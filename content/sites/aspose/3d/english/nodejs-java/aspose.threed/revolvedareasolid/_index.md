---
title: RevolvedAreaSolid 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/revolvedareasolid/
---
## RevolvedAreaSolid class

  This class represents a solid model by revolving a cross section provided by a profile about an axis.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() |  | 

 **Result:**



---


### getAngleStart{#getAngleStart}

| Name | Description |
| --- | --- |
| getAngleStart() | Gets or sets the starting angle of the revolving procedure, measured in radian, default value is 0. | 

 **Result:**



---


### setAngleStart{#setAngleStart}

| Name | Description |
| --- | --- |
| setAngleStart(value) | Gets or sets the starting angle of the revolving procedure, measured in radian, default value is 0. | 

 **Result:**



---


### getAngleEnd{#getAngleEnd}

| Name | Description |
| --- | --- |
| getAngleEnd() | Gets or sets the ending angle of the revolving procedure, measured in radian, default value is pi. | 

 **Result:**



---


### setAngleEnd{#setAngleEnd}

| Name | Description |
| --- | --- |
| setAngleEnd(value) | Gets or sets the ending angle of the revolving procedure, measured in radian, default value is pi. | 

 **Result:**



---


### getAxis{#getAxis}

| Name | Description |
| --- | --- |
| getAxis() | Gets or sets the axis direction, default value is (0, 1, 0). | 

 **Result:**



---


### setAxis{#setAxis}

| Name | Description |
| --- | --- |
| setAxis(value) | Gets or sets the axis direction, default value is (0, 1, 0). | 

 **Result:**



---


### getOrigin{#getOrigin}

| Name | Description |
| --- | --- |
| getOrigin() | Gets or sets the origin point of the revolving, default value is (0, 0, 0). | 

 **Result:**



---


### setOrigin{#setOrigin}

| Name | Description |
| --- | --- |
| setOrigin(value) | Gets or sets the origin point of the revolving, default value is (0, 0, 0). | 

 **Result:**



---


### getShape{#getShape}

| Name | Description |
| --- | --- |
| getShape() | Gets or sets the base profile used to revolve. | 

 **Result:**



---


### setShape{#setShape}

| Name | Description |
| --- | --- |
| setShape(value) | Gets or sets the base profile used to revolve. | 

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
| toMesh() | Convert the RevolvedAreaSolid into a mesh. | 

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



