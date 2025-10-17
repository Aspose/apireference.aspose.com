---
title: StructuralMetadata.ClassType
second_title: Aspose.3D for Java API Reference
description: Class definition in metadata
type: docs
weight: 10
url: /java/com.aspose.threed/structuralmetadata.classtype/
---

**Inheritance:**
java.lang.Object
```
public static class StructuralMetadata.ClassType
```

Class definition in metadata
## Constructors

| Constructor | Description |
| --- | --- |
| [ClassType(String name, String displayName, String description, ArrayList<StructuralMetadata.Property> properties)](#ClassType-java.lang.String-java.lang.String-java.lang.String-java.util.ArrayList-com.aspose.threed.StructuralMetadata.Property--) | Constructor of the class definition |
## Methods

| Method | Description |
| --- | --- |
| [addProperty(StructuralMetadata.Property property)](#addProperty-com.aspose.threed.StructuralMetadata.Property-) | Add a specified property to this class |
| [addProperty(String name, StructuralMetadata.EnumType type, boolean array)](#addProperty-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-) |  |
| [addProperty(String name, StructuralMetadata.EnumType type, boolean array, Integer count)](#addProperty-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-java.lang.Integer-) |  |
| [addProperty(String name, Class<?> type)](#addProperty-java.lang.String-java.lang.Class----) | Add a new property with specified type |
| [addProperty(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array)](#addProperty-java.lang.String-java.lang.String-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-) |  |
| [addProperty(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count)](#addProperty-java.lang.String-java.lang.String-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-java.lang.Integer-) |  |
| [addProperty(String name, String displayName, String description, Class<?> type)](#addProperty-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----) |  |
| [addProperty(String name, String displayName, String description, Class<?> type, boolean normalized)](#addProperty-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----boolean-) |  |
| [addProperty(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count)](#addProperty-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----boolean-java.lang.Integer-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDescription()](#getDescription--) | The description of the class |
| [getDisplayName()](#getDisplayName--) | The name of the class, used by UI for representation |
| [getName()](#getName--) | The unique name of the class |
| [getProperties()](#getProperties--) | The properties defined in this class. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setDescription(String value)](#setDescription-java.lang.String-) | The description of the class |
| [setDisplayName(String value)](#setDisplayName-java.lang.String-) | The name of the class, used by UI for representation |
| [toString()](#toString--) | Gets the string representation of this instance. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ClassType(String name, String displayName, String description, ArrayList<StructuralMetadata.Property> properties) {#ClassType-java.lang.String-java.lang.String-java.lang.String-java.util.ArrayList-com.aspose.threed.StructuralMetadata.Property--}
```
public ClassType(String name, String displayName, String description, ArrayList<StructuralMetadata.Property> properties)
```


Constructor of the class definition

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The unique name of the class |
| displayName | java.lang.String | The name of the class, used by UI for representation |
| description | java.lang.String | The description of the class |
| properties | java.util.ArrayList<com.aspose.threed.StructuralMetadata.Property> | The properties defined in this class |

### addProperty(StructuralMetadata.Property property) {#addProperty-com.aspose.threed.StructuralMetadata.Property-}
```
public void addProperty(StructuralMetadata.Property property)
```


Add a specified property to this class

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) |  |

### addProperty(String name, StructuralMetadata.EnumType type, boolean array) {#addProperty-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-}
```
public StructuralMetadata.Property addProperty(String name, StructuralMetadata.EnumType type, boolean array)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| type | [EnumType](../../com.aspose.threed/enumtype) |  |
| array | boolean |  |

**Returns:**
[Property](../../com.aspose.threed/property)
### addProperty(String name, StructuralMetadata.EnumType type, boolean array, Integer count) {#addProperty-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-java.lang.Integer-}
```
public StructuralMetadata.Property addProperty(String name, StructuralMetadata.EnumType type, boolean array, Integer count)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| type | [EnumType](../../com.aspose.threed/enumtype) |  |
| array | boolean |  |
| count | java.lang.Integer |  |

**Returns:**
[Property](../../com.aspose.threed/property)
### addProperty(String name, Class<?> type) {#addProperty-java.lang.String-java.lang.Class----}
```
public StructuralMetadata.Property addProperty(String name, Class<?> type)
```


Add a new property with specified type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Property's name |
| type | java.lang.Class<?> | Property's data type |

**Returns:**
[Property](../../com.aspose.threed/property)
### addProperty(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array) {#addProperty-java.lang.String-java.lang.String-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-}
```
public StructuralMetadata.Property addProperty(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| displayName | java.lang.String |  |
| description | java.lang.String |  |
| type | [EnumType](../../com.aspose.threed/enumtype) |  |
| array | boolean |  |

**Returns:**
[Property](../../com.aspose.threed/property)
### addProperty(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count) {#addProperty-java.lang.String-java.lang.String-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-java.lang.Integer-}
```
public StructuralMetadata.Property addProperty(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| displayName | java.lang.String |  |
| description | java.lang.String |  |
| type | [EnumType](../../com.aspose.threed/enumtype) |  |
| array | boolean |  |
| count | java.lang.Integer |  |

**Returns:**
[Property](../../com.aspose.threed/property)
### addProperty(String name, String displayName, String description, Class<?> type) {#addProperty-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----}
```
public StructuralMetadata.Property addProperty(String name, String displayName, String description, Class<?> type)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| displayName | java.lang.String |  |
| description | java.lang.String |  |
| type | java.lang.Class<?> |  |

**Returns:**
[Property](../../com.aspose.threed/property)
### addProperty(String name, String displayName, String description, Class<?> type, boolean normalized) {#addProperty-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----boolean-}
```
public StructuralMetadata.Property addProperty(String name, String displayName, String description, Class<?> type, boolean normalized)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| displayName | java.lang.String |  |
| description | java.lang.String |  |
| type | java.lang.Class<?> |  |
| normalized | boolean |  |

**Returns:**
[Property](../../com.aspose.threed/property)
### addProperty(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count) {#addProperty-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----boolean-java.lang.Integer-}
```
public StructuralMetadata.Property addProperty(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| displayName | java.lang.String |  |
| description | java.lang.String |  |
| type | java.lang.Class<?> |  |
| normalized | boolean |  |
| count | java.lang.Integer |  |

**Returns:**
[Property](../../com.aspose.threed/property)
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
### getDescription() {#getDescription--}
```
public String getDescription()
```


The description of the class

**Returns:**
java.lang.String - The description of the class
### getDisplayName() {#getDisplayName--}
```
public String getDisplayName()
```


The name of the class, used by UI for representation

**Returns:**
java.lang.String - The name of the class, used by UI for representation
### getName() {#getName--}
```
public String getName()
```


The unique name of the class

**Returns:**
java.lang.String - The unique name of the class
### getProperties() {#getProperties--}
```
public List<StructuralMetadata.Property> getProperties()
```


The properties defined in this class.

**Returns:**
java.util.List<com.aspose.threed.StructuralMetadata.Property> - The properties defined in this class.
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




### setDescription(String value) {#setDescription-java.lang.String-}
```
public void setDescription(String value)
```


The description of the class

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setDisplayName(String value) {#setDisplayName-java.lang.String-}
```
public void setDisplayName(String value)
```


The name of the class, used by UI for representation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### toString() {#toString--}
```
public String toString()
```


Gets the string representation of this instance.

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

