/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbortTxnRequest implements org.apache.thrift.TBase<AbortTxnRequest, AbortTxnRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AbortTxnRequest");

  private static final org.apache.thrift.protocol.TField TXNID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnid", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AbortTxnRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AbortTxnRequestTupleSchemeFactory());
  }

  private long txnid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXNID((short)1, "txnid");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TXNID
          return TXNID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TXNID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXNID, new org.apache.thrift.meta_data.FieldMetaData("txnid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AbortTxnRequest.class, metaDataMap);
  }

  public AbortTxnRequest() {
  }

  public AbortTxnRequest(
    long txnid)
  {
    this();
    this.txnid = txnid;
    setTxnidIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AbortTxnRequest(AbortTxnRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txnid = other.txnid;
  }

  public AbortTxnRequest deepCopy() {
    return new AbortTxnRequest(this);
  }

  @Override
  public void clear() {
    setTxnidIsSet(false);
    this.txnid = 0;
  }

  public long getTxnid() {
    return this.txnid;
  }

  public void setTxnid(long txnid) {
    this.txnid = txnid;
    setTxnidIsSet(true);
  }

  public void unsetTxnid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnid is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnid() {
    return EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TXNID:
      if (value == null) {
        unsetTxnid();
      } else {
        setTxnid((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TXNID:
      return Long.valueOf(getTxnid());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TXNID:
      return isSetTxnid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AbortTxnRequest)
      return this.equals((AbortTxnRequest)that);
    return false;
  }

  public boolean equals(AbortTxnRequest that) {
    if (that == null)
      return false;

    boolean this_present_txnid = true;
    boolean that_present_txnid = true;
    if (this_present_txnid || that_present_txnid) {
      if (!(this_present_txnid && that_present_txnid))
        return false;
      if (this.txnid != that.txnid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_txnid = true;
    builder.append(present_txnid);
    if (present_txnid)
      builder.append(txnid);

    return builder.toHashCode();
  }

  public int compareTo(AbortTxnRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AbortTxnRequest typedOther = (AbortTxnRequest)other;

    lastComparison = Boolean.valueOf(isSetTxnid()).compareTo(typedOther.isSetTxnid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnid, typedOther.txnid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AbortTxnRequest(");
    boolean first = true;

    sb.append("txnid:");
    sb.append(this.txnid);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTxnid()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txnid' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AbortTxnRequestStandardSchemeFactory implements SchemeFactory {
    public AbortTxnRequestStandardScheme getScheme() {
      return new AbortTxnRequestStandardScheme();
    }
  }

  private static class AbortTxnRequestStandardScheme extends StandardScheme<AbortTxnRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AbortTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXNID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnid = iprot.readI64();
              struct.setTxnidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AbortTxnRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TXNID_FIELD_DESC);
      oprot.writeI64(struct.txnid);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AbortTxnRequestTupleSchemeFactory implements SchemeFactory {
    public AbortTxnRequestTupleScheme getScheme() {
      return new AbortTxnRequestTupleScheme();
    }
  }

  private static class AbortTxnRequestTupleScheme extends TupleScheme<AbortTxnRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AbortTxnRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.txnid);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AbortTxnRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.txnid = iprot.readI64();
      struct.setTxnidIsSet(true);
    }
  }

}

