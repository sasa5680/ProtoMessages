// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: S2C_DroneLoadingMSG.proto

package com.sasa5680.ProtoMessages.S2C;

public final class S2CDroneLoadingMSG {
  private S2CDroneLoadingMSG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface S2C_DroneLoadingMSGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:S2C_DroneLoadingMSG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool AndroidFlag = 1;</code>
     */
    boolean getAndroidFlag();
  }
  /**
   * Protobuf type {@code S2C_DroneLoadingMSG}
   */
  public  static final class S2C_DroneLoadingMSG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:S2C_DroneLoadingMSG)
      S2C_DroneLoadingMSGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use S2C_DroneLoadingMSG.newBuilder() to construct.
    private S2C_DroneLoadingMSG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private S2C_DroneLoadingMSG() {
      androidFlag_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private S2C_DroneLoadingMSG(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              androidFlag_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.internal_static_S2C_DroneLoadingMSG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.internal_static_S2C_DroneLoadingMSG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG.class, com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG.Builder.class);
    }

    public static final int ANDROIDFLAG_FIELD_NUMBER = 1;
    private boolean androidFlag_;
    /**
     * <code>bool AndroidFlag = 1;</code>
     */
    public boolean getAndroidFlag() {
      return androidFlag_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (androidFlag_ != false) {
        output.writeBool(1, androidFlag_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (androidFlag_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, androidFlag_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG)) {
        return super.equals(obj);
      }
      com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG other = (com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG) obj;

      boolean result = true;
      result = result && (getAndroidFlag()
          == other.getAndroidFlag());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ANDROIDFLAG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAndroidFlag());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code S2C_DroneLoadingMSG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:S2C_DroneLoadingMSG)
        com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.internal_static_S2C_DroneLoadingMSG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.internal_static_S2C_DroneLoadingMSG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG.class, com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG.Builder.class);
      }

      // Construct using com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        androidFlag_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.internal_static_S2C_DroneLoadingMSG_descriptor;
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG getDefaultInstanceForType() {
        return com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG.getDefaultInstance();
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG build() {
        com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG buildPartial() {
        com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG result = new com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG(this);
        result.androidFlag_ = androidFlag_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG) {
          return mergeFrom((com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG other) {
        if (other == com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG.getDefaultInstance()) return this;
        if (other.getAndroidFlag() != false) {
          setAndroidFlag(other.getAndroidFlag());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean androidFlag_ ;
      /**
       * <code>bool AndroidFlag = 1;</code>
       */
      public boolean getAndroidFlag() {
        return androidFlag_;
      }
      /**
       * <code>bool AndroidFlag = 1;</code>
       */
      public Builder setAndroidFlag(boolean value) {
        
        androidFlag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool AndroidFlag = 1;</code>
       */
      public Builder clearAndroidFlag() {
        
        androidFlag_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:S2C_DroneLoadingMSG)
    }

    // @@protoc_insertion_point(class_scope:S2C_DroneLoadingMSG)
    private static final com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG();
    }

    public static com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<S2C_DroneLoadingMSG>
        PARSER = new com.google.protobuf.AbstractParser<S2C_DroneLoadingMSG>() {
      @java.lang.Override
      public S2C_DroneLoadingMSG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new S2C_DroneLoadingMSG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<S2C_DroneLoadingMSG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<S2C_DroneLoadingMSG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sasa5680.ProtoMessages.S2C.S2CDroneLoadingMSG.S2C_DroneLoadingMSG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_S2C_DroneLoadingMSG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_S2C_DroneLoadingMSG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031S2C_DroneLoadingMSG.proto\"*\n\023S2C_Drone" +
      "LoadingMSG\022\023\n\013AndroidFlag\030\001 \001(\010B \n\036com.s" +
      "asa5680.ProtoMessages.S2Cb\006proto3"
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
    internal_static_S2C_DroneLoadingMSG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_S2C_DroneLoadingMSG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_S2C_DroneLoadingMSG_descriptor,
        new java.lang.String[] { "AndroidFlag", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}