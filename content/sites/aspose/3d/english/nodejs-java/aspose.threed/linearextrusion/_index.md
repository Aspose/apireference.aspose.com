---
title: LinearExtrusion 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/linearextrusion/
---
## LinearExtrusion class

  Linear extrusion takes a 2D shape as input and extends the shape in the 3rd dimension.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Constructor of instance LinearExtrusion. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(shape, height) | Constructor of instance LinearExtrusion. | 

 **Result:**



---


### getShape{#getShape}

| Name | Description |
| --- | --- |
| getShape() | The base shape to be extruded. | 

 **Result:**



---


### setShape{#setShape}

| Name | Description |
| --- | --- |
| setShape(value) | The base shape to be extruded. | 

 **Result:**



---


### getDirection{#getDirection}

| Name | Description |
| --- | --- |
| getDirection() | The direction of extrusion, default value is (0, 0, 1) | 

 **Result:**



---


### setDirection{#setDirection}

| Name | Description |
| --- | --- |
| setDirection(value) | The direction of extrusion, default value is (0, 0, 1) | 

 **Result:**



---


### getHeight{#getHeight}

| Name | Description |
| --- | --- |
| getHeight() | The height of the extruded geometry, default value is 1.0 | 

 **Result:**



---


### setHeight{#setHeight}

| Name | Description |
| --- | --- |
| setHeight(value) | The height of the extruded geometry, default value is 1.0 | 

 **Result:**



---


### getSlices{#getSlices}

| Name | Description |
| --- | --- |
| getSlices() | The slices of the twisted extruded geometry, default value is 1. | 

 **Result:**



---


### setSlices{#setSlices}

| Name | Description |
| --- | --- |
| setSlices(value) | The slices of the twisted extruded geometry, default value is 1. | 

 **Result:**



---


### getCenter{#getCenter}

| Name | Description |
| --- | --- |
| getCenter() | If this value is false, the linear extrusion Z range is from 0 to height, otherwise the range is from -height/2 to height/2. | 

 **Result:**



---


### setCenter{#setCenter}

| Name | Description |
| --- | --- |
| setCenter(value) | If this value is false, the linear extrusion Z range is from 0 to height, otherwise the range is from -height/2 to height/2. | 

 **Result:**



---


### getTwistOffset{#getTwistOffset}

| Name | Description |
| --- | --- |
| getTwistOffset() | The offset that used in twisting, default value is (0, 0, 0). | 

 **Result:**



---


### setTwistOffset{#setTwistOffset}

| Name | Description |
| --- | --- |
| setTwistOffset(value) | The offset that used in twisting, default value is (0, 0, 0). | 

 **Result:**



---


### getTwist{#getTwist}

| Name | Description |
| --- | --- |
| getTwist() | The number of degrees of through which the shape is extruded. | 

 **Result:**



---


### setTwist{#setTwist}

| Name | Description |
| --- | --- |
| setTwist(value) | The number of degrees of through which the shape is extruded. | 

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


### toMesh{#toMesh}

| Name | Description |
| --- | --- |
| toMesh() | Convert the extrusion to mesh. | 

 **Result:**
Mesh


---


### getBoundingBox{#getBoundingBox}

| Name | Description |
| --- | --- |
| getBoundingBox() | Gets the bounding box of current entity in its object space coordinate system. | 

 **Result:**
Mesh


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



