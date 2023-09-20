package io.grpc.demo.ask;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: ask.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AskerGrpc {

  private AskerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "demo.Asker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest,
      io.grpc.demo.ask.AskReply> getAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ask",
      requestType = io.grpc.demo.ask.AskRequest.class,
      responseType = io.grpc.demo.ask.AskReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest,
      io.grpc.demo.ask.AskReply> getAskMethod() {
    io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest, io.grpc.demo.ask.AskReply> getAskMethod;
    if ((getAskMethod = AskerGrpc.getAskMethod) == null) {
      synchronized (AskerGrpc.class) {
        if ((getAskMethod = AskerGrpc.getAskMethod) == null) {
          AskerGrpc.getAskMethod = getAskMethod =
              io.grpc.MethodDescriptor.<io.grpc.demo.ask.AskRequest, io.grpc.demo.ask.AskReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.demo.ask.AskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.demo.ask.AskReply.getDefaultInstance()))
              .setSchemaDescriptor(new AskerMethodDescriptorSupplier("Ask"))
              .build();
        }
      }
    }
    return getAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest,
      io.grpc.demo.ask.AskReply> getAskStreamReplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AskStreamReply",
      requestType = io.grpc.demo.ask.AskRequest.class,
      responseType = io.grpc.demo.ask.AskReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest,
      io.grpc.demo.ask.AskReply> getAskStreamReplyMethod() {
    io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest, io.grpc.demo.ask.AskReply> getAskStreamReplyMethod;
    if ((getAskStreamReplyMethod = AskerGrpc.getAskStreamReplyMethod) == null) {
      synchronized (AskerGrpc.class) {
        if ((getAskStreamReplyMethod = AskerGrpc.getAskStreamReplyMethod) == null) {
          AskerGrpc.getAskStreamReplyMethod = getAskStreamReplyMethod =
              io.grpc.MethodDescriptor.<io.grpc.demo.ask.AskRequest, io.grpc.demo.ask.AskReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AskStreamReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.demo.ask.AskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.demo.ask.AskReply.getDefaultInstance()))
              .setSchemaDescriptor(new AskerMethodDescriptorSupplier("AskStreamReply"))
              .build();
        }
      }
    }
    return getAskStreamReplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest,
      io.grpc.demo.ask.AskReply> getAskBidiStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AskBidiStream",
      requestType = io.grpc.demo.ask.AskRequest.class,
      responseType = io.grpc.demo.ask.AskReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest,
      io.grpc.demo.ask.AskReply> getAskBidiStreamMethod() {
    io.grpc.MethodDescriptor<io.grpc.demo.ask.AskRequest, io.grpc.demo.ask.AskReply> getAskBidiStreamMethod;
    if ((getAskBidiStreamMethod = AskerGrpc.getAskBidiStreamMethod) == null) {
      synchronized (AskerGrpc.class) {
        if ((getAskBidiStreamMethod = AskerGrpc.getAskBidiStreamMethod) == null) {
          AskerGrpc.getAskBidiStreamMethod = getAskBidiStreamMethod =
              io.grpc.MethodDescriptor.<io.grpc.demo.ask.AskRequest, io.grpc.demo.ask.AskReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AskBidiStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.demo.ask.AskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.demo.ask.AskReply.getDefaultInstance()))
              .setSchemaDescriptor(new AskerMethodDescriptorSupplier("AskBidiStream"))
              .build();
        }
      }
    }
    return getAskBidiStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AskerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AskerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AskerStub>() {
        @java.lang.Override
        public AskerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AskerStub(channel, callOptions);
        }
      };
    return AskerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AskerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AskerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AskerBlockingStub>() {
        @java.lang.Override
        public AskerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AskerBlockingStub(channel, callOptions);
        }
      };
    return AskerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AskerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AskerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AskerFutureStub>() {
        @java.lang.Override
        public AskerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AskerFutureStub(channel, callOptions);
        }
      };
    return AskerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    default void ask(io.grpc.demo.ask.AskRequest request,
        io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAskMethod(), responseObserver);
    }

    /**
     */
    default void askStreamReply(io.grpc.demo.ask.AskRequest request,
        io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAskStreamReplyMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskRequest> askBidiStream(
        io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAskBidiStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Asker.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class AskerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AskerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Asker.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AskerStub
      extends io.grpc.stub.AbstractAsyncStub<AskerStub> {
    private AskerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AskerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AskerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void ask(io.grpc.demo.ask.AskRequest request,
        io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void askStreamReply(io.grpc.demo.ask.AskRequest request,
        io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getAskStreamReplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskRequest> askBidiStream(
        io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAskBidiStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Asker.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AskerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AskerBlockingStub> {
    private AskerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AskerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AskerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.demo.ask.AskReply ask(io.grpc.demo.ask.AskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<io.grpc.demo.ask.AskReply> askStreamReply(
        io.grpc.demo.ask.AskRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getAskStreamReplyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Asker.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AskerFutureStub
      extends io.grpc.stub.AbstractFutureStub<AskerFutureStub> {
    private AskerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AskerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AskerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.demo.ask.AskReply> ask(
        io.grpc.demo.ask.AskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASK = 0;
  private static final int METHODID_ASK_STREAM_REPLY = 1;
  private static final int METHODID_ASK_BIDI_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASK:
          serviceImpl.ask((io.grpc.demo.ask.AskRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply>) responseObserver);
          break;
        case METHODID_ASK_STREAM_REPLY:
          serviceImpl.askStreamReply((io.grpc.demo.ask.AskRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASK_BIDI_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.askBidiStream(
              (io.grpc.stub.StreamObserver<io.grpc.demo.ask.AskReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.demo.ask.AskRequest,
              io.grpc.demo.ask.AskReply>(
                service, METHODID_ASK)))
        .addMethod(
          getAskStreamReplyMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.grpc.demo.ask.AskRequest,
              io.grpc.demo.ask.AskReply>(
                service, METHODID_ASK_STREAM_REPLY)))
        .addMethod(
          getAskBidiStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              io.grpc.demo.ask.AskRequest,
              io.grpc.demo.ask.AskReply>(
                service, METHODID_ASK_BIDI_STREAM)))
        .build();
  }

  private static abstract class AskerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AskerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.demo.ask.AskerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Asker");
    }
  }

  private static final class AskerFileDescriptorSupplier
      extends AskerBaseDescriptorSupplier {
    AskerFileDescriptorSupplier() {}
  }

  private static final class AskerMethodDescriptorSupplier
      extends AskerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AskerMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AskerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AskerFileDescriptorSupplier())
              .addMethod(getAskMethod())
              .addMethod(getAskStreamReplyMethod())
              .addMethod(getAskBidiStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
