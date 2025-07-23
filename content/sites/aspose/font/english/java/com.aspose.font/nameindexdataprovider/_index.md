---
title: NameIndexDataProvider
second_title: Aspose.Font for Java API Reference
description: Provides settings common to CFF fonts.
type: docs
weight: 67
url: /java/com.aspose.font/nameindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class NameIndexDataProvider implements ICffIndexDataProvider
```

Provides settings common to CFF fonts.
## Constructors

| Constructor | Description |
| --- | --- |
| [NameIndexDataProvider()](#NameIndexDataProvider--) |  |
## Methods

| Method | Description |
| --- | --- |
| [addName(String name)](#addName-java.lang.String-) | Adds a font name to the Name INDEX structure. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Gets font name at the specified index. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Gets the number of objects in the CFF INDEX structure. |
| [getName(int index)](#getName-int-) | Gets name of font at the specified index. |
| [getRawBytes()](#getRawBytes--) | Gets all the bytes of the CFF INDEX structure. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeName(int index)](#removeName-int-) | Removes the name at the specified index. |
| [set(int index, String name)](#set-int-java.lang.String-) | Specifies font name at the specified index. |
| [setName(String name, int index)](#setName-java.lang.String-int-) | Sets font name at the specified index. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NameIndexDataProvider() {#NameIndexDataProvider--}
```
public NameIndexDataProvider()
```


### addName(String name) {#addName-java.lang.String-}
```
public abstract void addName(String name)
```


Adds a font name to the Name INDEX structure. Use this method with caution because each font name in the CFF Name INDEX structure must have a corresponding DICT structure in the Top DICT index according to the CFF specification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

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


Gets font name at the specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Font index. |

**Returns:**
java.lang.String - Font name.
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


Gets the number of objects in the CFF INDEX structure.

**Returns:**
int
### getName(int index) {#getName-int-}
```
public abstract String getName(int index)
```


Gets name of font at the specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Font index. |

**Returns:**
java.lang.String - The font name.
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Gets all the bytes of the CFF INDEX structure.

**Returns:**
byte[] - Bytes of the CFF INDEX structure
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




### removeName(int index) {#removeName-int-}
```
public abstract void removeName(int index)
```


Removes the name at the specified index. Use this method with caution because each font name in the CFF Name INDEX structure must have a corresponding DICT structure in the Top DICT index according to the CFF specification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Font index. |

### set(int index, String name) {#set-int-java.lang.String-}
```
public abstract void set(int index, String name)
```


Specifies font name at the specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Font index. |
| name | java.lang.String | Font name. |

### setName(String name, int index) {#setName-java.lang.String-int-}
```
public abstract void setName(String name, int index)
```


Sets font name at the specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Font name. |
| index | int | Font index. |

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

