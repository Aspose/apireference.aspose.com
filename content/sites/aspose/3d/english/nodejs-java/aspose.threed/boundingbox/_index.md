---
title: BoundingBox 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/boundingbox/
---
## BoundingBox class

  The axis-aligned bounding box


## Properties

| Name | Description |
| --- | --- |
| 	NULL | The null bounding box | 
| 	INFINITE | The infinite bounding box | 

## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() |  | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(minimum, maximum) | Initialize a finite bounding box with given minimum and maximum corner | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| minimum | Vector3 | The minimum corner |
| maximum | Vector3 | The maximum corner |

 **Result:**



---


### constructor_overload2{#constructor_overload2}

| Name | Description |
| --- | --- |
| constructor_overload2(minX, minY, minZ, maxX, maxY, maxZ) | Initialize a finite bounding box with given minimum and maximum corner | 

 **Result:**



---


### getExtent{#getExtent}

| Name | Description |
| --- | --- |
| getExtent() | Gets the extent of the bounding box. The value of the property is BoundingBoxExtent integer constant. | 

 **Result:**



---


### getMinimum{#getMinimum}

| Name | Description |
| --- | --- |
| getMinimum() | The minimum corner of the bounding box | 

 **Result:**



---


### getMaximum{#getMaximum}

| Name | Description |
| --- | --- |
| getMaximum() | The maximum corner of the bounding box | 

 **Result:**



---


### getSize{#getSize}

| Name | Description |
| --- | --- |
| getSize() | The size of the bounding box | 

 **Result:**



---


### getCenter{#getCenter}

| Name | Description |
| --- | --- |
| getCenter() | The center of the bounding box. | 

 **Result:**



---


### fromGeometry{#fromGeometry}

| Name | Description |
| --- | --- |
| fromGeometry(geometry) | Construct a bounding box from given geometry | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  geometr | Geometry | null |

 **Result:**
BoundingBox


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Gets the string representation of the bounding box. | 

 **Result:**
String


---


### hashCode{#hashCode}

| Name | Description |
| --- | --- |
| hashCode() | Returns the hash code for this instance | 

 **Result:**
Number


---


### equals{#equals}

| Name | Description |
| --- | --- |
| equals(obj) | Determines if two objects are equal | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  ob | Object | null |

 **Result:**
boolean


---



