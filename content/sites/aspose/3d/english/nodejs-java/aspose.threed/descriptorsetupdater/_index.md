---
title: DescriptorSetUpdater 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/descriptorsetupdater/
---
## DescriptorSetUpdater class

  This class allows to update the com.aspose.threed.IDescriptorSet in a chain operation.  @hideconstructor


## Methods

### bind{#bind}

| Name | Description |
| --- | --- |
| bind(buffer, offset, size) | Bind the buffer to current descriptor set | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| buffer | IBuffer | Which buffer to bind |
| offset | Number | Offset of the buffer to bind |
| size | Number | Size of the buffer to bind |

 **Result:**
DescriptorSetUpdater


---


### bind{#bind}

| Name | Description |
| --- | --- |
| bind(buffer) | Bind the entire buffer to current descriptor | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  buffe | IBuffer | null |

 **Result:**
DescriptorSetUpdater


---


### bind{#bind}

| Name | Description |
| --- | --- |
| bind(binding, buffer) | Bind the buffer to current descriptor set at specified binding location. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| binding | Number | Binding location |
| buffer | IBuffer | The entire buffer to bind |

 **Result:**
DescriptorSetUpdater


---


### bind{#bind}

| Name | Description |
| --- | --- |
| bind(binding, buffer, offset, size) | Bind the buffer to current descriptor set at specified binding location. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| binding | Number | Binding location |
| buffer | IBuffer | The buffer to bind |
| offset | Number | Offset of the buffer to bind |
| size | Number | Size of the buffer to bind |

 **Result:**
DescriptorSetUpdater


---


### bind{#bind}

| Name | Description |
| --- | --- |
| bind(texture) | Bind the texture unit to current descriptor set | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| texture | ITextureUnit | The texture unit to bind |

 **Result:**
DescriptorSetUpdater


---


### bind{#bind}

| Name | Description |
| --- | --- |
| bind(binding, texture) | Bind the texture unit to current descriptor set | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| binding | Number | The binding location |
| texture | ITextureUnit | The texture unit to bind |

 **Result:**
DescriptorSetUpdater


---



