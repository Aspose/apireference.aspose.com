---
title: PlySaveOptions 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/plysaveoptions/
---
## PlySaveOptions class

  Save options for exporting scene as PLY file.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Constructor of PlySaveOptions | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(contentType) | Constructor of PlySaveOptions | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| contentType | FileContentType | FileContentType |

 **Result:**



---


### getPointCloud{#getPointCloud}

| Name | Description |
| --- | --- |
| getPointCloud() | Export the scene as point cloud, the default value is false. | 

 **Result:**



---


### setPointCloud{#setPointCloud}

| Name | Description |
| --- | --- |
| setPointCloud(value) | Export the scene as point cloud, the default value is false. | 

 **Result:**



---


### getFlipCoordinate{#getFlipCoordinate}

| Name | Description |
| --- | --- |
| getFlipCoordinate() | Flip the coordinate while saving the scene, default value is true | 

 **Result:**



---


### setFlipCoordinate{#setFlipCoordinate}

| Name | Description |
| --- | --- |
| setFlipCoordinate(value) | Flip the coordinate while saving the scene, default value is true | 

 **Result:**



---


### getVertexElement{#getVertexElement}

| Name | Description |
| --- | --- |
| getVertexElement() | The element name for the vertex data, default value is "vertex" | 

 **Result:**



---


### setVertexElement{#setVertexElement}

| Name | Description |
| --- | --- |
| setVertexElement(value) | The element name for the vertex data, default value is "vertex" | 

 **Result:**



---


### getPositionComponents{#getPositionComponents}

| Name | Description |
| --- | --- |
| getPositionComponents() | The component names for position data, default value is ("x", "y", "z") | 

 **Result:**



---


### getNormalComponents{#getNormalComponents}

| Name | Description |
| --- | --- |
| getNormalComponents() | The component names for normal data, default value is ("nx", "ny", "nz") | 

 **Result:**



---


### getTextureCoordinateComponents{#getTextureCoordinateComponents}

| Name | Description |
| --- | --- |
| getTextureCoordinateComponents() | The component names for texture coordinate data, default value is ("u", "v") | 

 **Result:**



---


### getColorComponents{#getColorComponents}

| Name | Description |
| --- | --- |
| getColorComponents() | The component names for vertex color, default value is ("red", "green", "blue") | 

 **Result:**



---


### getFaceElement{#getFaceElement}

| Name | Description |
| --- | --- |
| getFaceElement() | The element name for the face data, default value is "face" | 

 **Result:**



---


### setFaceElement{#setFaceElement}

| Name | Description |
| --- | --- |
| setFaceElement(value) | The element name for the face data, default value is "face" | 

 **Result:**



---


### getFaceProperty{#getFaceProperty}

| Name | Description |
| --- | --- |
| getFaceProperty() | The property name for the face data, default value is "vertex_index" | 

 **Result:**



---


### setFaceProperty{#setFaceProperty}

| Name | Description |
| --- | --- |
| setFaceProperty(value) | The property name for the face data, default value is "vertex_index" | 

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



