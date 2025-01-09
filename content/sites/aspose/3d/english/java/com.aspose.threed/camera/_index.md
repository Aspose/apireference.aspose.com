---
title: Camera
second_title: Aspose.3D for Java API Reference
description: The camera describes the eye point of the viewer looking at the scene.
type: docs
weight: 26
url: /java/com.aspose.threed/camera/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Frustum](../../com.aspose.threed/frustum)

**All Implemented Interfaces:**
[com.aspose.threed.IOrientable](../../com.aspose.threed/iorientable)
```
public class Camera extends Frustum implements IOrientable
```

The camera describes the eye point of the viewer looking at the scene.
## Constructors

| Constructor | Description |
| --- | --- |
| [Camera()](#Camera--) | Initializes a new instance of the [Camera](../../com.aspose.threed/camera) class. |
| [Camera(ProjectionType projectionType)](#Camera-com.aspose.threed.ProjectionType-) | Initializes a new instance of the [Camera](../../com.aspose.threed/camera) class. |
| [Camera(String name)](#Camera-java.lang.String-) | Initializes a new instance of the [Camera](../../com.aspose.threed/camera) class. |
| [Camera(String name, ProjectionType projectionType)](#Camera-java.lang.String-com.aspose.threed.ProjectionType-) | Initializes a new instance of the [Camera](../../com.aspose.threed/camera) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getApertureMode()](#getApertureMode--) | Gets the camera's aperture mode |
| [getAspect()](#getAspect--) | Gets the aspect ratio of the frustum |
| [getAspectRatio()](#getAspectRatio--) | Gets the view plane aspect ratio. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getClass()](#getClass--) |  |
| [getDirection()](#getDirection--) | Gets the direction that the camera is looking at. |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getFarPlane()](#getFarPlane--) | Gets the frustum's far plane distance. |
| [getFieldOfView()](#getFieldOfView--) | Gets the camera's field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) or [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL) |
| [getFieldOfViewX()](#getFieldOfViewX--) | Gets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) |
| [getFieldOfViewY()](#getFieldOfViewY--) | Gets the camera's vertical field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) |
| [getHeight()](#getHeight--) | Gets the view plane's height measured in inches |
| [getLookAt()](#getLookAt--) | Gets the the interested position that the camera is looking at. |
| [getMagnification()](#getMagnification--) | Gets the magnification used in orthographic camera |
| [getName()](#getName--) | Gets the name. |
| [getNearPlane()](#getNearPlane--) | Gets the frustum's near plane distance. |
| [getOrthoHeight()](#getOrthoHeight--) | Gets the height when frustum in orthographic projection. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProjectionType()](#getProjectionType--) | Gets the camera's projection type. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getRotationMode()](#getRotationMode--) | Gets the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getTarget()](#getTarget--) | Gets the target that the camera is looking at. |
| [getUp()](#getUp--) | Gets the up direction of the camera |
| [getWidth()](#getWidth--) | Gets the view plane's width measured in inches |
| [hashCode()](#hashCode--) |  |
| [moveForward(double distance)](#moveForward-double-) | Move camera forward towards its direction or target. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setApertureMode(ApertureMode value)](#setApertureMode-com.aspose.threed.ApertureMode-) | Sets the camera's aperture mode |
| [setAspect(double value)](#setAspect-double-) | Sets the aspect ratio of the frustum |
| [setAspectRatio(double value)](#setAspectRatio-double-) | Sets the view plane aspect ratio. |
| [setDirection(Vector3 value)](#setDirection-com.aspose.threed.Vector3-) | Sets the direction that the camera is looking at. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setFarPlane(double value)](#setFarPlane-double-) | Sets the frustum's far plane distance. |
| [setFieldOfView(double value)](#setFieldOfView-double-) | Sets the camera's field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) or [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL) |
| [setFieldOfViewX(double value)](#setFieldOfViewX-double-) | Sets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) |
| [setFieldOfViewY(double value)](#setFieldOfViewY-double-) | Sets the camera's vertical field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) |
| [setHeight(double value)](#setHeight-double-) | Sets the view plane's height measured in inches |
| [setLookAt(Vector3 value)](#setLookAt-com.aspose.threed.Vector3-) | Sets the the interested position that the camera is looking at. |
| [setMagnification(Vector2 value)](#setMagnification-com.aspose.threed.Vector2-) | Sets the magnification used in orthographic camera |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setNearPlane(double value)](#setNearPlane-double-) | Sets the frustum's near plane distance. |
| [setOrthoHeight(double value)](#setOrthoHeight-double-) | Sets the height when frustum in orthographic projection. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProjectionType(ProjectionType value)](#setProjectionType-com.aspose.threed.ProjectionType-) | Sets the camera's projection type. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setRotationMode(RotationMode value)](#setRotationMode-com.aspose.threed.RotationMode-) | Sets the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. |
| [setTarget(Node value)](#setTarget-com.aspose.threed.Node-) | Sets the target that the camera is looking at. |
| [setUp(Vector3 value)](#setUp-com.aspose.threed.Vector3-) | Sets the up direction of the camera |
| [setWidth(double value)](#setWidth-double-) | Sets the view plane's width measured in inches |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Camera() {#Camera--}
```
public Camera()
```


Initializes a new instance of the [Camera](../../com.aspose.threed/camera) class.

### Camera(ProjectionType projectionType) {#Camera-com.aspose.threed.ProjectionType-}
```
public Camera(ProjectionType projectionType)
```


Initializes a new instance of the [Camera](../../com.aspose.threed/camera) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| projectionType | [ProjectionType](../../com.aspose.threed/projectiontype) | Projection type. |

### Camera(String name) {#Camera-java.lang.String-}
```
public Camera(String name)
```


Initializes a new instance of the [Camera](../../com.aspose.threed/camera) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### Camera(String name, ProjectionType projectionType) {#Camera-java.lang.String-com.aspose.threed.ProjectionType-}
```
public Camera(String name, ProjectionType projectionType)
```


Initializes a new instance of the [Camera](../../com.aspose.threed/camera) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| projectionType | [ProjectionType](../../com.aspose.threed/projectiontype) | Projection type. |

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
### getApertureMode() {#getApertureMode--}
```
public ApertureMode getApertureMode()
```


Gets the camera's aperture mode

**Returns:**
[ApertureMode](../../com.aspose.threed/aperturemode) - the camera's aperture mode
### getAspect() {#getAspect--}
```
public double getAspect()
```


Gets the aspect ratio of the frustum

**Returns:**
double - the aspect ratio of the frustum
### getAspectRatio() {#getAspectRatio--}
```
public double getAspectRatio()
```


Gets the view plane aspect ratio.

**Returns:**
double - the view plane aspect ratio.
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
### getDirection() {#getDirection--}
```
public Vector3 getDirection()
```


Gets the direction that the camera is looking at. Changes on this property will also affects the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) and [getTarget](../../com.aspose.threed/frustum\#getTarget).

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the direction that the camera is looking at. Changes on this property will also affects the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) and [getTarget](../../com.aspose.threed/frustum\#getTarget).
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
### getFarPlane() {#getFarPlane--}
```
public double getFarPlane()
```


Gets the frustum's far plane distance.

**Returns:**
double - the frustum's far plane distance.
### getFieldOfView() {#getFieldOfView--}
```
public double getFieldOfView()
```


Gets the camera's field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) or [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL)

**Returns:**
double - the camera's field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) or [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL)
### getFieldOfViewX() {#getFieldOfViewX--}
```
public double getFieldOfViewX()
```


Gets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT)

**Returns:**
double - the camera's horizontal field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT)
### getFieldOfViewY() {#getFieldOfViewY--}
```
public double getFieldOfViewY()
```


Gets the camera's vertical field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT)

**Returns:**
double - the camera's vertical field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT)
### getHeight() {#getHeight--}
```
public double getHeight()
```


Gets the view plane's height measured in inches

**Returns:**
double - the view plane's height measured in inches
### getLookAt() {#getLookAt--}
```
public Vector3 getLookAt()
```


Gets the the interested position that the camera is looking at.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the the interested position that the camera is looking at.
### getMagnification() {#getMagnification--}
```
public Vector2 getMagnification()
```


Gets the magnification used in orthographic camera

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the magnification used in orthographic camera
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getNearPlane() {#getNearPlane--}
```
public double getNearPlane()
```


Gets the frustum's near plane distance.

**Returns:**
double - the frustum's near plane distance.
### getOrthoHeight() {#getOrthoHeight--}
```
public double getOrthoHeight()
```


Gets the height when frustum in orthographic projection.

**Returns:**
double - the height when frustum in orthographic projection.
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
### getProjectionType() {#getProjectionType--}
```
public ProjectionType getProjectionType()
```


Gets the camera's projection type. By default the perspective projection is used.

**Returns:**
[ProjectionType](../../com.aspose.threed/projectiontype) - the camera's projection type. By default the perspective projection is used.
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
### getRotationMode() {#getRotationMode--}
```
public RotationMode getRotationMode()
```


Gets the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. If the value is [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET), the direction is always calculated by the property [getLookAt](../../com.aspose.threed/frustum\#getLookAt) Otherwise the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) is always calculated by the [getDirection](../../com.aspose.threed/frustum\#getDirection)

**Returns:**
[RotationMode](../../com.aspose.threed/rotationmode) - the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. If the value is [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET), the direction is always calculated by the property [getLookAt](../../com.aspose.threed/frustum\#getLookAt) Otherwise the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) is always calculated by the [getDirection](../../com.aspose.threed/frustum\#getDirection)
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getTarget() {#getTarget--}
```
public Node getTarget()
```


Gets the target that the camera is looking at. If the user supports this property, it should be prior to [getLookAt](../../com.aspose.threed/frustum\#getLookAt) property.

**Returns:**
[Node](../../com.aspose.threed/node) - the target that the camera is looking at. If the user supports this property, it should be prior to [getLookAt](../../com.aspose.threed/frustum\#getLookAt) property.
### getUp() {#getUp--}
```
public Vector3 getUp()
```


Gets the up direction of the camera

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the up direction of the camera
### getWidth() {#getWidth--}
```
public double getWidth()
```


Gets the view plane's width measured in inches

**Returns:**
double - the view plane's width measured in inches
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### moveForward(double distance) {#moveForward-double-}
```
public void moveForward(double distance)
```


Move camera forward towards its direction or target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| distance | double | How long to move forward |

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
### setApertureMode(ApertureMode value) {#setApertureMode-com.aspose.threed.ApertureMode-}
```
public void setApertureMode(ApertureMode value)
```


Sets the camera's aperture mode

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ApertureMode](../../com.aspose.threed/aperturemode) | New value |

### setAspect(double value) {#setAspect-double-}
```
public void setAspect(double value)
```


Sets the aspect ratio of the frustum

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setAspectRatio(double value) {#setAspectRatio-double-}
```
public void setAspectRatio(double value)
```


Sets the view plane aspect ratio.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setDirection(Vector3 value) {#setDirection-com.aspose.threed.Vector3-}
```
public void setDirection(Vector3 value)
```


Sets the direction that the camera is looking at. Changes on this property will also affects the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) and [getTarget](../../com.aspose.threed/frustum\#getTarget).

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

### setFarPlane(double value) {#setFarPlane-double-}
```
public void setFarPlane(double value)
```


Sets the frustum's far plane distance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setFieldOfView(double value) {#setFieldOfView-double-}
```
public void setFieldOfView(double value)
```


Sets the camera's field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) or [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setFieldOfViewX(double value) {#setFieldOfViewX-double-}
```
public void setFieldOfViewX(double value)
```


Sets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setFieldOfViewY(double value) {#setFieldOfViewY-double-}
```
public void setFieldOfViewY(double value)
```


Sets the camera's vertical field of view in degrees, this property is used only when ApertureMode is [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Sets the view plane's height measured in inches

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setLookAt(Vector3 value) {#setLookAt-com.aspose.threed.Vector3-}
```
public void setLookAt(Vector3 value)
```


Sets the the interested position that the camera is looking at.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setMagnification(Vector2 value) {#setMagnification-com.aspose.threed.Vector2-}
```
public void setMagnification(Vector2 value)
```


Sets the magnification used in orthographic camera

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setNearPlane(double value) {#setNearPlane-double-}
```
public void setNearPlane(double value)
```


Sets the frustum's near plane distance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setOrthoHeight(double value) {#setOrthoHeight-double-}
```
public void setOrthoHeight(double value)
```


Sets the height when frustum in orthographic projection.

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

### setProjectionType(ProjectionType value) {#setProjectionType-com.aspose.threed.ProjectionType-}
```
public void setProjectionType(ProjectionType value)
```


Sets the camera's projection type. By default the perspective projection is used.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ProjectionType](../../com.aspose.threed/projectiontype) | New value |

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

### setRotationMode(RotationMode value) {#setRotationMode-com.aspose.threed.RotationMode-}
```
public void setRotationMode(RotationMode value)
```


Sets the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. If the value is [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET), the direction is always calculated by the property [getLookAt](../../com.aspose.threed/frustum\#getLookAt) Otherwise the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) is always calculated by the [getDirection](../../com.aspose.threed/frustum\#getDirection)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [RotationMode](../../com.aspose.threed/rotationmode) | New value |

### setTarget(Node value) {#setTarget-com.aspose.threed.Node-}
```
public void setTarget(Node value)
```


Sets the target that the camera is looking at. If the user supports this property, it should be prior to [getLookAt](../../com.aspose.threed/frustum\#getLookAt) property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

### setUp(Vector3 value) {#setUp-com.aspose.threed.Vector3-}
```
public void setUp(Vector3 value)
```


Sets the up direction of the camera

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setWidth(double value) {#setWidth-double-}
```
public void setWidth(double value)
```


Sets the view plane's width measured in inches

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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

