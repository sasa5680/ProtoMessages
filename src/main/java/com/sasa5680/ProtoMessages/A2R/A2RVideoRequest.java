// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: A2R_VideoRequest.proto

package com.sasa5680.ProtoMessages.A2R;

public final class A2RVideoRequest {
  private A2RVideoRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface A2R_VidedoRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:A2R_VidedoRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    java.util.List<com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo> 
        getRoutingInfoList();
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo getRoutingInfo(int index);
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    int getRoutingInfoCount();
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    java.util.List<? extends com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder> 
        getRoutingInfoOrBuilderList();
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder getRoutingInfoOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code A2R_VidedoRequest}
   */
  public  static final class A2R_VidedoRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:A2R_VidedoRequest)
      A2R_VidedoRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use A2R_VidedoRequest.newBuilder() to construct.
    private A2R_VidedoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private A2R_VidedoRequest() {
      routingInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private A2R_VidedoRequest(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                routingInfo_ = new java.util.ArrayList<com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              routingInfo_.add(
                  input.readMessage(com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          routingInfo_ = java.util.Collections.unmodifiableList(routingInfo_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.internal_static_A2R_VidedoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.internal_static_A2R_VidedoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest.class, com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest.Builder.class);
    }

    public static final int ROUTINGINFO_FIELD_NUMBER = 1;
    private java.util.List<com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo> routingInfo_;
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    public java.util.List<com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo> getRoutingInfoList() {
      return routingInfo_;
    }
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    public java.util.List<? extends com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder> 
        getRoutingInfoOrBuilderList() {
      return routingInfo_;
    }
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    public int getRoutingInfoCount() {
      return routingInfo_.size();
    }
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    public com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo getRoutingInfo(int index) {
      return routingInfo_.get(index);
    }
    /**
     * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
     */
    public com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder getRoutingInfoOrBuilder(
        int index) {
      return routingInfo_.get(index);
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
      for (int i = 0; i < routingInfo_.size(); i++) {
        output.writeMessage(1, routingInfo_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < routingInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, routingInfo_.get(i));
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
      if (!(obj instanceof com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest)) {
        return super.equals(obj);
      }
      com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest other = (com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest) obj;

      boolean result = true;
      result = result && getRoutingInfoList()
          .equals(other.getRoutingInfoList());
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
      if (getRoutingInfoCount() > 0) {
        hash = (37 * hash) + ROUTINGINFO_FIELD_NUMBER;
        hash = (53 * hash) + getRoutingInfoList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parseFrom(
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
    public static Builder newBuilder(com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest prototype) {
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
     * Protobuf type {@code A2R_VidedoRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:A2R_VidedoRequest)
        com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.internal_static_A2R_VidedoRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.internal_static_A2R_VidedoRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest.class, com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest.Builder.class);
      }

      // Construct using com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest.newBuilder()
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
          getRoutingInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (routingInfoBuilder_ == null) {
          routingInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          routingInfoBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.internal_static_A2R_VidedoRequest_descriptor;
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest getDefaultInstanceForType() {
        return com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest build() {
        com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest buildPartial() {
        com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest result = new com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest(this);
        int from_bitField0_ = bitField0_;
        if (routingInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            routingInfo_ = java.util.Collections.unmodifiableList(routingInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.routingInfo_ = routingInfo_;
        } else {
          result.routingInfo_ = routingInfoBuilder_.build();
        }
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
        if (other instanceof com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest) {
          return mergeFrom((com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest other) {
        if (other == com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest.getDefaultInstance()) return this;
        if (routingInfoBuilder_ == null) {
          if (!other.routingInfo_.isEmpty()) {
            if (routingInfo_.isEmpty()) {
              routingInfo_ = other.routingInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRoutingInfoIsMutable();
              routingInfo_.addAll(other.routingInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.routingInfo_.isEmpty()) {
            if (routingInfoBuilder_.isEmpty()) {
              routingInfoBuilder_.dispose();
              routingInfoBuilder_ = null;
              routingInfo_ = other.routingInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              routingInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRoutingInfoFieldBuilder() : null;
            } else {
              routingInfoBuilder_.addAllMessages(other.routingInfo_);
            }
          }
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
        com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo> routingInfo_ =
        java.util.Collections.emptyList();
      private void ensureRoutingInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          routingInfo_ = new java.util.ArrayList<com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo>(routingInfo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder> routingInfoBuilder_;

      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public java.util.List<com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo> getRoutingInfoList() {
        if (routingInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(routingInfo_);
        } else {
          return routingInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public int getRoutingInfoCount() {
        if (routingInfoBuilder_ == null) {
          return routingInfo_.size();
        } else {
          return routingInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo getRoutingInfo(int index) {
        if (routingInfoBuilder_ == null) {
          return routingInfo_.get(index);
        } else {
          return routingInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder setRoutingInfo(
          int index, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo value) {
        if (routingInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutingInfoIsMutable();
          routingInfo_.set(index, value);
          onChanged();
        } else {
          routingInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder setRoutingInfo(
          int index, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder builderForValue) {
        if (routingInfoBuilder_ == null) {
          ensureRoutingInfoIsMutable();
          routingInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          routingInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder addRoutingInfo(com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo value) {
        if (routingInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutingInfoIsMutable();
          routingInfo_.add(value);
          onChanged();
        } else {
          routingInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder addRoutingInfo(
          int index, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo value) {
        if (routingInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutingInfoIsMutable();
          routingInfo_.add(index, value);
          onChanged();
        } else {
          routingInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder addRoutingInfo(
          com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder builderForValue) {
        if (routingInfoBuilder_ == null) {
          ensureRoutingInfoIsMutable();
          routingInfo_.add(builderForValue.build());
          onChanged();
        } else {
          routingInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder addRoutingInfo(
          int index, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder builderForValue) {
        if (routingInfoBuilder_ == null) {
          ensureRoutingInfoIsMutable();
          routingInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          routingInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder addAllRoutingInfo(
          java.lang.Iterable<? extends com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo> values) {
        if (routingInfoBuilder_ == null) {
          ensureRoutingInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, routingInfo_);
          onChanged();
        } else {
          routingInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder clearRoutingInfo() {
        if (routingInfoBuilder_ == null) {
          routingInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          routingInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public Builder removeRoutingInfo(int index) {
        if (routingInfoBuilder_ == null) {
          ensureRoutingInfoIsMutable();
          routingInfo_.remove(index);
          onChanged();
        } else {
          routingInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder getRoutingInfoBuilder(
          int index) {
        return getRoutingInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder getRoutingInfoOrBuilder(
          int index) {
        if (routingInfoBuilder_ == null) {
          return routingInfo_.get(index);  } else {
          return routingInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public java.util.List<? extends com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder> 
           getRoutingInfoOrBuilderList() {
        if (routingInfoBuilder_ != null) {
          return routingInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(routingInfo_);
        }
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder addRoutingInfoBuilder() {
        return getRoutingInfoFieldBuilder().addBuilder(
            com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder addRoutingInfoBuilder(
          int index) {
        return getRoutingInfoFieldBuilder().addBuilder(
            index, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GeneralMSG.RoutingInfo routingInfo = 1;</code>
       */
      public java.util.List<com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder> 
           getRoutingInfoBuilderList() {
        return getRoutingInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder> 
          getRoutingInfoFieldBuilder() {
        if (routingInfoBuilder_ == null) {
          routingInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfo.Builder, com.sasa5680.ProtoMessages.GeneralMSG.RoutingInfoOrBuilder>(
                  routingInfo_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          routingInfo_ = null;
        }
        return routingInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:A2R_VidedoRequest)
    }

    // @@protoc_insertion_point(class_scope:A2R_VidedoRequest)
    private static final com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest();
    }

    public static com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<A2R_VidedoRequest>
        PARSER = new com.google.protobuf.AbstractParser<A2R_VidedoRequest>() {
      @java.lang.Override
      public A2R_VidedoRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new A2R_VidedoRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<A2R_VidedoRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<A2R_VidedoRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sasa5680.ProtoMessages.A2R.A2RVideoRequest.A2R_VidedoRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_A2R_VidedoRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_A2R_VidedoRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026A2R_VideoRequest.proto\032\020GeneralMSG.pro" +
      "to\"A\n\021A2R_VidedoRequest\022,\n\013routingInfo\030\001" +
      " \003(\0132\027.GeneralMSG.RoutingInfoB \n\036com.sas" +
      "a5680.ProtoMessages.A2Rb\006proto3"
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
          com.sasa5680.ProtoMessages.GeneralMSG.getDescriptor(),
        }, assigner);
    internal_static_A2R_VidedoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_A2R_VidedoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_A2R_VidedoRequest_descriptor,
        new java.lang.String[] { "RoutingInfo", });
    com.sasa5680.ProtoMessages.GeneralMSG.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
