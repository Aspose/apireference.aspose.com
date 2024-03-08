---
title: BoundingBox2D 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/boundingbox2d/
---
## BoundingBox2D class

  The axis-aligned bounding box for Vector2


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
| minimum | Vector2 | The minimum corner |
| maximum | Vector2 | The maximum corner |

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


### merge{#merge}

| Name | Description |
| --- | --- |
| merge(pt) | Merges the new box into the current bounding box. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  p | Vector2 | null |

 **Result:**



---


### merge{#merge}

| Name | Description |
| --- | --- |
| merge(bb) | Merges the new box into the current bounding box. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  b | BoundingBox2D | null |

 **Result:**



---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Gets the string representation of the bounding box. | 

 **Result:**
String


---



