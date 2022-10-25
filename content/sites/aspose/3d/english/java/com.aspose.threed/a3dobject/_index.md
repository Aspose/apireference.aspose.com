---
title: A3DObject
second_title: Aspose.3D for Java API Reference
description: The base class of all Aspose.ThreeD objects all sub classes will support dynamic properties.
type: docs
weight: 10
url: /java/com.aspose.threed/a3dobject/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.threed.INamedObject](../../com.aspose.threed/inamedobject)
```
public class A3DObject implements INamedObject
```

The base class of all Aspose.ThreeD objects, all sub classes will support dynamic properties.
## Constructors

| Constructor | Description |
| --- | --- |
| [A3DObject(String name)](#A3DObject-java.lang.String-) | Initializes a new instance of the com.aspose.threed.A3DObject class. |
| [A3DObject()](#A3DObject--) | Initializes a new instance of the com.aspose.threed.A3DObject class with no name. |
## Methods

| Method | Description |
| --- | --- |
| [getName()](#getName--) | Gets the name. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
### A3DObject(String name) {#A3DObject-java.lang.String-}
```
public A3DObject(String name)
```


Initializes a new instance of the com.aspose.threed.A3DObject class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### A3DObject() {#A3DObject--}
```
public A3DObject()
```


Initializes a new instance of the com.aspose.threed.A3DObject class with no name.

### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Removes a dynamic property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Remove the specified property identified by name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String |  |

**Returns:**
boolean
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Get the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |

**Returns:**
java.lang.Object - The value of the found property
### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Sets the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |
| value | java.lang.Object | The value of the property |

### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propertyName | java.lang.String | Property name. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection)
