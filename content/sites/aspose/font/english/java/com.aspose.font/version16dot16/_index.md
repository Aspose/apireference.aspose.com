---
title: Version16Dot16
second_title: Aspose.Font for Java API Reference
description: Represents Version16Dot16 datatype
type: docs
weight: 117
url: /java/com.aspose.font/version16dot16/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Version16Dot16 implements Cloneable
```

Represents Version16Dot16 datatype
## Constructors

| Constructor | Description |
| --- | --- |
| [Version16Dot16()](#Version16Dot16--) | Constructor |
| [Version16Dot16(int majorNumber, int minorNumber)](#Version16Dot16-int-int-) | Constructor |
## Methods

| Method | Description |
| --- | --- |
| [clone()](#clone--) | Create a copy of  Version16Dot16  object. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMajorNumber()](#getMajorNumber--) | Gets major version number. |
| [getMinorNumber()](#getMinorNumber--) | Gets minor version number. |
| [getRawBytes()](#getRawBytes--) | Gets all raw bits for Version16Dot16 version number as byte array with size 4 bytes. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMajorNumber(int value)](#setMajorNumber-int-) | Sets major version number. |
| [setMinorNumber(int value)](#setMinorNumber-int-) | Sets minor version number. |
| [toString()](#toString--) | Return version value as a formated string For example "0.5", "1.1", "3.0" etc. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Version16Dot16() {#Version16Dot16--}
```
public Version16Dot16()
```


Constructor

### Version16Dot16(int majorNumber, int minorNumber) {#Version16Dot16-int-int-}
```
public Version16Dot16(int majorNumber, int minorNumber)
```


Constructor

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| majorNumber | int | Major version number |
| minorNumber | int | Minor version number |

### clone() {#clone--}
```
public Object clone()
```


Create a copy of  Version16Dot16  object.

**Returns:**
java.lang.Object - Object of type  Version16Dot16 
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
### getMajorNumber() {#getMajorNumber--}
```
public int getMajorNumber()
```


Gets major version number. Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: \{0, 0, 80, 0\}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object  Version16Dot16  will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000.

**Returns:**
int - Major version number.
### getMinorNumber() {#getMinorNumber--}
```
public int getMinorNumber()
```


Gets minor version number. Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: \{0, 0, 80, 0\}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object  Version16Dot16  will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000.

**Returns:**
int - Minor version number.
### getRawBytes() {#getRawBytes--}
```
public byte[] getRawBytes()
```


Gets all raw bits for Version16Dot16 version number as byte array with size 4 bytes.

**Returns:**
byte[] - All raw bits for Version16Dot16 version number as byte array with size 4 bytes.
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




### setMajorNumber(int value) {#setMajorNumber-int-}
```
public void setMajorNumber(int value)
```


Sets major version number. Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: \{0, 0, 80, 0\}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object  Version16Dot16  will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | Major version number. |

### setMinorNumber(int value) {#setMinorNumber-int-}
```
public void setMinorNumber(int value)
```


Sets minor version number. Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: \{0, 0, 80, 0\}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object  Version16Dot16  will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | Minor version number. |

### toString() {#toString--}
```
public String toString()
```


Return version value as a formated string For example "0.5", "1.1", "3.0" etc.

**Returns:**
java.lang.String - Object of  String  type
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

