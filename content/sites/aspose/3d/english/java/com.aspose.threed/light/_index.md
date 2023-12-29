---
title: Light
second_title: Aspose.3D for Java API Reference
description: The light illuminates the scene.
type: docs
weight: 87
url: /java/com.aspose.threed/light/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Frustum](../../com.aspose.threed/frustum)
```
public class Light extends Frustum
```

The light illuminates the scene.

The formula to calculate the total attenuation of light is:  A = ConstantAttenuation + (Dist \* LinearAttenuation) + ((Dist^2) \* QuadraticAttenuation) 
## Constructors

| Constructor | Description |
| --- | --- |
| [Light()](#Light--) | Initializes a new instance of the [Light](../../com.aspose.threed/light) class. |
| [Light(String name)](#Light-java.lang.String-) | Initializes a new instance of the [Light](../../com.aspose.threed/light) class. |
| [Light(String name, LightType type)](#Light-java.lang.String-com.aspose.threed.LightType-) | Initializes a new instance of the [Light](../../com.aspose.threed/light) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getAspect()](#getAspect--) | Gets the aspect ratio of the frustum |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getCastLight()](#getCastLight--) | Gets if the current light instance can illuminate other objects. |
| [getCastShadows()](#getCastShadows--) | Gets if the light can cast shadows on other objects. |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | Gets the light's color |
| [getConstantAttenuation()](#getConstantAttenuation--) | Gets the constant attenuation to calculate the total attenuation of the light |
| [getDirection()](#getDirection--) | Gets the direction that the camera is looking at. |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getFalloff()](#getFalloff--) | Gets the falloff cone angle (in degrees). |
| [getFarPlane()](#getFarPlane--) | Gets the frustum's far plane distance. |
| [getHotSpot()](#getHotSpot--) | Gets the hot spot cone angle(in degrees). |
| [getIntensity()](#getIntensity--) | Gets the light's intensity, default value is 100 |
| [getLightType()](#getLightType--) | Gets the light's type |
| [getLinearAttenuation()](#getLinearAttenuation--) | Gets the linear attenuation to calculate the total attenuation of the light |
| [getLookAt()](#getLookAt--) | Gets the the interested position that the camera is looking at. |
| [getName()](#getName--) | Gets the name. |
| [getNearPlane()](#getNearPlane--) | Gets the frustum's near plane distance. |
| [getOrthoHeight()](#getOrthoHeight--) | Gets the height when frustum in orthographic projection. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getQuadraticAttenuation()](#getQuadraticAttenuation--) | Gets the quadratic attenuation to calculate the total attenuation of the light |
| [getRotationMode()](#getRotationMode--) | Gets the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getShadowColor()](#getShadowColor--) | Gets the shadow's color. |
| [getTarget()](#getTarget--) | Gets the target that the camera is looking at. |
| [getUp()](#getUp--) | Gets the up direction of the camera |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setAspect(double value)](#setAspect-double-) | Sets the aspect ratio of the frustum |
| [setCastLight(boolean value)](#setCastLight-boolean-) | Sets if the current light instance can illuminate other objects. |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Sets if the light can cast shadows on other objects. |
| [setColor(Vector3 value)](#setColor-com.aspose.threed.Vector3-) | Sets the light's color |
| [setConstantAttenuation(double value)](#setConstantAttenuation-double-) | Sets the constant attenuation to calculate the total attenuation of the light |
| [setDirection(Vector3 value)](#setDirection-com.aspose.threed.Vector3-) | Sets the direction that the camera is looking at. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setFalloff(double value)](#setFalloff-double-) | Sets the falloff cone angle (in degrees). |
| [setFarPlane(double value)](#setFarPlane-double-) | Sets the frustum's far plane distance. |
| [setHotSpot(double value)](#setHotSpot-double-) | Sets the hot spot cone angle(in degrees). |
| [setIntensity(double value)](#setIntensity-double-) | Sets the light's intensity, default value is 100 |
| [setLightType(LightType value)](#setLightType-com.aspose.threed.LightType-) | Sets the light's type |
| [setLinearAttenuation(double value)](#setLinearAttenuation-double-) | Sets the linear attenuation to calculate the total attenuation of the light |
| [setLookAt(Vector3 value)](#setLookAt-com.aspose.threed.Vector3-) | Sets the the interested position that the camera is looking at. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setNearPlane(double value)](#setNearPlane-double-) | Sets the frustum's near plane distance. |
| [setOrthoHeight(double value)](#setOrthoHeight-double-) | Sets the height when frustum in orthographic projection. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setQuadraticAttenuation(double value)](#setQuadraticAttenuation-double-) | Sets the quadratic attenuation to calculate the total attenuation of the light |
| [setRotationMode(RotationMode value)](#setRotationMode-com.aspose.threed.RotationMode-) | Sets the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. |
| [setShadowColor(Vector3 value)](#setShadowColor-com.aspose.threed.Vector3-) | Sets the shadow's color. |
| [setTarget(Node value)](#setTarget-com.aspose.threed.Node-) | Sets the target that the camera is looking at. |
| [setUp(Vector3 value)](#setUp-com.aspose.threed.Vector3-) | Sets the up direction of the camera |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Light() {#Light--}
```
public Light()
```


Initializes a new instance of the [Light](../../com.aspose.threed/light) class.

### Light(String name) {#Light-java.lang.String-}
```
public Light(String name)
```


Initializes a new instance of the [Light](../../com.aspose.threed/light) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### Light(String name, LightType type) {#Light-java.lang.String-com.aspose.threed.LightType-}
```
public Light(String name, LightType type)
```


Initializes a new instance of the [Light](../../com.aspose.threed/light) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |
| type | [LightType](../../com.aspose.threed/lighttype) | New light's type |

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
### getAspect() {#getAspect--}
```
public double getAspect()
```


Gets the aspect ratio of the frustum

**Returns:**
double
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Gets the bounding box of current entity in its object space coordinate system.

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### getCastLight() {#getCastLight--}
```
public boolean getCastLight()
```


Gets if the current light instance can illuminate other objects.

**Returns:**
boolean
### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Gets if the light can cast shadows on other objects.

**Returns:**
boolean
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


Gets the light's color

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getConstantAttenuation() {#getConstantAttenuation--}
```
public double getConstantAttenuation()
```


Gets the constant attenuation to calculate the total attenuation of the light

**Returns:**
double
### getDirection() {#getDirection--}
```
public Vector3 getDirection()
```


Gets the direction that the camera is looking at. Changes on this property will also affects the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) and [getTarget](../../com.aspose.threed/frustum\#getTarget).

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
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
### getFalloff() {#getFalloff--}
```
public double getFalloff()
```


Gets the falloff cone angle (in degrees).

**Returns:**
double
### getFarPlane() {#getFarPlane--}
```
public double getFarPlane()
```


Gets the frustum's far plane distance.

**Returns:**
double
### getHotSpot() {#getHotSpot--}
```
public double getHotSpot()
```


Gets the hot spot cone angle(in degrees).

**Returns:**
double
### getIntensity() {#getIntensity--}
```
public double getIntensity()
```


Gets the light's intensity, default value is 100

**Returns:**
double
### getLightType() {#getLightType--}
```
public LightType getLightType()
```


Gets the light's type

**Returns:**
[LightType](../../com.aspose.threed/lighttype)
### getLinearAttenuation() {#getLinearAttenuation--}
```
public double getLinearAttenuation()
```


Gets the linear attenuation to calculate the total attenuation of the light

**Returns:**
double
### getLookAt() {#getLookAt--}
```
public Vector3 getLookAt()
```


Gets the the interested position that the camera is looking at.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getNearPlane() {#getNearPlane--}
```
public double getNearPlane()
```


Gets the frustum's near plane distance.

**Returns:**
double
### getOrthoHeight() {#getOrthoHeight--}
```
public double getOrthoHeight()
```


Gets the height when frustum in orthographic projection.

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
### getQuadraticAttenuation() {#getQuadraticAttenuation--}
```
public double getQuadraticAttenuation()
```


Gets the quadratic attenuation to calculate the total attenuation of the light

**Returns:**
double
### getRotationMode() {#getRotationMode--}
```
public RotationMode getRotationMode()
```


Gets the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. If the value is [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET), the direction is always calculated by the property [getLookAt](../../com.aspose.threed/frustum\#getLookAt) Otherwise the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) is always calculated by the [getDirection](../../com.aspose.threed/frustum\#getDirection)

**Returns:**
[RotationMode](../../com.aspose.threed/rotationmode)
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene)
### getShadowColor() {#getShadowColor--}
```
public Vector3 getShadowColor()
```


Gets the shadow's color.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getTarget() {#getTarget--}
```
public Node getTarget()
```


Gets the target that the camera is looking at. If the user supports this property, it should be prior to [getLookAt](../../com.aspose.threed/frustum\#getLookAt) property.

**Returns:**
[Node](../../com.aspose.threed/node)
### getUp() {#getUp--}
```
public Vector3 getUp()
```


Gets the up direction of the camera

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
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
### setAspect(double value) {#setAspect-double-}
```
public void setAspect(double value)
```


Sets the aspect ratio of the frustum

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setCastLight(boolean value) {#setCastLight-boolean-}
```
public void setCastLight(boolean value)
```


Sets if the current light instance can illuminate other objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setCastShadows(boolean value) {#setCastShadows-boolean-}
```
public void setCastShadows(boolean value)
```


Sets if the light can cast shadows on other objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setColor(Vector3 value) {#setColor-com.aspose.threed.Vector3-}
```
public void setColor(Vector3 value)
```


Sets the light's color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setConstantAttenuation(double value) {#setConstantAttenuation-double-}
```
public void setConstantAttenuation(double value)
```


Sets the constant attenuation to calculate the total attenuation of the light

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

### setFalloff(double value) {#setFalloff-double-}
```
public void setFalloff(double value)
```


Sets the falloff cone angle (in degrees).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setFarPlane(double value) {#setFarPlane-double-}
```
public void setFarPlane(double value)
```


Sets the frustum's far plane distance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setHotSpot(double value) {#setHotSpot-double-}
```
public void setHotSpot(double value)
```


Sets the hot spot cone angle(in degrees).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setIntensity(double value) {#setIntensity-double-}
```
public void setIntensity(double value)
```


Sets the light's intensity, default value is 100

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setLightType(LightType value) {#setLightType-com.aspose.threed.LightType-}
```
public void setLightType(LightType value)
```


Sets the light's type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [LightType](../../com.aspose.threed/lighttype) | New value |

### setLinearAttenuation(double value) {#setLinearAttenuation-double-}
```
public void setLinearAttenuation(double value)
```


Sets the linear attenuation to calculate the total attenuation of the light

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

### setQuadraticAttenuation(double value) {#setQuadraticAttenuation-double-}
```
public void setQuadraticAttenuation(double value)
```


Sets the quadratic attenuation to calculate the total attenuation of the light

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setRotationMode(RotationMode value) {#setRotationMode-com.aspose.threed.RotationMode-}
```
public void setRotationMode(RotationMode value)
```


Sets the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. If the value is [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET), the direction is always calculated by the property [getLookAt](../../com.aspose.threed/frustum\#getLookAt) Otherwise the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) is always calculated by the [getDirection](../../com.aspose.threed/frustum\#getDirection)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [RotationMode](../../com.aspose.threed/rotationmode) | New value |

### setShadowColor(Vector3 value) {#setShadowColor-com.aspose.threed.Vector3-}
```
public void setShadowColor(Vector3 value)
```


Sets the shadow's color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

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

