---
title: Torus
second_title: Aspose.3D for Java API Reference
description: Parameterized torus.
type: docs
weight: 169
url: /java/com.aspose.threed/torus/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Torus extends Primitive
```

Parameterized torus.
## Constructors

| Constructor | Description |
| --- | --- |
| [Torus()](#Torus--) | Initializes a new instance of the [Torus](../../com.aspose.threed/torus) class. |
| [Torus(double radius, double tube)](#Torus-double-double-) | Initializes a new instance of the [Torus](../../com.aspose.threed/torus) class. |
| [Torus(double radius, double tube, double arc)](#Torus-double-double-double-) | Initializes a new instance of the [Torus](../../com.aspose.threed/torus) class. |
| [Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc)](#Torus-java.lang.String-double-double-int-int-double-) | Initializes a new instance of the [Torus](../../com.aspose.threed/torus) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getArc()](#getArc--) | Gets the arc. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getCastShadows()](#getCastShadows--) | Gets whether this geometry can cast shadow |
| [getClass()](#getClass--) |  |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getName()](#getName--) | Gets the name. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getRadialSegments()](#getRadialSegments--) | Gets the radial segments. |
| [getRadius()](#getRadius--) | Gets the radius of the torus. |
| [getReceiveShadows()](#getReceiveShadows--) | Gets whether this geometry can receive shadow. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getTube()](#getTube--) | Gets the radius of the tube. |
| [getTubularSegments()](#getTubularSegments--) | Gets the tubular segments. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setArc(double value)](#setArc-double-) | Sets the arc. |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Sets whether this geometry can cast shadow |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setRadialSegments(int value)](#setRadialSegments-int-) | Sets the radial segments. |
| [setRadius(double value)](#setRadius-double-) | Sets the radius of the torus. |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Sets whether this geometry can receive shadow. |
| [setTube(double value)](#setTube-double-) | Sets the radius of the tube. |
| [setTubularSegments(int value)](#setTubularSegments-int-) | Sets the tubular segments. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Torus() {#Torus--}
```
public Torus()
```


Initializes a new instance of the [Torus](../../com.aspose.threed/torus) class.

### Torus(double radius, double tube) {#Torus-double-double-}
```
public Torus(double radius, double tube)
```


Initializes a new instance of the [Torus](../../com.aspose.threed/torus) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | The radius of the torus. |
| tube | double | The radius of the torus' tube. |

### Torus(double radius, double tube, double arc) {#Torus-double-double-double-}
```
public Torus(double radius, double tube, double arc)
```


Initializes a new instance of the [Torus](../../com.aspose.threed/torus) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | The radius of the torus. |
| tube | double | The radius of the torus' tube. |
| arc | double | Arc. |

### Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc) {#Torus-java.lang.String-double-double-int-int-double-}
```
public Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc)
```


Initializes a new instance of the [Torus](../../com.aspose.threed/torus) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| radius | double | The radius of the torus. |
| tube | double | The radius of the torus' tube. |
| radialSegments | int | Radial segments. |
| tubularSegments | int | Tubular segments. |
| arc | double | Arc. |

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
### getArc() {#getArc--}
```
public double getArc()
```


Gets the arc.

**Returns:**
double
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Gets the bounding box of current entity in its object space coordinate system.

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
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
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


Gets the radial segments.

**Returns:**
int
### getRadius() {#getRadius--}
```
public double getRadius()
```


Gets the radius of the torus.

**Returns:**
double
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
### getTube() {#getTube--}
```
public double getTube()
```


Gets the radius of the tube.

**Returns:**
double
### getTubularSegments() {#getTubularSegments--}
```
public int getTubularSegments()
```


Gets the tubular segments.

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
### setArc(double value) {#setArc-double-}
```
public void setArc(double value)
```


Sets the arc.

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

### setRadialSegments(int value) {#setRadialSegments-int-}
```
public void setRadialSegments(int value)
```


Sets the radial segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setRadius(double value) {#setRadius-double-}
```
public void setRadius(double value)
```


Sets the radius of the torus.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setReceiveShadows(boolean value) {#setReceiveShadows-boolean-}
```
public void setReceiveShadows(boolean value)
```


Sets whether this geometry can receive shadow.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setTube(double value) {#setTube-double-}
```
public void setTube(double value)
```


Sets the radius of the tube.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setTubularSegments(int value) {#setTubularSegments-int-}
```
public void setTubularSegments(int value)
```


Sets the tubular segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert current object to mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The mesh.
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
public final native void wait(long arg0)
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

