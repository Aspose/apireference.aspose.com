---
title: DracoFormat 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/dracoformat/
---
## DracoFormat class

  Google Draco format  @hideconstructor


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


### decode{#decode}

| Name | Description |
| --- | --- |
| decode(fileName) | Decode the point cloud or mesh from specified file name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | The file name contains the drc file |

 **Result:**
Geometry


---


### decode{#decode}

| Name | Description |
| --- | --- |
| decode(data) | Decode the point cloud or mesh from memory data | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| data | byte[] | The raw drc bytes |

 **Result:**
Geometry


---


### encode{#encode}

| Name | Description |
| --- | --- |
| encode(entity, fileName, options) | Encode the entity to specified file | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to be encoded |
| fileName | String | The file name to be written |
| options | DracoSaveOptions | Extra options for encoding the point cloud |

 **Result:**
Geometry


---


### encode{#encode}

| Name | Description |
| --- | --- |
| encode(entity, options) | Encode the entity to Draco raw data | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to be encoded |
| options | DracoSaveOptions | Extra options for encoding the point cloud |

 **Result:**
byte[]


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



