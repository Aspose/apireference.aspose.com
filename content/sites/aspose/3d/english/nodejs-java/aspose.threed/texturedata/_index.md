---
title: TextureData 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/texturedata/
---
## TextureData class

  This class contains the raw data and format definition of a texture.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(width, height, stride, bytesPerPixel, pixelFormat, data) | Constructor of TextureData | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  widt | Number | null |
|  heigh | Number | null |
|  strid | Number | null |
|  bytesPerPixe | Number | null |
| pixelFormat | PixelFormat | PixelFormat |
|  dat | byte[] | null |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(width, height, pixelFormat) | Constructs a new TextureData and allocate pixel data. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  widt | Number | null |
|  heigh | Number | null |
| pixelFormat | PixelFormat | PixelFormat |

 **Result:**



---


### constructor_overload2{#constructor_overload2}

| Name | Description |
| --- | --- |
| constructor_overload2() | Constructor of TextureData | 

 **Result:**



---


### getData{#getData}

| Name | Description |
| --- | --- |
| getData() | Raw bytes of pixel data | 

 **Result:**



---


### getWidth{#getWidth}

| Name | Description |
| --- | --- |
| getWidth() | Number of horizontal pixels | 

 **Result:**



---


### getHeight{#getHeight}

| Name | Description |
| --- | --- |
| getHeight() | Number of vertical pixels | 

 **Result:**



---


### getStride{#getStride}

| Name | Description |
| --- | --- |
| getStride() | Number of bytes of a scanline. | 

 **Result:**



---


### getBytesPerPixel{#getBytesPerPixel}

| Name | Description |
| --- | --- |
| getBytesPerPixel() | Number of bytes of a pixel | 

 **Result:**



---


### getPixelFormat{#getPixelFormat}

| Name | Description |
| --- | --- |
| getPixelFormat() | The pixel's format The value of the property is PixelFormat integer constant. | 

 **Result:**



---


### fromFile{#fromFile}

| Name | Description |
| --- | --- |
| fromFile(fileName) | Load a texture from file | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  fileNam | String | null |

 **Result:**
TextureData


---


### save{#save}

| Name | Description |
| --- | --- |
| save(fileName) | Save texture data into image file | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | The file name of where the image will be saved. |

 **Result:**
TextureData


---


### save{#save}

| Name | Description |
| --- | --- |
| save(fileName, format) | Save texture data into image file | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | The file name of where the image will be saved. |
| format | String | Image format of the output file. |

 **Result:**
TextureData


---


### mapPixels{#mapPixels}

| Name | Description |
| --- | --- |
| mapPixels(mapMode) | Map all pixels for read/write | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| mapMode | PixelMapMode | PixelMapMode |

 **Result:**
PixelMapping


---


### mapPixels{#mapPixels}

| Name | Description |
| --- | --- |
| mapPixels(mapMode, format) | Map all pixels for read/write in given pixel format | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| mapMode | PixelMapMode | PixelMapMode |
| format | PixelFormat | PixelFormat |

 **Result:**
PixelMapping


---


### mapPixels{#mapPixels}

| Name | Description |
| --- | --- |
| mapPixels(rect, mapMode, format) | Map pixels addressed by rect for reading/writing in given pixel format | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| rect | Rect | The area of pixels to be accessed |
| mapMode | PixelMapMode | PixelMapMode |
| format | PixelFormat | PixelFormat |

 **Result:**
PixelMapping


---


### transformPixelFormat{#transformPixelFormat}

| Name | Description |
| --- | --- |
| transformPixelFormat(pixelFormat) | Transform pixel's layout to new pixel format. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| pixelFormat | PixelFormat | PixelFormat |

 **Result:**
PixelMapping


---



