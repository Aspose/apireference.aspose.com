---
title: Dish 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/dish/
---
## Dish class

  Parameterized dish.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Create a new dish instance with default radius(10) and default height(5) | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(radius, height) | Create a new dish instance with specified radius and height | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| radius | Number | The radius of the dish |
| height | Number | The height of the dish |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(name, radius, height, widthSegments, heightSegments) | Create a new dish instance with specified radius and height | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | The name of the dish |
| radius | Number | The radius of the dish |
| height | Number | The height of the dish |
| widthSegments | Number | The width segment of the dish |
| heightSegments | Number | The height segment of the dish |

 **Result:**



---


### getHeight{#getHeight}

| Name | Description |
| --- | --- |
| getHeight() | Height of the dish | 

 **Result:**



---


### setHeight{#setHeight}

| Name | Description |
| --- | --- |
| setHeight(value) | Height of the dish | 

 **Result:**



---


### getRadius{#getRadius}

| Name | Description |
| --- | --- |
| getRadius() | Radius of the dish | 

 **Result:**



---


### setRadius{#setRadius}

| Name | Description |
| --- | --- |
| setRadius(value) | Radius of the dish | 

 **Result:**



---


### getWidthSegments{#getWidthSegments}

| Name | Description |
| --- | --- |
| getWidthSegments() | Gets or sets the width segments | 

 **Result:**



---


### setWidthSegments{#setWidthSegments}

| Name | Description |
| --- | --- |
| setWidthSegments(value) | Gets or sets the width segments | 

 **Result:**



---


### getHeightSegments{#getHeightSegments}

| Name | Description |
| --- | --- |
| getHeightSegments() | Gets or sets the height segments | 

 **Result:**



---


### setHeightSegments{#setHeightSegments}

| Name | Description |
| --- | --- |
| setHeightSegments(value) | Gets or sets the height segments | 

 **Result:**



---


### getCastShadows{#getCastShadows}

| Name | Description |
| --- | --- |
| getCastShadows() | Gets or sets whether this geometry can cast shadow | 

 **Result:**



---


### setCastShadows{#setCastShadows}

| Name | Description |
| --- | --- |
| setCastShadows(value) | Gets or sets whether this geometry can cast shadow | 

 **Result:**



---


### getReceiveShadows{#getReceiveShadows}

| Name | Description |
| --- | --- |
| getReceiveShadows() | Gets or sets whether this geometry can receive shadow. | 

 **Result:**



---


### setReceiveShadows{#setReceiveShadows}

| Name | Description |
| --- | --- |
| setReceiveShadows(value) | Gets or sets whether this geometry can receive shadow. | 

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
| toMesh() | Convert current object to mesh | 

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



