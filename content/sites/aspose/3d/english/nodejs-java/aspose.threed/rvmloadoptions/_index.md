---
title: RvmLoadOptions 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/rvmloadoptions/
---
## RvmLoadOptions class

  Load options for AVEVA Plant Design Management System's RVM file.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(contentType) | Construct a RvmLoadOptions instance | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| contentType | FileContentType | FileContentType |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload() | Construct a RvmLoadOptions instance | 

 **Result:**



---


### getGenerateMaterials{#getGenerateMaterials}

| Name | Description |
| --- | --- |
| getGenerateMaterials() | Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. Default value is true | 

 **Result:**



---


### setGenerateMaterials{#setGenerateMaterials}

| Name | Description |
| --- | --- |
| setGenerateMaterials(value) | Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. Default value is true | 

 **Result:**



---


### getCylinderRadialSegments{#getCylinderRadialSegments}

| Name | Description |
| --- | --- |
| getCylinderRadialSegments() | Gets or sets the number of cylinder's radial segments, default value is 16 | 

 **Result:**



---


### setCylinderRadialSegments{#setCylinderRadialSegments}

| Name | Description |
| --- | --- |
| setCylinderRadialSegments(value) | Gets or sets the number of cylinder's radial segments, default value is 16 | 

 **Result:**



---


### getDishLongitudeSegments{#getDishLongitudeSegments}

| Name | Description |
| --- | --- |
| getDishLongitudeSegments() | Gets or sets the number of dish' longitude segments, default value is 12 | 

 **Result:**



---


### setDishLongitudeSegments{#setDishLongitudeSegments}

| Name | Description |
| --- | --- |
| setDishLongitudeSegments(value) | Gets or sets the number of dish' longitude segments, default value is 12 | 

 **Result:**



---


### getDishLatitudeSegments{#getDishLatitudeSegments}

| Name | Description |
| --- | --- |
| getDishLatitudeSegments() | Gets or sets the number of dish' latitude segments, default value is 8 | 

 **Result:**



---


### setDishLatitudeSegments{#setDishLatitudeSegments}

| Name | Description |
| --- | --- |
| setDishLatitudeSegments(value) | Gets or sets the number of dish' latitude segments, default value is 8 | 

 **Result:**



---


### getTorusTubularSegments{#getTorusTubularSegments}

| Name | Description |
| --- | --- |
| getTorusTubularSegments() | Gets or sets the number of torus' tubular segments, default value is 20 | 

 **Result:**



---


### setTorusTubularSegments{#setTorusTubularSegments}

| Name | Description |
| --- | --- |
| setTorusTubularSegments(value) | Gets or sets the number of torus' tubular segments, default value is 20 | 

 **Result:**



---


### getRectangularTorusSegments{#getRectangularTorusSegments}

| Name | Description |
| --- | --- |
| getRectangularTorusSegments() | Gets or sets the number of rectangular torus' radial segments, default value is 20 | 

 **Result:**



---


### setRectangularTorusSegments{#setRectangularTorusSegments}

| Name | Description |
| --- | --- |
| setRectangularTorusSegments(value) | Gets or sets the number of rectangular torus' radial segments, default value is 20 | 

 **Result:**



---


### getCenterScene{#getCenterScene}

| Name | Description |
| --- | --- |
| getCenterScene() | Center the scene after it's loaded. | 

 **Result:**



---


### setCenterScene{#setCenterScene}

| Name | Description |
| --- | --- |
| setCenterScene(value) | Center the scene after it's loaded. | 

 **Result:**



---


### getAttributePrefix{#getAttributePrefix}

| Name | Description |
| --- | --- |
| getAttributePrefix() | Gets or sets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:" | 

 **Result:**



---


### setAttributePrefix{#setAttributePrefix}

| Name | Description |
| --- | --- |
| setAttributePrefix(value) | Gets or sets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:" | 

 **Result:**



---


### getLookupAttributes{#getLookupAttributes}

| Name | Description |
| --- | --- |
| getLookupAttributes() | Gets or sets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true. | 

 **Result:**



---


### setLookupAttributes{#setLookupAttributes}

| Name | Description |
| --- | --- |
| setLookupAttributes(value) | Gets or sets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true. | 

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



