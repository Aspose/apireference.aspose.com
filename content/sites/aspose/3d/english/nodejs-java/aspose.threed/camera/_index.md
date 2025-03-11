---
title: Camera 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/camera/
---
## Camera class

  The camera describes the eye point of the viewer looking at the scene.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Camera class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(projectionType) | Initializes a new instance of the Camera class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| projectionType | ProjectionType | ProjectionType |

 **Result:**



---


### constructor_overload2{#constructor_overload2}

| Name | Description |
| --- | --- |
| constructor_overload2(name) | Initializes a new instance of the Camera class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### constructor_overload3{#constructor_overload3}

| Name | Description |
| --- | --- |
| constructor_overload3(name, projectionType) | Initializes a new instance of the Camera class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |
| projectionType | ProjectionType | ProjectionType |

 **Result:**



---


### getApertureMode{#getApertureMode}

| Name | Description |
| --- | --- |
| getApertureMode() | Gets or sets the camera's aperture mode The value of the property is ApertureMode integer constant. | 

 **Result:**



---


### setApertureMode{#setApertureMode}

| Name | Description |
| --- | --- |
| setApertureMode(value) | Gets or sets the camera's aperture mode The value of the property is ApertureMode integer constant. | 

 **Result:**



---


### getFieldOfView{#getFieldOfView}

| Name | Description |
| --- | --- |
| getFieldOfView() | Gets or sets the camera's field of view in degrees, this property is used only when ApertureMode is ApertureMode.HORIZONTAL or ApertureMode.VERTICAL | 

 **Result:**



---


### setFieldOfView{#setFieldOfView}

| Name | Description |
| --- | --- |
| setFieldOfView(value) | Gets or sets the camera's field of view in degrees, this property is used only when ApertureMode is ApertureMode.HORIZONTAL or ApertureMode.VERTICAL | 

 **Result:**



---


### getFieldOfViewX{#getFieldOfViewX}

| Name | Description |
| --- | --- |
| getFieldOfViewX() | Gets or sets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is ApertureMode.HORIZ_AND_VERT | 

 **Result:**



---


### setFieldOfViewX{#setFieldOfViewX}

| Name | Description |
| --- | --- |
| setFieldOfViewX(value) | Gets or sets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is ApertureMode.HORIZ_AND_VERT | 

 **Result:**



---


### getFieldOfViewY{#getFieldOfViewY}

| Name | Description |
| --- | --- |
| getFieldOfViewY() | Gets or sets the camera's vertical field of view in degrees, this property is used only when ApertureMode is ApertureMode.HORIZ_AND_VERT | 

 **Result:**



---


### setFieldOfViewY{#setFieldOfViewY}

| Name | Description |
| --- | --- |
| setFieldOfViewY(value) | Gets or sets the camera's vertical field of view in degrees, this property is used only when ApertureMode is ApertureMode.HORIZ_AND_VERT | 

 **Result:**



---


### getWidth{#getWidth}

| Name | Description |
| --- | --- |
| getWidth() | Gets or sets the view plane's width measured in inches | 

 **Result:**



---


### setWidth{#setWidth}

| Name | Description |
| --- | --- |
| setWidth(value) | Gets or sets the view plane's width measured in inches | 

 **Result:**



---


### getHeight{#getHeight}

| Name | Description |
| --- | --- |
| getHeight() | Gets or sets the view plane's height measured in inches | 

 **Result:**



---


### setHeight{#setHeight}

| Name | Description |
| --- | --- |
| setHeight(value) | Gets or sets the view plane's height measured in inches | 

 **Result:**



---


### getAspectRatio{#getAspectRatio}

| Name | Description |
| --- | --- |
| getAspectRatio() | Gets or sets the view plane aspect ratio. | 

 **Result:**



---


### setAspectRatio{#setAspectRatio}

| Name | Description |
| --- | --- |
| setAspectRatio(value) | Gets or sets the view plane aspect ratio. | 

 **Result:**



---


### getMagnification{#getMagnification}

| Name | Description |
| --- | --- |
| getMagnification() | Gets or sets the magnification used in orthographic camera | 

 **Result:**



---


### setMagnification{#setMagnification}

| Name | Description |
| --- | --- |
| setMagnification(value) | Gets or sets the magnification used in orthographic camera | 

 **Result:**



---


### getProjectionType{#getProjectionType}

| Name | Description |
| --- | --- |
| getProjectionType() | Gets or sets the camera's projection type. By default the perspective projection is used. The value of the property is ProjectionType integer constant. | 

 **Result:**



---


### setProjectionType{#setProjectionType}

| Name | Description |
| --- | --- |
| setProjectionType(value) | Gets or sets the camera's projection type. By default the perspective projection is used. The value of the property is ProjectionType integer constant. | 

 **Result:**



---


### getRotationMode{#getRotationMode}

| Name | Description |
| --- | --- |
| getRotationMode() | Gets or sets the frustum's orientation mode This property only works when the Target is null. If the value is RotationMode.FIXED_TARGET, the direction is always calculated by the property LookAt Otherwise the LookAt is always calculated by the DirectionThe value of the property is RotationMode integer constant. | 

 **Result:**



---


### setRotationMode{#setRotationMode}

| Name | Description |
| --- | --- |
| setRotationMode(value) | Gets or sets the frustum's orientation mode This property only works when the Target is null. If the value is RotationMode.FIXED_TARGET, the direction is always calculated by the property LookAt Otherwise the LookAt is always calculated by the DirectionThe value of the property is RotationMode integer constant. | 

 **Result:**



---


### getNearPlane{#getNearPlane}

