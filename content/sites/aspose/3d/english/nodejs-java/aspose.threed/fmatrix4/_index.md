---
title: FMatrix4 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/fmatrix4/
---
## FMatrix4 class

  Matrix 4x4 with all component in float type


## Properties

| Name | Description |
| --- | --- |
| 	m00 | The m00. | 
| 	m01 | The m01. | 
| 	m02 | The m02. | 
| 	m03 | The m03. | 
| 	m10 | The m10. | 
| 	m11 | The m11. | 
| 	m12 | The m12. | 
| 	m13 | The m13. | 
| 	m20 | The m20. | 
| 	m21 | The m21. | 
| 	m22 | The m22. | 
| 	m23 | The m23. | 
| 	m30 | The m30. | 
| 	m31 | The m31. | 
| 	m32 | The m32. | 
| 	m33 | The m33. | 
| 	IDENTITY | The identity matrix | 

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
| constructor_overload(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33) | Initialize the instance of FMatrix4 | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  m0 | Number | null |
|  m0 | Number | null |
|  m0 | Number | null |
|  m0 | Number | null |
|  m1 | Number | null |
|  m1 | Number | null |
|  m1 | Number | null |
|  m1 | Number | null |
|  m2 | Number | null |
|  m2 | Number | null |
|  m2 | Number | null |
|  m2 | Number | null |
|  m3 | Number | null |
|  m3 | Number | null |
|  m3 | Number | null |
|  m3 | Number | null |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(mat) | Initialize the instance of FMatrix4 from a Matrix4 instance. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  ma | Matrix4 | null |

 **Result:**



---


### constructor_overload$3{#constructor_overload$3}

| Name | Description |
| --- | --- |
| constructor_overload$3(r0, r1, r2, r3) | Constructs matrix from 4 rows. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| r0 | FVector4 | R0. |
| r1 | FVector4 | R1. |
| r2 | FVector4 | R2. |
| r3 | FVector4 | R3. |

 **Result:**



---


### concatenate{#concatenate}

| Name | Description |
| --- | --- |
| concatenate(m2) | Concatenates the two matrices | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| m2 | FMatrix4 | M2. |

 **Result:**
FMatrix4


---


### concatenate{#concatenate}

| Name | Description |
| --- | --- |
| concatenate(m2) | Concatenates the two matrices | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| m2 | Matrix4 | M2. |

 **Result:**
FMatrix4


---


### transpose{#transpose}

| Name | Description |
| --- | --- |
| transpose() | Transposes this instance. | 

 **Result:**
FMatrix4


---


### inverse{#inverse}

| Name | Description |
| --- | --- |
| inverse() | Calculate the inverse matrix of current instance. | 

 **Result:**
FMatrix4


---



