---
title: Pyramid 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/pyramid/
---
## Pyramid class

  Parameterized pyramid.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Construct a new pyramid instance with default bottom area(10, 10) and default height(5) | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(xbottom, ybottom, height) | Construct a new pyramid instance with specified bottom area | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| xbottom | Number | The x-direction length of the bottom |
| ybottom | Number | The y-direction length of the bottom |
| height | Number | The height of the pyramid |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(xbottom, ybottom, xtop, ytop, height) | Construct a new pyramid instance with specified bottom area and top area and height. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| xbottom | Number | The x-direction length of the bottom area |
| ybottom | Number | The y-direction length of the bottom area |
| xtop | Number | The x-direction length of the top area |
| ytop | Number | The y-direction length of the top area |
| height | Number | The height of the pyramid |

 **Result:**



---


### constructor_overload$3{#constructor_overload$3}

| Name | Description |
| --- | --- |
| constructor_overload$3(name, xbottom, ybottom, xtop, ytop, height) | Construct a new pyramid instance with specified bottom area and top area and height. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | The name of the pyramid |
| xbottom | Number | The x-direction length of the bottom area |
| ybottom | Number | The y-direction length of the bottom area |
| xtop | Number | The x-direction length of the top area |
| ytop | Number | The y-direction length of the top area |
| height | Number | The height of the pyramid |

 **Result:**



---


### getBottomArea{#getBottomArea}

| Name | Description |
| --- | --- |
| getBottomArea() | Area of the bottom cap | 

 **Result:**



---


### setBottomArea{#setBottomArea}

| Name | Description |
| --- | --- |
| setBottomArea(value) | Area of the bottom cap | 

 **Result:**



---


### getTopArea{#getTopArea}

| Name | Description |
| --- | --- |
| getTopArea() | Area of the top cap | 

 **Result:**



---


### setTopArea{#setTopArea}

| Name | Description |
| --- | --- |
| setTopArea(value) | Area of the top cap | 

 **Result:**



---


### getBottomOffset{#getBottomOffset}

| Name | Description |
| --- | --- |
| getBottomOffset() | Offset for bottom vertices | 

 **Result:**



---


### setBottomOffset{#setBottomOffset}

| Name | Description |
| --- | --- |
| setBottomOffset(value) | Offset for bottom vertices | 

 **Result:**



---


### getHeight{#getHeight}

| Name | Description |
| --- | --- |
| getHeight() | Height of the pyramid | 

 **Result:**



---


### setHeight{#setHeight}

| Name | Description |
| --- | --- |
| setHeight(value) | Height of the pyramid | 

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



