---
title: StructuralMetadata.Property
second_title: Aspose.3D for Java API Reference
description: The property definition in meta datas classes
type: docs
weight: 13
url: /java/com.aspose.threed/structuralmetadata.property/
---

**Inheritance:**
java.lang.Object
```
public static class StructuralMetadata.Property
```

The property definition in meta data's classes
## Constructors

| Constructor | Description |
| --- | --- |
| [Property(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count)](#Property-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----boolean-java.lang.Integer-) | Constructor of metadata's property |
| [Property(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count)](#Property-java.lang.String-java.lang.String-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-java.lang.Integer-) | Constructor of metadata's property |
| [Property(String name, Class<?> type)](#Property-java.lang.String-java.lang.Class----) | Constructor of metadata's property |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Count of the data for fixed-size array. |
| [getDescription()](#getDescription--) | The description of the property |
| [getDisplayName()](#getDisplayName--) | The name of the property, used by UI for representation. |
| [getEnumType()](#getEnumType--) | The enum type |
| [getName()](#getName--) | The unique name of the property |
| [getNormalized()](#getNormalized--) | Is the data normalized. |
| [getType()](#getType--) | The data type of the property |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCount(Integer value)](#setCount-java.lang.Integer-) | Count of the data for fixed-size array. |
| [setDescription(String value)](#setDescription-java.lang.String-) | The description of the property |
| [setDisplayName(String value)](#setDisplayName-java.lang.String-) | The name of the property, used by UI for representation. |
| [setEnumType(StructuralMetadata.EnumType value)](#setEnumType-com.aspose.threed.StructuralMetadata.EnumType-) | The enum type |
| [setNormalized(boolean value)](#setNormalized-boolean-) | Is the data normalized. |
| [toString()](#toString--) | Gets the string representation of this instance. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Property(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count) {#Property-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----boolean-java.lang.Integer-}
```
public Property(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count)
```


Constructor of metadata's property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The unique name of the property |
| displayName | java.lang.String | The name of the property, used by UI for representation. |
| description | java.lang.String | The description of the property |
| type | java.lang.Class<?> | Data type of the property |
| normalized | boolean | Is the data normalized |
| count | java.lang.Integer | Count of the data for fixed-size array |

### Property(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count) {#Property-java.lang.String-java.lang.String-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-java.lang.Integer-}
```
public Property(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count)
```


Constructor of metadata's property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The unique name of the property |
| displayName | java.lang.String | The name of the property, used by UI for representation. |
| description | java.lang.String | The description of the property |
| type | [EnumType](../../com.aspose.threed/enumtype) | Data type of the property |
| array | boolean | Is each property value array or scalar |
| count | java.lang.Integer | Count of the data for fixed-size array |

### Property(String name, Class<?> type) {#Property-java.lang.String-java.lang.Class----}
```
public Property(String name, Class<?> type)
```


Constructor of metadata's property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The unique name of the property |
| type | java.lang.Class<?> | Data type of the property |

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
### getCount() {#getCount--}
```
public Integer getCount()
```


Count of the data for fixed-size array.

**Returns:**
java.lang.Integer - Count of the data for fixed-size array.
### getDescription() {#getDescription--}
```
public String getDescription()
```


The description of the property

**Returns:**
java.lang.String - The description of the property
### getDisplayName() {#getDisplayName--}
```
public String getDisplayName()
```


The name of the property, used by UI for representation.

**Returns:**
java.lang.String - The name of the property, used by UI for representation.
### getEnumType() {#getEnumType--}
```
public StructuralMetadata.EnumType getEnumType()
```


The enum type

**Returns:**
[EnumType](../../com.aspose.threed/enumtype) - The enum type
### getName() {#getName--}
```
public String getName()
```


The unique name of the property

**Returns:**
java.lang.String - The unique name of the property
### getNormalized() {#getNormalized--}
```
public boolean getNormalized()
```


Is the data normalized.

**Returns:**
boolean - Is the data normalized.
### getType() {#getType--}
```
public Class<?> getType()
```


The data type of the property

**Returns:**
java.lang.Class<?> - The data type of the property
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




### setCount(Integer value) {#setCount-java.lang.Integer-}
```
public void setCount(Integer value)
```


Count of the data for fixed-size array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Integer | New value |

### setDescription(String value) {#setDescription-java.lang.String-}
```
public void setDescription(String value)
```


The description of the property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setDisplayName(String value) {#setDisplayName-java.lang.String-}
```
public void setDisplayName(String value)
```


The name of the property, used by UI for representation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setEnumType(StructuralMetadata.EnumType value) {#setEnumType-com.aspose.threed.StructuralMetadata.EnumType-}
```
public void setEnumType(StructuralMetadata.EnumType value)
```


The enum type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EnumType](../../com.aspose.threed/enumtype) | New value |

### setNormalized(boolean value) {#setNormalized-boolean-}
```
public void setNormalized(boolean value)
```


Is the data normalized.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

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

