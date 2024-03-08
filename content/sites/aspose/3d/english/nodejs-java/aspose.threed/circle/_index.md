---
title: Circle 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/circle/
---
## Circle class

  A Circle curve consists of a set of points in the edge of the circle shape.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Constructor of Circle | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(radius) | Constructor of Circle | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| radius | Number | The radius of the circle curve. |

 **Result:**



---


### getRadius{#getRadius}

| Name | Description |
| --- | --- |
| getRadius() | The radius of the circle curve, default value is 10 | 

 **Result:**



---


### setRadius{#setRadius}

| Name | Description |
| --- | --- |
| setRadius(value) | The radius of the circle curve, default value is 10 | 

 **Result:**



---


### getColor{#getColor}

| Name | Description |
| --- | --- |
| getColor() | Gets or sets the color of the line, default value is white(1, 1, 1) | 

 **Result:**



---


### setColor{#setColor}

| Name | Description |
| --- | --- |
| setColor(value) | Gets or sets the color of the line, default value is white(1, 1, 1) | 

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



