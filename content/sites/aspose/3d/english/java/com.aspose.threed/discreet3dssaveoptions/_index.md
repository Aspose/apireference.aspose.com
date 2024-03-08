---
title: Discreet3dsSaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for 3DS file.
type: docs
weight: 41
url: /java/com.aspose.threed/discreet3dssaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class Discreet3dsSaveOptions extends SaveOptions
```

Save options for 3DS file.
## Constructors

| Constructor | Description |
| --- | --- |
| [Discreet3dsSaveOptions()](#Discreet3dsSaveOptions--) | Constructor of [Discreet3dsSaveOptions](../../com.aspose.threed/discreet3dssaveoptions) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDuplicatedNameCounterBase()](#getDuplicatedNameCounterBase--) | The counter used by generating new name for duplicated names, default value is 2. |
| [getDuplicatedNameCounterFormat()](#getDuplicatedNameCounterFormat--) | The format of the duplicated counter, default value is empty string. |
| [getDuplicatedNameSeparator()](#getDuplicatedNameSeparator--) | The separator between object's name and the duplicated counter, default value is "\_". |
| [getEncoding()](#getEncoding--) | Gets the default encoding for text-based files. |
| [getExportCamera()](#getExportCamera--) | Gets whether export all cameras in the scene. |
| [getExportLight()](#getExportLight--) | Gets whether export all lights in the scene. |
| [getExportTextures()](#getExportTextures--) | Try to copy textures used in scene to output directory. |
| [getFileFormat()](#getFileFormat--) | Gets the file format that specified in current Save/Load option. |
| [getFileName()](#getFileName--) | The file name of the exporting/importing scene. |
| [getFileSystem()](#getFileSystem--) | Allow user to handle how to manage the external dependencies during load/save. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Gets the factory class for FileSystem. |
| [getFlipCoordinateSystem()](#getFlipCoordinateSystem--) | Gets flip coordinate system of control points/normal during importing/exporting. |
| [getGammaCorrectedColor()](#getGammaCorrectedColor--) | A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color. |
| [getHighPreciseColor()](#getHighPreciseColor--) | If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. |
| [getLookupPaths()](#getLookupPaths--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [getMasterScale()](#getMasterScale--) | Gets the master scale used in exporting. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setDuplicatedNameCounterBase(int value)](#setDuplicatedNameCounterBase-int-) | The counter used by generating new name for duplicated names, default value is 2. |
| [setDuplicatedNameCounterFormat(String value)](#setDuplicatedNameCounterFormat-java.lang.String-) | The format of the duplicated counter, default value is empty string. |
| [setDuplicatedNameSeparator(String value)](#setDuplicatedNameSeparator-java.lang.String-) | The separator between object's name and the duplicated counter, default value is "\_". |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Sets the default encoding for text-based files. |
| [setExportCamera(boolean value)](#setExportCamera-boolean-) | Sets whether export all cameras in the scene. |
| [setExportLight(boolean value)](#setExportLight-boolean-) | Sets whether export all lights in the scene. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Try to copy textures used in scene to output directory. |
| [setFileName(String value)](#setFileName-java.lang.String-) | The file name of the exporting/importing scene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Allow user to handle how to manage the external dependencies during load/save. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Sets the factory class for FileSystem. |
| [setFlipCoordinateSystem(boolean value)](#setFlipCoordinateSystem-boolean-) | Sets flip coordinate system of control points/normal during importing/exporting. |
| [setGammaCorrectedColor(boolean value)](#setGammaCorrectedColor-boolean-) | A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color. |
| [setHighPreciseColor(boolean value)](#setHighPreciseColor-boolean-) | If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [setMasterScale(double value)](#setMasterScale-double-) | Sets the master scale used in exporting. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Discreet3dsSaveOptions() {#Discreet3dsSaveOptions--}
```
public Discreet3dsSaveOptions()
```


Constructor of [Discreet3dsSaveOptions](../../com.aspose.threed/discreet3dssaveoptions)

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
### getDuplicatedNameCounterBase() {#getDuplicatedNameCounterBase--}
```
public int getDuplicatedNameCounterBase()
```


The counter used by generating new name for duplicated names, default value is 2.

**Returns:**
int
### getDuplicatedNameCounterFormat() {#getDuplicatedNameCounterFormat--}
```
public String getDuplicatedNameCounterFormat()
```


The format of the duplicated counter, default value is empty string.

**Returns:**
java.lang.String
### getDuplicatedNameSeparator() {#getDuplicatedNameSeparator--}
```
public String getDuplicatedNameSeparator()
```


The separator between object's name and the duplicated counter, default value is "\_". When scene contains objects that use the same name, Aspose.3D 3DS exporter will generate a different name for the object. For example there's two nodes named "Box", the first node will have a name "Box", and the second node will get a new name "Box\_2" using the default configuration.

**Returns:**
java.lang.String
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Gets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Returns:**
java.nio.charset.Charset
### getExportCamera() {#getExportCamera--}
```
public boolean getExportCamera()
```


Gets whether export all cameras in the scene.

**Returns:**
boolean
### getExportLight() {#getExportLight--}
```
public boolean getExportLight()
```


Gets whether export all lights in the scene.

**Returns:**
boolean
### getExportTextures() {#getExportTextures--}
```
public boolean getExportTextures()
```


Try to copy textures used in scene to output directory.

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
### getFlipCoordinateSystem() {#getFlipCoordinateSystem--}
```
public boolean getFlipCoordinateSystem()
```


Gets flip coordinate system of control points/normal during importing/exporting.

**Returns:**
boolean
### getGammaCorrectedColor() {#getGammaCorrectedColor--}
```
public boolean getGammaCorrectedColor()
```


A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color.

**Returns:**
boolean
### getHighPreciseColor() {#getHighPreciseColor--}
```
public boolean getHighPreciseColor()
```


If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. Otherwise the generated file will use 24bit color, each channel use 8bit byte. The default value is false, because not all applications supports the high-precise color.

**Returns:**
boolean
### getLookupPaths() {#getLookupPaths--}
```
public ArrayList<String> getLookupPaths()
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Returns:**
java.util.ArrayList<java.lang.String>
### getMasterScale() {#getMasterScale--}
```
public double getMasterScale()
```


