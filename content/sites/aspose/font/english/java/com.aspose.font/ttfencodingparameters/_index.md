---
title: TtfEncodingParameters
second_title: Aspose.Font for Java API Reference
description: Represents TTF encoding parameters.
type: docs
weight: 92
url: /java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

Represents TTF encoding parameters. Should be used to request specific encoding from TTF Font.
## Constructors

| Constructor | Description |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | Initializes new instance of TtfEncodingParameters class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPlatformId()](#getPlatformId--) | Get PlatformId value. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | Gets PlatformSpecificId value. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setPlatformId(int value)](#setPlatformId-int-) | Sets PlatformId value. |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | Sets PlatformSpecificId value. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


Initializes new instance of TtfEncodingParameters class. Takes Platform Id, Platform-specific encoding id as parameters. These parameters used to request special CMap subtable from main font CMap table, see table 'CMap', 'name' in OpenType Font File specification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| platformId | int | Platform id. |
| platformSpecificId | int | Platform-specific encoding id. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


Get PlatformId value.

**Returns:**
int - PlatformId value.
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


Gets PlatformSpecificId value.

**Returns:**
int - PlatformSpecificId value.
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




### setPlatformId(int value) {#setPlatformId-int-}
```
public void setPlatformId(int value)
```


Sets PlatformId value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | PlatformId value. |

### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


Sets PlatformSpecificId value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | PlatformSpecificId value. |

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

