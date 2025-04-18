---
title: FileFormat
second_title: Aspose.3D for Java API Reference
description: File format definition
type: docs
weight: 62
url: /java/com.aspose.threed/fileformat/
---

**Inheritance:**
java.lang.Object
```
public class FileFormat
```

File format definition
## Fields

| Field | Description |
| --- | --- |
| [AMF](#AMF) | Additive manufacturing file format |
| [ASE](#ASE) | 3D Studio Max's ASCII Scene Exporter format. |
| [ASPOSE3D_WEB](#ASPOSE3D-WEB) | Aspose.3D Web format. |
| [BLENDER](#BLENDER) | Blender's 3D file format |
| [COLLADA](#COLLADA) | Collada file format |
| [DISCREET3DS](#DISCREET3DS) | 3D Studio's file format |
| [DRACO](#DRACO) | Google Draco Mesh |
| [DXF](#DXF) | AutoCAD DXF |
| [FBX6100ASCII](#FBX6100ASCII) | ASCII FBX file format, with 6.1.0 version |
| [FBX6100_BINARY](#FBX6100-BINARY) | Binary FBX file format, with 6.1.0 version |
| [FBX7200ASCII](#FBX7200ASCII) | ASCII FBX file format, with 7.2.0 version |
| [FBX7200_BINARY](#FBX7200-BINARY) | Binary FBX file format, with 7.2.0 version |
| [FBX7300ASCII](#FBX7300ASCII) | ASCII FBX file format, with 7.3.0 version |
| [FBX7300_BINARY](#FBX7300-BINARY) | Binary FBX file format, with 7.3.0 version |
| [FBX7400ASCII](#FBX7400ASCII) | ASCII FBX file format, with 7.4.0 version |
| [FBX7400_BINARY](#FBX7400-BINARY) | Binary FBX file format, with 7.4.0 version |
| [FBX7500ASCII](#FBX7500ASCII) | ASCII FBX file format, with 7.5.0 version |
| [FBX7500_BINARY](#FBX7500-BINARY) | Binary FBX file format, with 7.5.0 version |
| [FBX7600ASCII](#FBX7600ASCII) | ASCII FBX file format, with 7.6.0 version |
| [FBX7600_BINARY](#FBX7600-BINARY) | Binary FBX file format, with 7.6.0 version |
| [FBX7700ASCII](#FBX7700ASCII) | ASCII FBX file format, with 7.7.0 version |
| [FBX7700_BINARY](#FBX7700-BINARY) | Binary FBX file format, with 7.7.0 version |
| [GLTF](#GLTF) | Khronos Group's glTF |
| [GLTF2](#GLTF2) | Khronos Group's glTF version 2.0 |
| [GLTF2_BINARY](#GLTF2-BINARY) | Khronos Group's glTF version 2.0 |
| [GLTF_BINARY](#GLTF-BINARY) | Khronos Group's glTF in Binary format |
| [HTML5](#HTML5) | HTML5 File |
| [IFC](#IFC) | ISO 16739-1 Industry Foundation Classes data model. |
| [MAYAASCII](#MAYAASCII) | Autodesk Maya in ASCII format |
| [MAYA_BINARY](#MAYA-BINARY) | Autodesk Maya in Binary format |
| [MICROSOFT3MF](#MICROSOFT3MF) | Microsoft 3D Manufacturing Format |
| [PCD](#PCD) | PCL Point Cloud Data file in ASCII mode |
| [PCD_BINARY](#PCD-BINARY) | PCL Point Cloud Data file in Binary mode |
| [PDF](#PDF) | Adobe's Portable Document Format |
| [PLY](#PLY) | Polygon File Format or Stanford Triangle Format |
| [RVM_BINARY](#RVM-BINARY) | AVEVA Plant Design Management System Model in binary format |
| [RVM_TEXT](#RVM-TEXT) | AVEVA Plant Design Management System Model in text format |
| [SIEMENSJT8](#SIEMENSJT8) | Siemens JT File Version 8 |
| [SIEMENSJT9](#SIEMENSJT9) | Siemens JT File Version 9 |
| [STLASCII](#STLASCII) | ASCII STL file format |
| [STL_BINARY](#STL-BINARY) | Binary STL file format |
| [UNIVERSAL3D](#UNIVERSAL3D) | Universal3D file format |
| [USD](#USD) | Universal Scene Description |
| [USDA](#USDA) | Universal Scene Description in ASCII format. |
| [USDZ](#USDZ) | Compressed Universal Scene Description |
| [VRML](#VRML) | The Virtual Reality Modeling Language |
| [WAVEFRONTOBJ](#WAVEFRONTOBJ) | Wavefront's Obj file format |
| [XYZ](#XYZ) | Xyz point cloud file |
| [X_BINARY](#X-BINARY) | DirectX X File in binary format |
| [X_TEXT](#X-TEXT) | DirectX X File in binary format |
| [ZIP](#ZIP) | Zip archive that contains other 3d file format. |
## Methods

| Method | Description |
| --- | --- |
| [createLoadOptions()](#createLoadOptions--) | Create a default load options for this file format |
| [createSaveOptions()](#createSaveOptions--) | Create a default save options for this file format |
| [detect(Stream stream, String fileName)](#detect-com.aspose.threed.Stream-java.lang.String-) | Detect the file format from data stream, file name is optional for guessing types that has no magic header. |
| [detect(String fileName)](#detect-java.lang.String-) | Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCanExport()](#getCanExport--) | Gets whether Aspose.3D supports export scene to current file format. |
| [getCanImport()](#getCanImport--) | Gets whether Aspose.3D supports import scene from current file format. |
| [getClass()](#getClass--) |  |
| [getContentType()](#getContentType--) | Gets file format content type |
| [getExtension()](#getExtension--) | Gets the extension name of this type. |
| [getExtensions()](#getExtensions--) | Gets the extension names of this type. |
| [getFileFormatType()](#getFileFormatType--) | Gets file format type |
| [getFormatByExtension(String extensionName)](#getFormatByExtension-java.lang.String-) | Gets the preferred file format from the file extension name The extension name should starts with a dot('.'). |
| [getFormats()](#getFormats--) | Access to all supported formats |
| [getVersion()](#getVersion--) | Gets file format version |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | Formats to string |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AMF {#AMF}
```
public static final FileFormat AMF
```


Additive manufacturing file format

### ASE {#ASE}
```
public static final FileFormat ASE
```


3D Studio Max's ASCII Scene Exporter format.

### ASPOSE3D_WEB {#ASPOSE3D-WEB}
```
public static final FileFormat ASPOSE3D_WEB
```


Aspose.3D Web format.

### BLENDER {#BLENDER}
```
public static final FileFormat BLENDER
```


Blender's 3D file format

### COLLADA {#COLLADA}
```
public static final FileFormat COLLADA
```


Collada file format

### DISCREET3DS {#DISCREET3DS}
```
public static final FileFormat DISCREET3DS
```


3D Studio's file format

### DRACO {#DRACO}
```
public static final DracoFormat DRACO
```


Google Draco Mesh

### DXF {#DXF}
```
public static final FileFormat DXF
```


AutoCAD DXF

### FBX6100ASCII {#FBX6100ASCII}
```
public static final FileFormat FBX6100ASCII
```


ASCII FBX file format, with 6.1.0 version

### FBX6100_BINARY {#FBX6100-BINARY}
```
public static final FileFormat FBX6100_BINARY
```


Binary FBX file format, with 6.1.0 version

### FBX7200ASCII {#FBX7200ASCII}
```
public static final FileFormat FBX7200ASCII
```


ASCII FBX file format, with 7.2.0 version

### FBX7200_BINARY {#FBX7200-BINARY}
```
public static final FileFormat FBX7200_BINARY
```


Binary FBX file format, with 7.2.0 version

### FBX7300ASCII {#FBX7300ASCII}
```
public static final FileFormat FBX7300ASCII
```


ASCII FBX file format, with 7.3.0 version

### FBX7300_BINARY {#FBX7300-BINARY}
```
public static final FileFormat FBX7300_BINARY
```


Binary FBX file format, with 7.3.0 version

### FBX7400ASCII {#FBX7400ASCII}
```
public static final FileFormat FBX7400ASCII
```


ASCII FBX file format, with 7.4.0 version

### FBX7400_BINARY {#FBX7400-BINARY}
```
public static final FileFormat FBX7400_BINARY
```


Binary FBX file format, with 7.4.0 version

### FBX7500ASCII {#FBX7500ASCII}
```
public static final FileFormat FBX7500ASCII
```


ASCII FBX file format, with 7.5.0 version

### FBX7500_BINARY {#FBX7500-BINARY}
```
public static final FileFormat FBX7500_BINARY
```


Binary FBX file format, with 7.5.0 version

### FBX7600ASCII {#FBX7600ASCII}
```
public static final FileFormat FBX7600ASCII
```


ASCII FBX file format, with 7.6.0 version

### FBX7600_BINARY {#FBX7600-BINARY}
```
public static final FileFormat FBX7600_BINARY
```


Binary FBX file format, with 7.6.0 version

### FBX7700ASCII {#FBX7700ASCII}
```
public static final FileFormat FBX7700ASCII
```


ASCII FBX file format, with 7.7.0 version

### FBX7700_BINARY {#FBX7700-BINARY}
```
public static final FileFormat FBX7700_BINARY
```


Binary FBX file format, with 7.7.0 version

### GLTF {#GLTF}
```
public static final FileFormat GLTF
```


Khronos Group's glTF

### GLTF2 {#GLTF2}
```
public static final FileFormat GLTF2
```


Khronos Group's glTF version 2.0

### GLTF2_BINARY {#GLTF2-BINARY}
```
public static final FileFormat GLTF2_BINARY
```


Khronos Group's glTF version 2.0

### GLTF_BINARY {#GLTF-BINARY}
```
public static final FileFormat GLTF_BINARY
```


Khronos Group's glTF in Binary format

### HTML5 {#HTML5}
```
public static final FileFormat HTML5
```


HTML5 File

### IFC {#IFC}
```
public static final FileFormat IFC
```


ISO 16739-1 Industry Foundation Classes data model.

### MAYAASCII {#MAYAASCII}
```
public static final FileFormat MAYAASCII
```


Autodesk Maya in ASCII format

### MAYA_BINARY {#MAYA-BINARY}
```
public static final FileFormat MAYA_BINARY
```


Autodesk Maya in Binary format

### MICROSOFT3MF {#MICROSOFT3MF}
```
public static final Microsoft3MFFormat MICROSOFT3MF
```


Microsoft 3D Manufacturing Format

### PCD {#PCD}
```
public static final FileFormat PCD
```


PCL Point Cloud Data file in ASCII mode

### PCD_BINARY {#PCD-BINARY}
```
public static final FileFormat PCD_BINARY
```


PCL Point Cloud Data file in Binary mode

### PDF {#PDF}
```
public static final PdfFormat PDF
```


Adobe's Portable Document Format

### PLY {#PLY}
```
public static final PlyFormat PLY
```


Polygon File Format or Stanford Triangle Format

### RVM_BINARY {#RVM-BINARY}
```
public static final RvmFormat RVM_BINARY
```


AVEVA Plant Design Management System Model in binary format

### RVM_TEXT {#RVM-TEXT}
```
public static final RvmFormat RVM_TEXT
```


AVEVA Plant Design Management System Model in text format

### SIEMENSJT8 {#SIEMENSJT8}
```
public static final FileFormat SIEMENSJT8
```


Siemens JT File Version 8

### SIEMENSJT9 {#SIEMENSJT9}
```
public static final FileFormat SIEMENSJT9
```


Siemens JT File Version 9

### STLASCII {#STLASCII}
```
public static final FileFormat STLASCII
```


ASCII STL file format

### STL_BINARY {#STL-BINARY}
```
public static final FileFormat STL_BINARY
```


Binary STL file format

### UNIVERSAL3D {#UNIVERSAL3D}
```
public static final FileFormat UNIVERSAL3D
```


Universal3D file format

### USD {#USD}
```
public static final FileFormat USD
```


Universal Scene Description

### USDA {#USDA}
```
public static final FileFormat USDA
```


Universal Scene Description in ASCII format.

### USDZ {#USDZ}
```
public static final FileFormat USDZ
```


Compressed Universal Scene Description

### VRML {#VRML}
```
public static final FileFormat VRML
```


The Virtual Reality Modeling Language

### WAVEFRONTOBJ {#WAVEFRONTOBJ}
```
public static final FileFormat WAVEFRONTOBJ
```


Wavefront's Obj file format

### XYZ {#XYZ}
```
public static final FileFormat XYZ
```


Xyz point cloud file

### X_BINARY {#X-BINARY}
```
public static final FileFormat X_BINARY
```


DirectX X File in binary format

### X_TEXT {#X-TEXT}
```
public static final FileFormat X_TEXT
```


DirectX X File in binary format

### ZIP {#ZIP}
```
public static final FileFormat ZIP
```


Zip archive that contains other 3d file format.

### createLoadOptions() {#createLoadOptions--}
```
public LoadOptions createLoadOptions()
```


Create a default load options for this file format

**Returns:**
[LoadOptions](../../com.aspose.threed/loadoptions) - A default load option for current format
### createSaveOptions() {#createSaveOptions--}
```
public SaveOptions createSaveOptions()
```


Create a default save options for this file format

**Returns:**
[SaveOptions](../../com.aspose.threed/saveoptions) - A default save option for current format
### detect(Stream stream, String fileName) {#detect-com.aspose.threed.Stream-java.lang.String-}
```
public static FileFormat detect(Stream stream, String fileName)
```


Detect the file format from data stream, file name is optional for guessing types that has no magic header.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Stream containing data to detect |
| fileName | java.lang.String | Original file name of the data, used as hint. |

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat) - The [FileFormat](../../com.aspose.threed/fileformat) instance of the detected type or null if failed.
### detect(String fileName) {#detect-java.lang.String-}
```
public static FileFormat detect(String fileName)
```


Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | Path to the file to detect file format. |

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat) - The [FileFormat](../../com.aspose.threed/fileformat) instance of the detected type or null if failed.
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
### getCanExport() {#getCanExport--}
```
public boolean getCanExport()
```


Gets whether Aspose.3D supports export scene to current file format.

**Returns:**
boolean - whether Aspose.3D supports export scene to current file format. **Example:** The following code shows how to check if exporting to specified format is supported.

```
var outputFormat = ".glb";
     var format = FileFormat.getFormatByExtension(outputFormat);
     if (format.getCanExport())
         System.out.printf("Can export to %s", outputFormat);
```
### getCanImport() {#getCanImport--}
```
public boolean getCanImport()
```


Gets whether Aspose.3D supports import scene from current file format.

**Returns:**
boolean - whether Aspose.3D supports import scene from current file format. **Example:** The following code shows how to check if importing from specified format is supported.

```
var outputFormat = ".glb";
     var format = FileFormat.getFormatByExtension(outputFormat);
     if (format.getCanImport())
         System.out.printf("Can import from %s", outputFormat);
```
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getContentType() {#getContentType--}
```
public FileContentType getContentType()
```


Gets file format content type

**Returns:**
[FileContentType](../../com.aspose.threed/filecontenttype) - file format content type **Example:**

```
var format = FileFormat.MAYA_BINARY;
     if (format.getContentType() == FileContentType.BINARY)
         System.out.printf("%s is binary format", format);
     else
         System.out.printf("%s is text-based format", format);
```
### getExtension() {#getExtension--}
```
public String getExtension()
```


Gets the extension name of this type.

**Returns:**
java.lang.String - the extension name of this type. **Example:**

```
var format = FileFormat.MAYA_BINARY;
     System.out.printf("Extension of %s is %s", format, format.getExtension());
```
### getExtensions() {#getExtensions--}
```
public String[] getExtensions()
```


Gets the extension names of this type.

**Returns:**
java.lang.String[] - the extension names of this type.
### getFileFormatType() {#getFileFormatType--}
```
public FileFormatType getFileFormatType()
```


Gets file format type

**Returns:**
[FileFormatType](../../com.aspose.threed/fileformattype) - file format type
### getFormatByExtension(String extensionName) {#getFormatByExtension-java.lang.String-}
```
public static FileFormat getFormatByExtension(String extensionName)
```


Gets the preferred file format from the file extension name The extension name should starts with a dot('.').

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| extensionName | java.lang.String | The extension name started with '.' to query. |

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat) - Instance of [FileFormat](../../com.aspose.threed/fileformat), otherwise null returned. **Example:** The following code shows how to save scene to memory using specified format

```
Scene scene = new Scene(new Box());
     var outputFormat = ".glb";
     var format = FileFormat.getFormatByExtension(outputFormat);
     var output = new ByteArrayOutputStream();
     scene.save(output);
```
### getFormats() {#getFormats--}
```
public static List<FileFormat> getFormats()
```


Access to all supported formats

**Returns:**
java.util.List<com.aspose.threed.FileFormat> - Access to all supported formats
### getVersion() {#getVersion--}
```
public Version getVersion()
```


Gets file format version

**Returns:**
[Version](../../com.aspose.threed/version) - file format version
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




### toString() {#toString--}
```
public String toString()
```


Formats to string

**Returns:**
java.lang.String - Object string
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

