---
title: PlyFormat 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/plyformat/
---
## PlyFormat class

  The PLY format.  @hideconstructor


## Methods

### getVersion{#getVersion}

| Name | Description |
| --- | --- |
| getVersion() | Gets file format version | 

 **Result:**



---


### getExtension{#getExtension}

| Name | Description |
| --- | --- |
| getExtension() | Gets the extension name of this type. | 

 **Result:**



---


### getExtensions{#getExtensions}

| Name | Description |
| --- | --- |
| getExtensions() | Gets the extension names of this type. | 

 **Result:**



---


### getContentType{#getContentType}

| Name | Description |
| --- | --- |
| getContentType() | Gets file format content type The value of the property is FileContentType integer constant. | 

 **Result:**



---


### getFileFormatType{#getFileFormatType}

| Name | Description |
| --- | --- |
| getFileFormatType() | Gets file format type | 

 **Result:**



---


### encode{#encode}

| Name | Description |
| --- | --- |
| encode(entity, fileName) | Encode the entity and save the result into an external file. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to encode |
| fileName | String | The file to write to |

 **Result:**



---


### encode{#encode}

| Name | Description |
| --- | --- |
| encode(entity, fileName, opt) | Encode the entity and save the result into an external file. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to encode |
| fileName | String | The file to write to |
| opt | PlySaveOptions | Save options |

 **Result:**



---


### decode{#decode}

| Name | Description |
| --- | --- |
| decode(fileName) | Decode a point cloud or mesh from the specified stream. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | The input stream |

 **Result:**
Geometry


---


### decode{#decode}

| Name | Description |
| --- | --- |
| decode(fileName, opt) | Decode a point cloud or mesh from the specified stream. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | The input stream |
| opt | PlyLoadOptions | The load option of PLY format |

 **Result:**
Geometry


---


### createLoadOptions{#createLoadOptions}

| Name | Description |
| --- | --- |
| createLoadOptions() | Create a default load options for this file format | 

 **Result:**
LoadOptions


---


### createSaveOptions{#createSaveOptions}

| Name | Description |
| --- | --- |
| createSaveOptions() | Create a default save options for this file format | 

 **Result:**
SaveOptions


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Formats to string | 

 **Result:**
String


---



