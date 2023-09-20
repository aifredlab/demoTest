package io.grpc.examples.echo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Echo is the echo service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: grpc/examples/echo/echo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EchoGrpc {

  private EchoGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.examples.echo.Echo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest,
      io.grpc.examples.echo.EchoResponse> getUnaryEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnaryEcho",
      requestType = io.grpc.examples.echo.EchoRequest.class,
      responseType = io.grpc.examples.echo.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest,
      io.grpc.examples.echo.EchoResponse> getUnaryEchoMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest, io.grpc.examples.echo.EchoResponse> getUnaryEchoMethod;
    if ((getUnaryEchoMethod = EchoGrpc.getUnaryEchoMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getUnaryEchoMethod = EchoGrpc.getUnaryEchoMethod) == null) {
          EchoGrpc.getUnaryEchoMethod = getUnaryEchoMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.echo.EchoRequest, io.grpc.examples.echo.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnaryEcho"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.echo.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.echo.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("UnaryEcho"))
              .build();
        }
      }
    }
    return getUnaryEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest,
      io.grpc.examples.echo.EchoResponse> getServerStreamingEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerStreamingEcho",
      requestType = io.grpc.examples.echo.EchoRequest.class,
      responseType = io.grpc.examples.echo.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest,
      io.grpc.examples.echo.EchoResponse> getServerStreamingEchoMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest, io.grpc.examples.echo.EchoResponse> getServerStreamingEchoMethod;
    if ((getServerStreamingEchoMethod = EchoGrpc.getServerStreamingEchoMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getServerStreamingEchoMethod = EchoGrpc.getServerStreamingEchoMethod) == null) {
          EchoGrpc.getServerStreamingEchoMethod = getServerStreamingEchoMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.echo.EchoRequest, io.grpc.examples.echo.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStreamingEcho"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.echo.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.echo.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("ServerStreamingEcho"))
              .build();
        }
      }
    }
    return getServerStreamingEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest,
      io.grpc.examples.echo.EchoResponse> getClientStreamingEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientStreamingEcho",
      requestType = io.grpc.examples.echo.EchoRequest.class,
      responseType = io.grpc.examples.echo.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest,
      io.grpc.examples.echo.EchoResponse> getClientStreamingEchoMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest, io.grpc.examples.echo.EchoResponse> getClientStreamingEchoMethod;
    if ((getClientStreamingEchoMethod = EchoGrpc.getClientStreamingEchoMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getClientStreamingEchoMethod = EchoGrpc.getClientStreamingEchoMethod) == null) {
          EchoGrpc.getClientStreamingEchoMethod = getClientStreamingEchoMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.echo.EchoRequest, io.grpc.examples.echo.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClientStreamingEcho"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.echo.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.echo.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("ClientStreamingEcho"))
              .build();
        }
      }
    }
    return getClientStreamingEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest,
      io.grpc.examples.echo.EchoResponse> getBidirectionalStreamingEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidirectionalStreamingEcho",
      requestType = io.grpc.examples.echo.EchoRequest.class,
      responseType = io.grpc.examples.echo.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest,
      io.grpc.examples.echo.EchoResponse> getBidirectionalStreamingEchoMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.echo.EchoRequest, io.grpc.examples.echo.EchoResponse> getBidirectionalStreamingEchoMethod;
    if ((getBidirectionalStreamingEchoMethod = EchoGrpc.getBidirectionalStreamingEchoMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getBidirectionalStreamingEchoMethod = EchoGrpc.getBidirectionalStreamingEchoMethod) == null) {
          EchoGrpc.getBidirectionalStreamingEchoMethod = getBidirectionalStreamingEchoMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.echo.EchoRequest, io.grpc.examples.echo.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BidirectionalStreamingEcho"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.echo.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.echo.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("BidirectionalStreamingEcho"))
              .build();
        }
      }
    }
    return getBidirectionalStreamingEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoStub>() {
        @java.lang.Override
        public EchoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoStub(channel, callOptions);
        }
      };
    return EchoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoBlockingStub>() {
        @java.lang.Override
        public EchoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoBlockingStub(channel, callOptions);
        }
      };
    return EchoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoFutureStub>() {
        @java.lang.Override
        public EchoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoFutureStub(channel, callOptions);
        }
      };
    return EchoFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Echo is the echo service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * UnaryEcho is unary echo.
     * </pre>
     */
    default void unaryEcho(io.grpc.examples.echo.EchoRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnaryEchoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ServerStreamingEcho is server side streaming.
     * </pre>
     */
    default void serverStreamingEcho(io.grpc.examples.echo.EchoRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerStreamingEchoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClientStreamingEcho is client side streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoRequest> clientStreamingEcho(
        io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientStreamingEchoMethod(), responseObserver);
    }

    /**
     * <pre>
     * BidirectionalStreamingEcho is bidi streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoRequest> bidirectionalStreamingEcho(
        io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidirectionalStreamingEchoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Echo.
   * <pre>
   * Echo is the echo service.
   * </pre>
   */
  public static abstract class EchoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EchoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Echo.
   * <pre>
   * Echo is the echo service.
   * </pre>
   */
  public static final class EchoStub
      extends io.grpc.stub.AbstractAsyncStub<EchoStub> {
    private EchoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoStub(channel, callOptions);
    }

    /**
     * <pre>
     * UnaryEcho is unary echo.
     * </pre>
     */
    public void unaryEcho(io.grpc.examples.echo.EchoRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnaryEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ServerStreamingEcho is server side streaming.
     * </pre>
     */
    public void serverStreamingEcho(io.grpc.examples.echo.EchoRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerStreamingEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClientStreamingEcho is client side streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoRequest> clientStreamingEcho(
        io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientStreamingEchoMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * BidirectionalStreamingEcho is bidi streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoRequest> bidirectionalStreamingEcho(
        io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamingEchoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Echo.
   * <pre>
   * Echo is the echo service.
   * </pre>
   */
  public static final class EchoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EchoBlockingStub> {
    private EchoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * UnaryEcho is unary echo.
     * </pre>
     */
    public io.grpc.examples.echo.EchoResponse unaryEcho(io.grpc.examples.echo.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnaryEchoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ServerStreamingEcho is server side streaming.
     * </pre>
     */
    public java.util.Iterator<io.grpc.examples.echo.EchoResponse> serverStreamingEcho(
        io.grpc.examples.echo.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerStreamingEchoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Echo.
   * <pre>
   * Echo is the echo service.
   * </pre>
   */
  public static final class EchoFutureStub
      extends io.grpc.stub.AbstractFutureStub<EchoFutureStub> {
    private EchoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * UnaryEcho is unary echo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.echo.EchoResponse> unaryEcho(
        io.grpc.examples.echo.EchoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnaryEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_ECHO = 0;
  private static final int METHODID_SERVER_STREAMING_ECHO = 1;
  private static final int METHODID_CLIENT_STREAMING_ECHO = 2;
  private static final int METHODID_BIDIRECTIONAL_STREAMING_ECHO = 3;

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
        case METHODID_UNARY_ECHO:
          serviceImpl.unaryEcho((io.grpc.examples.echo.EchoRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse>) responseObserver);
          break;
        case METHODID_SERVER_STREAMING_ECHO:
          serviceImpl.serverStreamingEcho((io.grpc.examples.echo.EchoRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse>) responseObserver);
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
        case METHODID_CLIENT_STREAMING_ECHO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamingEcho(
              (io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse>) responseObserver);
        case METHODID_BIDIRECTIONAL_STREAMING_ECHO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStreamingEcho(
              (io.grpc.stub.StreamObserver<io.grpc.examples.echo.EchoResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUnaryEchoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.echo.EchoRequest,
              io.grpc.examples.echo.EchoResponse>(
                service, METHODID_UNARY_ECHO)))
        .addMethod(
          getServerStreamingEchoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.grpc.examples.echo.EchoRequest,
              io.grpc.examples.echo.EchoResponse>(
                service, METHODID_SERVER_STREAMING_ECHO)))
        .addMethod(
          getClientStreamingEchoMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              io.grpc.examples.echo.EchoRequest,
              io.grpc.examples.echo.EchoResponse>(
                service, METHODID_CLIENT_STREAMING_ECHO)))
        .addMethod(
          getBidirectionalStreamingEchoMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              io.grpc.examples.echo.EchoRequest,
              io.grpc.examples.echo.EchoResponse>(
                service, METHODID_BIDIRECTIONAL_STREAMING_ECHO)))
        .build();
  }

  private static abstract class EchoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.echo.EchoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Echo");
    }
  }

  private static final class EchoFileDescriptorSupplier
      extends EchoBaseDescriptorSupplier {
    EchoFileDescriptorSupplier() {}
  }

  private static final class EchoMethodDescriptorSupplier
      extends EchoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EchoMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EchoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoFileDescriptorSupplier())
              .addMethod(getUnaryEchoMethod())
              .addMethod(getServerStreamingEchoMethod())
              .addMethod(getClientStreamingEchoMethod())
              .addMethod(getBidirectionalStreamingEchoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
