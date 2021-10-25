package org.example.AlmaOnline.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: AlmaOnline.proto")
public final class AlmaOnlineGrpc {

  private AlmaOnlineGrpc() {}

  public static final String SERVICE_NAME = "almaonline.AlmaOnline";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlmaOnlineStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlmaOnlineStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlmaOnlineStub>() {
        @java.lang.Override
        public AlmaOnlineStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlmaOnlineStub(channel, callOptions);
        }
      };
    return AlmaOnlineStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlmaOnlineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlmaOnlineBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlmaOnlineBlockingStub>() {
        @java.lang.Override
        public AlmaOnlineBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlmaOnlineBlockingStub(channel, callOptions);
        }
      };
    return AlmaOnlineBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlmaOnlineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlmaOnlineFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlmaOnlineFutureStub>() {
        @java.lang.Override
        public AlmaOnlineFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlmaOnlineFutureStub(channel, callOptions);
        }
      };
    return AlmaOnlineFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AlmaOnlineImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class AlmaOnlineStub extends io.grpc.stub.AbstractAsyncStub<AlmaOnlineStub> {
    private AlmaOnlineStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlmaOnlineStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlmaOnlineStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class AlmaOnlineBlockingStub extends io.grpc.stub.AbstractBlockingStub<AlmaOnlineBlockingStub> {
    private AlmaOnlineBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlmaOnlineBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlmaOnlineBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class AlmaOnlineFutureStub extends io.grpc.stub.AbstractFutureStub<AlmaOnlineFutureStub> {
    private AlmaOnlineFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlmaOnlineFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlmaOnlineFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlmaOnlineImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlmaOnlineImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AlmaOnlineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlmaOnlineBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.AlmaOnline.server.AlmaOnlineProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlmaOnline");
    }
  }

  private static final class AlmaOnlineFileDescriptorSupplier
      extends AlmaOnlineBaseDescriptorSupplier {
    AlmaOnlineFileDescriptorSupplier() {}
  }

  private static final class AlmaOnlineMethodDescriptorSupplier
      extends AlmaOnlineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlmaOnlineMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlmaOnlineGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlmaOnlineFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