| Name | Description |
| --- | --- |
| getNearPlane() | Gets or sets the frustum's near plane distance. | 

 **Result:**



---


### setNearPlane{#setNearPlane}

| Name | Description |
| --- | --- |
| setNearPlane(value) | Gets or sets the frustum's near plane distance. | 

 **Result:**



---


### getFarPlane{#getFarPlane}

| Name | Description |
| --- | --- |
| getFarPlane() | Gets or sets the frustum's far plane distance. | 

 **Result:**



---


### setFarPlane{#setFarPlane}

| Name | Description |
| --- | --- |
| setFarPlane(value) | Gets or sets the frustum's far plane distance. | 

 **Result:**



---


### getAspect{#getAspect}

| Name | Description |
| --- | --- |
| getAspect() | Gets or sets the aspect ratio of the frustum | 

 **Result:**



---


### setAspect{#setAspect}

| Name | Description |
| --- | --- |
| setAspect(value) | Gets or sets the aspect ratio of the frustum | 

 **Result:**



---


### getOrthoHeight{#getOrthoHeight}

| Name | Description |
| --- | --- |
| getOrthoHeight() | Gets or sets the height when frustum in orthographic projection. | 

 **Result:**



---


### setOrthoHeight{#setOrthoHeight}

| Name | Description |
| --- | --- |
| setOrthoHeight(value) | Gets or sets the height when frustum in orthographic projection. | 

 **Result:**



---


### getUp{#getUp}

| Name | Description |
| --- | --- |
| getUp() | Gets or sets the up direction of the camera | 

 **Result:**



---


### setUp{#setUp}

| Name | Description |
| --- | --- |
| setUp(value) | Gets or sets the up direction of the camera | 

 **Result:**



---


### getLookAt{#getLookAt}

| Name | Description |
| --- | --- |
| getLookAt() | Gets or sets the the interested position that the camera is looking at. | 

 **Result:**



---


### setLookAt{#setLookAt}

| Name | Description |
| --- | --- |
| setLookAt(value) | Gets or sets the the interested position that the camera is looking at. | 

 **Result:**



---


### getDirection{#getDirection}

| Name | Description |
| --- | --- |
| getDirection() | Gets or sets the direction that the camera is looking at. Changes on this property will also affects the LookAt and Target. | 

 **Result:**



---


### setDirection{#setDirection}

| Name | Description |
| --- | --- |
| setDirection(value) | Gets or sets the direction that the camera is looking at. Changes on this property will also affects the LookAt and Target. | 

 **Result:**



---


### getTarget{#getTarget}

| Name | Description |
| --- | --- |
| getTarget() | Gets or sets the target that the camera is looking at. If the user supports this property, it should be prior to LookAt property. | 

 **Result:**



---


### setTarget{#setTarget}

| Name | Description |
| --- | --- |
| setTarget(value) | Gets or sets the target that the camera is looking at. If the user supports this property, it should be prior to LookAt property. | 

 **Result:**



---


### getParentNodes{#getParentNodes}

| Name | Description |
| --- | --- |
| getParentNodes() | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing The nodes. | 

 **Result:**



---


### getExcluded{#getExcluded}

| Name | Description |
| --- | --- |
| getExcluded() | Gets or sets whether to exclude this entity during exporting. | 

 **Result:**



---


### setExcluded{#setExcluded}

| Name | Description |
| --- | --- |
| setExcluded(value) | Gets or sets whether to exclude this entity during exporting. | 

 **Result:**



---


### getParentNode{#getParentNode}

| Name | Description |
| --- | --- |
| getParentNode() | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. The parent node. | 

 **Result:**



---


### setParentNode{#setParentNode}

| Name | Description |
| --- | --- |
| setParentNode(value) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. The parent node. | 

 **Result:**



---


### getScene{#getScene}

| Name | Description |
| --- | --- |
| getScene() | Gets the scene that this object belongs to | 

 **Result:**



---


### getName{#getName}

| Name | Description |
| --- | --- |
| getName() | Gets or sets the name. The name. | 

 **Result:**



---


### setName{#setName}

| Name | Description |
| --- | --- |
| setName(value) | Gets or sets the name. The name. | 

 **Result:**



---


### getProperties{#getProperties}

| Name | Description |
| --- | --- |
| getProperties() | Gets the collection of all properties. | 

 **Result:**



---


### moveForward{#moveForward}

| Name | Description |
| --- | --- |
| moveForward(distance) | Move camera forward towards its direction or target. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| distance | Number | How long to move forward |

 **Result:**



---


### getBoundingBox{#getBoundingBox}

| Name | Description |
| --- | --- |
| getBoundingBox() | Gets the bounding box of current entity in its object space coordinate system. | 

 **Result:**



---


### getEntityRendererKey{#getEntityRendererKey}

| Name | Description |
| --- | --- |
| getEntityRendererKey() | Gets the key of the entity renderer registered in the renderer | 

 **Result:**
EntityRendererKey


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Removes a dynamic property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | Property | Which property to remove |

 **Result:**
boolean


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Remove the specified property identified by name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  propert | String | null |

 **Result:**
boolean


---


### getProperty{#getProperty}

| Name | Description |
| --- | --- |
| getProperty(property) | Get the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |

 **Result:**
Object


---


### setProperty{#setProperty}

| Name | Description |
| --- | --- |
| setProperty(property, value) | Sets the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |
| value | Object | The value of the property |

 **Result:**
Object


---


### findProperty{#findProperty}

| Name | Description |
| --- | --- |
| findProperty(propertyName) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| propertyName | String | Property name. |

 **Result:**
Property


---



