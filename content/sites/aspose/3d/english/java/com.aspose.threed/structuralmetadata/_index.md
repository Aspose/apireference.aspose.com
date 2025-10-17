---
title: StructuralMetadata
second_title: Aspose.3D for Java API Reference
description: This class provides support for EXT_structural_metadata only used in glTF.
type: docs
weight: 180
url: /java/com.aspose.threed/structuralmetadata/
---

**Inheritance:**
java.lang.Object
```
public class StructuralMetadata
```

This class provides support for EXT\_structural\_metadata, only used in glTF.
## Constructors

| Constructor | Description |
| --- | --- |
| [StructuralMetadata()](#StructuralMetadata--) |  |
## Methods

| Method | Description |
| --- | --- |
| [attach(Scene scene)](#attach-com.aspose.threed.Scene-) | Attach current meta data to specified scene |
| [createClass(String name)](#createClass-java.lang.String-) | Create a meta class type |
| [createEnum(String name)](#createEnum-java.lang.String-) | Create an enum type |
| [createPropertyTable(String name, StructuralMetadata.ClassType clazz)](#createPropertyTable-java.lang.String-com.aspose.threed.StructuralMetadata.ClassType-) | Create a new property table with given meta class type |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [from(Scene scene)](#from-com.aspose.threed.Scene-) | Get [StructuralMetadata](../../com.aspose.threed/structuralmetadata) associated with specified scene. |
| [getClass()](#getClass--) |  |
| [getClasses()](#getClasses--) | The class definitions . |
| [getEnums()](#getEnums--) | The enum type definitions |
| [getPropertyTables()](#getPropertyTables--) | The property tables in this metadata. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StructuralMetadata() {#StructuralMetadata--}
```
public StructuralMetadata()
```


### attach(Scene scene) {#attach-com.aspose.threed.Scene-}
```
public void attach(Scene scene)
```


Attach current meta data to specified scene

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) |  |

### createClass(String name) {#createClass-java.lang.String-}
```
public StructuralMetadata.ClassType createClass(String name)
```


Create a meta class type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The class's name |

**Returns:**
[ClassType](../../com.aspose.threed/classtype) - Instance of the meta class
### createEnum(String name) {#createEnum-java.lang.String-}
```
public StructuralMetadata.EnumType createEnum(String name)
```


Create an enum type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The enum type's name |

**Returns:**
[EnumType](../../com.aspose.threed/enumtype) - Instance of the enum type
### createPropertyTable(String name, StructuralMetadata.ClassType clazz) {#createPropertyTable-java.lang.String-com.aspose.threed.StructuralMetadata.ClassType-}
```
public StructuralMetadata.PropertyTable createPropertyTable(String name, StructuralMetadata.ClassType clazz)
```


Create a new property table with given meta class type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of the property table |
| clazz | [ClassType](../../com.aspose.threed/classtype) | The class type of the new property table |

**Returns:**
[PropertyTable](../../com.aspose.threed/propertytable) - The new instance of property table
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
### from(Scene scene) {#from-com.aspose.threed.Scene-}
```
public static StructuralMetadata from(Scene scene)
```


Get [StructuralMetadata](../../com.aspose.threed/structuralmetadata) associated with specified scene.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | Which scene to look for the structural metadata |

**Returns:**
[StructuralMetadata](../../com.aspose.threed/structuralmetadata) - A valid instance of [StructuralMetadata](../../com.aspose.threed/structuralmetadata) if its found in the scene, otherwise null returned
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClasses() {#getClasses--}
```
public HashMap<String,StructuralMetadata.ClassType> getClasses()
```


The class definitions .

**Returns:**
java.util.HashMap<java.lang.String,com.aspose.threed.StructuralMetadata.ClassType> - The class definitions .
### getEnums() {#getEnums--}
```
public HashMap<String,StructuralMetadata.EnumType> getEnums()
```


The enum type definitions

**Returns:**
java.util.HashMap<java.lang.String,com.aspose.threed.StructuralMetadata.EnumType> - The enum type definitions
### getPropertyTables() {#getPropertyTables--}
```
public ArrayList<StructuralMetadata.PropertyTable> getPropertyTables()
```


The property tables in this metadata.

**Returns:**
java.util.ArrayList<com.aspose.threed.StructuralMetadata.PropertyTable> - The property tables in this metadata.
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
public final void wait(long arg0)
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

