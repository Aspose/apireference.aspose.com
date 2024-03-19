---
title: UsdSaveOptions 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/usdsaveoptions/
---
## UsdSaveOptions class

  Save options for USD/USDZ formats.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initialize a new UsdSaveOptions with FileFormat.USD format | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(fileFormat) | Initialize a new UsdSaveOptions with specified USD/USDZ format. | 

 **Result:**



---


### getPrimitiveToMesh{#getPrimitiveToMesh}

| Name | Description |
| --- | --- |
| getPrimitiveToMesh() | Convert the primitive entities to mesh during the export. Or directly encode the primitives to the output file(will use Aspose's extension definition for unofficial primitives like Dish, Torus) Default value is true. | 

 **Result:**



---


### setPrimitiveToMesh{#setPrimitiveToMesh}

| Name | Description |
| --- | --- |
| setPrimitiveToMesh(value) | Convert the primitive entities to mesh during the export. Or directly encode the primitives to the output file(will use Aspose's extension definition for unofficial primitives like Dish, Torus) Default value is true. | 

 **Result:**



---


### getExportMetaData{#getExportMetaData}

| Name | Description |
| --- | --- |
| getExportMetaData() | Export node's properties through USD's customData field. | 

 **Result:**



---


### setExportMetaData{#setExportMetaData}

| Name | Description |
| --- | --- |
| setExportMetaData(value) | Export node's properties through USD's customData field. | 

 **Result:**



---


### getMaterialConverter{#getMaterialConverter}

| Name | Description |
| --- | --- |
| getMaterialConverter() | Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. Default value is null | 

 **Result:**



---


### setMaterialConverter{#setMaterialConverter}

| Name | Description |
| --- | --- |
| setMaterialConverter(value) | Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. Default value is null | 

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



