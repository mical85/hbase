// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Encryption.proto

package org.apache.hadoop.hbase.shaded.protobuf.generated;

public final class EncryptionProtos {
  private EncryptionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WrappedKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hbase.pb.WrappedKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string algorithm = 1;</code>
     */
    boolean hasAlgorithm();
    /**
     * <code>required string algorithm = 1;</code>
     */
    java.lang.String getAlgorithm();
    /**
     * <code>required string algorithm = 1;</code>
     */
    com.google.protobuf.ByteString
        getAlgorithmBytes();

    /**
     * <code>required uint32 length = 2;</code>
     */
    boolean hasLength();
    /**
     * <code>required uint32 length = 2;</code>
     */
    int getLength();

    /**
     * <code>required bytes data = 3;</code>
     */
    boolean hasData();
    /**
     * <code>required bytes data = 3;</code>
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>optional bytes iv = 4;</code>
     */
    boolean hasIv();
    /**
     * <code>optional bytes iv = 4;</code>
     */
    com.google.protobuf.ByteString getIv();

    /**
     * <code>optional bytes hash = 5;</code>
     */
    boolean hasHash();
    /**
     * <code>optional bytes hash = 5;</code>
     */
    com.google.protobuf.ByteString getHash();
  }
  /**
   * Protobuf type {@code hbase.pb.WrappedKey}
   */
  public  static final class WrappedKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hbase.pb.WrappedKey)
      WrappedKeyOrBuilder {
    // Use WrappedKey.newBuilder() to construct.
    private WrappedKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WrappedKey() {
      algorithm_ = "";
      length_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
      iv_ = com.google.protobuf.ByteString.EMPTY;
      hash_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WrappedKey(
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              algorithm_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              length_ = input.readUInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              data_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              iv_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              hash_ = input.readBytes();
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
      return org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.internal_static_hbase_pb_WrappedKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.internal_static_hbase_pb_WrappedKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey.class, org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey.Builder.class);
    }

    private int bitField0_;
    public static final int ALGORITHM_FIELD_NUMBER = 1;
    private volatile java.lang.Object algorithm_;
    /**
     * <code>required string algorithm = 1;</code>
     */
    public boolean hasAlgorithm() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string algorithm = 1;</code>
     */
    public java.lang.String getAlgorithm() {
      java.lang.Object ref = algorithm_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          algorithm_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string algorithm = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAlgorithmBytes() {
      java.lang.Object ref = algorithm_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        algorithm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LENGTH_FIELD_NUMBER = 2;
    private int length_;
    /**
     * <code>required uint32 length = 2;</code>
     */
    public boolean hasLength() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 length = 2;</code>
     */
    public int getLength() {
      return length_;
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>required bytes data = 3;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bytes data = 3;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    public static final int IV_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString iv_;
    /**
     * <code>optional bytes iv = 4;</code>
     */
    public boolean hasIv() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes iv = 4;</code>
     */
    public com.google.protobuf.ByteString getIv() {
      return iv_;
    }

    public static final int HASH_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString hash_;
    /**
     * <code>optional bytes hash = 5;</code>
     */
    public boolean hasHash() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bytes hash = 5;</code>
     */
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAlgorithm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, algorithm_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, length_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, data_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, iv_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, hash_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, algorithm_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, length_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, data_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, iv_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, hash_);
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
      if (!(obj instanceof org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey other = (org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey) obj;

      boolean result = true;
      result = result && (hasAlgorithm() == other.hasAlgorithm());
      if (hasAlgorithm()) {
        result = result && getAlgorithm()
            .equals(other.getAlgorithm());
      }
      result = result && (hasLength() == other.hasLength());
      if (hasLength()) {
        result = result && (getLength()
            == other.getLength());
      }
      result = result && (hasData() == other.hasData());
      if (hasData()) {
        result = result && getData()
            .equals(other.getData());
      }
      result = result && (hasIv() == other.hasIv());
      if (hasIv()) {
        result = result && getIv()
            .equals(other.getIv());
      }
      result = result && (hasHash() == other.hasHash());
      if (hasHash()) {
        result = result && getHash()
            .equals(other.getHash());
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
      if (hasAlgorithm()) {
        hash = (37 * hash) + ALGORITHM_FIELD_NUMBER;
        hash = (53 * hash) + getAlgorithm().hashCode();
      }
      if (hasLength()) {
        hash = (37 * hash) + LENGTH_FIELD_NUMBER;
        hash = (53 * hash) + getLength();
      }
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      if (hasIv()) {
        hash = (37 * hash) + IV_FIELD_NUMBER;
        hash = (53 * hash) + getIv().hashCode();
      }
      if (hasHash()) {
        hash = (37 * hash) + HASH_FIELD_NUMBER;
        hash = (53 * hash) + getHash().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey prototype) {
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
     * Protobuf type {@code hbase.pb.WrappedKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hbase.pb.WrappedKey)
        org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.internal_static_hbase_pb_WrappedKey_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.internal_static_hbase_pb_WrappedKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey.class, org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey.newBuilder()
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
        algorithm_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        length_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        iv_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        hash_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.internal_static_hbase_pb_WrappedKey_descriptor;
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey.getDefaultInstance();
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey build() {
        org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey buildPartial() {
        org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey result = new org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.algorithm_ = algorithm_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.length_ = length_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.iv_ = iv_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.hash_ = hash_;
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
        if (other instanceof org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey) {
          return mergeFrom((org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey other) {
        if (other == org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey.getDefaultInstance()) return this;
        if (other.hasAlgorithm()) {
          bitField0_ |= 0x00000001;
          algorithm_ = other.algorithm_;
          onChanged();
        }
        if (other.hasLength()) {
          setLength(other.getLength());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        if (other.hasIv()) {
          setIv(other.getIv());
        }
        if (other.hasHash()) {
          setHash(other.getHash());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasAlgorithm()) {
          return false;
        }
        if (!hasLength()) {
          return false;
        }
        if (!hasData()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object algorithm_ = "";
      /**
       * <code>required string algorithm = 1;</code>
       */
      public boolean hasAlgorithm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string algorithm = 1;</code>
       */
      public java.lang.String getAlgorithm() {
        java.lang.Object ref = algorithm_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            algorithm_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string algorithm = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAlgorithmBytes() {
        java.lang.Object ref = algorithm_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          algorithm_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string algorithm = 1;</code>
       */
      public Builder setAlgorithm(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        algorithm_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string algorithm = 1;</code>
       */
      public Builder clearAlgorithm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        algorithm_ = getDefaultInstance().getAlgorithm();
        onChanged();
        return this;
      }
      /**
       * <code>required string algorithm = 1;</code>
       */
      public Builder setAlgorithmBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        algorithm_ = value;
        onChanged();
        return this;
      }

      private int length_ ;
      /**
       * <code>required uint32 length = 2;</code>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 length = 2;</code>
       */
      public int getLength() {
        return length_;
      }
      /**
       * <code>required uint32 length = 2;</code>
       */
      public Builder setLength(int value) {
        bitField0_ |= 0x00000002;
        length_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 length = 2;</code>
       */
      public Builder clearLength() {
        bitField0_ = (bitField0_ & ~0x00000002);
        length_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes data = 3;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bytes data = 3;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>required bytes data = 3;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes data = 3;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000004);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString iv_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes iv = 4;</code>
       */
      public boolean hasIv() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bytes iv = 4;</code>
       */
      public com.google.protobuf.ByteString getIv() {
        return iv_;
      }
      /**
       * <code>optional bytes iv = 4;</code>
       */
      public Builder setIv(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        iv_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes iv = 4;</code>
       */
      public Builder clearIv() {
        bitField0_ = (bitField0_ & ~0x00000008);
        iv_ = getDefaultInstance().getIv();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes hash = 5;</code>
       */
      public boolean hasHash() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bytes hash = 5;</code>
       */
      public com.google.protobuf.ByteString getHash() {
        return hash_;
      }
      /**
       * <code>optional bytes hash = 5;</code>
       */
      public Builder setHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        hash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes hash = 5;</code>
       */
      public Builder clearHash() {
        bitField0_ = (bitField0_ & ~0x00000010);
        hash_ = getDefaultInstance().getHash();
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


      // @@protoc_insertion_point(builder_scope:hbase.pb.WrappedKey)
    }

    // @@protoc_insertion_point(class_scope:hbase.pb.WrappedKey)
    private static final org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey();
    }

    public static org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<WrappedKey>
        PARSER = new com.google.protobuf.AbstractParser<WrappedKey>() {
      public WrappedKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new WrappedKey(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WrappedKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WrappedKey> getParserForType() {
      return PARSER;
    }

    public org.apache.hadoop.hbase.shaded.protobuf.generated.EncryptionProtos.WrappedKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hbase_pb_WrappedKey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hbase_pb_WrappedKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Encryption.proto\022\010hbase.pb\"W\n\nWrappedK" +
      "ey\022\021\n\talgorithm\030\001 \002(\t\022\016\n\006length\030\002 \002(\r\022\014\n" +
      "\004data\030\003 \002(\014\022\n\n\002iv\030\004 \001(\014\022\014\n\004hash\030\005 \001(\014BJ\n" +
      "1org.apache.hadoop.hbase.shaded.protobuf" +
      ".generatedB\020EncryptionProtosH\001\240\001\001"
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
    internal_static_hbase_pb_WrappedKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hbase_pb_WrappedKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hbase_pb_WrappedKey_descriptor,
        new java.lang.String[] { "Algorithm", "Length", "Data", "Iv", "Hash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
