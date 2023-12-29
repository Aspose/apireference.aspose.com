---
title: Bone
second_title: Aspose.3D for Java API Reference
description: A bone defines the subset of the geometrys control point and defined blend weight for each control point.
type: docs
weight: 20
url: /java/com.aspose.threed/bone/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class Bone extends A3DObject
```

A bone defines the subset of the geometry's control point, and defined blend weight for each control point. The [Bone](../../com.aspose.threed/bone) object cannot be used directly, a [SkinDeformer](../../com.aspose.threed/skindeformer) instance is used to deform the geometry, and [SkinDeformer](../../com.aspose.threed/skindeformer) comes with a set of bones, each bone linked to a node. NOTE: A control point of a geometry can be bounded to more than one Bones.
## Constructors

| Constructor | Description |
| --- | --- |
| [Bone(String name)](#Bone-java.lang.String-) | Initializes a new instance of the [Bone](../../com.aspose.threed/bone) class. |
| [Bone()](#Bone--) | Initializes a new instance of the [Bone](../../com.aspose.threed/bone) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [get(int index)](#get-int-) | Gets the blend weight of specified control point |
| [getBoneTransform()](#getBoneTransform--) | Gets the transform matrix of the bone. |
| [getClass()](#getClass--) |  |
| [getLinkMode()](#getLinkMode--) | A bone's link mode refers to the way in which a bone is connected or linked to its parent bone within a hierarchical structure. |
| [getName()](#getName--) | Gets the name. |
| [getNode()](#getNode--) | Gets the node. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getTransform()](#getTransform--) | Gets the transform matrix of the node containing the bone. |
| [getWeight(int index)](#getWeight-int-) | Gets the weight for control point specified by index |
| [getWeightCount()](#getWeightCount--) | Gets the count of weight, this is automatically extended by [setWeight](../../com.aspose.threed/bone\#setWeight) |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [set(int index, double value)](#set-int-double-) | Sets the blend weight of specified control point |
| [setBoneTransform(Matrix4 value)](#setBoneTransform-com.aspose.threed.Matrix4-) | Sets the transform matrix of the bone. |
| [setLinkMode(BoneLinkMode value)](#setLinkMode-com.aspose.threed.BoneLinkMode-) | A bone's link mode refers to the way in which a bone is connected or linked to its parent bone within a hierarchical structure. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setNode(Node value)](#setNode-com.aspose.threed.Node-) | Sets the node. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setTransform(Matrix4 value)](#setTransform-com.aspose.threed.Matrix4-) | Sets the transform matrix of the node containing the bone. |
| [setWeight(int index, double weight)](#setWeight-int-double-) | Sets the weight for control point specified by index |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Bone(String name) {#Bone-java.lang.String-}
```
public Bone(String name)
```


Initializes a new instance of the [Bone](../../com.aspose.threed/bone) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### Bone() {#Bone--}
```
public Bone()
```


Initializes a new instance of the [Bone](../../com.aspose.threed/bone) class.

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
### get(int index) {#get-int-}
```
public double get(int index)
```


Gets the blend weight of specified control point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int |  |

**Returns:**
double - The weight
### getBoneTransform() {#getBoneTransform--}
```
public Matrix4 getBoneTransform()
```


Gets the transform matrix of the bone.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getLinkMode() {#getLinkMode--}
```
public BoneLinkMode getLinkMode()
```


A bone's link mode refers to the way in which a bone is connected or linked to its parent bone within a hierarchical structure.

**Returns:**
[BoneLinkMode](../../com.aspose.threed/bonelinkmode)
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getNode() {#getNode--}
```
public Node getNode()
```


Gets the node. The bone node is the bone which skin attached to, the [SkinDeformer](../../com.aspose.threed/skindeformer) will use bone node to influence the displacement of the control points. Bone node usually has a [Skeleton](../../com.aspose.threed/skeleton) attached, but it's not required. Attached [Skeleton](../../com.aspose.threed/skeleton) is usually used by DCC software to show skeleton to user.

**Returns:**
[Node](../../com.aspose.threed/node)
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection)
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
### getTransform() {#getTransform--}
```
public Matrix4 getTransform()
```


Gets the transform matrix of the node containing the bone.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### getWeight(int index) {#getWeight-int-}
```
public double getWeight(int index)
```


Gets the weight for control point specified by index

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Control point's index |

**Returns:**
double - the weight at specified index, or 0 if the index is invalid
### getWeightCount() {#getWeightCount--}
```
public int getWeightCount()
```


Gets the count of weight, this is automatically extended by [setWeight](../../com.aspose.threed/bone\#setWeight)

**Returns:**
int
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
| property | java.lang.String |  |

**Returns:**
boolean
### set(int index, double value) {#set-int-double-}
```
public void set(int index, double value)
```


Sets the blend weight of specified control point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int |  |
| value | double | New value |

### setBoneTransform(Matrix4 value) {#setBoneTransform-com.aspose.threed.Matrix4-}
```
public void setBoneTransform(Matrix4 value)
```


Sets the transform matrix of the bone.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | New value |

### setLinkMode(BoneLinkMode value) {#setLinkMode-com.aspose.threed.BoneLinkMode-}
```
public void setLinkMode(BoneLinkMode value)
```


A bone's link mode refers to the way in which a bone is connected or linked to its parent bone within a hierarchical structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [BoneLinkMode](../../com.aspose.threed/bonelinkmode) | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setNode(Node value) {#setNode-com.aspose.threed.Node-}
```
public void setNode(Node value)
```


Sets the node. The bone node is the bone which skin attached to, the [SkinDeformer](../../com.aspose.threed/skindeformer) will use bone node to influence the displacement of the control points. Bone node usually has a [Skeleton](../../com.aspose.threed/skeleton) attached, but it's not required. Attached [Skeleton](../../com.aspose.threed/skeleton) is usually used by DCC software to show skeleton to user.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

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

### setTransform(Matrix4 value) {#setTransform-com.aspose.threed.Matrix4-}
```
public void setTransform(Matrix4 value)
```


Sets the transform matrix of the node containing the bone.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | New value |

### setWeight(int index, double weight) {#setWeight-int-double-}
```
public void setWeight(int index, double weight)
```


Sets the weight for control point specified by index

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Control point's index |
| weight | double | New weight |

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

