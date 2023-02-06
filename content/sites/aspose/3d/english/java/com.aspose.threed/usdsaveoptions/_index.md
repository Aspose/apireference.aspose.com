---
title: UsdSaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for USD/USDZ formats.
type: docs
weight: 180
url: /java/com.aspose.threed/usdsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class UsdSaveOptions extends SaveOptions
```

Save options for USD/USDZ formats.
## Constructors

| Constructor | Description |
| --- | --- |
| [UsdSaveOptions()](#UsdSaveOptions--) | Initialize a new [UsdSaveOptions](../../com.aspose.threed/usdsaveoptions) with [FileFormat.USD](../../com.aspose.threed/fileformat\#USD) format |
| [UsdSaveOptions(FileFormat fileFormat)](#UsdSaveOptions-com.aspose.threed.FileFormat-) | Initialize a new [UsdSaveOptions](../../com.aspose.threed/usdsaveoptions) with specified USD/USDZ format. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Gets the default encoding for text-based files. |
| [getExportMetaData()](#getExportMetaData--) | Export node's properties through USD's customData field. |
| [getFileFormat()](#getFileFormat--) | Gets the file format that specified in current Save/Load option. |
| [getFileName()](#getFileName--) | The file name of the exporting/importing scene. |
| [getFileSystem()](#getFileSystem--) | Allow user to handle how to manage the external dependencies during load/save. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Gets the factory class for FileSystem. |
| [getLookupPaths()](#getLookupPaths--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [getMaterialConverter()](#getMaterialConverter--) | Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. |
| [getPrimitiveToMesh()](#getPrimitiveToMesh--) | Convert the primitive entities to mesh during the export. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Sets the default encoding for text-based files. |
| [setExportMetaData(boolean value)](#setExportMetaData-boolean-) | Export node's properties through USD's customData field. |
| [setFileName(String value)](#setFileName-java.lang.String-) | The file name of the exporting/importing scene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Allow user to handle how to manage the external dependencies during load/save. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Sets the factory class for FileSystem. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [setMaterialConverter(MaterialConverter value)](#setMaterialConverter-com.aspose.threed.MaterialConverter-) | Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. |
| [setPrimitiveToMesh(boolean value)](#setPrimitiveToMesh-boolean-) | Convert the primitive entities to mesh during the export. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### UsdSaveOptions() {#UsdSaveOptions--}
```
public UsdSaveOptions()
```


Initialize a new [UsdSaveOptions](../../com.aspose.threed/usdsaveoptions) with [FileFormat.USD](../../com.aspose.threed/fileformat\#USD) format

### UsdSaveOptions(FileFormat fileFormat) {#UsdSaveOptions-com.aspose.threed.FileFormat-}
```
public UsdSaveOptions(FileFormat fileFormat)
```


Initialize a new [UsdSaveOptions](../../com.aspose.threed/usdsaveoptions) with specified USD/USDZ format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileFormat | [FileFormat](../../com.aspose.threed/fileformat) |  |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Gets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Returns:**
java.nio.charset.Charset
### getExportMetaData() {#getExportMetaData--}
```
public boolean getExportMetaData()
```


Export node's properties through USD's customData field.

**Returns:**
boolean
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
### getLookupPaths() {#getLookupPaths--}
```
public ArrayList<String> getLookupPaths()
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Returns:**
java.util.ArrayList<java.lang.String>
### getMaterialConverter() {#getMaterialConverter--}
```
public MaterialConverter getMaterialConverter()
```


Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. Default value is null

**Returns:**
[MaterialConverter](../../com.aspose.threed/materialconverter)
### getPrimitiveToMesh() {#getPrimitiveToMesh--}
```
public boolean getPrimitiveToMesh()
```


Convert the primitive entities to mesh during the export. Or directly encode the primitives to the output file(will use Aspose's extension definition for unofficial primitives like Dish, Torus) Default value is true.

**Returns:**
boolean
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




### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.nio.charset.Charset | New value |

### setExportMetaData(boolean value) {#setExportMetaData-boolean-}
```
public void setExportMetaData(boolean value)
```


Export node's properties through USD's customData field.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

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

### setLookupPaths(ArrayList<String> value) {#setLookupPaths-java.util.ArrayList-java.lang.String--}
```
public void setLookupPaths(ArrayList<String> value)
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.ArrayList<java.lang.String> | New value |

### setMaterialConverter(MaterialConverter value) {#setMaterialConverter-com.aspose.threed.MaterialConverter-}
```
public void setMaterialConverter(MaterialConverter value)
```


Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. Default value is null

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [MaterialConverter](../../com.aspose.threed/materialconverter) | New value |

### setPrimitiveToMesh(boolean value) {#setPrimitiveToMesh-boolean-}
```
public void setPrimitiveToMesh(boolean value)
```


Convert the primitive entities to mesh during the export. Or directly encode the primitives to the output file(will use Aspose's extension definition for unofficial primitives like Dish, Torus) Default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

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
public final native void wait(long arg0)
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

