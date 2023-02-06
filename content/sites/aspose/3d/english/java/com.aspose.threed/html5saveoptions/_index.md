---
title: Html5SaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for HTML5
type: docs
weight: 73
url: /java/com.aspose.threed/html5saveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class Html5SaveOptions extends SaveOptions
```

Save options for HTML5
## Constructors

| Constructor | Description |
| --- | --- |
| [Html5SaveOptions()](#Html5SaveOptions--) | Constructor of [Html5SaveOptions](../../com.aspose.threed/html5saveoptions) with all default settings. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCameraPosition()](#getCameraPosition--) | Gets the initial position of the camera, default value is (10, 10, 10) |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Gets the default encoding for text-based files. |
| [getFarPlane()](#getFarPlane--) | Gets the far plane of the camera, default value is 1000. |
| [getFieldOfView()](#getFieldOfView--) | Gets the field of the view, default value is 45, measured in degree. |
| [getFileFormat()](#getFileFormat--) | Gets the file format that specified in current Save/Load option. |
| [getFileName()](#getFileName--) | The file name of the exporting/importing scene. |
| [getFileSystem()](#getFileSystem--) | Allow user to handle how to manage the external dependencies during load/save. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Gets the factory class for FileSystem. |
| [getLookAt()](#getLookAt--) | Gets the default look at position, default value is (0, 0, 0) |
| [getLookupPaths()](#getLookupPaths--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [getNearPlane()](#getNearPlane--) | Gets the near plane of the camera, default value is 1 |
| [getOrientationBox()](#getOrientationBox--) | Display a orientation box. |
| [getShowGrid()](#getShowGrid--) | Display a grid in the scene. |
| [getShowRulers()](#getShowRulers--) | Display rulers of x/y/z axes in the scene to measure the model. |
| [getShowUI()](#getShowUI--) | Display a simple UI in the scene. |
| [getUpVector()](#getUpVector--) | Gets the up vector, value can be "x"/"y"/"z", default value is "y" |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCameraPosition(Vector3 value)](#setCameraPosition-com.aspose.threed.Vector3-) | Sets the initial position of the camera, default value is (10, 10, 10) |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Sets the default encoding for text-based files. |
| [setFarPlane(double value)](#setFarPlane-double-) | Sets the far plane of the camera, default value is 1000. |
| [setFieldOfView(double value)](#setFieldOfView-double-) | Sets the field of the view, default value is 45, measured in degree. |
| [setFileName(String value)](#setFileName-java.lang.String-) | The file name of the exporting/importing scene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Allow user to handle how to manage the external dependencies during load/save. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Sets the factory class for FileSystem. |
| [setLookAt(Vector3 value)](#setLookAt-com.aspose.threed.Vector3-) | Sets the default look at position, default value is (0, 0, 0) |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [setNearPlane(double value)](#setNearPlane-double-) | Sets the near plane of the camera, default value is 1 |
| [setOrientationBox(boolean value)](#setOrientationBox-boolean-) | Display a orientation box. |
| [setShowGrid(boolean value)](#setShowGrid-boolean-) | Display a grid in the scene. |
| [setShowRulers(boolean value)](#setShowRulers-boolean-) | Display rulers of x/y/z axes in the scene to measure the model. |
| [setShowUI(boolean value)](#setShowUI-boolean-) | Display a simple UI in the scene. |
| [setUpVector(String value)](#setUpVector-java.lang.String-) | Sets the up vector, value can be "x"/"y"/"z", default value is "y" |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Html5SaveOptions() {#Html5SaveOptions--}
```
public Html5SaveOptions()
```


Constructor of [Html5SaveOptions](../../com.aspose.threed/html5saveoptions) with all default settings.

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
### getCameraPosition() {#getCameraPosition--}
```
public Vector3 getCameraPosition()
```


Gets the initial position of the camera, default value is (10, 10, 10)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
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
### getFarPlane() {#getFarPlane--}
```
public double getFarPlane()
```


Gets the far plane of the camera, default value is 1000.

**Returns:**
double
### getFieldOfView() {#getFieldOfView--}
```
public double getFieldOfView()
```


Gets the field of the view, default value is 45, measured in degree.

**Returns:**
double
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
### getLookAt() {#getLookAt--}
```
public Vector3 getLookAt()
```


Gets the default look at position, default value is (0, 0, 0)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getLookupPaths() {#getLookupPaths--}
```
public ArrayList<String> getLookupPaths()
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Returns:**
java.util.ArrayList<java.lang.String>
### getNearPlane() {#getNearPlane--}
```
public double getNearPlane()
```


Gets the near plane of the camera, default value is 1

**Returns:**
double
### getOrientationBox() {#getOrientationBox--}
```
public boolean getOrientationBox()
```


Display a orientation box. Default value is true.

**Returns:**
boolean
### getShowGrid() {#getShowGrid--}
```
public boolean getShowGrid()
```


Display a grid in the scene. Default value is true.

**Returns:**
boolean
### getShowRulers() {#getShowRulers--}
```
public boolean getShowRulers()
```


Display rulers of x/y/z axes in the scene to measure the model. Default value is false.

**Returns:**
boolean
### getShowUI() {#getShowUI--}
```
public boolean getShowUI()
```


Display a simple UI in the scene. Default value is true.

**Returns:**
boolean
### getUpVector() {#getUpVector--}
```
public String getUpVector()
```


Gets the up vector, value can be "x"/"y"/"z", default value is "y"

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




### setCameraPosition(Vector3 value) {#setCameraPosition-com.aspose.threed.Vector3-}
```
public void setCameraPosition(Vector3 value)
```


Sets the initial position of the camera, default value is (10, 10, 10)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.nio.charset.Charset | New value |

### setFarPlane(double value) {#setFarPlane-double-}
```
public void setFarPlane(double value)
```


Sets the far plane of the camera, default value is 1000.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setFieldOfView(double value) {#setFieldOfView-double-}
```
public void setFieldOfView(double value)
```


Sets the field of the view, default value is 45, measured in degree.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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

### setLookAt(Vector3 value) {#setLookAt-com.aspose.threed.Vector3-}
```
public void setLookAt(Vector3 value)
```


Sets the default look at position, default value is (0, 0, 0)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setLookupPaths(ArrayList<String> value) {#setLookupPaths-java.util.ArrayList-java.lang.String--}
```
public void setLookupPaths(ArrayList<String> value)
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.ArrayList<java.lang.String> | New value |

### setNearPlane(double value) {#setNearPlane-double-}
```
public void setNearPlane(double value)
```


Sets the near plane of the camera, default value is 1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setOrientationBox(boolean value) {#setOrientationBox-boolean-}
```
public void setOrientationBox(boolean value)
```


Display a orientation box. Default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setShowGrid(boolean value) {#setShowGrid-boolean-}
```
public void setShowGrid(boolean value)
```


Display a grid in the scene. Default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setShowRulers(boolean value) {#setShowRulers-boolean-}
```
public void setShowRulers(boolean value)
```


Display rulers of x/y/z axes in the scene to measure the model. Default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setShowUI(boolean value) {#setShowUI-boolean-}
```
public void setShowUI(boolean value)
```


Display a simple UI in the scene. Default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setUpVector(String value) {#setUpVector-java.lang.String-}
```
public void setUpVector(String value)
```


Sets the up vector, value can be "x"/"y"/"z", default value is "y"

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

