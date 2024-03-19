---
title: VertexDeclaration 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/vertexdeclaration/
---
## VertexDeclaration class

  The declaration of a custom defined vertex's structure


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() |  | 

 **Result:**



---


### getSealed{#getSealed}

| Name | Description |
| --- | --- |
| getSealed() | A VertexDeclaration will be sealed when its been used by com.aspose.threed.TriMesh`1 or TriMesh, no more modifications is allowed. | 

 **Result:**



---


### getCount{#getCount}

| Name | Description |
| --- | --- |
| getCount() | Gets the count of all fields defined in this VertexDeclaration | 

 **Result:**



---


### getSize{#getSize}

| Name | Description |
| --- | --- |
| getSize() | The size in byte of the vertex structure. | 

 **Result:**



---


### get{#get}

| Name | Description |
| --- | --- |
| get(index) |  | 

 **Result:**



---


### clear{#clear}

| Name | Description |
| --- | --- |
| clear() | Clear all fields. | 

 **Result:**



---


### addField{#addField}

| Name | Description |
| --- | --- |
| addField(dataType, semantic, index, alias) | Add a new vertex field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| dataType | Number | VertexFieldDataType |
| semantic | VertexFieldSemantic | VertexFieldSemantic |
| index | Number | The index for same field semantic, -1 for auto-generation |
| alias | String | The alias name of the field |

 **Result:**



---


### fromGeometry{#fromGeometry}

| Name | Description |
| --- | --- |
| fromGeometry(geometry, useFloat) | Create a VertexDeclaration based on a Geometry's layout. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  geometr | Geometry | null |
| useFloat | boolean | Use float instead of double type |

 **Result:**
VertexDeclaration


---


### compareTo{#compareTo}

| Name | Description |
| --- | --- |
| compareTo(other) | Compares this instance to a specified object and returns an indication of their relative values. | 

 **Result:**
VertexDeclaration


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() |  | 

 **Result:**
String


---


### hashCode{#hashCode}

| Name | Description |
| --- | --- |
| hashCode() |  | 

 **Result:**
Number


---


### equals{#equals}

| Name | Description |
| --- | --- |
| equals(obj) | Determines whether this instance and a specified object, which must also be a VertexDeclaration object, have the same value. | 

 **Result:**
Number


---


### iterator{#iterator}

| Name | Description |
| --- | --- |
| iterator() | Reserved for internal use. | 

 **Result:**
Number


---



