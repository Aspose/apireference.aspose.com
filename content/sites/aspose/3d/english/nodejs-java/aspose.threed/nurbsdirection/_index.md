---
title: NurbsDirection 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/nurbsdirection/
---
## NurbsDirection class

  A 3D NurbsSurface has two direction, the NurbsSurface.U and NurbsSurface.V, the NurbsDirection defines data for each direction.  A direction is actually a NURBS curve, that means it's also defined by its Order, a KnotVectors, and a set of weighted control points(defined in NurbsSurface).


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() |  | 

 **Result:**



---


### getKnotVectors{#getKnotVectors}

| Name | Description |
| --- | --- |
| getKnotVectors() | Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve. | 

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
| getOrder() | Gets or sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. | 

 **Result:**



---


### setOrder{#setOrder}

| Name | Description |
| --- | --- |
| setOrder(value) | Gets or sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. | 

 **Result:**



---


### getDivisions{#getDivisions}

| Name | Description |
| --- | --- |
| getDivisions() | Gets or sets the number of divisions between adjacent control points in current direction. The step. | 

 **Result:**



---


### setDivisions{#setDivisions}

| Name | Description |
| --- | --- |
| setDivisions(value) | Gets or sets the number of divisions between adjacent control points in current direction. The step. | 

 **Result:**



---


### getType{#getType}

| Name | Description |
| --- | --- |
| getType() | Gets or sets the type of the current direction. The value of the property is NurbsType integer constant. | 

 **Result:**



---


### setType{#setType}

| Name | Description |
| --- | --- |
| setType(value) | Gets or sets the type of the current direction. The value of the property is NurbsType integer constant. | 

 **Result:**



---


### getCount{#getCount}

| Name | Description |
| --- | --- |
| getCount() | Gets or sets the count of control points in current direction. The count. | 

 **Result:**



---


### setCount{#setCount}

| Name | Description |
| --- | --- |
| setCount(value) | Gets or sets the count of control points in current direction. The count. | 

 **Result:**



---



