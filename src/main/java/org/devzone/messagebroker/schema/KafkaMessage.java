/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.devzone.messagebroker.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class KafkaMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3050706030976369251L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KafkaMessage\",\"namespace\":\"org.devzone.messagebroker.schema\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"sender\",\"type\":\"string\"},{\"name\":\"receiver\",\"type\":\"string\"},{\"name\":\"message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KafkaMessage> ENCODER =
      new BinaryMessageEncoder<KafkaMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KafkaMessage> DECODER =
      new BinaryMessageDecoder<KafkaMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<KafkaMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<KafkaMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<KafkaMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KafkaMessage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this KafkaMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a KafkaMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a KafkaMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static KafkaMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence sender;
  @Deprecated public java.lang.CharSequence receiver;
  @Deprecated public java.lang.CharSequence message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KafkaMessage() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param sender The new value for sender
   * @param receiver The new value for receiver
   * @param message The new value for message
   */
  public KafkaMessage(java.lang.CharSequence id, java.lang.CharSequence sender, java.lang.CharSequence receiver, java.lang.CharSequence message) {
    this.id = id;
    this.sender = sender;
    this.receiver = receiver;
    this.message = message;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return sender;
    case 2: return receiver;
    case 3: return message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: sender = (java.lang.CharSequence)value$; break;
    case 2: receiver = (java.lang.CharSequence)value$; break;
    case 3: message = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'sender' field.
   * @return The value of the 'sender' field.
   */
  public java.lang.CharSequence getSender() {
    return sender;
  }


  /**
   * Sets the value of the 'sender' field.
   * @param value the value to set.
   */
  public void setSender(java.lang.CharSequence value) {
    this.sender = value;
  }

  /**
   * Gets the value of the 'receiver' field.
   * @return The value of the 'receiver' field.
   */
  public java.lang.CharSequence getReceiver() {
    return receiver;
  }


  /**
   * Sets the value of the 'receiver' field.
   * @param value the value to set.
   */
  public void setReceiver(java.lang.CharSequence value) {
    this.receiver = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }


  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Creates a new KafkaMessage RecordBuilder.
   * @return A new KafkaMessage RecordBuilder
   */
  public static org.devzone.messagebroker.schema.KafkaMessage.Builder newBuilder() {
    return new org.devzone.messagebroker.schema.KafkaMessage.Builder();
  }

  /**
   * Creates a new KafkaMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KafkaMessage RecordBuilder
   */
  public static org.devzone.messagebroker.schema.KafkaMessage.Builder newBuilder(org.devzone.messagebroker.schema.KafkaMessage.Builder other) {
    if (other == null) {
      return new org.devzone.messagebroker.schema.KafkaMessage.Builder();
    } else {
      return new org.devzone.messagebroker.schema.KafkaMessage.Builder(other);
    }
  }

  /**
   * Creates a new KafkaMessage RecordBuilder by copying an existing KafkaMessage instance.
   * @param other The existing instance to copy.
   * @return A new KafkaMessage RecordBuilder
   */
  public static org.devzone.messagebroker.schema.KafkaMessage.Builder newBuilder(org.devzone.messagebroker.schema.KafkaMessage other) {
    if (other == null) {
      return new org.devzone.messagebroker.schema.KafkaMessage.Builder();
    } else {
      return new org.devzone.messagebroker.schema.KafkaMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for KafkaMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KafkaMessage>
    implements org.apache.avro.data.RecordBuilder<KafkaMessage> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence sender;
    private java.lang.CharSequence receiver;
    private java.lang.CharSequence message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.devzone.messagebroker.schema.KafkaMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.sender)) {
        this.sender = data().deepCopy(fields()[1].schema(), other.sender);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.receiver)) {
        this.receiver = data().deepCopy(fields()[2].schema(), other.receiver);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.message)) {
        this.message = data().deepCopy(fields()[3].schema(), other.message);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing KafkaMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(org.devzone.messagebroker.schema.KafkaMessage other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sender)) {
        this.sender = data().deepCopy(fields()[1].schema(), other.sender);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.receiver)) {
        this.receiver = data().deepCopy(fields()[2].schema(), other.receiver);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.message)) {
        this.message = data().deepCopy(fields()[3].schema(), other.message);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.devzone.messagebroker.schema.KafkaMessage.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public org.devzone.messagebroker.schema.KafkaMessage.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sender' field.
      * @return The value.
      */
    public java.lang.CharSequence getSender() {
      return sender;
    }


    /**
      * Sets the value of the 'sender' field.
      * @param value The value of 'sender'.
      * @return This builder.
      */
    public org.devzone.messagebroker.schema.KafkaMessage.Builder setSender(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.sender = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sender' field has been set.
      * @return True if the 'sender' field has been set, false otherwise.
      */
    public boolean hasSender() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sender' field.
      * @return This builder.
      */
    public org.devzone.messagebroker.schema.KafkaMessage.Builder clearSender() {
      sender = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'receiver' field.
      * @return The value.
      */
    public java.lang.CharSequence getReceiver() {
      return receiver;
    }


    /**
      * Sets the value of the 'receiver' field.
      * @param value The value of 'receiver'.
      * @return This builder.
      */
    public org.devzone.messagebroker.schema.KafkaMessage.Builder setReceiver(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.receiver = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'receiver' field has been set.
      * @return True if the 'receiver' field has been set, false otherwise.
      */
    public boolean hasReceiver() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'receiver' field.
      * @return This builder.
      */
    public org.devzone.messagebroker.schema.KafkaMessage.Builder clearReceiver() {
      receiver = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }


    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public org.devzone.messagebroker.schema.KafkaMessage.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.message = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public org.devzone.messagebroker.schema.KafkaMessage.Builder clearMessage() {
      message = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KafkaMessage build() {
      try {
        KafkaMessage record = new KafkaMessage();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.sender = fieldSetFlags()[1] ? this.sender : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.receiver = fieldSetFlags()[2] ? this.receiver : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.message = fieldSetFlags()[3] ? this.message : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KafkaMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<KafkaMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KafkaMessage>
    READER$ = (org.apache.avro.io.DatumReader<KafkaMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    out.writeString(this.sender);

    out.writeString(this.receiver);

    out.writeString(this.message);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      this.sender = in.readString(this.sender instanceof Utf8 ? (Utf8)this.sender : null);

      this.receiver = in.readString(this.receiver instanceof Utf8 ? (Utf8)this.receiver : null);

      this.message = in.readString(this.message instanceof Utf8 ? (Utf8)this.message : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 1:
          this.sender = in.readString(this.sender instanceof Utf8 ? (Utf8)this.sender : null);
          break;

        case 2:
          this.receiver = in.readString(this.receiver instanceof Utf8 ? (Utf8)this.receiver : null);
          break;

        case 3:
          this.message = in.readString(this.message instanceof Utf8 ? (Utf8)this.message : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









