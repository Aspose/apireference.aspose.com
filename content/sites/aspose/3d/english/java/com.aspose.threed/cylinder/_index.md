---
title: Cylinder
second_title: Aspose.3D for Java API Reference
description: Parameterized Cylinder.
type: docs
weight: 38
url: /java/com.aspose.threed/cylinder/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Cylinder extends Primitive
```

Parameterized Cylinder. It can also be used to represent the cone when one of radiusTop/radiusBottom is zero.
## Constructors

| Constructor | Description |
| --- | --- |
| [Cylinder()](#Cylinder--) | Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class. |
| [Cylinder(double radius, double height)](#Cylinder-double-double-) | Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class. |
| [Cylinder(double radiusTop, double radiusBottom, double height)](#Cylinder-double-double-double-) | Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class. |
| [Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded)](#Cylinder-double-double-double-int-int-boolean-) | Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class. |
| [Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength)](#Cylinder-java.lang.String-double-double-double-int-int-boolean-double-double-) | Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getCastShadows()](#getCastShadows--) | Gets whether this geometry can cast shadow |
| [getClass()](#getClass--) |  |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getGenerateFanCylinder()](#getGenerateFanCylinder--) | Gets whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut. |
| [getHeight()](#getHeight--) | Gets the height of the cylinder. |
| [getHeightSegments()](#getHeightSegments--) | Gets the height segments. |
| [getName()](#getName--) | Gets the name. |
| [getOffsetBottom()](#getOffsetBottom--) | Gets the vertices transformation offset of the bottom side. |
| [getOffsetTop()](#getOffsetTop--) | Gets the vertices transformation offset of the top side. |
| [getOpenEnded()](#getOpenEnded--) | Gets a value indicating whether this [Cylinder](../../com.aspose.threed/cylinder) open ended. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getRadialSegments()](#getRadialSegments--) | Gets the radial segments. |
| [getRadiusBottom()](#getRadiusBottom--) | Gets the radius of cylinder's bottom cap. |
| [getRadiusTop()](#getRadiusTop--) | Gets the radius of cylinder's top cap. |
| [getReceiveShadows()](#getReceiveShadows--) | Gets whether this geometry can receive shadow. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getShearBottom()](#getShearBottom--) | Gets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [getShearTop()](#getShearTop--) | Gets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [getThetaLength()](#getThetaLength--) | Gets the length of the theta. |
| [getThetaStart()](#getThetaStart--) | Gets the theta start. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Sets whether this geometry can cast shadow |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setGenerateFanCylinder(boolean value)](#setGenerateFanCylinder-boolean-) | Sets whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut. |
| [setHeight(double value)](#setHeight-double-) | Sets the height of the cylinder. |
| [setHeightSegments(int value)](#setHeightSegments-int-) | Sets the height segments. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setOffsetBottom(Vector3 value)](#setOffsetBottom-com.aspose.threed.Vector3-) | Sets the vertices transformation offset of the bottom side. |
| [setOffsetTop(Vector3 value)](#setOffsetTop-com.aspose.threed.Vector3-) | Sets the vertices transformation offset of the top side. |
| [setOpenEnded(boolean value)](#setOpenEnded-boolean-) | Sets a value indicating whether this [Cylinder](../../com.aspose.threed/cylinder) open ended. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setRadialSegments(int value)](#setRadialSegments-int-) | Sets the radial segments. |
| [setRadiusBottom(double value)](#setRadiusBottom-double-) | Sets the radius of cylinder's bottom cap. |
| [setRadiusTop(double value)](#setRadiusTop-double-) | Sets the radius of cylinder's top cap. |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Sets whether this geometry can receive shadow. |
| [setShearBottom(Vector2 value)](#setShearBottom-com.aspose.threed.Vector2-) | Sets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [setShearTop(Vector2 value)](#setShearTop-com.aspose.threed.Vector2-) | Sets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [setThetaLength(double value)](#setThetaLength-double-) | Sets the length of the theta. |
| [setThetaStart(double value)](#setThetaStart-double-) | Sets the theta start. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Cylinder() {#Cylinder--}
```
public Cylinder()
```


Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class.

### Cylinder(double radius, double height) {#Cylinder-double-double-}
```
public Cylinder(double radius, double height)
```


Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | Radius of the top and bottom cap. |
| height | double | Height. |

### Cylinder(double radiusTop, double radiusBottom, double height) {#Cylinder-double-double-double-}
```
public Cylinder(double radiusTop, double radiusBottom, double height)
```


Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radiusTop | double | Radius top. |
| radiusBottom | double | Radius bottom. |
| height | double | Height. |

### Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded) {#Cylinder-double-double-double-int-int-boolean-}
```
public Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded)
```


Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radiusTop | double | Radius of cylinder's top cap. |
| radiusBottom | double | Radius of cylinder's bottom cap. |
| height | double | Height of the cylinder. |
| radialSegments | int | Radial segments of both top and bottom circles.. |
| heightSegments | int | Height segments. |
| openEnded | boolean | If set to  true  the cylinder would have no bottom/top caps.. |

### Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength) {#Cylinder-java.lang.String-double-double-double-int-int-boolean-double-double-}
```
public Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength)
```


Initializes a new instance of the [Cylinder](../../com.aspose.threed/cylinder) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of this object |
| radiusTop | double | Radius of cylinder's top cap. |
| radiusBottom | double | Radius of cylinder's bottom cap. |
| height | double | Height of the cylinder. |
| radialSegments | int | Radial segments of both top and bottom circles.. |
| heightSegments | int | Height segments. |
| openEnded | boolean | If set to  true  the cylinder would have no bottom/top caps.. |
| thetaStart | double | Theta start. |
| thetaLength | double | Theta length. |

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
### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Gets whether this geometry can cast shadow

**Returns:**
boolean - whether this geometry can cast shadow
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
[EntityRendererKey](../../com.aspose.threed/entityrendererkey) - the key of the entity renderer registered in the renderer
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Gets whether to exclude this entity during exporting.

**Returns:**
boolean - whether to exclude this entity during exporting.
### getGenerateFanCylinder() {#getGenerateFanCylinder--}
```
public boolean getGenerateFanCylinder()
```


Gets whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut.

**Returns:**
boolean - whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut.
### getHeight() {#getHeight--}
```
public double getHeight()
```


Gets the height of the cylinder.

**Returns:**
double - the height of the cylinder.
### getHeightSegments() {#getHeightSegments--}
```
public int getHeightSegments()
```


Gets the height segments.

**Returns:**
int - the height segments.
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getOffsetBottom() {#getOffsetBottom--}
```
public Vector3 getOffsetBottom()
```


Gets the vertices transformation offset of the bottom side.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the vertices transformation offset of the bottom side.
### getOffsetTop() {#getOffsetTop--}
```
public Vector3 getOffsetTop()
```


Gets the vertices transformation offset of the top side.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the vertices transformation offset of the top side.
### getOpenEnded() {#getOpenEnded--}
```
public boolean getOpenEnded()
```


Gets a value indicating whether this [Cylinder](../../com.aspose.threed/cylinder) open ended. The default value is false.

**Returns:**
boolean - a value indicating whether this [Cylinder](../../com.aspose.threed/cylinder) open ended. The default value is false.
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
### getRadialSegments() {#getRadialSegments--}
```
public int getRadialSegments()
```


Gets the radial segments.

**Returns:**
int - the radial segments.
### getRadiusBottom() {#getRadiusBottom--}
```
public double getRadiusBottom()
```


Gets the radius of cylinder's bottom cap.

**Returns:**
double - the radius of cylinder's bottom cap.
### getRadiusTop() {#getRadiusTop--}
```
public double getRadiusTop()
```


Gets the radius of cylinder's top cap.

**Returns:**
double - the radius of cylinder's top cap.
### getReceiveShadows() {#getReceiveShadows--}
```
public boolean getReceiveShadows()
```


Gets whether this geometry can receive shadow.

**Returns:**
boolean - whether this geometry can receive shadow.
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getShearBottom() {#getShearBottom--}
```
public Vector2 getShearBottom()
```


Gets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)
### getShearTop() {#getShearTop--}
```
public Vector2 getShearTop()
```


Gets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)
### getThetaLength() {#getThetaLength--}
```
public double getThetaLength()
```


Gets the length of the theta. The default value is 2\\u03c0.

**Returns:**
double - the length of the theta. The default value is 2\\u03c0.
### getThetaStart() {#getThetaStart--}
```
public double getThetaStart()
```


Gets the theta start. The default value is 0.

**Returns:**
double - the theta start. The default value is 0.
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

### setGenerateFanCylinder(boolean value) {#setGenerateFanCylinder-boolean-}
```
public void setGenerateFanCylinder(boolean value)
```


Sets whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Sets the height of the cylinder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setHeightSegments(int value) {#setHeightSegments-int-}
```
public void setHeightSegments(int value)
```


Sets the height segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setOffsetBottom(Vector3 value) {#setOffsetBottom-com.aspose.threed.Vector3-}
```
public void setOffsetBottom(Vector3 value)
```


Sets the vertices transformation offset of the bottom side.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setOffsetTop(Vector3 value) {#setOffsetTop-com.aspose.threed.Vector3-}
```
public void setOffsetTop(Vector3 value)
```


Sets the vertices transformation offset of the top side.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setOpenEnded(boolean value) {#setOpenEnded-boolean-}
```
public void setOpenEnded(boolean value)
```


Sets a value indicating whether this [Cylinder](../../com.aspose.threed/cylinder) open ended. The default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

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

### setRadiusBottom(double value) {#setRadiusBottom-double-}
```
public void setRadiusBottom(double value)
```


Sets the radius of cylinder's bottom cap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setRadiusTop(double value) {#setRadiusTop-double-}
```
public void setRadiusTop(double value)
```


Sets the radius of cylinder's top cap.

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

### setShearBottom(Vector2 value) {#setShearBottom-com.aspose.threed.Vector2-}
```
public void setShearBottom(Vector2 value)
```


Sets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### setShearTop(Vector2 value) {#setShearTop-com.aspose.threed.Vector2-}
```
public void setShearTop(Vector2 value)
```


Sets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### setThetaLength(double value) {#setThetaLength-double-}
```
public void setThetaLength(double value)
```


Sets the length of the theta. The default value is 2\\u03c0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setThetaStart(double value) {#setThetaStart-double-}
```
public void setThetaStart(double value)
```


Sets the theta start. The default value is 0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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

