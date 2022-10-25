---
title: GltfSaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for glTF format.
type: docs
weight: 69
url: /java/com.aspose.threed/gltfsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class GltfSaveOptions extends SaveOptions
```

Save options for glTF format.
## Constructors

| Constructor | Description |
| --- | --- |
| [GltfSaveOptions(FileContentType contentType)](#GltfSaveOptions-com.aspose.threed.FileContentType-) | Constructor of com.aspose.threed.GltfSaveOptions |
| [GltfSaveOptions(FileFormat format)](#GltfSaveOptions-com.aspose.threed.FileFormat-) | Constructor of com.aspose.threed.GltfSaveOptions |
## Methods

| Method | Description |
| --- | --- |
| [getPrettyPrint()](#getPrettyPrint--) | The JSON content of GLTF file is indented for human reading, default value is false |
| [setPrettyPrint(boolean value)](#setPrettyPrint-boolean-) | The JSON content of GLTF file is indented for human reading, default value is false |
| [getFallbackNormal()](#getFallbackNormal--) | When GLTF2 exporter detected an invalid normal, this will be used instead of its original value to bypass the validation. |
| [setFallbackNormal(Vector3 value)](#setFallbackNormal-com.aspose.threed.Vector3-) | When GLTF2 exporter detected an invalid normal, this will be used instead of its original value to bypass the validation. |
| [getEmbedAssets()](#getEmbedAssets--) | Embed all external assets as base64 into single file in ASCII mode, default value is false. |
| [setEmbedAssets(boolean value)](#setEmbedAssets-boolean-) | Embed all external assets as base64 into single file in ASCII mode, default value is false. |
| [getImageFormat()](#getImageFormat--) | Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D convert the non-standard images to supported format during the exporting. |
| [setImageFormat(GltfEmbeddedImageFormat value)](#setImageFormat-com.aspose.threed.GltfEmbeddedImageFormat-) | Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D convert the non-standard images to supported format during the exporting. |
| [getMaterialConverter()](#getMaterialConverter--) | Custom converter to convert the geometry's material to PBR material If this is unassigned, glTF 2.0 exporter will automatically convert the standard material to PBR material. |
| [setMaterialConverter(MaterialConverter value)](#setMaterialConverter-com.aspose.threed.MaterialConverter-) | Custom converter to convert the geometry's material to PBR material If this is unassigned, glTF 2.0 exporter will automatically convert the standard material to PBR material. |
| [getUseCommonMaterials()](#getUseCommonMaterials--) | Serialize materials using KHR common material extensions, default value is false. |
| [setUseCommonMaterials(boolean value)](#setUseCommonMaterials-boolean-) | Serialize materials using KHR common material extensions, default value is false. |
| [getExternalDracoEncoder()](#getExternalDracoEncoder--) | Use external draco encoder to accelerate the draco compression speed. |
| [setExternalDracoEncoder(String value)](#setExternalDracoEncoder-java.lang.String-) | Use external draco encoder to accelerate the draco compression speed. |
| [getFlipTexCoordV()](#getFlipTexCoordV--) | Flip texture coordinate v(t) component, default value is true. |
| [setFlipTexCoordV(boolean value)](#setFlipTexCoordV-boolean-) | Flip texture coordinate v(t) component, default value is true. |
| [getBufferFile()](#getBufferFile--) | The file name of the external buffer file used to store binary data. |
| [setBufferFile(String value)](#setBufferFile-java.lang.String-) | The file name of the external buffer file used to store binary data. |
| [getSaveExtras()](#getSaveExtras--) | Save scene object's dynamic properties into 'extra' fields in the generated glTF file. |
| [setSaveExtras(boolean value)](#setSaveExtras-boolean-) | Save scene object's dynamic properties into 'extra' fields in the generated glTF file. |
| [getDracoCompression()](#getDracoCompression--) | Gets whether to enable draco compression |
| [setDracoCompression(boolean value)](#setDracoCompression-boolean-) | Sets whether to enable draco compression |
### GltfSaveOptions(FileContentType contentType) {#GltfSaveOptions-com.aspose.threed.FileContentType-}
```
public GltfSaveOptions(FileContentType contentType)
```


Constructor of com.aspose.threed.GltfSaveOptions

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

### GltfSaveOptions(FileFormat format) {#GltfSaveOptions-com.aspose.threed.FileFormat-}
```
public GltfSaveOptions(FileFormat format)
```


Constructor of com.aspose.threed.GltfSaveOptions

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| format | [FileFormat](../../com.aspose.threed/fileformat) |  |

### getPrettyPrint() {#getPrettyPrint--}
```
public boolean getPrettyPrint()
```


The JSON content of GLTF file is indented for human reading, default value is false

**Returns:**
boolean
### setPrettyPrint(boolean value) {#setPrettyPrint-boolean-}
```
public void setPrettyPrint(boolean value)
```


The JSON content of GLTF file is indented for human reading, default value is false

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getFallbackNormal() {#getFallbackNormal--}
```
public Vector3 getFallbackNormal()
```


When GLTF2 exporter detected an invalid normal, this will be used instead of its original value to bypass the validation. Default value is (0, 1, 0)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setFallbackNormal(Vector3 value) {#setFallbackNormal-com.aspose.threed.Vector3-}
```
public void setFallbackNormal(Vector3 value)
```


When GLTF2 exporter detected an invalid normal, this will be used instead of its original value to bypass the validation. Default value is (0, 1, 0)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getEmbedAssets() {#getEmbedAssets--}
```
public boolean getEmbedAssets()
```


Embed all external assets as base64 into single file in ASCII mode, default value is false.

**Returns:**
boolean
### setEmbedAssets(boolean value) {#setEmbedAssets-boolean-}
```
public void setEmbedAssets(boolean value)
```


Embed all external assets as base64 into single file in ASCII mode, default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getImageFormat() {#getImageFormat--}
```
public GltfEmbeddedImageFormat getImageFormat()
```


Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D convert the non-standard images to supported format during the exporting. Default value is com.aspose.threed.GltfEmbeddedImageFormat\#PNG

**Returns:**
[GltfEmbeddedImageFormat](../../com.aspose.threed/gltfembeddedimageformat)
### setImageFormat(GltfEmbeddedImageFormat value) {#setImageFormat-com.aspose.threed.GltfEmbeddedImageFormat-}
```
public void setImageFormat(GltfEmbeddedImageFormat value)
```


Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D convert the non-standard images to supported format during the exporting. Default value is com.aspose.threed.GltfEmbeddedImageFormat\#PNG

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [GltfEmbeddedImageFormat](../../com.aspose.threed/gltfembeddedimageformat) | New value |

### getMaterialConverter() {#getMaterialConverter--}
```
public MaterialConverter getMaterialConverter()
```


Custom converter to convert the geometry's material to PBR material If this is unassigned, glTF 2.0 exporter will automatically convert the standard material to PBR material. Default value is null This property is used when exporting a scene to a glTF 2.0 file.

**Returns:**
[MaterialConverter](../../com.aspose.threed/materialconverter)
### setMaterialConverter(MaterialConverter value) {#setMaterialConverter-com.aspose.threed.MaterialConverter-}
```
public void setMaterialConverter(MaterialConverter value)
```


Custom converter to convert the geometry's material to PBR material If this is unassigned, glTF 2.0 exporter will automatically convert the standard material to PBR material. Default value is null This property is used when exporting a scene to a glTF 2.0 file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [MaterialConverter](../../com.aspose.threed/materialconverter) | New value |

### getUseCommonMaterials() {#getUseCommonMaterials--}
```
public boolean getUseCommonMaterials()
```


Serialize materials using KHR common material extensions, default value is false. Set this to false will cause Aspose.3D export a set of vertex/fragment shader if com.aspose.threed.GltfSaveOptions\#getExportShaders

**Returns:**
boolean
### setUseCommonMaterials(boolean value) {#setUseCommonMaterials-boolean-}
```
public void setUseCommonMaterials(boolean value)
```


Serialize materials using KHR common material extensions, default value is false. Set this to false will cause Aspose.3D export a set of vertex/fragment shader if com.aspose.threed.GltfSaveOptions\#getExportShaders

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getExternalDracoEncoder() {#getExternalDracoEncoder--}
```
public String getExternalDracoEncoder()
```


Use external draco encoder to accelerate the draco compression speed.

**Returns:**
java.lang.String
### setExternalDracoEncoder(String value) {#setExternalDracoEncoder-java.lang.String-}
```
public void setExternalDracoEncoder(String value)
```


Use external draco encoder to accelerate the draco compression speed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getFlipTexCoordV() {#getFlipTexCoordV--}
```
public boolean getFlipTexCoordV()
```


Flip texture coordinate v(t) component, default value is true.

**Returns:**
boolean
### setFlipTexCoordV(boolean value) {#setFlipTexCoordV-boolean-}
```
public void setFlipTexCoordV(boolean value)
```


Flip texture coordinate v(t) component, default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getBufferFile() {#getBufferFile--}
```
public String getBufferFile()
```


The file name of the external buffer file used to store binary data. If this file is not specified, Aspose.3D will generate a name for you. This is ignored when export glTF in binary mode.

**Returns:**
java.lang.String
### setBufferFile(String value) {#setBufferFile-java.lang.String-}
```
public void setBufferFile(String value)
```


The file name of the external buffer file used to store binary data. If this file is not specified, Aspose.3D will generate a name for you. This is ignored when export glTF in binary mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getSaveExtras() {#getSaveExtras--}
```
public boolean getSaveExtras()
```


Save scene object's dynamic properties into 'extra' fields in the generated glTF file. This is useful to provide application-specific data. Default value is false.

**Returns:**
boolean
### setSaveExtras(boolean value) {#setSaveExtras-boolean-}
```
public void setSaveExtras(boolean value)
```


Save scene object's dynamic properties into 'extra' fields in the generated glTF file. This is useful to provide application-specific data. Default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getDracoCompression() {#getDracoCompression--}
```
public boolean getDracoCompression()
```


Gets whether to enable draco compression

**Returns:**
boolean
### setDracoCompression(boolean value) {#setDracoCompression-boolean-}
```
public void setDracoCompression(boolean value)
```


Sets whether to enable draco compression

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

