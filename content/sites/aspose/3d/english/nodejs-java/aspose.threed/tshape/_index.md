---
title: TShape 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/tshape/
---
## TShape class

  IFC compatible T-shape defined by parameters.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Constructor of TShape | 

 **Result:**



---


### getDepth{#getDepth}

| Name | Description |
| --- | --- |
| getDepth() | Gets or sets the length of the web. | 

 **Result:**



---


### setDepth{#setDepth}

| Name | Description |
| --- | --- |
| setDepth(value) | Gets or sets the length of the web. | 

 **Result:**



---


### getFlangeWidth{#getFlangeWidth}

| Name | Description |
| --- | --- |
| getFlangeWidth() | Gets or sets the length of the flange. | 

 **Result:**



---


### setFlangeWidth{#setFlangeWidth}

| Name | Description |
| --- | --- |
| setFlangeWidth(value) | Gets or sets the length of the flange. | 

 **Result:**



---


### getWebThickness{#getWebThickness}

| Name | Description |
| --- | --- |
| getWebThickness() | Gets or sets the wall thickness of web. | 

 **Result:**



---


### setWebThickness{#setWebThickness}

| Name | Description |
| --- | --- |
| setWebThickness(value) | Gets or sets the wall thickness of web. | 

 **Result:**



---


### getFlangeThickness{#getFlangeThickness}

| Name | Description |
| --- | --- |
| getFlangeThickness() | Gets or sets the wall thickness of flange. | 

 **Result:**



---


### setFlangeThickness{#setFlangeThickness}

| Name | Description |
| --- | --- |
| setFlangeThickness(value) | Gets or sets the wall thickness of flange. | 

 **Result:**



---


### getFilletRadius{#getFilletRadius}

| Name | Description |
| --- | --- |
| getFilletRadius() | Gets or sets the radius of fillet between web and flange. | 

 **Result:**



---


### setFilletRadius{#setFilletRadius}

| Name | Description |
| --- | --- |
| setFilletRadius(value) | Gets or sets the radius of fillet between web and flange. | 

 **Result:**



---


### getFlangeEdgeRadius{#getFlangeEdgeRadius}

| Name | Description |
| --- | --- |
| getFlangeEdgeRadius() | Gets or sets the radius of the flange edge. | 

 **Result:**



---


### setFlangeEdgeRadius{#setFlangeEdgeRadius}

| Name | Description |
| --- | --- |
| setFlangeEdgeRadius(value) | Gets or sets the radius of the flange edge. | 

 **Result:**



---


### getWebEdgeRadius{#getWebEdgeRadius}

| Name | Description |
| --- | --- |
| getWebEdgeRadius() | Gets or sets the radius of web edge. | 

 **Result:**



---


### setWebEdgeRadius{#setWebEdgeRadius}

| Name | Description |
| --- | --- |
| setWebEdgeRadius(value) | Gets or sets the radius of web edge. | 

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


### getExtent{#getExtent}

| Name | Description |
| --- | --- |
| getExtent() | Gets the extent in x and y dimension. | 

 **Result:**
Vector2


---


### getEntityRendererKey{#getEntityRendererKey}

| Name | Description |
| --- | --- |
| getEntityRendererKey() | Gets the key of the entity renderer registered in the renderer | 

 **Result:**
EntityRendererKey


---


### getBoundingBox{#getBoundingBox}

| Name | Description |
| --- | --- |
| getBoundingBox() | Gets the bounding box of current entity in its object space coordinate system. | 

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



