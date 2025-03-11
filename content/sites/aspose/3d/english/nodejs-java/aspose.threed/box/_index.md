---
title: Box 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/box/
---
## Box class

  Box.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Box class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(length, width, height) | Initializes a new instance of the Box class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| length | Number | Length of the box aligned in z-axis. |
| width | Number | Width of the box aligned in x-axis. |
| height | Number | Height of the box aligned in y-axis. |

 **Result:**



---


### constructor_overload2{#constructor_overload2}

| Name | Description |
| --- | --- |
| constructor_overload2(name, length, width, height, lengthSegments, widthSegments, heightSegments) | Initializes a new instance of the Box class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name of the box. |
| length | Number | Length of the box aligned in z-axis. |
| width | Number | Width of the box aligned in x-axis. |
| height | Number | Height of the box aligned in y-axis. |
| lengthSegments | Number | Length segments. |
| widthSegments | Number | Width segments. |
| heightSegments | Number | Height segments. |

 **Result:**



---


### getLengthSegments{#getLengthSegments}

| Name | Description |
| --- | --- |
| getLengthSegments() | Gets or sets the length segments. | 

 **Result:**



---


### setLengthSegments{#setLengthSegments}

| Name | Description |
| --- | --- |
| setLengthSegments(value) | Gets or sets the length segments. | 

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
| getHeightSegments() | gets or sets the height segments. | 

 **Result:**



---


### setHeightSegments{#setHeightSegments}

| Name | Description |
| --- | --- |
| setHeightSegments(value) | gets or sets the height segments. | 

 **Result:**



---


### getLength{#getLength}

| Name | Description |
| --- | --- |
| getLength() | Gets or sets the length of the box aligned in z-axis. The length aligned in z-axis. | 

 **Result:**



---


### setLength{#setLength}

| Name | Description |
| --- | --- |
| setLength(value) | Gets or sets the length of the box aligned in z-axis. The length aligned in z-axis. | 

 **Result:**



---


### getWidth{#getWidth}

| Name | Description |
| --- | --- |
| getWidth() | Gets or sets the width of the box aligned in x-axis. The width aligned in x-axis. | 

 **Result:**



---


### setWidth{#setWidth}

| Name | Description |
| --- | --- |
| setWidth(value) | Gets or sets the width of the box aligned in x-axis. The width aligned in x-axis. | 

 **Result:**



---


### getHeight{#getHeight}

| Name | Description |
| --- | --- |
| getHeight() | Gets or sets the height of the box aligned in y-axis. The height aligned in y-axis. | 

 **Result:**



---


### setHeight{#setHeight}

| Name | Description |
| --- | --- |
| setHeight(value) | Gets or sets the height of the box aligned in y-axis. The height aligned in y-axis. | 

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



