---
title: PdfSaveOptions
second_title: Aspose.3D for Java API Reference
description: The save options in PDF exporting.
type: docs
weight: 115
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
| [PdfSaveOptions()](#PdfSaveOptions--) | Constructor of [PdfSaveOptions](../../com.aspose.threed/pdfsaveoptions) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAuxiliaryColor()](#getAuxiliaryColor--) | Gets the auxiliary color to be used when rendering the 3D content. |
| [getBackgroundColor()](#getBackgroundColor--) | Background color of the 3D view in PDF file. |
| [getClass()](#getClass--) |  |
| [getEmbedTextures()](#getEmbedTextures--) | Embed the external textures into the PDF file, default value is false. |
| [getEncoding()](#getEncoding--) | Gets the default encoding for text-based files. |
| [getExportTextures()](#getExportTextures--) | Try to copy textures used in scene to output directory. |
| [getFaceColor()](#getFaceColor--) | Gets the face color to be used when rendering the 3D content. |
| [getFileFormat()](#getFileFormat--) | Gets the file format that specified in current Save/Load option. |
| [getFileName()](#getFileName--) | The file name of the exporting/importing scene. |
| [getFileSystem()](#getFileSystem--) | Allow user to handle how to manage the external dependencies during load/save. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Gets the factory class for FileSystem. |
| [getFlipCoordinateSystem()](#getFlipCoordinateSystem--) | Gets to flip the coordinate system of the scene during exporting. |
| [getLightingScheme()](#getLightingScheme--) | LightingScheme specifies the lighting to apply to 3D artwork. |
| [getLookupPaths()](#getLookupPaths--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [getRenderMode()](#getRenderMode--) | Render mode specifies the style in which the 3D artwork is rendered. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAuxiliaryColor(Vector3 value)](#setAuxiliaryColor-com.aspose.threed.Vector3-) | Sets the auxiliary color to be used when rendering the 3D content. |
| [setBackgroundColor(Vector3 value)](#setBackgroundColor-com.aspose.threed.Vector3-) | Background color of the 3D view in PDF file. |
| [setEmbedTextures(boolean value)](#setEmbedTextures-boolean-) | Embed the external textures into the PDF file, default value is false. |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Sets the default encoding for text-based files. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Try to copy textures used in scene to output directory. |
| [setFaceColor(Vector3 value)](#setFaceColor-com.aspose.threed.Vector3-) | Sets the face color to be used when rendering the 3D content. |
| [setFileName(String value)](#setFileName-java.lang.String-) | The file name of the exporting/importing scene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Allow user to handle how to manage the external dependencies during load/save. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Sets the factory class for FileSystem. |
| [setFlipCoordinateSystem(boolean value)](#setFlipCoordinateSystem-boolean-) | Sets to flip the coordinate system of the scene during exporting. |
| [setLightingScheme(PdfLightingScheme value)](#setLightingScheme-com.aspose.threed.PdfLightingScheme-) | LightingScheme specifies the lighting to apply to 3D artwork. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [setRenderMode(PdfRenderMode value)](#setRenderMode-com.aspose.threed.PdfRenderMode-) | Render mode specifies the style in which the 3D artwork is rendered. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Constructor of [PdfSaveOptions](../../com.aspose.threed/pdfsaveoptions)

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAuxiliaryColor() {#getAuxiliaryColor--}
```
public Vector3 getAuxiliaryColor()
```


Gets the auxiliary color to be used when rendering the 3D content. The interpretation of this color depends on the [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getBackgroundColor() {#getBackgroundColor--}
```
public Vector3 getBackgroundColor()
```


Background color of the 3D view in PDF file.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEmbedTextures() {#getEmbedTextures--}
```
public boolean getEmbedTextures()
```


Embed the external textures into the PDF file, default value is false.

**Returns:**
boolean
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Gets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Returns:**
java.nio.charset.Charset
### getExportTextures() {#getExportTextures--}
```
public boolean getExportTextures()
```


Try to copy textures used in scene to output directory.

**Returns:**
boolean
### getFaceColor() {#getFaceColor--}
```
public Vector3 getFaceColor()
```


Gets the face color to be used when rendering the 3D content. This is only relevant only when the [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode) has a value of Illustration.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getFileFormat() {#getFileFormat--}
```
public FileFormat getFileFormat()
```


Gets the file format that specified in current Save/Load option.

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat)
### getFileName() {#getFileName--}
```
public String getFileName()
```


The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.

**Returns:**
java.lang.String
### getFileSystem() {#getFileSystem--}
```
public FileSystem getFileSystem()
```


Allow user to handle how to manage the external dependencies during load/save.

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem)
### getFileSystemFactory() {#getFileSystemFactory--}
```
public static FileSystemFactory getFileSystemFactory()
```


Gets the factory class for FileSystem. The default factory will create [LocalFileSystem](../../com.aspose.threed/localfilesystem) which is not suitable for server environment.

**Returns:**
[FileSystemFactory](../../com.aspose.threed/filesystemfactory)
### getFlipCoordinateSystem() {#getFlipCoordinateSystem--}
```
public boolean getFlipCoordinateSystem()
```


Gets to flip the coordinate system of the scene during exporting.

**Returns:**
boolean
### getLightingScheme() {#getLightingScheme--}
```
public PdfLightingScheme getLightingScheme()
```


LightingScheme specifies the lighting to apply to 3D artwork.

**Returns:**
[PdfLightingScheme](../../com.aspose.threed/pdflightingscheme)
### getLookupPaths() {#getLookupPaths--}
```
public ArrayList<String> getLookupPaths()
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Returns:**
java.util.ArrayList<java.lang.String>
### getRenderMode() {#getRenderMode--}
```
public PdfRenderMode getRenderMode()
```


Render mode specifies the style in which the 3D artwork is rendered.

**Returns:**
[PdfRenderMode](../../com.aspose.threed/pdfrendermode)
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAuxiliaryColor(Vector3 value) {#setAuxiliaryColor-com.aspose.threed.Vector3-}
```
public void setAuxiliaryColor(Vector3 value)
```


Sets the auxiliary color to be used when rendering the 3D content. The interpretation of this color depends on the [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setBackgroundColor(Vector3 value) {#setBackgroundColor-com.aspose.threed.Vector3-}
```
public void setBackgroundColor(Vector3 value)
```


Background color of the 3D view in PDF file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setEmbedTextures(boolean value) {#setEmbedTextures-boolean-}
```
public void setEmbedTextures(boolean value)
```


Embed the external textures into the PDF file, default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.nio.charset.Charset | New value |

### setExportTextures(boolean value) {#setExportTextures-boolean-}
```
public void setExportTextures(boolean value)
```


Try to copy textures used in scene to output directory.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setFaceColor(Vector3 value) {#setFaceColor-com.aspose.threed.Vector3-}
```
public void setFaceColor(Vector3 value)
```


Sets the face color to be used when rendering the 3D content. This is only relevant only when the [getRenderMode](../../com.aspose.threed/pdfsaveoptions\#getRenderMode) has a value of Illustration.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setFileSystem(FileSystem value) {#setFileSystem-com.aspose.threed.FileSystem-}
```
public void setFileSystem(FileSystem value)
```


Allow user to handle how to manage the external dependencies during load/save.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FileSystem](../../com.aspose.threed/filesystem) | New value |

### setFileSystemFactory(FileSystemFactory value) {#setFileSystemFactory-com.aspose.threed.FileSystemFactory-}
```
public static void setFileSystemFactory(FileSystemFactory value)
```


Sets the factory class for FileSystem. The default factory will create [LocalFileSystem](../../com.aspose.threed/localfilesystem) which is not suitable for server environment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FileSystemFactory](../../com.aspose.threed/filesystemfactory) | New value |

### setFlipCoordinateSystem(boolean value) {#setFlipCoordinateSystem-boolean-}
```
public void setFlipCoordinateSystem(boolean value)
```


Sets to flip the coordinate system of the scene during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setLightingScheme(PdfLightingScheme value) {#setLightingScheme-com.aspose.threed.PdfLightingScheme-}
```
public void setLightingScheme(PdfLightingScheme value)
```


LightingScheme specifies the lighting to apply to 3D artwork.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfLightingScheme](../../com.aspose.threed/pdflightingscheme) | New value |

### setLookupPaths(ArrayList<String> value) {#setLookupPaths-java.util.ArrayList-java.lang.String--}
```
public void setLookupPaths(ArrayList<String> value)
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.ArrayList<java.lang.String> | New value |

### setRenderMode(PdfRenderMode value) {#setRenderMode-com.aspose.threed.PdfRenderMode-}
```
public void setRenderMode(PdfRenderMode value)
```


Render mode specifies the style in which the 3D artwork is rendered.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfRenderMode](../../com.aspose.threed/pdfrendermode) | New value |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

