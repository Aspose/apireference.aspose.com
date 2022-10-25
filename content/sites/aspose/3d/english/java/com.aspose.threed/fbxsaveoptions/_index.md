---
title: FbxSaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for Fbx file.
type: docs
weight: 60
url: /java/com.aspose.threed/fbxsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class FbxSaveOptions extends SaveOptions
```

Save options for Fbx file.
## Constructors

| Constructor | Description |
| --- | --- |
| [FbxSaveOptions(FileFormat format)](#FbxSaveOptions-com.aspose.threed.FileFormat-) | Initializes a com.aspose.threed.FbxSaveOptions |
| [FbxSaveOptions(FileContentType contentType)](#FbxSaveOptions-com.aspose.threed.FileContentType-) | Initialize a com.aspose.threed.FbxSaveOptions using latest supported version. |
## Methods

| Method | Description |
| --- | --- |
| [getReusePrimitiveMesh()](#getReusePrimitiveMesh--) | Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). |
| [setReusePrimitiveMesh(boolean value)](#setReusePrimitiveMesh-boolean-) | Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). |
| [getEnableCompression()](#getEnableCompression--) | Compression large binary data in the FBX file(e.g. |
| [setEnableCompression(boolean value)](#setEnableCompression-boolean-) | Compression large binary data in the FBX file(e.g. |
| [getFoldRepeatedCurveData()](#getFoldRepeatedCurveData--) | Gets whether reuse repeated curve data by increasing last data's ref count |
| [setFoldRepeatedCurveData(Boolean value)](#setFoldRepeatedCurveData-java.lang.Boolean-) | Sets whether reuse repeated curve data by increasing last data's ref count |
| [getExportLegacyMaterialProperties()](#getExportLegacyMaterialProperties--) | Gets whether export legacy material properties, used for back compatibility. |
| [setExportLegacyMaterialProperties(boolean value)](#setExportLegacyMaterialProperties-boolean-) | Sets whether export legacy material properties, used for back compatibility. |
| [getVideoForTexture()](#getVideoForTexture--) | Gets whether generate a Video instance for com.aspose.threed.Texture when exporting as FBX. |
| [setVideoForTexture(boolean value)](#setVideoForTexture-boolean-) | Sets whether generate a Video instance for com.aspose.threed.Texture when exporting as FBX. |
| [getEmbedTextures()](#getEmbedTextures--) | Gets whether to embed the texture to the final output file. |
| [setEmbedTextures(boolean value)](#setEmbedTextures-boolean-) | Sets whether to embed the texture to the final output file. |
| [getGenerateVertexElementMaterial()](#getGenerateVertexElementMaterial--) | Gets whether always generate a com.aspose.threed.VertexElementMaterial for geometries if the attached node contains materials. |
| [setGenerateVertexElementMaterial(boolean value)](#setGenerateVertexElementMaterial-boolean-) | Sets whether always generate a com.aspose.threed.VertexElementMaterial for geometries if the attached node contains materials. |
### FbxSaveOptions(FileFormat format) {#FbxSaveOptions-com.aspose.threed.FileFormat-}
```
public FbxSaveOptions(FileFormat format)
```


Initializes a com.aspose.threed.FbxSaveOptions

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| format | [FileFormat](../../com.aspose.threed/fileformat) |  |

### FbxSaveOptions(FileContentType contentType) {#FbxSaveOptions-com.aspose.threed.FileContentType-}
```
public FbxSaveOptions(FileContentType contentType)
```


Initialize a com.aspose.threed.FbxSaveOptions using latest supported version.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

### getReusePrimitiveMesh() {#getReusePrimitiveMesh--}
```
public boolean getReusePrimitiveMesh()
```


Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). Default value is false

**Returns:**
boolean
### setReusePrimitiveMesh(boolean value) {#setReusePrimitiveMesh-boolean-}
```
public void setReusePrimitiveMesh(boolean value)
```


Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). Default value is false

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getEnableCompression() {#getEnableCompression--}
```
public boolean getEnableCompression()
```


Compression large binary data in the FBX file(e.g. animation data, control points, vertex element data, indices), default value is true.

**Returns:**
boolean
### setEnableCompression(boolean value) {#setEnableCompression-boolean-}
```
public void setEnableCompression(boolean value)
```


Compression large binary data in the FBX file(e.g. animation data, control points, vertex element data, indices), default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getFoldRepeatedCurveData() {#getFoldRepeatedCurveData--}
```
public Boolean getFoldRepeatedCurveData()
```


Gets whether reuse repeated curve data by increasing last data's ref count

**Returns:**
java.lang.Boolean
### setFoldRepeatedCurveData(Boolean value) {#setFoldRepeatedCurveData-java.lang.Boolean-}
```
public void setFoldRepeatedCurveData(Boolean value)
```


Sets whether reuse repeated curve data by increasing last data's ref count

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Boolean | New value |

### getExportLegacyMaterialProperties() {#getExportLegacyMaterialProperties--}
```
public boolean getExportLegacyMaterialProperties()
```


Gets whether export legacy material properties, used for back compatibility. This option is turned on by default.

**Returns:**
boolean
### setExportLegacyMaterialProperties(boolean value) {#setExportLegacyMaterialProperties-boolean-}
```
public void setExportLegacyMaterialProperties(boolean value)
```


Sets whether export legacy material properties, used for back compatibility. This option is turned on by default.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getVideoForTexture() {#getVideoForTexture--}
```
public boolean getVideoForTexture()
```


Gets whether generate a Video instance for com.aspose.threed.Texture when exporting as FBX.

**Returns:**
boolean
### setVideoForTexture(boolean value) {#setVideoForTexture-boolean-}
```
public void setVideoForTexture(boolean value)
```


Sets whether generate a Video instance for com.aspose.threed.Texture when exporting as FBX.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getEmbedTextures() {#getEmbedTextures--}
```
public boolean getEmbedTextures()
```


Gets whether to embed the texture to the final output file. FBX Exporter will try to find the texture's raw data from com.aspose.threed.IOConfig\#getFileSystem, and embed the file to final FBX file. Default value is false.

**Returns:**
boolean
### setEmbedTextures(boolean value) {#setEmbedTextures-boolean-}
```
public void setEmbedTextures(boolean value)
```


Sets whether to embed the texture to the final output file. FBX Exporter will try to find the texture's raw data from com.aspose.threed.IOConfig\#getFileSystem, and embed the file to final FBX file. Default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getGenerateVertexElementMaterial() {#getGenerateVertexElementMaterial--}
```
public boolean getGenerateVertexElementMaterial()
```


Gets whether always generate a com.aspose.threed.VertexElementMaterial for geometries if the attached node contains materials. This is turned off by default.

**Returns:**
boolean
### setGenerateVertexElementMaterial(boolean value) {#setGenerateVertexElementMaterial-boolean-}
```
public void setGenerateVertexElementMaterial(boolean value)
```


Sets whether always generate a com.aspose.threed.VertexElementMaterial for geometries if the attached node contains materials. This is turned off by default.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

