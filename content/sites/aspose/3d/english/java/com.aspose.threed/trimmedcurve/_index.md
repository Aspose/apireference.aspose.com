---
title: TrimmedCurve
second_title: Aspose.3D for Java API Reference
description: A bounded curve that trimmed the basis curve at both ends.
type: docs
weight: 184
url: /java/com.aspose.threed/trimmedcurve/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Curve](../../com.aspose.threed/curve)
```
public class TrimmedCurve extends Curve
```

A bounded curve that trimmed the basis curve at both ends.
## Constructors

| Constructor | Description |
| --- | --- |
| [TrimmedCurve()](#TrimmedCurve--) | Constructor of [TrimmedCurve](../../com.aspose.threed/trimmedcurve) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBasisCurve()](#getBasisCurve--) | The basis curve to be trimmed. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | Gets the color of the line, default value is white(1, 1, 1) |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getFirst()](#getFirst--) | The first end point to trim, can be a Cartesian point or a real parameter. |
| [getName()](#getName--) | Gets the name. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getSameDirection()](#getSameDirection--) | Gets whether the trimmed result uses the same direction of the basis curve. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getSecond()](#getSecond--) | The second end point to trim, can be a Cartesian point or a real parameter. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setBasisCurve(Curve value)](#setBasisCurve-com.aspose.threed.Curve-) | The basis curve to be trimmed. |
| [setColor(Vector3 value)](#setColor-com.aspose.threed.Vector3-) | Sets the color of the line, default value is white(1, 1, 1) |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setFirst(EndPoint value)](#setFirst-com.aspose.threed.EndPoint-) | The first end point to trim, can be a Cartesian point or a real parameter. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setSameDirection(boolean value)](#setSameDirection-boolean-) | Sets whether the trimmed result uses the same direction of the basis curve. |
| [setSecond(EndPoint value)](#setSecond-com.aspose.threed.EndPoint-) | The second end point to trim, can be a Cartesian point or a real parameter. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TrimmedCurve() {#TrimmedCurve--}
```
public TrimmedCurve()
```


Constructor of [TrimmedCurve](../../com.aspose.threed/trimmedcurve)

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
### getBasisCurve() {#getBasisCurve--}
```
public Curve getBasisCurve()
```


The basis curve to be trimmed.

**Returns:**
[Curve](../../com.aspose.threed/curve) - The basis curve to be trimmed.
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Gets the bounding box of current entity in its object space coordinate system.

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - the bounding box of current entity in its object space coordinate system. **Example:** The following code shows how to calculate the bounding box of a shape

```
Entity entity = new Sphere();
     entity.setRadius(10);
     var bbox = entity.getBoundingBox();
     System.out.printf("The bounding box of the entity is %s ~ %s", bbox.getMinimum(), bbox.getMaximum());
```
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColor() {#getColor--}
```
public Vector3 getColor()
```


Gets the color of the line, default value is white(1, 1, 1)

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the color of the line, default value is white(1, 1, 1)
### getEntityRendererKey() {#getEntityRendererKey--}
```
public EntityRendererKey getEntityRendererKey()
```


Gets the key of the entity renderer registered in the renderer

**Returns:**
[EntityRendererKey](../../com.aspose.threed/entityrendererkey)
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Gets whether to exclude this entity during exporting.

**Returns:**
boolean - whether to exclude this entity during exporting.
### getFirst() {#getFirst--}
```
public EndPoint getFirst()
```


The first end point to trim, can be a Cartesian point or a real parameter.

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint) - The first end point to trim, can be a Cartesian point or a real parameter.
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getParentNode() {#getParentNode--}
```
public Node getParentNode()
```


Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.

**Returns:**
[Node](../../com.aspose.threed/node) - the first parent node, if set the first parent node, this entity will be detached from other parent nodes.
### getParentNodes() {#getParentNodes--}
```
public ArrayList<Node> getParentNodes()
```


Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing

**Returns:**
java.util.ArrayList<com.aspose.threed.Node> - all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing
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
### getSameDirection() {#getSameDirection--}
```
public boolean getSameDirection()
```


Gets whether the trimmed result uses the same direction of the basis curve.

**Returns:**
boolean - whether the trimmed result uses the same direction of the basis curve.
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getSecond() {#getSecond--}
```
public EndPoint getSecond()
```


The second end point to trim, can be a Cartesian point or a real parameter.

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint) - The second end point to trim, can be a Cartesian point or a real parameter.
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
### setBasisCurve(Curve value) {#setBasisCurve-com.aspose.threed.Curve-}
```
public void setBasisCurve(Curve value)
```


The basis curve to be trimmed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Curve](../../com.aspose.threed/curve) | New value |

### setColor(Vector3 value) {#setColor-com.aspose.threed.Vector3-}
```
public void setColor(Vector3 value)
```


Sets the color of the line, default value is white(1, 1, 1)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Sets whether to exclude this entity during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setFirst(EndPoint value) {#setFirst-com.aspose.threed.EndPoint-}
```
public void setFirst(EndPoint value)
```


The first end point to trim, can be a Cartesian point or a real parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EndPoint](../../com.aspose.threed/endpoint) | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setParentNode(Node value) {#setParentNode-com.aspose.threed.Node-}
```
public void setParentNode(Node value)
```


Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.

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

### setSameDirection(boolean value) {#setSameDirection-boolean-}
```
public void setSameDirection(boolean value)
```


Sets whether the trimmed result uses the same direction of the basis curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setSecond(EndPoint value) {#setSecond-com.aspose.threed.EndPoint-}
```
public void setSecond(EndPoint value)
```


The second end point to trim, can be a Cartesian point or a real parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EndPoint](../../com.aspose.threed/endpoint) | New value |

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