Gets the master scale used in exporting.

**Returns:**
double
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




### setDuplicatedNameCounterBase(int value) {#setDuplicatedNameCounterBase-int-}
```
public void setDuplicatedNameCounterBase(int value)
```


The counter used by generating new name for duplicated names, default value is 2.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setDuplicatedNameCounterFormat(String value) {#setDuplicatedNameCounterFormat-java.lang.String-}
```
public void setDuplicatedNameCounterFormat(String value)
```


The format of the duplicated counter, default value is empty string.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setDuplicatedNameSeparator(String value) {#setDuplicatedNameSeparator-java.lang.String-}
```
public void setDuplicatedNameSeparator(String value)
```


The separator between object's name and the duplicated counter, default value is "\_". When scene contains objects that use the same name, Aspose.3D 3DS exporter will generate a different name for the object. For example there's two nodes named "Box", the first node will have a name "Box", and the second node will get a new name "Box\_2" using the default configuration.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.nio.charset.Charset | New value |

### setExportCamera(boolean value) {#setExportCamera-boolean-}
```
public void setExportCamera(boolean value)
```


Sets whether export all cameras in the scene.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setExportLight(boolean value) {#setExportLight-boolean-}
```
public void setExportLight(boolean value)
```


Sets whether export all lights in the scene.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setExportTextures(boolean value) {#setExportTextures-boolean-}
```
public void setExportTextures(boolean value)
```


Try to copy textures used in scene to output directory.

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

### setFlipCoordinateSystem(boolean value) {#setFlipCoordinateSystem-boolean-}
```
public void setFlipCoordinateSystem(boolean value)
```


Sets flip coordinate system of control points/normal during importing/exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setGammaCorrectedColor(boolean value) {#setGammaCorrectedColor-boolean-}
```
public void setGammaCorrectedColor(boolean value)
```


A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setHighPreciseColor(boolean value) {#setHighPreciseColor-boolean-}
```
public void setHighPreciseColor(boolean value)
```


If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. Otherwise the generated file will use 24bit color, each channel use 8bit byte. The default value is false, because not all applications supports the high-precise color.

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

### setMasterScale(double value) {#setMasterScale-double-}
```
public void setMasterScale(double value)
```


Sets the master scale used in exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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

