---
title: PdfSaveOptions
second_title: Aspose.3D for Java API Reference
description: The save options in PDF exporting.
type: docs
weight: 112
url: /java/com.aspose.threed/pdfsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class PdfSaveOptions extends SaveOptions
```

The save options in PDF exporting.
## Constructors

| Constructor | Description |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Constructor of com.aspose.threed.PdfSaveOptions |
## Methods

| Method | Description |
| --- | --- |
| [getRenderMode()](#getRenderMode--) | Render mode specifies the style in which the 3D artwork is rendered. |
| [setRenderMode(PdfRenderMode value)](#setRenderMode-com.aspose.threed.PdfRenderMode-) | Render mode specifies the style in which the 3D artwork is rendered. |
| [getLightingScheme()](#getLightingScheme--) | LightingScheme specifies the lighting to apply to 3D artwork. |
| [setLightingScheme(PdfLightingScheme value)](#setLightingScheme-com.aspose.threed.PdfLightingScheme-) | LightingScheme specifies the lighting to apply to 3D artwork. |
| [getBackgroundColor()](#getBackgroundColor--) | Background color of the 3D view in PDF file. |
| [setBackgroundColor(Vector3 value)](#setBackgroundColor-com.aspose.threed.Vector3-) | Background color of the 3D view in PDF file. |
| [getFaceColor()](#getFaceColor--) | Gets the face color to be used when rendering the 3D content. |
| [setFaceColor(Vector3 value)](#setFaceColor-com.aspose.threed.Vector3-) | Sets the face color to be used when rendering the 3D content. |
| [getAuxiliaryColor()](#getAuxiliaryColor--) | Gets the auxiliary color to be used when rendering the 3D content. |
| [setAuxiliaryColor(Vector3 value)](#setAuxiliaryColor-com.aspose.threed.Vector3-) | Sets the auxiliary color to be used when rendering the 3D content. |
| [getFlipCoordinateSystem()](#getFlipCoordinateSystem--) | Gets to flip the coordinate system of the scene during exporting. |
| [setFlipCoordinateSystem(boolean value)](#setFlipCoordinateSystem-boolean-) | Sets to flip the coordinate system of the scene during exporting. |
| [getEmbedTextures()](#getEmbedTextures--) | Embed the external textures into the PDF file, default value is false. |
| [setEmbedTextures(boolean value)](#setEmbedTextures-boolean-) | Embed the external textures into the PDF file, default value is false. |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Constructor of com.aspose.threed.PdfSaveOptions

### getRenderMode() {#getRenderMode--}
```
public PdfRenderMode getRenderMode()
```


Render mode specifies the style in which the 3D artwork is rendered.

**Returns:**
[PdfRenderMode](../../com.aspose.threed/pdfrendermode)
### setRenderMode(PdfRenderMode value) {#setRenderMode-com.aspose.threed.PdfRenderMode-}
```
public void setRenderMode(PdfRenderMode value)
```


Render mode specifies the style in which the 3D artwork is rendered.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfRenderMode](../../com.aspose.threed/pdfrendermode) | New value |

### getLightingScheme() {#getLightingScheme--}
```
public PdfLightingScheme getLightingScheme()
```


LightingScheme specifies the lighting to apply to 3D artwork.

**Returns:**
[PdfLightingScheme](../../com.aspose.threed/pdflightingscheme)
### setLightingScheme(PdfLightingScheme value) {#setLightingScheme-com.aspose.threed.PdfLightingScheme-}
```
public void setLightingScheme(PdfLightingScheme value)
```


LightingScheme specifies the lighting to apply to 3D artwork.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfLightingScheme](../../com.aspose.threed/pdflightingscheme) | New value |

### getBackgroundColor() {#getBackgroundColor--}
```
public Vector3 getBackgroundColor()
```


Background color of the 3D view in PDF file.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setBackgroundColor(Vector3 value) {#setBackgroundColor-com.aspose.threed.Vector3-}
```
public void setBackgroundColor(Vector3 value)
```


Background color of the 3D view in PDF file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getFaceColor() {#getFaceColor--}
```
public Vector3 getFaceColor()
```


Gets the face color to be used when rendering the 3D content. This is only relevant only when the com.aspose.threed.PdfSaveOptions\#getRenderMode has a value of Illustration.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setFaceColor(Vector3 value) {#setFaceColor-com.aspose.threed.Vector3-}
```
public void setFaceColor(Vector3 value)
```


Sets the face color to be used when rendering the 3D content. This is only relevant only when the com.aspose.threed.PdfSaveOptions\#getRenderMode has a value of Illustration.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getAuxiliaryColor() {#getAuxiliaryColor--}
```
public Vector3 getAuxiliaryColor()
```


Gets the auxiliary color to be used when rendering the 3D content. The interpretation of this color depends on the com.aspose.threed.PdfSaveOptions\#getRenderMode

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setAuxiliaryColor(Vector3 value) {#setAuxiliaryColor-com.aspose.threed.Vector3-}
```
public void setAuxiliaryColor(Vector3 value)
```


Sets the auxiliary color to be used when rendering the 3D content. The interpretation of this color depends on the com.aspose.threed.PdfSaveOptions\#getRenderMode

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getFlipCoordinateSystem() {#getFlipCoordinateSystem--}
```
public boolean getFlipCoordinateSystem()
```


Gets to flip the coordinate system of the scene during exporting.

**Returns:**
boolean
### setFlipCoordinateSystem(boolean value) {#setFlipCoordinateSystem-boolean-}
```
public void setFlipCoordinateSystem(boolean value)
```


Sets to flip the coordinate system of the scene during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getEmbedTextures() {#getEmbedTextures--}
```
public boolean getEmbedTextures()
```


Embed the external textures into the PDF file, default value is false.

**Returns:**
boolean
### setEmbedTextures(boolean value) {#setEmbedTextures-boolean-}
```
public void setEmbedTextures(boolean value)
```


Embed the external textures into the PDF file, default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

