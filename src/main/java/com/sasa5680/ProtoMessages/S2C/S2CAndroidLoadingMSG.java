// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: S2C_AndroidLoadingMSG.proto

package com.sasa5680.ProtoMessages.S2C;

public final class S2CAndroidLoadingMSG {
  private S2CAndroidLoadingMSG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface S2C_AndroidLoadingMSGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:S2C_AndroidLoadingMSG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *Message Info
     * </pre>
     *
     * <code>string DroneID = 3;</code>
     */
    java.lang.String getDroneID();
    /**
     * <pre>
     *Message Info
     * </pre>
     *
     * <code>string DroneID = 3;</code>
     */
    com.google.protobuf.ByteString
        getDroneIDBytes();

    /**
     * <code>bool ConnectionStatue = 4;</code>
     */
    boolean getConnectionStatue();
  }
  /**
   * Protobuf type {@code S2C_AndroidLoadingMSG}
   */
  public  static final class S2C_AndroidLoadingMSG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:S2C_AndroidLoadingMSG)
      S2C_AndroidLoadingMSGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use S2C_AndroidLoadingMSG.newBuilder() to construct.
    private S2C_AndroidLoadingMSG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private S2C_AndroidLoadingMSG() {
      droneID_ = "";
      connectionStatue_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private S2C_AndroidLoadingMSG(
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
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              droneID_ = s;
              break;
            }
            case 32: {

              connectionStatue_ = input.readBool();
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
      return com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.internal_static_S2C_AndroidLoadingMSG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.internal_static_S2C_AndroidLoadingMSG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG.class, com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG.Builder.class);
    }

    public static final int DRONEID_FIELD_NUMBER = 3;
    private volatile java.lang.Object droneID_;
    /**
     * <pre>
     *Message Info
     * </pre>
     *
     * <code>string DroneID = 3;</code>
     */
    public java.lang.String getDroneID() {
      java.lang.Object ref = droneID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        droneID_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *Message Info
     * </pre>
     *
     * <code>string DroneID = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDroneIDBytes() {
      java.lang.Object ref = droneID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        droneID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONNECTIONSTATUE_FIELD_NUMBER = 4;
    private boolean connectionStatue_;
    /**
     * <code>bool ConnectionStatue = 4;</code>
     */
    public boolean getConnectionStatue() {
      return connectionStatue_;
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
      if (!getDroneIDBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, droneID_);
      }
      if (connectionStatue_ != false) {
        output.writeBool(4, connectionStatue_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getDroneIDBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, droneID_);
      }
      if (connectionStatue_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, connectionStatue_);
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
      if (!(obj instanceof com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG)) {
        return super.equals(obj);
      }
      com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG other = (com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG) obj;

      boolean result = true;
      result = result && getDroneID()
          .equals(other.getDroneID());
      result = result && (getConnectionStatue()
          == other.getConnectionStatue());
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
      hash = (37 * hash) + DRONEID_FIELD_NUMBER;
      hash = (53 * hash) + getDroneID().hashCode();
      hash = (37 * hash) + CONNECTIONSTATUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getConnectionStatue());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parseFrom(
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
    public static Builder newBuilder(com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG prototype) {
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
     * Protobuf type {@code S2C_AndroidLoadingMSG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:S2C_AndroidLoadingMSG)
        com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.internal_static_S2C_AndroidLoadingMSG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.internal_static_S2C_AndroidLoadingMSG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG.class, com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG.Builder.class);
      }

      // Construct using com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG.newBuilder()
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
        droneID_ = "";

        connectionStatue_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.internal_static_S2C_AndroidLoadingMSG_descriptor;
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG getDefaultInstanceForType() {
        return com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG.getDefaultInstance();
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG build() {
        com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG buildPartial() {
        com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG result = new com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG(this);
        result.droneID_ = droneID_;
        result.connectionStatue_ = connectionStatue_;
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
        if (other instanceof com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG) {
          return mergeFrom((com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG other) {
        if (other == com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG.getDefaultInstance()) return this;
        if (!other.getDroneID().isEmpty()) {
          droneID_ = other.droneID_;
          onChanged();
        }
        if (other.getConnectionStatue() != false) {
          setConnectionStatue(other.getConnectionStatue());
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
        com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object droneID_ = "";
      /**
       * <pre>
       *Message Info
       * </pre>
       *
       * <code>string DroneID = 3;</code>
       */
      public java.lang.String getDroneID() {
        java.lang.Object ref = droneID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          droneID_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *Message Info
       * </pre>
       *
       * <code>string DroneID = 3;</code>
       */
      public com.google.protobuf.ByteString
          getDroneIDBytes() {
        java.lang.Object ref = droneID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          droneID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *Message Info
       * </pre>
       *
       * <code>string DroneID = 3;</code>
       */
      public Builder setDroneID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        droneID_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Message Info
       * </pre>
       *
       * <code>string DroneID = 3;</code>
       */
      public Builder clearDroneID() {
        
        droneID_ = getDefaultInstance().getDroneID();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Message Info
       * </pre>
       *
       * <code>string DroneID = 3;</code>
       */
      public Builder setDroneIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        droneID_ = value;
        onChanged();
        return this;
      }

      private boolean connectionStatue_ ;
      /**
       * <code>bool ConnectionStatue = 4;</code>
       */
      public boolean getConnectionStatue() {
        return connectionStatue_;
      }
      /**
       * <code>bool ConnectionStatue = 4;</code>
       */
      public Builder setConnectionStatue(boolean value) {
        
        connectionStatue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool ConnectionStatue = 4;</code>
       */
      public Builder clearConnectionStatue() {
        
        connectionStatue_ = false;
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


      // @@protoc_insertion_point(builder_scope:S2C_AndroidLoadingMSG)
    }

    // @@protoc_insertion_point(class_scope:S2C_AndroidLoadingMSG)
    private static final com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG();
    }

    public static com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<S2C_AndroidLoadingMSG>
        PARSER = new com.google.protobuf.AbstractParser<S2C_AndroidLoadingMSG>() {
      @java.lang.Override
      public S2C_AndroidLoadingMSG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new S2C_AndroidLoadingMSG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<S2C_AndroidLoadingMSG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<S2C_AndroidLoadingMSG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sasa5680.ProtoMessages.S2C.S2CAndroidLoadingMSG.S2C_AndroidLoadingMSG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_S2C_AndroidLoadingMSG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_S2C_AndroidLoadingMSG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033S2C_AndroidLoadingMSG.proto\"B\n\025S2C_And" +
      "roidLoadingMSG\022\017\n\007DroneID\030\003 \001(\t\022\030\n\020Conne" +
      "ctionStatue\030\004 \001(\010B \n\036com.sasa5680.ProtoM" +
      "essages.S2Cb\006proto3"
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
    internal_static_S2C_AndroidLoadingMSG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_S2C_AndroidLoadingMSG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_S2C_AndroidLoadingMSG_descriptor,
        new java.lang.String[] { "DroneID", "ConnectionStatue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
