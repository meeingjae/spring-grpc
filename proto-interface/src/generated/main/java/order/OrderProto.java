// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Order.proto

package order;

public final class OrderProto {
  private OrderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_OrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_OrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_OrderReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_OrderReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Order.proto\022\032net.devh.boot.grpc.exampl" +
      "e\"\034\n\014OrderRequest\022\014\n\004name\030\001 \001(\t\"S\n\nOrder" +
      "Reply\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\023\n\013order" +
      "Status\030\003 \001(\t\022\026\n\016deliveryStatus\030\004 \001(\t2k\n\014" +
      "OrderService\022[\n\005order\022(.net.devh.boot.gr" +
      "pc.example.OrderRequest\032&.net.devh.boot." +
      "grpc.example.OrderReply\"\000B\025\n\005orderB\nOrde" +
      "rProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_net_devh_boot_grpc_example_OrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_net_devh_boot_grpc_example_OrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_OrderRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_net_devh_boot_grpc_example_OrderReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_net_devh_boot_grpc_example_OrderReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_OrderReply_descriptor,
        new java.lang.String[] { "Id", "Name", "OrderStatus", "DeliveryStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
