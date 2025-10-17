---
title: RvmLoadOptions
second_title: Aspose.3D for Java API Reference
description: Load options for AVEVA Plant Design Management Systems RVM file.
type: docs
weight: 157
url: /java/com.aspose.threed/rvmloadoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.LoadOptions](../../com.aspose.threed/loadoptions)
```
public class RvmLoadOptions extends LoadOptions
```

Load options for AVEVA Plant Design Management System's RVM file. **Example:** The following code shows how to customize the tessellation parameters for primitive geometries imported from RVM file using RvmLoadOptions.

```
RvmLoadOptions opt = new RvmLoadOptions();
             opt.setRectangularTorusSegments(30);
             opt.setCylinderRadialSegments(20);
             opt.setDishLatitudeSegments(20);
             opt.setDishLongitudeSegments(20);
             opt.setCenterScene(true);
             var scene = Scene.fromFile("input.rvm", opt);
             scene.save("output.obj");
```
## Constructors

| Constructor | Description |
| --- | --- |
| [RvmLoadOptions(FileContentType contentType)](#RvmLoadOptions-com.aspose.threed.FileContentType-) | Construct a [RvmLoadOptions](../../com.aspose.threed/rvmloadoptions) instance |
| [RvmLoadOptions()](#RvmLoadOptions--) | Construct a [RvmLoadOptions](../../com.aspose.threed/rvmloadoptions) instance |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAttributePrefix()](#getAttributePrefix--) | Gets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:" |
| [getCenterScene()](#getCenterScene--) | Center the scene after it's loaded. |
| [getClass()](#getClass--) |  |
| [getCylinderRadialSegments()](#getCylinderRadialSegments--) | Gets the number of cylinder's radial segments, default value is 16 |
| [getDishLatitudeSegments()](#getDishLatitudeSegments--) | Gets the number of dish' latitude segments, default value is 8 |
| [getDishLongitudeSegments()](#getDishLongitudeSegments--) | Gets the number of dish' longitude segments, default value is 12 |
| [getEncoding()](#getEncoding--) | Gets the default encoding for text-based files. |
| [getFileFormat()](#getFileFormat--) | Gets the file format that specified in current Save/Load option. |
| [getFileName()](#getFileName--) | The file name of the exporting/importing scene. |
| [getFileSystem()](#getFileSystem--) | Allow user to handle how to manage the external dependencies during load/save. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Gets the factory class for FileSystem. |
| [getGenerateMaterials()](#getGenerateMaterials--) | Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. |
| [getLookupAttributes()](#getLookupAttributes--) | Gets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true. |
| [getLookupPaths()](#getLookupPaths--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [getRectangularTorusSegments()](#getRectangularTorusSegments--) | Gets the number of rectangular torus' radial segments, default value is 20 |
| [getTorusTubularSegments()](#getTorusTubularSegments--) | Gets the number of torus' tubular segments, default value is 20 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAttributePrefix(String value)](#setAttributePrefix-java.lang.String-) | Sets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:" |
| [setCenterScene(boolean value)](#setCenterScene-boolean-) | Center the scene after it's loaded. |
| [setCylinderRadialSegments(int value)](#setCylinderRadialSegments-int-) | Sets the number of cylinder's radial segments, default value is 16 |
| [setDishLatitudeSegments(int value)](#setDishLatitudeSegments-int-) | Sets the number of dish' latitude segments, default value is 8 |
| [setDishLongitudeSegments(int value)](#setDishLongitudeSegments-int-) | Sets the number of dish' longitude segments, default value is 12 |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Sets the default encoding for text-based files. |
| [setFileName(String value)](#setFileName-java.lang.String-) | The file name of the exporting/importing scene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Allow user to handle how to manage the external dependencies during load/save. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Sets the factory class for FileSystem. |
| [setGenerateMaterials(boolean value)](#setGenerateMaterials-boolean-) | Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. |
| [setLookupAttributes(boolean value)](#setLookupAttributes-boolean-) | Sets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [setRectangularTorusSegments(int value)](#setRectangularTorusSegments-int-) | Sets the number of rectangular torus' radial segments, default value is 20 |
| [setTorusTubularSegments(int value)](#setTorusTubularSegments-int-) | Sets the number of torus' tubular segments, default value is 20 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RvmLoadOptions(FileContentType contentType) {#RvmLoadOptions-com.aspose.threed.FileContentType-}
```
public RvmLoadOptions(FileContentType contentType)
```


Construct a [RvmLoadOptions](../../com.aspose.threed/rvmloadoptions) instance

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

### RvmLoadOptions() {#RvmLoadOptions--}
```
public RvmLoadOptions()
```


Construct a [RvmLoadOptions](../../com.aspose.threed/rvmloadoptions) instance

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
### getAttributePrefix() {#getAttributePrefix--}
```
public String getAttributePrefix()
```


Gets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:"

**Returns:**
java.lang.String - the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:"
### getCenterScene() {#getCenterScene--}
```
public boolean getCenterScene()
```


Center the scene after it's loaded.

**Returns:**
boolean - Center the scene after it's loaded.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCylinderRadialSegments() {#getCylinderRadialSegments--}
```
public int getCylinderRadialSegments()
```


Gets the number of cylinder's radial segments, default value is 16

**Returns:**
int - the number of cylinder's radial segments, default value is 16
### getDishLatitudeSegments() {#getDishLatitudeSegments--}
```
public int getDishLatitudeSegments()
```


Gets the number of dish' latitude segments, default value is 8

**Returns:**
int - the number of dish' latitude segments, default value is 8
### getDishLongitudeSegments() {#getDishLongitudeSegments--}
```
public int getDishLongitudeSegments()
```


Gets the number of dish' longitude segments, default value is 12

**Returns:**
int - the number of dish' longitude segments, default value is 12
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Gets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Returns:**
java.nio.charset.Charset - the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.
### getFileFormat() {#getFileFormat--}
```
public FileFormat getFileFormat()
```


Gets the file format that specified in current Save/Load option.

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat) - the file format that specified in current Save/Load option.
### getFileName() {#getFileName--}
```
public String getFileName()
```


The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.

**Returns:**
java.lang.String - The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.
### getFileSystem() {#getFileSystem--}
```
public FileSystem getFileSystem()
```


Allow user to handle how to manage the external dependencies during load/save.

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem) - Allow user to handle how to manage the external dependencies during load/save. **Example:** The default FileSystem is LocalFileSystem, it is not safe in environment like server side, But you can override the file system access by specifying a different implementation. Aspose.3D provides different FileSystem implementation like:

 *  Memory-based file system
 *  Directory-based file system
 *  Dummy file system
 *  Zip file system

And you can also use your own implementation.

```
Scene scene = new Scene();
             var material = new PhongMaterial();
             var boxNode = scene.getRootNode().createChildNode(new Box());
             boxNode.setMaterial(material);
 
             var opt = new ObjSaveOptions();
             var memFs = new HashMap<string, MemoryStream>();
             opt.setFileSystem(FileSystem.createMemoryFileSystem(memFs));
 			opt.setFileName("output.obj");
             try(var output = new ByteArrayOutputStream()) {
 				scene.save(output, opt);
 				//The material will be written to variable memFs named output.mtl
 				var materialInBytes = memFs["output.mtl"].toArray();
             }
```
### getFileSystemFactory() {#getFileSystemFactory--}
```
public static FileSystemFactory getFileSystemFactory()
```


Gets the factory class for FileSystem. The default factory will create com.aspose.threed.LocalFileSystem which is not suitable for server environment.

**Returns:**
[FileSystemFactory](../../com.aspose.threed/filesystemfactory) - the factory class for FileSystem. The default factory will create com.aspose.threed.LocalFileSystem which is not suitable for server environment. **Example:** The default FileSystem in SaveOptions/LoadOptions is directory-based file system, You can override the default implementation by specify it through IOConfig.FileSystemFactory:

```
IOConfig.setFileSystemFactory(new FileSystemFactory() {
 				@Override
 				public FileSystem call() {
 					return FileSystem.createDummyFileSystem();
 				}
 			});
 
             Scene scene = new Scene();
             var material = new PhongMaterial();
             var boxNode = scene.getRootNode().createChildNode(new Box());
             boxNode.setMaterial(material);
 
             //opt.FileSystem would be dummy file system now
             var opt = new ObjSaveOptions();
             scene.Save("output.obj", opt);
             //the material file output.mtl will not be written to any places because we've configured a dummy file system as default implementation.
```
### getGenerateMaterials() {#getGenerateMaterials--}
```
public boolean getGenerateMaterials()
```


Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. Default value is true

**Returns:**
boolean - Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. Default value is true
### getLookupAttributes() {#getLookupAttributes--}
```
public boolean getLookupAttributes()
```


Gets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true.

**Returns:**
boolean - whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true.
### getLookupPaths() {#getLookupPaths--}
```
public ArrayList<String> getLookupPaths()
```


Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.

**Returns:**
java.util.ArrayList<java.lang.String> - Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. **Example:** The following code shows how to manually specify the look up textures, so the importer can find

```
var opt = new ObjLoadOptions();
             //Specify the lookup paths, so the textures can be located.
             opt.getLookupPaths().add("textures");
             var scene = Scene.fromFile("input.obj", opt);
             scene.save("output.glb");
```
### getRectangularTorusSegments() {#getRectangularTorusSegments--}
```
public int getRectangularTorusSegments()
```


Gets the number of rectangular torus' radial segments, default value is 20

**Returns:**
int - the number of rectangular torus' radial segments, default value is 20
### getTorusTubularSegments() {#getTorusTubularSegments--}
```
public int getTorusTubularSegments()
```


Gets the number of torus' tubular segments, default value is 20

**Returns:**
int - the number of torus' tubular segments, default value is 20
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




### setAttributePrefix(String value) {#setAttributePrefix-java.lang.String-}
```
public void setAttributePrefix(String value)
```


Sets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setCenterScene(boolean value) {#setCenterScene-boolean-}
```
public void setCenterScene(boolean value)
```


Center the scene after it's loaded.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setCylinderRadialSegments(int value) {#setCylinderRadialSegments-int-}
```
public void setCylinderRadialSegments(int value)
```


Sets the number of cylinder's radial segments, default value is 16

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setDishLatitudeSegments(int value) {#setDishLatitudeSegments-int-}
```
public void setDishLatitudeSegments(int value)
```


Sets the number of dish' latitude segments, default value is 8

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setDishLongitudeSegments(int value) {#setDishLongitudeSegments-int-}
```
public void setDishLongitudeSegments(int value)
```


Sets the number of dish' longitude segments, default value is 12

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setEncoding(Charset value) {#setEncoding-java.nio.charset.Charset-}
```
public void setEncoding(Charset value)
```


Sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.nio.charset.Charset | New value |

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
| value | [FileSystem](../../com.aspose.threed/filesystem) | New value **Example:** The default FileSystem is LocalFileSystem, it is not safe in environment like server side, But you can override the file system access by specifying a different implementation. Aspose.3D provides different FileSystem implementation like:

 *  Memory-based file system
 *  Directory-based file system
 *  Dummy file system
 *  Zip file system

And you can also use your own implementation.

```
Scene scene = new Scene();
             var material = new PhongMaterial();
             var boxNode = scene.getRootNode().createChildNode(new Box());
             boxNode.setMaterial(material);
 
             var opt = new ObjSaveOptions();
             var memFs = new HashMap<string, MemoryStream>();
             opt.setFileSystem(FileSystem.createMemoryFileSystem(memFs));
 			opt.setFileName("output.obj");
             try(var output = new ByteArrayOutputStream()) {
 				scene.save(output, opt);
 				//The material will be written to variable memFs named output.mtl
 				var materialInBytes = memFs["output.mtl"].toArray();
             }
``` |

### setFileSystemFactory(FileSystemFactory value) {#setFileSystemFactory-com.aspose.threed.FileSystemFactory-}
```
public static void setFileSystemFactory(FileSystemFactory value)
```


Sets the factory class for FileSystem. The default factory will create com.aspose.threed.LocalFileSystem which is not suitable for server environment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FileSystemFactory](../../com.aspose.threed/filesystemfactory) | New value **Example:** The default FileSystem in SaveOptions/LoadOptions is directory-based file system, You can override the default implementation by specify it through IOConfig.FileSystemFactory:

```
IOConfig.setFileSystemFactory(new FileSystemFactory() {
 				@Override
 				public FileSystem call() {
 					return FileSystem.createDummyFileSystem();
 				}
 			});
 
             Scene scene = new Scene();
             var material = new PhongMaterial();
             var boxNode = scene.getRootNode().createChildNode(new Box());
             boxNode.setMaterial(material);
 
             //opt.FileSystem would be dummy file system now
             var opt = new ObjSaveOptions();
             scene.Save("output.obj", opt);
             //the material file output.mtl will not be written to any places because we've configured a dummy file system as default implementation.
``` |

### setGenerateMaterials(boolean value) {#setGenerateMaterials-boolean-}
```
public void setGenerateMaterials(boolean value)
```


Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. Default value is true

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setLookupAttributes(boolean value) {#setLookupAttributes-boolean-}
```
public void setLookupAttributes(boolean value)
```


Sets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true.

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
| value | java.util.ArrayList<java.lang.String> | New value **Example:** The following code shows how to manually specify the look up textures, so the importer can find

```
var opt = new ObjLoadOptions();
             //Specify the lookup paths, so the textures can be located.
             opt.getLookupPaths().add("textures");
             var scene = Scene.fromFile("input.obj", opt);
             scene.save("output.glb");
``` |

### setRectangularTorusSegments(int value) {#setRectangularTorusSegments-int-}
```
public void setRectangularTorusSegments(int value)
```


Sets the number of rectangular torus' radial segments, default value is 20

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setTorusTubularSegments(int value) {#setTorusTubularSegments-int-}
```
public void setTorusTubularSegments(int value)
```


Sets the number of torus' tubular segments, default value is 20

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

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

