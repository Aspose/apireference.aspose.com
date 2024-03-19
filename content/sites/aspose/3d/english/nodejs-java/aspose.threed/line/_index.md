---
title: Line 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/line/
---
## Line class

  A polyline is a path defined by a set of points with Geometry.ControlPoints, and connected by Segments,  which means it can also be a set of connected line segments.  The line is usually a linear object, which means it cannot be used to represent a curve, in order to represent a curve, uses NurbsCurve.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Line class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(name) | Initializes a new instance of the Line class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### getControlPoints{#getControlPoints}

| Name | Description |
| --- | --- |
| getControlPoints() | Gets all control points | 

 **Result:**



---


### getVisible{#getVisible}

| Name | Description |
| --- | --- |
| getVisible() | Gets or sets if the geometry is visible | 

 **Result:**



---


### setVisible{#setVisible}

| Name | Description |
| --- | --- |
| setVisible(value) | Gets or sets if the geometry is visible | 

 **Result:**



---


### getSegments{#getSegments}

| Name | Description |
| --- | --- |
| getSegments() | Gets the segments of the line | 

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


### fromPoints{#fromPoints}

| Name | Description |
| --- | --- |
| fromPoints(points) | Construct a Line instance from a set of points. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  point | Vector3[] | null |

 **Result:**
Line


---


### makeDefaultIndices{#makeDefaultIndices}

| Name | Description |
| --- | --- |
| makeDefaultIndices() | Generate the sequence 0,1,2,3....Geometry.ControlPoints.Length-1 to Segments so the ControlPoints can be used as a single line | 

 **Result:**
Line


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



