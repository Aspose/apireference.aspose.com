---
title: GltfSaveOptions 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/gltfsaveoptions/
---
## GltfSaveOptions class

  Save options for glTF format.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(contentType) | Constructor of GltfSaveOptions | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| contentType | FileContentType | FileContentType |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(format) | Constructor of GltfSaveOptions | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  forma | FileFormat | null |

 **Result:**



---


### getPrettyPrint{#getPrettyPrint}

| Name | Description |
| --- | --- |
| getPrettyPrint() | The JSON content of GLTF file is indented for human reading, default value is false | 

 **Result:**



---


### setPrettyPrint{#setPrettyPrint}

| Name | Description |
| --- | --- |
| setPrettyPrint(value) | The JSON content of GLTF file is indented for human reading, default value is false | 

 **Result:**



---


### getFallbackNormal{#getFallbackNormal}

| Name | Description |
| --- | --- |
| getFallbackNormal() | When GLTF2 exporter detected an invalid normal, this will be used instead of its original value to bypass the validation. Default value is (0, 1, 0) | 

 **Result:**



---


### getEmbedAssets{#getEmbedAssets}

| Name | Description |
| --- | --- |
| getEmbedAssets() | Embed all external assets as base64 into single file in ASCII mode, default value is false. | 

 **Result:**



---


### setEmbedAssets{#setEmbedAssets}

| Name | Description |
| --- | --- |
| setEmbedAssets(value) | Embed all external assets as base64 into single file in ASCII mode, default value is false. | 

 **Result:**



---


### getImageFormat{#getImageFormat}

| Name | Description |
| --- | --- |
| getImageFormat() | Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D convert the non-standard images to supported format during the exporting. Default value is GltfEmbeddedImageFormat.PNGThe value of the property is GltfEmbeddedImageFormat integer constant. | 

 **Result:**



---


### setImageFormat{#setImageFormat}

| Name | Description |
| --- | --- |
| setImageFormat(value) | Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D convert the non-standard images to supported format during the exporting. Default value is GltfEmbeddedImageFormat.PNGThe value of the property is GltfEmbeddedImageFormat integer constant. | 

 **Result:**



---


### getMaterialConverter{#getMaterialConverter}

| Name | Description |
| --- | --- |
| getMaterialConverter() | Custom converter to convert the geometry's material to PBR material If this is unassigned, glTF 2.0 exporter will automatically convert the standard material to PBR material. Default value is null This property is used when exporting a scene to a glTF 2.0 file. | 

 **Result:**



---


### setMaterialConverter{#setMaterialConverter}

| Name | Description |
| --- | --- |
| setMaterialConverter(value) | Custom converter to convert the geometry's material to PBR material If this is unassigned, glTF 2.0 exporter will automatically convert the standard material to PBR material. Default value is null This property is used when exporting a scene to a glTF 2.0 file. | 

 **Result:**



---


### getUseCommonMaterials{#getUseCommonMaterials}

| Name | Description |
| --- | --- |
| getUseCommonMaterials() | Serialize materials using KHR common material extensions, default value is false. Set this to false will cause Aspose.3D export a set of vertex/fragment shader if #Error Cref: P:Aspose.ThreeD.Formats.GltfSaveOptions.ExportShaders | 

 **Result:**



---


### setUseCommonMaterials{#setUseCommonMaterials}

| Name | Description |
| --- | --- |
| setUseCommonMaterials(value) | Serialize materials using KHR common material extensions, default value is false. Set this to false will cause Aspose.3D export a set of vertex/fragment shader if #Error Cref: P:Aspose.ThreeD.Formats.GltfSaveOptions.ExportShaders | 

 **Result:**



---


### getExternalDracoEncoder{#getExternalDracoEncoder}

| Name | Description |
| --- | --- |
| getExternalDracoEncoder() | Use external draco encoder to accelerate the draco compression speed. Aspose.3D will create new sub process to encode the mesh to the draco format, use it at your own risk. | 

 **Result:**



---


### setExternalDracoEncoder{#setExternalDracoEncoder}

| Name | Description |
| --- | --- |
| setExternalDracoEncoder(value) | Use external draco encoder to accelerate the draco compression speed. Aspose.3D will create new sub process to encode the mesh to the draco format, use it at your own risk. | 

 **Result:**



---


### getFlipTexCoordV{#getFlipTexCoordV}

| Name | Description |
| --- | --- |
| getFlipTexCoordV() | Flip texture coordinate v(t) component, default value is true. | 

 **Result:**



---


### setFlipTexCoordV{#setFlipTexCoordV}

| Name | Description |
| --- | --- |
| setFlipTexCoordV(value) | Flip texture coordinate v(t) component, default value is true. | 

 **Result:**



---


### getBufferFile{#getBufferFile}

| Name | Description |
| --- | --- |
| getBufferFile() | The file name of the external buffer file used to store binary data. If this file is not specified, Aspose.3D will generate a name for you. This is ignored when export glTF in binary mode. | 

 **Result:**



---


### setBufferFile{#setBufferFile}

| Name | Description |
| --- | --- |
| setBufferFile(value) | The file name of the external buffer file used to store binary data. If this file is not specified, Aspose.3D will generate a name for you. This is ignored when export glTF in binary mode. | 

 **Result:**



---


### getSaveExtras{#getSaveExtras}

| Name | Description |
| --- | --- |
| getSaveExtras() | Save scene object's dynamic properties into 'extra' fields in the generated glTF file. This is useful to provide application-specific data. Default value is false. | 

 **Result:**



---


### setSaveExtras{#setSaveExtras}

| Name | Description |
| --- | --- |
| setSaveExtras(value) | Save scene object's dynamic properties into 'extra' fields in the generated glTF file. This is useful to provide application-specific data. Default value is false. | 

 **Result:**



---


### getApplyUnitScale{#getApplyUnitScale}

| Name | Description |
| --- | --- |
| getApplyUnitScale() | Apply AssetInfo.UnitScaleFactor to the mesh. Default value is false. | 

 **Result:**



---


### setApplyUnitScale{#setApplyUnitScale}

| Name | Description |
| --- | --- |
| setApplyUnitScale(value) | Apply AssetInfo.UnitScaleFactor to the mesh. Default value is false. | 

 **Result:**



---


### getDracoCompression{#getDracoCompression}

| Name | Description |
| --- | --- |
| getDracoCompression() | Gets or sets whether to enable draco compression | 

 **Result:**



---


### setDracoCompression{#setDracoCompression}

| Name | Description |
| --- | --- |
| setDracoCompression(value) | Gets or sets whether to enable draco compression | 

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



