---
title: PdfFormat 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/pdfformat/
---
## PdfFormat class

  Adobe's Portable Document Format  @hideconstructor


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


### extract{#extract}

| Name | Description |
| --- | --- |
| extract(fileName, password) | Extract raw 3D content from PDF file. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  fileNam | String | null |
|  passwor | byte[] | null |

 **Result:**
0, Culture=neutral, PublicKeyToken=b77a5c561934e089]]


---


### extractScene{#extractScene}

| Name | Description |
| --- | --- |
| extractScene(fileName) | Extract 3D scenes from PDF file. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  fileNam | String | null |

 **Result:**
0, Culture=neutral, PublicKeyToken=f071c641d0b4582b]]


---


### extractScene{#extractScene}

| Name | Description |
| --- | --- |
| extractScene(fileName, password) | Extract 3D scenes from PDF file. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  fileNam | String | null |
|  passwor | byte[] | null |

 **Result:**
0, Culture=neutral, PublicKeyToken=f071c641d0b4582b]]


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



