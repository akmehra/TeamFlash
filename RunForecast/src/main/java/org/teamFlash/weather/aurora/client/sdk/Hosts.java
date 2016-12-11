/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.teamFlash.weather.aurora.client.sdk;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-10")
public class Hosts implements org.apache.thrift.TBase<Hosts, Hosts._Fields>, java.io.Serializable, Cloneable, Comparable<Hosts> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Hosts");

  private static final org.apache.thrift.protocol.TField HOST_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("hostNames", org.apache.thrift.protocol.TType.SET, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HostsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HostsTupleSchemeFactory());
  }

  public Set<String> hostNames; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOST_NAMES((short)1, "hostNames");

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
        case 1: // HOST_NAMES
          return HOST_NAMES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOST_NAMES, new org.apache.thrift.meta_data.FieldMetaData("hostNames", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Hosts.class, metaDataMap);
  }

  public Hosts() {
  }

  public Hosts(
    Set<String> hostNames)
  {
    this();
    this.hostNames = hostNames;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Hosts(Hosts other) {
    if (other.isSetHostNames()) {
      Set<String> __this__hostNames = new HashSet<String>(other.hostNames);
      this.hostNames = __this__hostNames;
    }
  }

  public Hosts deepCopy() {
    return new Hosts(this);
  }

  @Override
  public void clear() {
    this.hostNames = null;
  }

  public int getHostNamesSize() {
    return (this.hostNames == null) ? 0 : this.hostNames.size();
  }

  public java.util.Iterator<String> getHostNamesIterator() {
    return (this.hostNames == null) ? null : this.hostNames.iterator();
  }

  public void addToHostNames(String elem) {
    if (this.hostNames == null) {
      this.hostNames = new HashSet<String>();
    }
    this.hostNames.add(elem);
  }

  public Set<String> getHostNames() {
    return this.hostNames;
  }

  public Hosts setHostNames(Set<String> hostNames) {
    this.hostNames = hostNames;
    return this;
  }

  public void unsetHostNames() {
    this.hostNames = null;
  }

  /** Returns true if field hostNames is set (has been assigned a value) and false otherwise */
  public boolean isSetHostNames() {
    return this.hostNames != null;
  }

  public void setHostNamesIsSet(boolean value) {
    if (!value) {
      this.hostNames = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HOST_NAMES:
      if (value == null) {
        unsetHostNames();
      } else {
        setHostNames((Set<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HOST_NAMES:
      return getHostNames();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HOST_NAMES:
      return isSetHostNames();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Hosts)
      return this.equals((Hosts)that);
    return false;
  }

  public boolean equals(Hosts that) {
    if (that == null)
      return false;

    boolean this_present_hostNames = true && this.isSetHostNames();
    boolean that_present_hostNames = true && that.isSetHostNames();
    if (this_present_hostNames || that_present_hostNames) {
      if (!(this_present_hostNames && that_present_hostNames))
        return false;
      if (!this.hostNames.equals(that.hostNames))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_hostNames = true && (isSetHostNames());
    list.add(present_hostNames);
    if (present_hostNames)
      list.add(hostNames);

    return list.hashCode();
  }

  @Override
  public int compareTo(Hosts other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHostNames()).compareTo(other.isSetHostNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostNames, other.hostNames);
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
    StringBuilder sb = new StringBuilder("Hosts(");
    boolean first = true;

    sb.append("hostNames:");
    if (this.hostNames == null) {
      sb.append("null");
    } else {
      sb.append(this.hostNames);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HostsStandardSchemeFactory implements SchemeFactory {
    public HostsStandardScheme getScheme() {
      return new HostsStandardScheme();
    }
  }

  private static class HostsStandardScheme extends StandardScheme<Hosts> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Hosts struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOST_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set190 = iprot.readSetBegin();
                struct.hostNames = new HashSet<String>(2*_set190.size);
                String _elem191;
                for (int _i192 = 0; _i192 < _set190.size; ++_i192)
                {
                  _elem191 = iprot.readString();
                  struct.hostNames.add(_elem191);
                }
                iprot.readSetEnd();
              }
              struct.setHostNamesIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Hosts struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hostNames != null) {
        oprot.writeFieldBegin(HOST_NAMES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.hostNames.size()));
          for (String _iter193 : struct.hostNames)
          {
            oprot.writeString(_iter193);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HostsTupleSchemeFactory implements SchemeFactory {
    public HostsTupleScheme getScheme() {
      return new HostsTupleScheme();
    }
  }

  private static class HostsTupleScheme extends TupleScheme<Hosts> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Hosts struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHostNames()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetHostNames()) {
        {
          oprot.writeI32(struct.hostNames.size());
          for (String _iter194 : struct.hostNames)
          {
            oprot.writeString(_iter194);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Hosts struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set195 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.hostNames = new HashSet<String>(2*_set195.size);
          String _elem196;
          for (int _i197 = 0; _i197 < _set195.size; ++_i197)
          {
            _elem196 = iprot.readString();
            struct.hostNames.add(_elem196);
          }
        }
        struct.setHostNamesIsSet(true);
      }
    }
  }

}

