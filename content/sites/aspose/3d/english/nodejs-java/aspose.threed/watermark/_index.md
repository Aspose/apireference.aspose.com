---
title: Watermark 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/watermark/
---
## Watermark class

  Utility to encode/decode blind watermark  to/from a mesh.  @hideconstructor


## Methods

### encodeWatermark{#encodeWatermark}

| Name | Description |
| --- | --- |
| encodeWatermark(input, text) | Encode a text into mesh' blind watermark. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| input | Mesh | Mesh to encode a blind watermark |
| text | String | Text to encode to the mesh |

 **Result:**
Mesh


---


### encodeWatermark{#encodeWatermark}

| Name | Description |
| --- | --- |
| encodeWatermark(input, text, password) | Encode a text into mesh' blind watermark. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| input | Mesh | Mesh to encode a blind watermark |
| text | String | Text to encode to the mesh |
| password | String | Password to protect the watermark, it's optional |

 **Result:**
Mesh


---


### decodeWatermark{#decodeWatermark}

| Name | Description |
| --- | --- |
| decodeWatermark(input) | Decode the watermark from a mesh | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| input | Mesh | The mesh to extract watermark |

 **Result:**
String


---


### decodeWatermark{#decodeWatermark}

| Name | Description |
| --- | --- |
| decodeWatermark(input, password) | Decode the watermark from a mesh | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| input | Mesh | The mesh to extract watermark |
| password | String | The password to decrypt the watermark |

 **Result:**
String


---



