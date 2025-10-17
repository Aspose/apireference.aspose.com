---
title: Group
second_title: Aspose.3D for Java API Reference
description: A  represents the logical relationships of .
type: docs
weight: 75
url: /java/com.aspose.threed/group/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class Group extends A3DObject
```

A [Group](../../com.aspose.threed/group) represents the logical relationships of [Node](../../com.aspose.threed/node).
## Constructors

| Constructor | Description |
| --- | --- |
| [Group(String name)](#Group-java.lang.String-) | Construct a new instance of [Group](../../com.aspose.threed/group) |
| [Group()](#Group--) | Construct a new instance of [Group](../../com.aspose.threed/group) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getClass()](#getClass--) |  |
| [getGroups()](#getGroups--) | Sub-groups |
| [getName()](#getName--) | Gets the name. |
| [getNodes()](#getNodes--) | The nodes in this group |
| [getParent()](#getParent--) | Parent group of current group |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [toString()](#toString--) | Gets the string representation of [Group](../../com.aspose.threed/group) |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Group(String name) {#Group-java.lang.String-}
```
public Group(String name)
```


Construct a new instance of [Group](../../com.aspose.threed/group)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Group's name |

### Group() {#Group--}
```
public Group()
```


Construct a new instance of [Group](../../com.aspose.threed/group)

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getGroups() {#getGroups--}
```
public List<Group> getGroups()
```


Sub-groups

**Returns:**
java.util.List<com.aspose.threed.Group> - Sub-groups
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getNodes() {#getNodes--}
```
public List<Node> getNodes()
```


The nodes in this group

**Returns:**
java.util.List<com.aspose.threed.Node> - The nodes in this group
### getParent() {#getParent--}
```
public Group getParent()
```


Parent group of current group

**Returns:**
[Group](../../com.aspose.threed/group) - Parent group of current group
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection) - the collection of all properties.
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
| property | java.lang.String | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

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

### toString() {#toString--}
```
public String toString()
```


Gets the string representation of [Group](../../com.aspose.threed/group)

**Returns:**
java.lang.String - The string representation of current instance
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

