---
title: RectangularTorus
second_title: Aspose.3D for Java API Reference
description: Parameterized rectangular torus.
type: docs
weight: 136
url: /java/com.aspose.threed/rectangulartorus/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class RectangularTorus extends Primitive
```

Parameterized rectangular torus.
## Constructors

| Constructor | Description |
| --- | --- |
| [RectangularTorus()](#RectangularTorus--) | Constructor of [RectangularTorus](../../com.aspose.threed/rectangulartorus) |
| [RectangularTorus(String name)](#RectangularTorus-java.lang.String-) | Constructor of [RectangularTorus](../../com.aspose.threed/rectangulartorus) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getAngleStart()](#getAngleStart--) | The start angle of the arc, measured in radian. |
| [getArc()](#getArc--) | The total angle of the arc, measured in radian. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getCastShadows()](#getCastShadows--) | Gets whether this geometry can cast shadow |
| [getClass()](#getClass--) |  |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getHeight()](#getHeight--) | The height of the rectangular torus. |
| [getInnerRadius()](#getInnerRadius--) | The inner radius of the rectangular torus Default value is 17 |
| [getName()](#getName--) | Gets the name. |
| [getOuterRadius()](#getOuterRadius--) | The outer radius of the rectangular torus Default value is 20 |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getRadialSegments()](#getRadialSegments--) | The radial segments, default value is 10 |
| [getReceiveShadows()](#getReceiveShadows--) | Gets whether this geometry can receive shadow. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setAngleStart(double value)](#setAngleStart-double-) | The start angle of the arc, measured in radian. |
| [setArc(double value)](#setArc-double-) | The total angle of the arc, measured in radian. |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Sets whether this geometry can cast shadow |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setHeight(double value)](#setHeight-double-) | The height of the rectangular torus. |
| [setInnerRadius(double value)](#setInnerRadius-double-) | The inner radius of the rectangular torus Default value is 17 |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setOuterRadius(double value)](#setOuterRadius-double-) | The outer radius of the rectangular torus Default value is 20 |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setRadialSegments(int value)](#setRadialSegments-int-) | The radial segments, default value is 10 |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Sets whether this geometry can receive shadow. |
| [toMesh()](#toMesh--) | Convert this primitive to [Mesh](../../com.aspose.threed/mesh) |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RectangularTorus() {#RectangularTorus--}
```
public RectangularTorus()
```


Constructor of [RectangularTorus](../../com.aspose.threed/rectangulartorus)

### RectangularTorus(String name) {#RectangularTorus-java.lang.String-}
```
public RectangularTorus(String name)
```


Constructor of [RectangularTorus](../../com.aspose.threed/rectangulartorus)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

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
### getAngleStart() {#getAngleStart--}
```
public double getAngleStart()
```


The start angle of the arc, measured in radian. Default value is 0

**Returns:**
double
### getArc() {#getArc--}
```
public double getArc()
```


The total angle of the arc, measured in radian. Default value is PI

**Returns:**
double
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Gets the bounding box of current entity in its object space coordinate system. **Example:** The following code shows how to calculate the bounding box of a shape

```
Entity entity = new Sphere();
     entity.setRadius(10);
     var bbox = entity.getBoundingBox();
     System.out.printf("The bounding box of the entity is %s ~ %s", bbox.getMinimum(), bbox.getMaximum());
```

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Gets whether this geometry can cast shadow

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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
boolean
### getHeight() {#getHeight--}
```
public double getHeight()
```


The height of the rectangular torus. Default value is 20

**Returns:**
double
### getInnerRadius() {#getInnerRadius--}
```
public double getInnerRadius()
```


The inner radius of the rectangular torus Default value is 17

**Returns:**
double
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getOuterRadius() {#getOuterRadius--}
```
public double getOuterRadius()
```


The outer radius of the rectangular torus Default value is 20

**Returns:**
double
### getParentNode() {#getParentNode--}
```
public Node getParentNode()
```


Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.

**Returns:**
[Node](../../com.aspose.threed/node)
### getParentNodes() {#getParentNodes--}
```
public ArrayList<Node> getParentNodes()
```


Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing

**Returns:**
java.util.ArrayList<com.aspose.threed.Node>
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
### getRadialSegments() {#getRadialSegments--}
```
public int getRadialSegments()
```


The radial segments, default value is 10

**Returns:**
int
### getReceiveShadows() {#getReceiveShadows--}
```
public boolean getReceiveShadows()
```


Gets whether this geometry can receive shadow.

**Returns:**
boolean
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene)
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
### setAngleStart(double value) {#setAngleStart-double-}
```
public void setAngleStart(double value)
```


The start angle of the arc, measured in radian. Default value is 0

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setArc(double value) {#setArc-double-}
```
public void setArc(double value)
```


The total angle of the arc, measured in radian. Default value is PI

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setCastShadows(boolean value) {#setCastShadows-boolean-}
```
public void setCastShadows(boolean value)
```


Sets whether this geometry can cast shadow

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Sets whether to exclude this entity during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


The height of the rectangular torus. Default value is 20

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setInnerRadius(double value) {#setInnerRadius-double-}
```
public void setInnerRadius(double value)
```


The inner radius of the rectangular torus Default value is 17

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setOuterRadius(double value) {#setOuterRadius-double-}
```
public void setOuterRadius(double value)
```


The outer radius of the rectangular torus Default value is 20

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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

### setRadialSegments(int value) {#setRadialSegments-int-}
```
public void setRadialSegments(int value)
```


The radial segments, default value is 10

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setReceiveShadows(boolean value) {#setReceiveShadows-boolean-}
```
public void setReceiveShadows(boolean value)
```


Sets whether this geometry can receive shadow.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert this primitive to [Mesh](../../com.aspose.threed/mesh)

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
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

