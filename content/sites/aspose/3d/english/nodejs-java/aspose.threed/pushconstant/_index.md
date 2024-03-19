---
title: PushConstant 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/pushconstant/
---
## PushConstant class

  A utility to provide data to shader through push constant.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Constructor of the PushConstant | 

 **Result:**



---


### write{#write}

| Name | Description |
| --- | --- |
| write(mat) | Write the matrix to the constant | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| mat | FMatrix4 | The matrix to write |

 **Result:**



---


### write{#write}

| Name | Description |
| --- | --- |
| write(n) | Write a int value to the constant | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Number | null |

 **Result:**



---


### write{#write}

| Name | Description |
| --- | --- |
| write(f) | Write a float value to the constant | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Number | null |

 **Result:**



---


### write{#write}

| Name | Description |
| --- | --- |
| write(vec) | Write a 4-component vector to the constant | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  ve | FVector4 | null |

 **Result:**



---


### write{#write}

| Name | Description |
| --- | --- |
| write(vec) | Write a 3-component vector to the constant | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  ve | FVector3 | null |

 **Result:**



---


### write{#write}

| Name | Description |
| --- | --- |
| write(x, y, z, w) | Write a 4-component vector to the constant | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Number | null |
|   | Number | null |
|   | Number | null |
|   | Number | null |

 **Result:**



---


### commit{#commit}

| Name | Description |
| --- | --- |
| commit(stage, commandList) | Commit prepared data to graphics pipeline. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| stage | Number | ShaderStage |
|  commandLis | ICommandList | null |

 **Result:**



---



