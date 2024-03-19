---
title: FbxSaveOptions 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/fbxsaveoptions/
---
## FbxSaveOptions class

  Save options for Fbx file.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(format) | Initializes a FbxSaveOptions | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  forma | FileFormat | null |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(contentType) | Initialize a FbxSaveOptions using latest supported version. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| contentType | FileContentType | FileContentType |

 **Result:**



---


### getReusePrimitiveMesh{#getReusePrimitiveMesh}

| Name | Description |
| --- | --- |
| getReusePrimitiveMesh() | Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). Default value is false | 

 **Result:**



---


### setReusePrimitiveMesh{#setReusePrimitiveMesh}

| Name | Description |
| --- | --- |
| setReusePrimitiveMesh(value) | Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). Default value is false | 

 **Result:**



---


### getEnableCompression{#getEnableCompression}

| Name | Description |
| --- | --- |
| getEnableCompression() | Compression large binary data in the FBX file(e.g. animation data, control points, vertex element data, indices), default value is true. | 

 **Result:**



---


### setEnableCompression{#setEnableCompression}

| Name | Description |
| --- | --- |
| setEnableCompression(value) | Compression large binary data in the FBX file(e.g. animation data, control points, vertex element data, indices), default value is true. | 

 **Result:**



---


### getFoldRepeatedCurveData{#getFoldRepeatedCurveData}

| Name | Description |
| --- | --- |
| getFoldRepeatedCurveData() | Gets or sets whether reuse repeated curve data by increasing last data's ref count true if fold repeated curve data; otherwise, false. | 

 **Result:**



---


### getExportLegacyMaterialProperties{#getExportLegacyMaterialProperties}

| Name | Description |
| --- | --- |
| getExportLegacyMaterialProperties() | Gets or sets whether export legacy material properties, used for back compatibility. This option is turned on by default. | 

 **Result:**



---


### setExportLegacyMaterialProperties{#setExportLegacyMaterialProperties}

| Name | Description |
| --- | --- |
| setExportLegacyMaterialProperties(value) | Gets or sets whether export legacy material properties, used for back compatibility. This option is turned on by default. | 

 **Result:**



---


### getVideoForTexture{#getVideoForTexture}

| Name | Description |
| --- | --- |
| getVideoForTexture() | Gets or sets whether generate a Video instance for Texture when exporting as FBX. | 

 **Result:**



---


### setVideoForTexture{#setVideoForTexture}

| Name | Description |
| --- | --- |
| setVideoForTexture(value) | Gets or sets whether generate a Video instance for Texture when exporting as FBX. | 

 **Result:**



---


### getEmbedTextures{#getEmbedTextures}

| Name | Description |
| --- | --- |
| getEmbedTextures() | Gets or sets whether to embed the texture to the final output file. FBX Exporter will try to find the texture's raw data from FileSystem, and embed the file to final FBX file. Default value is false. | 

 **Result:**



---


### setEmbedTextures{#setEmbedTextures}

| Name | Description |
| --- | --- |
| setEmbedTextures(value) | Gets or sets whether to embed the texture to the final output file. FBX Exporter will try to find the texture's raw data from FileSystem, and embed the file to final FBX file. Default value is false. | 

 **Result:**



---


### getGenerateVertexElementMaterial{#getGenerateVertexElementMaterial}

| Name | Description |
| --- | --- |
| getGenerateVertexElementMaterial() | Gets or sets whether always generate a VertexElementMaterial for geometries if the attached node contains materials. This is turned off by default. | 

 **Result:**



---


### setGenerateVertexElementMaterial{#setGenerateVertexElementMaterial}

| Name | Description |
| --- | --- |
| setGenerateVertexElementMaterial(value) | Gets or sets whether always generate a VertexElementMaterial for geometries if the attached node contains materials. This is turned off by default. | 

 **Result:**



---


### getExportTextures{#getExportTextures}

| Name | Description |
| --- | --- |
| getExportTextures() | Try to copy textures used in scene to output directory. | 

 **Result:**



---


### setExportTextures{#setExportTextures}

| Name | Description |
| --- | --- |
| setExportTextures(value) | Try to copy textures used in scene to output directory. | 

 **Result:**



---


### getFileFormat{#getFileFormat}

| Name | Description |
| --- | --- |
| getFileFormat() | Gets the file format that specified in current Save/Load option. | 

 **Result:**



---


### getEncoding{#getEncoding}

| Name | Description |
| --- | --- |
| getEncoding() | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. | 

 **Result:**



---


### getFileSystem{#getFileSystem}

| Name | Description |
| --- | --- |
| getFileSystem() | Allow user to handle how to manage the external dependencies during load/save. | 

 **Result:**



---


### setFileSystem{#setFileSystem}

| Name | Description |
| --- | --- |
| setFileSystem(value) | Allow user to handle how to manage the external dependencies during load/save. | 

 **Result:**



---


### getLookupPaths{#getLookupPaths}

| Name | Description |
| --- | --- |
| getLookupPaths() | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. | 

 **Result:**



---


### getFileName{#getFileName}

| Name | Description |
| --- | --- |
| getFileName() | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. | 

 **Result:**



---


### setFileName{#setFileName}

| Name | Description |
| --- | --- |
| setFileName(value) | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. | 

 **Result:**



---



