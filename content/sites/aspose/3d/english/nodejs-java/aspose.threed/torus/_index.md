---
title: Torus 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/torus/
---
## Torus class

  Parameterized torus.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Torus class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(radius, tube) | Initializes a new instance of the Torus class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| radius | Number | The radius of the torus. |
| tube | Number | The radius of the torus' tube. |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(radius, tube, arc) | Initializes a new instance of the Torus class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| radius | Number | The radius of the torus. |
| tube | Number | The radius of the torus' tube. |
| arc | Number | Arc. |

 **Result:**



---


### constructor_overload$3{#constructor_overload$3}

| Name | Description |
| --- | --- |
| constructor_overload$3(name, radius, tube, radialSegments, tubularSegments, arc) | Initializes a new instance of the Torus class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |
| radius | Number | The radius of the torus. |
| tube | Number | The radius of the torus' tube. |
| radialSegments | Number | Radial segments. |
| tubularSegments | Number | Tubular segments. |
| arc | Number | Arc. |

 **Result:**



---


### getRadius{#getRadius}

| Name | Description |
| --- | --- |
| getRadius() | Gets or sets the radius of the torus. The radius. | 

 **Result:**



---


### setRadius{#setRadius}

| Name | Description |
| --- | --- |
| setRadius(value) | Gets or sets the radius of the torus. The radius. | 

 **Result:**



---


### getTube{#getTube}

| Name | Description |
| --- | --- |
| getTube() | Gets or sets the radius of the tube. The tube. | 

 **Result:**



---


### setTube{#setTube}

| Name | Description |
| --- | --- |
| setTube(value) | Gets or sets the radius of the tube. The tube. | 

 **Result:**



---


### getRadialSegments{#getRadialSegments}

| Name | Description |
| --- | --- |
| getRadialSegments() | Gets or sets the radial segments. The radial segments. | 

 **Result:**



---


### setRadialSegments{#setRadialSegments}

| Name | Description |
| --- | --- |
| setRadialSegments(value) | Gets or sets the radial segments. The radial segments. | 

 **Result:**



---


### getTubularSegments{#getTubularSegments}

| Name | Description |
| --- | --- |
| getTubularSegments() | Gets or sets the tubular segments. The tubular segments. | 

 **Result:**



---


### setTubularSegments{#setTubularSegments}

| Name | Description |
| --- | --- |
| setTubularSegments(value) | Gets or sets the tubular segments. The tubular segments. | 

 **Result:**



---


### getArc{#getArc}

| Name | Description |
| --- | --- |
| getArc() | Gets or sets the arc. The arc. | 

 **Result:**



---


### setArc{#setArc}

| Name | Description |
| --- | --- |
| setArc(value) | Gets or sets the arc. The arc. | 

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



