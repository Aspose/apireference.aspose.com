---
title: FbxSaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for Fbx file.
type: docs
weight: 63
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
| [FbxSaveOptions(FileFormat format)](#FbxSaveOptions-com.aspose.threed.FileFormat-) | Initializes a [FbxSaveOptions](../../com.aspose.threed/fbxsaveoptions) |
| [FbxSaveOptions(FileContentType contentType)](#FbxSaveOptions-com.aspose.threed.FileContentType-) | Initialize a [FbxSaveOptions](../../com.aspose.threed/fbxsaveoptions) using latest supported version. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEmbedTextures()](#getEmbedTextures--) | Gets whether to embed the texture to the final output file. |
| [getEnableCompression()](#getEnableCompression--) | Compression large binary data in the FBX file(e.g. |
| [getEncoding()](#getEncoding--) | Gets the default encoding for text-based files. |
| [getExportLegacyMaterialProperties()](#getExportLegacyMaterialProperties--) | Gets whether export legacy material properties, used for back compatibility. |
| [getExportTextures()](#getExportTextures--) | Try to copy textures used in scene to output directory. |
| [getFileFormat()](#getFileFormat--) | Gets the file format that specified in current Save/Load option. |
| [getFileName()](#getFileName--) | The file name of the exporting/importing scene. |
| [getFileSystem()](#getFileSystem--) | Allow user to handle how to manage the external dependencies during load/save. |
| [getFileSystemFactory()](#getFileSystemFactory--) | Gets the factory class for FileSystem. |
| [getFoldRepeatedCurveData()](#getFoldRepeatedCurveData--) | Gets whether reuse repeated curve data by increasing last data's ref count |
| [getGenerateVertexElementMaterial()](#getGenerateVertexElementMaterial--) | Gets whether always generate a [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) for geometries if the attached node contains materials. |
| [getLookupPaths()](#getLookupPaths--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [getReusePrimitiveMesh()](#getReusePrimitiveMesh--) | Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). |
| [getVideoForTexture()](#getVideoForTexture--) | Gets whether generate a Video instance for [Texture](../../com.aspose.threed/texture) when exporting as FBX. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEmbedTextures(boolean value)](#setEmbedTextures-boolean-) | Sets whether to embed the texture to the final output file. |
| [setEnableCompression(boolean value)](#setEnableCompression-boolean-) | Compression large binary data in the FBX file(e.g. |
| [setEncoding(Charset value)](#setEncoding-java.nio.charset.Charset-) | Sets the default encoding for text-based files. |
| [setExportLegacyMaterialProperties(boolean value)](#setExportLegacyMaterialProperties-boolean-) | Sets whether export legacy material properties, used for back compatibility. |
| [setExportTextures(boolean value)](#setExportTextures-boolean-) | Try to copy textures used in scene to output directory. |
| [setFileName(String value)](#setFileName-java.lang.String-) | The file name of the exporting/importing scene. |
| [setFileSystem(FileSystem value)](#setFileSystem-com.aspose.threed.FileSystem-) | Allow user to handle how to manage the external dependencies during load/save. |
| [setFileSystemFactory(FileSystemFactory value)](#setFileSystemFactory-com.aspose.threed.FileSystemFactory-) | Sets the factory class for FileSystem. |
| [setFoldRepeatedCurveData(Boolean value)](#setFoldRepeatedCurveData-java.lang.Boolean-) | Sets whether reuse repeated curve data by increasing last data's ref count |
| [setGenerateVertexElementMaterial(boolean value)](#setGenerateVertexElementMaterial-boolean-) | Sets whether always generate a [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) for geometries if the attached node contains materials. |
| [setLookupPaths(ArrayList<String> value)](#setLookupPaths-java.util.ArrayList-java.lang.String--) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [setReusePrimitiveMesh(boolean value)](#setReusePrimitiveMesh-boolean-) | Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). |
| [setVideoForTexture(boolean value)](#setVideoForTexture-boolean-) | Sets whether generate a Video instance for [Texture](../../com.aspose.threed/texture) when exporting as FBX. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FbxSaveOptions(FileFormat format) {#FbxSaveOptions-com.aspose.threed.FileFormat-}
```
public FbxSaveOptions(FileFormat format)
```


Initializes a [FbxSaveOptions](../../com.aspose.threed/fbxsaveoptions)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Instance of [getFileFormat](../../com.aspose.threed/fbxsaveoptions\#getFileFormat), it should be a valid FBX format. |

### FbxSaveOptions(FileContentType contentType) {#FbxSaveOptions-com.aspose.threed.FileContentType-}
```
public FbxSaveOptions(FileContentType contentType)
```


Initialize a [FbxSaveOptions](../../com.aspose.threed/fbxsaveoptions) using latest supported version.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) | Binary or ASCII |

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
### getEmbedTextures() {#getEmbedTextures--}
```
public boolean getEmbedTextures()
```


Gets whether to embed the texture to the final output file. FBX Exporter will try to find the texture's raw data from [IOConfig.getFileSystem](../../com.aspose.threed/ioconfig\#getFileSystem), and embed the file to final FBX file. Default value is false.

**Returns:**
boolean - whether to embed the texture to the final output file. FBX Exporter will try to find the texture's raw data from [IOConfig.getFileSystem](../../com.aspose.threed/ioconfig\#getFileSystem), and embed the file to final FBX file. Default value is false.
### getEnableCompression() {#getEnableCompression--}
```
public boolean getEnableCompression()
```


Compression large binary data in the FBX file(e.g. animation data, control points, vertex element data, indices), default value is true.

**Returns:**
boolean - Compression large binary data in the FBX file(e.g. animation data, control points, vertex element data, indices), default value is true.
### getEncoding() {#getEncoding--}
```
public Charset getEncoding()
```


Gets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.

**Returns:**
java.nio.charset.Charset - the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.
### getExportLegacyMaterialProperties() {#getExportLegacyMaterialProperties--}
```
public boolean getExportLegacyMaterialProperties()
```


Gets whether export legacy material properties, used for back compatibility. This option is turned on by default.

**Returns:**
boolean - whether export legacy material properties, used for back compatibility. This option is turned on by default.
### getExportTextures() {#getExportTextures--}
```
public boolean getExportTextures()
```


Try to copy textures used in scene to output directory.

**Returns:**
boolean - Try to copy textures used in scene to output directory.
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
### getFoldRepeatedCurveData() {#getFoldRepeatedCurveData--}
```
public Boolean getFoldRepeatedCurveData()
```


Gets whether reuse repeated curve data by increasing last data's ref count

**Returns:**
java.lang.Boolean - whether reuse repeated curve data by increasing last data's ref count
### getGenerateVertexElementMaterial() {#getGenerateVertexElementMaterial--}
```
public boolean getGenerateVertexElementMaterial()
```


Gets whether always generate a [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) for geometries if the attached node contains materials. This is turned off by default.

**Returns:**
boolean - whether always generate a [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) for geometries if the attached node contains materials. This is turned off by default.
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
### getReusePrimitiveMesh() {#getReusePrimitiveMesh--}
```
public boolean getReusePrimitiveMesh()
```


Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). Default value is false

**Returns:**
boolean - Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). Default value is false
### getVideoForTexture() {#getVideoForTexture--}
```
public boolean getVideoForTexture()
```


Gets whether generate a Video instance for [Texture](../../com.aspose.threed/texture) when exporting as FBX.

**Returns:**
boolean - whether generate a Video instance for [Texture](../../com.aspose.threed/texture) when exporting as FBX.
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




### setEmbedTextures(boolean value) {#setEmbedTextures-boolean-}
```
public void setEmbedTextures(boolean value)
```


Sets whether to embed the texture to the final output file. FBX Exporter will try to find the texture's raw data from [IOConfig.getFileSystem](../../com.aspose.threed/ioconfig\#getFileSystem), and embed the file to final FBX file. Default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setEnableCompression(boolean value) {#setEnableCompression-boolean-}
```
public void setEnableCompression(boolean value)
```


Compression large binary data in the FBX file(e.g. animation data, control points, vertex element data, indices), default value is true.

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

### setExportLegacyMaterialProperties(boolean value) {#setExportLegacyMaterialProperties-boolean-}
```
public void setExportLegacyMaterialProperties(boolean value)
```


Sets whether export legacy material properties, used for back compatibility. This option is turned on by default.

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

### setFoldRepeatedCurveData(Boolean value) {#setFoldRepeatedCurveData-java.lang.Boolean-}
```
public void setFoldRepeatedCurveData(Boolean value)
```


Sets whether reuse repeated curve data by increasing last data's ref count

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Boolean | New value |

### setGenerateVertexElementMaterial(boolean value) {#setGenerateVertexElementMaterial-boolean-}
```
public void setGenerateVertexElementMaterial(boolean value)
```


Sets whether always generate a [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial) for geometries if the attached node contains materials. This is turned off by default.

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

### setReusePrimitiveMesh(boolean value) {#setReusePrimitiveMesh-boolean-}
```
public void setReusePrimitiveMesh(boolean value)
```


Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files). Default value is false

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setVideoForTexture(boolean value) {#setVideoForTexture-boolean-}
```
public void setVideoForTexture(boolean value)
```


Sets whether generate a Video instance for [Texture](../../com.aspose.threed/texture) when exporting as FBX.

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

