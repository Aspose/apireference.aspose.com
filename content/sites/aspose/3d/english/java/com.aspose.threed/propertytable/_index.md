---
title: StructuralMetadata.PropertyTable
second_title: Aspose.3D for Java API Reference
description: Property table.
type: docs
weight: 14
url: /java/com.aspose.threed/structuralmetadata.propertytable/
---

**Inheritance:**
java.lang.Object
```
public static class StructuralMetadata.PropertyTable
```

Property table.
## Constructors

| Constructor | Description |
| --- | --- |
| [PropertyTable(String name, StructuralMetadata.ClassType mclass)](#PropertyTable-java.lang.String-com.aspose.threed.StructuralMetadata.ClassType-) | Constructor of the property table. |
## Methods

| Method | Description |
| --- | --- |
| [addValue(StructuralMetadata.Property prop, Object value)](#addValue-com.aspose.threed.StructuralMetadata.Property-java.lang.Object-) | Add a new property to the property table. |
| [addValue(String propName, Object value)](#addValue-java.lang.String-java.lang.Object-) | Add a new property to the property table. |
| [attach(VertexElementUserData userData)](#attach-com.aspose.threed.VertexElementUserData-) | Attach current property table to specified user data |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [from(VertexElementUserData userData)](#from-com.aspose.threed.VertexElementUserData-) | Extract attached property table from specified user data |
| [getClass()](#getClass--) |  |
| [getMetaClass()](#getMetaClass--) | The meta class of this property table. |
| [getName()](#getName--) | Name of the property table. |
| [getValue(String name)](#getValue-java.lang.String-) | Gets the value of specified property name |
| [getValues()](#getValues--) | Values of the property table. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PropertyTable(String name, StructuralMetadata.ClassType mclass) {#PropertyTable-java.lang.String-com.aspose.threed.StructuralMetadata.ClassType-}
```
public PropertyTable(String name, StructuralMetadata.ClassType mclass)
```


Constructor of the property table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of this table instance. |
| mclass | [ClassType](../../com.aspose.threed/classtype) | The meta class definition of this property table |

### addValue(StructuralMetadata.Property prop, Object value) {#addValue-com.aspose.threed.StructuralMetadata.Property-java.lang.Object-}
```
public void addValue(StructuralMetadata.Property prop, Object value)
```


Add a new property to the property table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| prop | [Property](../../com.aspose.threed/property) | Which property to add with value |
| value | java.lang.Object | Array of values |

### addValue(String propName, Object value) {#addValue-java.lang.String-java.lang.Object-}
```
public void addValue(String propName, Object value)
```


Add a new property to the property table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propName | java.lang.String | Which property to add with value |
| value | java.lang.Object | Array of values |

### attach(VertexElementUserData userData) {#attach-com.aspose.threed.VertexElementUserData-}
```
public void attach(VertexElementUserData userData)
```


Attach current property table to specified user data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| userData | [VertexElementUserData](../../com.aspose.threed/vertexelementuserdata) |  |

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
### from(VertexElementUserData userData) {#from-com.aspose.threed.VertexElementUserData-}
```
public static StructuralMetadata.PropertyTable from(VertexElementUserData userData)
```


Extract attached property table from specified user data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| userData | [VertexElementUserData](../../com.aspose.threed/vertexelementuserdata) | The user data which associated with a property table |

**Returns:**
[PropertyTable](../../com.aspose.threed/propertytable) - The associated property table instance
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMetaClass() {#getMetaClass--}
```
public StructuralMetadata.ClassType getMetaClass()
```


The meta class of this property table.

**Returns:**
[ClassType](../../com.aspose.threed/classtype) - The meta class of this property table.
### getName() {#getName--}
```
public String getName()
```


Name of the property table.

**Returns:**
java.lang.String - Name of the property table.
### getValue(String name) {#getValue-java.lang.String-}
```
public Object getValue(String name)
```


Gets the value of specified property name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Property name |

**Returns:**
java.lang.Object - Property value or null if not found
### getValues() {#getValues--}
```
public HashMap<String,Object> getValues()
```


Values of the property table.

**Returns:**
java.util.HashMap<java.lang.String,java.lang.Object> - Values of the property table.
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

