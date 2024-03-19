---
title: RvmSaveOptions 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/rvmsaveoptions/
---
## RvmSaveOptions class

  Save options for Aveva PDMS RVM file.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Constructor of RvmSaveOptions | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(contentType) | Constructor of RvmSaveOptions | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| contentType | FileContentType | FileContentType |

 **Result:**



---


### getFileNote{#getFileNote}

| Name | Description |
| --- | --- |
| getFileNote() | File note in the file header. | 

 **Result:**



---


### setFileNote{#setFileNote}

| Name | Description |
| --- | --- |
| setFileNote(value) | File note in the file header. | 

 **Result:**



---


### getAuthor{#getAuthor}

| Name | Description |
| --- | --- |
| getAuthor() |  | 

 **Result:**



---


### setAuthor{#setAuthor}

| Name | Description |
| --- | --- |
| setAuthor(value) |  | 

 **Result:**



---


### getCreationTime{#getCreationTime}

| Name | Description |
| --- | --- |
| getCreationTime() | The timestamp that exported this file, default value is current time | 

 **Result:**



---


### setCreationTime{#setCreationTime}

| Name | Description |
| --- | --- |
| setCreationTime(value) | The timestamp that exported this file, default value is current time | 

 **Result:**



---


### getAttributePrefix{#getAttributePrefix}

| Name | Description |
| --- | --- |
| getAttributePrefix() | Gets or sets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'. For example if a property is rvm:Refno=345, the exported attribute will be Refno = 345, the prefix is stripped. | 

 **Result:**



---


### setAttributePrefix{#setAttributePrefix}

| Name | Description |
| --- | --- |
| setAttributePrefix(value) | Gets or sets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'. For example if a property is rvm:Refno=345, the exported attribute will be Refno = 345, the prefix is stripped. | 

 **Result:**



---


### getAttributeListFile{#getAttributeListFile}

| Name | Description |
| --- | --- |
| getAttributeListFile() | Gets or sets the file name of attribute list file, exporter will generate a name based on the .rvm file name when this property is undefined, default value is null. | 

 **Result:**



---


### setAttributeListFile{#setAttributeListFile}

| Name | Description |
| --- | --- |
| setAttributeListFile(value) | Gets or sets the file name of attribute list file, exporter will generate a name based on the .rvm file name when this property is undefined, default value is null. | 

 **Result:**



---


### getExportAttributes{#getExportAttributes}

| Name | Description |
| --- | --- |
| getExportAttributes() | Gets or sets whether to export the attribute list to an external .att file, default value is false. | 

 **Result:**



---


### setExportAttributes{#setExportAttributes}

| Name | Description |
| --- | --- |
| setExportAttributes(value) | Gets or sets whether to export the attribute list to an external .att file, default value is false. | 

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



