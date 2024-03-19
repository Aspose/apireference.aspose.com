---
title: FileFormat 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/fileformat/
---
## FileFormat class

  File format definition  @hideconstructor


## Properties

| Name | Description |
| --- | --- |
| 	MAYA_BINARY | Autodesk Maya in Binary format | 
| 	STL_BINARY | Binary STL file format | 
| 	STLASCII | ASCII STL file format | 
| 	COLLADA | Collada file format | 
| 	GLTF | Khronos Group's glTF | 
| 	GLTF_BINARY | Khronos Group's glTF in Binary format | 
| 	PDF | Adobe's Portable Document Format | 
| 	DXF | AutoCAD DXF | 
| 	PLY | Polygon File Format or Stanford Triangle Format | 
| 	X_BINARY | DirectX X File in binary format | 
| 	X_TEXT | DirectX X File in binary format | 
| 	DRACO | Google Draco Mesh | 
| 	RVM_TEXT | AVEVA Plant Design Management System Model in text format | 
| 	RVM_BINARY | AVEVA Plant Design Management System Model in binary format | 
| 	ASE | 3D Studio Max's ASCII Scene Exporter format. | 
| 	IFC | ISO 16739-1 Industry Foundation Classes data model. | 
| 	AMF | Additive manufacturing file format | 
| 	VRML | The Virtual Reality Modeling Language | 
| 	ZIP | Zip archive that contains other 3d file format. | 
| 	USD | Universal Scene Description | 
| 	USDZ | Compressed Universal Scene Description | 
| 	XYZ | Xyz point cloud file | 
| 	PCD | PCL Point Cloud Data file in ASCII mode | 
| 	PCD_BINARY | PCL Point Cloud Data file in Binary mode | 

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


### getFormatByExtension{#getFormatByExtension}

| Name | Description |
| --- | --- |
| getFormatByExtension(extensionName) | Gets the preferred file format from the file extension name The extension name should starts with a dot('.'). | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  extensionNam | String | null |

 **Result:**
FileFormat


---


### detect{#detect}

| Name | Description |
| --- | --- |
| detect(fileName) | Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  fileNam | String | null |

 **Result:**
FileFormat


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



