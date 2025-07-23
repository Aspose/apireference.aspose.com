---
title: StringIndexDataProvider
second_title: Aspose.Font for Java API Reference
description: Declares functionality to access CFF String INDEX structure.
type: docs
weight: 74
url: /java/com.aspose.font/stringindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class StringIndexDataProvider implements ICffIndexDataProvider
```

Declares functionality to access CFF String INDEX structure.
## Constructors

| Constructor | Description |
| --- | --- |
| [StringIndexDataProvider()](#StringIndexDataProvider--) |  |
## Methods

| Method | Description |
| --- | --- |
| [addString(String value)](#addString-java.lang.String-) | Adds string into CFF String INDEX structure. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Gets/sets string at the specified index. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | The number of objects in the CFF INDEX structure. |
| [getRawBytes()](#getRawBytes--) | Gets all the bytes of the CFF INDEX structure. |
| [getString(int index)](#getString-int-) | Gets string at the specified index from CFF String INDEX structure. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeString(int index)](#removeString-int-) | Removes string from CFF String Index structure at the specified index. |
| [set(int index, String value)](#set-int-java.lang.String-) |  |
| [setString(String value, int index)](#setString-java.lang.String-int-) | Sets string in the CFF String Index structure at the specified index. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringIndexDataProvider() {#StringIndexDataProvider--}
```
public StringIndexDataProvider()
```


### addString(String value) {#addString-java.lang.String-}
```
public abstract void addString(String value)
```


Adds string into CFF String INDEX structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | String value |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public abstract String get(int index)
```


Gets/sets string at the specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index of string, index means an ordinal number at CFF INDEX structure, not SID |

**Returns:**
java.lang.String - String
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public abstract int getCount()
```


The number of objects in the CFF INDEX structure.

**Returns:**
int
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Gets all the bytes of the CFF INDEX structure.

**Returns:**
byte[] - Bytes of the CFF INDEX structure
### getString(int index) {#getString-int-}
```
public abstract String getString(int index)
```


Gets string at the specified index from CFF String INDEX structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index of string, index means ordinal number in CFF INDEX structure, not SID |

**Returns:**
java.lang.String - String
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeString(int index) {#removeString-int-}
```
public abstract void removeString(int index)
```


Removes string from CFF String Index structure at the specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index of string, index means an ordinal number at CFF INDEX structure, not SID |

### set(int index, String value) {#set-int-java.lang.String-}
```
public abstract void set(int index, String value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int |  |
| value | java.lang.String |  |

### setString(String value, int index) {#setString-java.lang.String-int-}
```
public abstract void setString(String value, int index)
```


Sets string in the CFF String Index structure at the specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | String value |
| index | int | Index of string, index means ordinal number in CFF INDEX structure, not SID |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

