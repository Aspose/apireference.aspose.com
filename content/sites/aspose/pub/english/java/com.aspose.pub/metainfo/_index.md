---
title: MetaInfo
second_title: Aspose.PUB for Java API Reference
description: Base class for summary info objects
type: docs
weight: 16
url: /java/com.aspose.pub/metainfo/
---
**Inheritance:**
java.lang.Object
```
public class MetaInfo
```

Base class for summary info objects
## Constructors

| Constructor | Description |
| --- | --- |
| [MetaInfo()](#MetaInfo--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getRawByteOrder()](#getRawByteOrder--) | Raw byte order |
| [isLittleEndian()](#isLittleEndian--) | Is little endian |
| [getVersion()](#getVersion--) | Version value |
| [getSysID()](#getSysID--) | System identifier |
| [getClsid()](#getClsid--) | CLSID identifier |
| [getFMTID()](#getFMTID--) | FMTID identifier |
| [getPropsCount()](#getPropsCount--) | Count of properties |
| [getPropsIdentifiers()](#getPropsIdentifiers--) | Identifiers of properties |
| [getProperty(long id)](#getProperty-long-) | Gets property by ID passed |
| [getCodePage()](#getCodePage--) | Code page identifier |
| [getLocale()](#getLocale--) | Locale identifier |
### MetaInfo() {#MetaInfo--}
```
public MetaInfo()
```


### getRawByteOrder() {#getRawByteOrder--}
```
public final int getRawByteOrder()
```


Raw byte order

**Returns:**
int - int value
### isLittleEndian() {#isLittleEndian--}
```
public final boolean isLittleEndian()
```


Is little endian

**Returns:**
boolean - boolean value
### getVersion() {#getVersion--}
```
public final int getVersion()
```


Version value

**Returns:**
int - int value
### getSysID() {#getSysID--}
```
public final long getSysID()
```


System identifier

**Returns:**
long - long value
### getClsid() {#getClsid--}
```
public final UUID getClsid()
```


CLSID identifier

**Returns:**
java.util.UUID - java.util.UUID instance
### getFMTID() {#getFMTID--}
```
public final UUID getFMTID()
```


FMTID identifier

**Returns:**
java.util.UUID - java.util.UUID instance
### getPropsCount() {#getPropsCount--}
```
public final int getPropsCount()
```


Count of properties

**Returns:**
int - int value
### getPropsIdentifiers() {#getPropsIdentifiers--}
```
public final List<Long> getPropsIdentifiers()
```


Identifiers of properties

**Returns:**
java.util.List<java.lang.Long> - List of Long
### getProperty(long id) {#getProperty-long-}
```
public final Object getProperty(long id)
```


Gets property by ID passed

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | long | property identifier |

**Returns:**
java.lang.Object - property value
### getCodePage() {#getCodePage--}
```
public final short getCodePage()
```


Code page identifier

**Returns:**
short - short value
### getLocale() {#getLocale--}
```
public final long getLocale()
```


Locale identifier

**Returns:**
long - long value
