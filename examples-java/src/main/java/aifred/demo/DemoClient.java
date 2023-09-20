package aifred.demo;

import io.grpc.*;
import io.grpc.demo.ask.AskReply;
import io.grpc.demo.ask.AskRequest;
import io.grpc.demo.ask.AskerGrpc;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoClient {
    private static final Logger logger = Logger.getLogger(DemoClient.class.getName());
    private final AskerGrpc.AskerBlockingStub blockingStub;
    public DemoClient(Channel channel) {
        blockingStub = AskerGrpc.newBlockingStub(channel);
    }

    /** Say hello to server. */
    public void request(String ask) {
        AskRequest request = AskRequest.newBuilder().setQuestion(ask).build();
        AskReply response;
        try {
            response = blockingStub.ask(request);

            System.out.println("### resp = " + response.getAnswer() + ", " + response.getContent());
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Answer : " + response.getAnswer());
    }

    public static void main(String[] args) throws Exception {
        ManagedChannel channel = Grpc.newChannelBuilder("localhost:50051", InsecureChannelCredentials.create()).build();

        try {
            DemoClient client = new DemoClient(channel);
            client.request("what is your name?");
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}