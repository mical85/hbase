// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoadBalancer.proto

package org.apache.hadoop.hbase.shaded.protobuf.generated;

public final class LoadBalancerProtos {
  private LoadBalancerProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LoadBalancerStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hbase.pb.LoadBalancerState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool balancer_on = 1;</code>
     */
    boolean hasBalancerOn();
    /**
     * <code>optional bool balancer_on = 1;</code>
     */
    boolean getBalancerOn();
  }
  /**
   * Protobuf type {@code hbase.pb.LoadBalancerState}
   */
  public  static final class LoadBalancerState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hbase.pb.LoadBalancerState)
      LoadBalancerStateOrBuilder {
    // Use LoadBalancerState.newBuilder() to construct.
    private LoadBalancerState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LoadBalancerState() {
      balancerOn_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LoadBalancerState(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              balancerOn_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.internal_static_hbase_pb_LoadBalancerState_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.internal_static_hbase_pb_LoadBalancerState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState.class, org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState.Builder.class);
    }

    private int bitField0_;
    public static final int BALANCER_ON_FIELD_NUMBER = 1;
    private boolean balancerOn_;
    /**
     * <code>optional bool balancer_on = 1;</code>
     */
    public boolean hasBalancerOn() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool balancer_on = 1;</code>
     */
    public boolean getBalancerOn() {
      return balancerOn_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, balancerOn_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, balancerOn_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState other = (org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState) obj;

      boolean result = true;
      result = result && (hasBalancerOn() == other.hasBalancerOn());
      if (hasBalancerOn()) {
        result = result && (getBalancerOn()
            == other.getBalancerOn());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasBalancerOn()) {
        hash = (37 * hash) + BALANCER_ON_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBalancerOn());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hbase.pb.LoadBalancerState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hbase.pb.LoadBalancerState)
        org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.internal_static_hbase_pb_LoadBalancerState_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.internal_static_hbase_pb_LoadBalancerState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState.class, org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        balancerOn_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.internal_static_hbase_pb_LoadBalancerState_descriptor;
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState.getDefaultInstance();
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState build() {
        org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState buildPartial() {
        org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState result = new org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.balancerOn_ = balancerOn_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState) {
          return mergeFrom((org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState other) {
        if (other == org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState.getDefaultInstance()) return this;
        if (other.hasBalancerOn()) {
          setBalancerOn(other.getBalancerOn());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean balancerOn_ ;
      /**
       * <code>optional bool balancer_on = 1;</code>
       */
      public boolean hasBalancerOn() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool balancer_on = 1;</code>
       */
      public boolean getBalancerOn() {
        return balancerOn_;
      }
      /**
       * <code>optional bool balancer_on = 1;</code>
       */
      public Builder setBalancerOn(boolean value) {
        bitField0_ |= 0x00000001;
        balancerOn_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool balancer_on = 1;</code>
       */
      public Builder clearBalancerOn() {
        bitField0_ = (bitField0_ & ~0x00000001);
        balancerOn_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hbase.pb.LoadBalancerState)
    }

    // @@protoc_insertion_point(class_scope:hbase.pb.LoadBalancerState)
    private static final org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState();
    }

    public static org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LoadBalancerState>
        PARSER = new com.google.protobuf.AbstractParser<LoadBalancerState>() {
      public LoadBalancerState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new LoadBalancerState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LoadBalancerState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoadBalancerState> getParserForType() {
      return PARSER;
    }

    public org.apache.hadoop.hbase.shaded.protobuf.generated.LoadBalancerProtos.LoadBalancerState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hbase_pb_LoadBalancerState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hbase_pb_LoadBalancerState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022LoadBalancer.proto\022\010hbase.pb\"(\n\021LoadBa" +
      "lancerState\022\023\n\013balancer_on\030\001 \001(\010BL\n1org." +
      "apache.hadoop.hbase.shaded.protobuf.gene" +
      "ratedB\022LoadBalancerProtosH\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_hbase_pb_LoadBalancerState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hbase_pb_LoadBalancerState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hbase_pb_LoadBalancerState_descriptor,
        new java.lang.String[] { "BalancerOn", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
