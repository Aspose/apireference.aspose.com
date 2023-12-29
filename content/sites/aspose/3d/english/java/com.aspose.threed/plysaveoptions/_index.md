---
title: PlySaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for exporting scene as PLY file.
type: docs
weight: 121
url: /java/com.aspose.threed/plysaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class PlySaveOptions extends SaveOptions
```

Save options for exporting scene as PLY file.
## Constructors

| Constructor | Description |
| --- | --- |
| [PlySaveOptions()](#PlySaveOptions--) | Constructor of [PlySaveOptions](../../com.aspose.threed/plysaveoptions) |
| [PlySaveOptions(FileContentType contentType)](#PlySaveOptions-com.aspose.threed.FileContentType-) | Constructor of [PlySaveOptions](../../com.aspose.threed/plysaveoptions) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisSystem()](#getAxisSystem--) | Gets the axis system in the exported stl file. |
| [getClass()](#getClass--) |  |
| [getColorComponents()](#getColorComponents--) | The component names for vertex color, default value is ("red", "green", "blue") |
| [getEncoding()](#getEncoding--) | Gets the default encoding for text-based files. |
| [getExportTextures()](#getExportTextures--) | Try to copy textures used in scene to output directory. |
| [getFaceElement()](#getFaceElement--) | The element name for the face data, default value is "face" |
| [getFaceProperty()](#getFaceProperty--) | The property name for the face data, default value is "vertex\_index" |
| [getFileFormat()](#getFileFormat--) | Gets the file format that specified in current Save/Load option. |
| [getFileName()](#getFileName--) | The file name of the exporting/importing scene. |
| [getFileSystem()](#getFileSystem--) | Allow user to handle how to manage the external dependencies during load/save. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Gets the factory class for FileSystem. |
| [getFlipCoordinate()](#getFlipCoordinate--) | Flip the coordinate while saving the scene, default value is true |
| [getLookupPaths()](#getLookupPaths--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [getNormalComponents()](#getNormalComponents--) | The component names for normal data, default value is ("nx", "ny", "nz") |
| [getPointCloud()](#getPointCloud--) | Export the scene as point cloud, the default value is false. |
| [getPositionComponents()](#getPositionComponents--) | The component names for position data, default value is ("x", "y", "z") |
| [getTextureCoordinateComponents()](#getTextureCoordinateComponents--) | The component names for texture coordinate data, default value is ("u", "v") |
| [getVertexElement()](#getVertexElement--) | The element name for the vertex data, default value is "vertex" |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAxisSystem(AxisSystem value)](#setAxisSystem-com.aspose.threed.AxisSystem-) | Sets the axis system in the exported stl file. |
| [setColorComponents(Tuple_3<String,String,String> value)](#setColorComponents-com.aspose.csporter.helpers.Tuple-3-java.lang.String-java.lang.String-java.lang.String--) | The component names for vertex color, default value is ("red", "green", "blue") |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Sets the default encoding for text-based files. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Try to copy textures used in scene to output directory. |
| [setFaceElement(String value)](#setFaceElement-java.lang.String-) | The element name for the face data, default value is "face" |
| [setFaceProperty(String value)](#setFaceProperty-java.lang.String-) | The property name for the face data, default value is "vertex\_index" |
| [setFileName(String value)](#setFileName-java.lang.String-) | The file name of the exporting/importing scene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Allow user to handle how to manage the external dependencies during load/save. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Sets the factory class for FileSystem. |
| [setFlipCoordinate(boolean value)](#setFlipCoordinate-boolean-) | Flip the coordinate while saving the scene, default value is true |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [setNormalComponents(Tuple_3<String,String,String> value)](#setNormalComponents-com.aspose.csporter.helpers.Tuple-3-java.lang.String-java.lang.String-java.lang.String--) | The component names for normal data, default value is ("nx", "ny", "nz") |
| [setPointCloud(boolean value)](#setPointCloud-boolean-) | Export the scene as point cloud, the default value is false. |
| [setPositionComponents(Tuple_3<String,String,String> value)](#setPositionComponents-com.aspose.csporter.helpers.Tuple-3-java.lang.String-java.lang.String-java.lang.String--) | The component names for position data, default value is ("x", "y", "z") |
| [setTextureCoordinateComponents(Tuple_2<String,String> value)](#setTextureCoordinateComponents-com.aspose.csporter.helpers.Tuple-2-java.lang.String-java.lang.String--) | The component names for texture coordinate data, default value is ("u", "v") |
| [setVertexElement(String value)](#setVertexElement-java.lang.String-) | The element name for the vertex data, default value is "vertex" |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PlySaveOptions() {#PlySaveOptions--}
```
public PlySaveOptions()
```


Constructor of [PlySaveOptions](../../com.aspose.threed/plysaveoptions)

### PlySaveOptions(FileContentType contentType) {#PlySaveOptions-com.aspose.threed.FileContentType-}
```
public PlySaveOptions(FileContentType contentType)
```


Constructor of [PlySaveOptions](../../com.aspose.threed/plysaveoptions)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

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
### getAxisSystem() {#getAxisSystem--}
```
public AxisSystem getAxisSystem()
```


Gets the axis system in the exported stl file.

**Returns:**
[AxisSystem](../../com.aspose.threed/axissystem)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColorComponents() {#getColorComponents--}
```
public Tuple_3<String,String,String> getColorComponents()
```


The component names for vertex color, default value is ("red", "green", "blue")

**Returns:**
com.aspose.csporter.helpers.Tuple_3<java.lang.String,java.lang.String,java.lang.String>
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
### getFaceElement() {#getFaceElement--}
```
public String getFaceElement()
```


The element name for the face data, default value is "face"

**Returns:**
java.lang.String
### getFaceProperty() {#getFaceProperty--}
```
public String getFaceProperty()
```


The property name for the face data, default value is "vertex\_index"

**Returns:**
java.lang.String
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
### getFlipCoordinate() {#getFlipCoordinate--}
```
public boolean getFlipCoordinate()
```


Flip the coordinate while saving the scene, default value is true

**Returns:**
boolean
### getLookupPaths() {#getLookupPaths--}
```
public ArrayList<String> getLookupPaths()
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Returns:**
java.util.ArrayList<java.lang.String>
### getNormalComponents() {#getNormalComponents--}
```
public Tuple_3<String,String,String> getNormalComponents()
```


