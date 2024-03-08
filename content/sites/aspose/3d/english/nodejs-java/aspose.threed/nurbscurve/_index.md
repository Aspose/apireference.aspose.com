---
title: NurbsCurve 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/nurbscurve/
---
## NurbsCurve class

  NURBS curve is a curve represented by NURBS(Non-uniform rational basis spline),  A NURBS curve is defined by its Order, a set of weighted Geometry.ControlPoints and a KnotVectors  The w component in control point is used as control point's weight, whatever it is a CurveDimension.TWO_DIMENSIONAL or CurveDimension.THREE_DIMENSIONAL


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the NurbsCurve class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(name) | Initializes a new instance of the NurbsCurve class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name |

 **Result:**



---


### getControlPoints{#getControlPoints}

| Name | Description |
| --- | --- |
| getControlPoints() | Gets all control points | 

 **Result:**



---


### getMultiplicity{#getMultiplicity}

| Name | Description |
| --- | --- |
| getMultiplicity() | Gets the multiplicity. The multiplicity. | 

 **Result:**



---


### getOrder{#getOrder}

| Name | Description |
| --- | --- |
| getOrder() | Gets or sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. The order. | 

 **Result:**



---


### setOrder{#setOrder}

| Name | Description |
| --- | --- |
| setOrder(value) | Gets or sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. The order. | 

 **Result:**



---


### getDimension{#getDimension}

| Name | Description |
| --- | --- |
| getDimension() | Gets or sets the curve's dimension. The value of the property is CurveDimension integer constant. For a CurveDimension.TWO_DIMENSIONAL curve, the z component in control point is unused. | 

 **Result:**



---


### setDimension{#setDimension}

| Name | Description |
| --- | --- |
| setDimension(value) | Gets or sets the curve's dimension. The value of the property is CurveDimension integer constant. For a CurveDimension.TWO_DIMENSIONAL curve, the z component in control point is unused. | 

 **Result:**



---


### getCurveType{#getCurveType}

| Name | Description |
| --- | --- |
| getCurveType() | Gets or sets the type of the curve. The value of the property is NurbsType integer constant.The type of the curve. | 

 **Result:**



---


### setCurveType{#setCurveType}

| Name | Description |
| --- | --- |
| setCurveType(value) | Gets or sets the type of the curve. The value of the property is NurbsType integer constant.The type of the curve. | 

 **Result:**



---


### getKnotVectors{#getKnotVectors}

| Name | Description |
| --- | --- |
| getKnotVectors() | Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve. | 

 **Result:**



---


### getRational{#getRational}

| Name | Description |
| --- | --- |
| getRational() | Gets or sets whether it is rational, this value indicates whether this NurbsCurve is rational spline or non-rational spline. Non-rational B-spline is a special case of rational B-splines. true if it's rational spline; otherwise, false is a non-rational spline. | 

 **Result:**



---


### setRational{#setRational}

| Name | Description |
| --- | --- |
| setRational(value) | Gets or sets whether it is rational, this value indicates whether this NurbsCurve is rational spline or non-rational spline. Non-rational B-spline is a special case of rational B-splines. true if it's rational spline; otherwise, false is a non-rational spline. | 

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


### evaluate{#evaluate}

| Name | Description |
| --- | --- |
| evaluate(steps) | Evaluate the NURBS curve | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| steps | Number | The evaluation frequency between two neighbor knots, default value is 20 |

 **Result:**
Vector4[]


---


### evaluateAt{#evaluateAt}

| Name | Description |
| --- | --- |
| evaluateAt(u) | Evaluate the curve's point at specified position | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| u | Number | The position in the curve, between 0 and 1 |

 **Result:**
Vector4


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



