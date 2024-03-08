---
title: MemoryFileSystem 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/memoryfilesystem/
---
## MemoryFileSystem class

  The MemoryFileSystem will maps the read/write operations to memory.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() |  | 

 **Result:**



---


### getFileNames{#getFileNames}

| Name | Description |
| --- | --- |
| getFileNames() | File names that in this memory file system. | 

 **Result:**



---


### getFileContent{#getFileContent}

| Name | Description |
| --- | --- |
| getFileContent(fileName) | Returns the raw content of the specified file. Throw System.IO.FileNotFoundException if the specified file is not existing. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  fileNam | String | null |

 **Result:**
byte[]


---


### readFile{#readFile}

| Name | Description |
| --- | --- |
| readFile(fileName, options) | Create a stream for reading dependencies. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  fileNam | String | null |
|  option | IOConfig | null |

 **Result:**
Stream


---


### writeFile{#writeFile}

| Name | Description |
| --- | --- |
| writeFile(fileName, options) | Create a stream for writing dependencies. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  fileNam | String | null |
|  option | IOConfig | null |

 **Result:**
Stream


---