The component names for normal data, default value is ("nx", "ny", "nz")

**Returns:**
com.aspose.csporter.helpers.Tuple_3<java.lang.String,java.lang.String,java.lang.String>
### getPointCloud() {#getPointCloud--}
```
public boolean getPointCloud()
```


Export the scene as point cloud, the default value is false.

**Returns:**
boolean
### getPositionComponents() {#getPositionComponents--}
```
public Tuple_3<String,String,String> getPositionComponents()
```


The component names for position data, default value is ("x", "y", "z")

**Returns:**
com.aspose.csporter.helpers.Tuple_3<java.lang.String,java.lang.String,java.lang.String>
### getTextureCoordinateComponents() {#getTextureCoordinateComponents--}
```
public Tuple_2<String,String> getTextureCoordinateComponents()
```


The component names for texture coordinate data, default value is ("u", "v")

**Returns:**
com.aspose.csporter.helpers.Tuple_2<java.lang.String,java.lang.String>
### getVertexElement() {#getVertexElement--}
```
public String getVertexElement()
```


The element name for the vertex data, default value is "vertex"

**Returns:**
java.lang.String
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




### setAxisSystem(AxisSystem value) {#setAxisSystem-com.aspose.threed.AxisSystem-}
```
public void setAxisSystem(AxisSystem value)
```


Sets the axis system in the exported stl file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [AxisSystem](../../com.aspose.threed/axissystem) | New value |

### setColorComponents(Tuple_3<String,String,String> value) {#setColorComponents-com.aspose.csporter.helpers.Tuple-3-java.lang.String-java.lang.String-java.lang.String--}
```
public void setColorComponents(Tuple_3<String,String,String> value)
```


The component names for vertex color, default value is ("red", "green", "blue")

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.csporter.helpers.Tuple_3<java.lang.String,java.lang.String,java.lang.String> | New value |

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

### setFaceElement(String value) {#setFaceElement-java.lang.String-}
```
public void setFaceElement(String value)
```


The element name for the face data, default value is "face"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setFaceProperty(String value) {#setFaceProperty-java.lang.String-}
```
public void setFaceProperty(String value)
```


The property name for the face data, default value is "vertex\_index"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

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

### setFlipCoordinate(boolean value) {#setFlipCoordinate-boolean-}
```
public void setFlipCoordinate(boolean value)
```


Flip the coordinate while saving the scene, default value is true

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setLookupPaths(ArrayList<String> value) {#setLookupPaths-java.util.ArrayList-java.lang.String--}
```
public void setLookupPaths(ArrayList<String> value)
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.ArrayList<java.lang.String> | New value |

### setNormalComponents(Tuple_3<String,String,String> value) {#setNormalComponents-com.aspose.csporter.helpers.Tuple-3-java.lang.String-java.lang.String-java.lang.String--}
```
public void setNormalComponents(Tuple_3<String,String,String> value)
```


The component names for normal data, default value is ("nx", "ny", "nz")

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.csporter.helpers.Tuple_3<java.lang.String,java.lang.String,java.lang.String> | New value |

### setPointCloud(boolean value) {#setPointCloud-boolean-}
```
public void setPointCloud(boolean value)
```


Export the scene as point cloud, the default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setPositionComponents(Tuple_3<String,String,String> value) {#setPositionComponents-com.aspose.csporter.helpers.Tuple-3-java.lang.String-java.lang.String-java.lang.String--}
```
public void setPositionComponents(Tuple_3<String,String,String> value)
```


The component names for position data, default value is ("x", "y", "z")

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.csporter.helpers.Tuple_3<java.lang.String,java.lang.String,java.lang.String> | New value |

### setTextureCoordinateComponents(Tuple_2<String,String> value) {#setTextureCoordinateComponents-com.aspose.csporter.helpers.Tuple-2-java.lang.String-java.lang.String--}
```
public void setTextureCoordinateComponents(Tuple_2<String,String> value)
```


The component names for texture coordinate data, default value is ("u", "v")

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.csporter.helpers.Tuple_2<java.lang.String,java.lang.String> | New value |

### setVertexElement(String value) {#setVertexElement-java.lang.String-}
```
public void setVertexElement(String value)
```


The element name for the vertex data, default value is "vertex"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

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

