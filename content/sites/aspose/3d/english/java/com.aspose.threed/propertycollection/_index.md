---
title: PropertyCollection
second_title: Aspose.3D for Java API Reference
description: The collection of properties
type: docs
weight: 130
url: /java/com.aspose.threed/propertycollection/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public class PropertyCollection implements Iterable<Property>
```

The collection of properties
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String property)](#findProperty-java.lang.String-) | Finds the property. |
| [get(int idx)](#get-int-) | Gets the property by index. |
| [get(String property)](#get-java.lang.String-) | Gets the value of the property by property name. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Returns an enumerator that iterates through the collection. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Removes a dynamic property. |
| [set(String property, Object value)](#set-java.lang.String-java.lang.Object-) | Sets the value of the property by property name. |
| [size()](#size--) | Gets the count of declared properties. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### findProperty(String property) {#findProperty-java.lang.String-}
```
public Property findProperty(String property)
```


Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### get(int idx) {#get-int-}
```
public Property get(int idx)
```


Gets the property by index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The 0-based index of the property |

**Returns:**
[Property](../../com.aspose.threed/property)
### get(String property) {#get-java.lang.String-}
```
public Object get(String property)
```


Gets the value of the property by property name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | The name of the property |

**Returns:**
java.lang.Object - The property's value
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<Property> iterator()
```


Returns an enumerator that iterates through the collection.

**Returns:**
java.util.Iterator<com.aspose.threed.Property>
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


Removes a dynamic property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### set(String property, Object value) {#set-java.lang.String-java.lang.Object-}
```
public void set(String property, Object value)
```


Sets the value of the property by property name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | The name of the property |
| value | java.lang.Object | New value |

### size() {#size--}
```
public int size()
```


Gets the count of declared properties.

**Returns:**
int
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

