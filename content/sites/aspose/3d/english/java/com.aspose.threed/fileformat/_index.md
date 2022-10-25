---
title: FileFormat
second_title: Aspose.3D for Java API Reference
description: File format definition
type: docs
weight: 61
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
| [STL_BINARY](#STL-BINARY) | Binary STL file format |
| [STLASCII](#STLASCII) | ASCII STL file format |
| [WAVEFRONTOBJ](#WAVEFRONTOBJ) | Wavefront's Obj file format |
| [DISCREET3DS](#DISCREET3DS) | 3D Studio's file format |
| [COLLADA](#COLLADA) | Collada file format |
| [UNIVERSAL3D](#UNIVERSAL3D) | Universal3D file format |
| [GLTF](#GLTF) | Khronos Group's glTF |
| [GLTF2](#GLTF2) | Khronos Group's glTF version 2.0 |
| [GLTF_BINARY](#GLTF-BINARY) | Khronos Group's glTF in Binary format |
| [GLTF2_BINARY](#GLTF2-BINARY) | Khronos Group's glTF version 2.0 |
| [PDF](#PDF) | Adobe's Portable Document Format |
| [DXF](#DXF) | AutoCAD DXF |
| [PLY](#PLY) | Polygon File Format or Stanford Triangle Format |
| [X_BINARY](#X-BINARY) | DirectX X File in binary format |
| [X_TEXT](#X-TEXT) | DirectX X File in binary format |
| [DRACO](#DRACO) | Google Draco Mesh |
| [MICROSOFT3MF](#MICROSOFT3MF) | Microsoft 3D Manufacturing Format |
| [RVM_TEXT](#RVM-TEXT) | AVEVA Plant Design Management System Model in text format |
| [RVM_BINARY](#RVM-BINARY) | AVEVA Plant Design Management System Model in binary format |
| [ASE](#ASE) | 3D Studio Max's ASCII Scene Exporter format. |
| [SIEMENSJT8](#SIEMENSJT8) | Siemens JT File Version 8 |
| [SIEMENSJT9](#SIEMENSJT9) | Siemens JT File Version 9 |
| [AMF](#AMF) | Additive manufacturing file format |
| [VRML](#VRML) | The Virtual Reality Modeling Language |
| [ASPOSE3D_WEB](#ASPOSE3D-WEB) | Aspose.3D Web format. |
| [HTML5](#HTML5) | HTML5 File |
| [ZIP](#ZIP) | Zip archive that contains other 3d file format. |
| [USD](#USD) | Universal Scene Description |
| [USDZ](#USDZ) | Compressed Universal Scene Description |
| [XYZ](#XYZ) | Xyz point cloud file |
| [PCD](#PCD) | PCL Point Cloud Data file in ASCII mode |
| [PCD_BINARY](#PCD-BINARY) | PCL Point Cloud Data file in Binary mode |
## Methods

| Method | Description |
| --- | --- |
| [getVersion()](#getVersion--) | Gets file format version |
| [getFormatByExtension(String extensionName)](#getFormatByExtension-java.lang.String-) | Gets the preferred file format from the file extension name The extension name should starts with a dot('.'). |
| [getCanExport()](#getCanExport--) | Gets whether Aspose.3D supports export scene to current file format. |
| [getCanImport()](#getCanImport--) | Gets whether Aspose.3D supports import scene from current file format. |
| [getExtension()](#getExtension--) | Gets the extension name of this type. |
| [getExtensions()](#getExtensions--) | Gets the extension names of this type. |
| [getContentType()](#getContentType--) | Gets file format content type |
| [getFileFormatType()](#getFileFormatType--) | Gets file format type |
| [detect(Stream stream, String fileName)](#detect-com.aspose.threed.Stream-java.lang.String-) | Detect the file format from data stream, file name is optional for guessing types that has no magic header. |
| [detect(String fileName)](#detect-java.lang.String-) | Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header. |
| [createLoadOptions()](#createLoadOptions--) | Create a default load options for this file format |
| [createSaveOptions()](#createSaveOptions--) | Create a default save options for this file format |
| [toString()](#toString--) | Formats to string |
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

### STL_BINARY {#STL-BINARY}
```
public static final FileFormat STL_BINARY
```


Binary STL file format

### STLASCII {#STLASCII}
```
public static final FileFormat STLASCII
```


ASCII STL file format

### WAVEFRONTOBJ {#WAVEFRONTOBJ}
```
public static final FileFormat WAVEFRONTOBJ
```


Wavefront's Obj file format

### DISCREET3DS {#DISCREET3DS}
```
public static final FileFormat DISCREET3DS
```


3D Studio's file format

### COLLADA {#COLLADA}
```
public static final FileFormat COLLADA
```


Collada file format

### UNIVERSAL3D {#UNIVERSAL3D}
```
public static final FileFormat UNIVERSAL3D
```


Universal3D file format

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

### GLTF_BINARY {#GLTF-BINARY}
```
public static final FileFormat GLTF_BINARY
```


Khronos Group's glTF in Binary format

### GLTF2_BINARY {#GLTF2-BINARY}
```
public static final FileFormat GLTF2_BINARY
```


Khronos Group's glTF version 2.0

### PDF {#PDF}
```
public static final PdfFormat PDF
```


Adobe's Portable Document Format

### DXF {#DXF}
```
public static final FileFormat DXF
```


AutoCAD DXF

### PLY {#PLY}
```
public static final PlyFormat PLY
```


Polygon File Format or Stanford Triangle Format

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

### DRACO {#DRACO}
```
public static final DracoFormat DRACO
```


Google Draco Mesh

### MICROSOFT3MF {#MICROSOFT3MF}
```
public static final FileFormat MICROSOFT3MF
```


Microsoft 3D Manufacturing Format

### RVM_TEXT {#RVM-TEXT}
```
public static final RvmFormat RVM_TEXT
```


AVEVA Plant Design Management System Model in text format

### RVM_BINARY {#RVM-BINARY}
```
public static final RvmFormat RVM_BINARY
```


AVEVA Plant Design Management System Model in binary format

### ASE {#ASE}
```
public static final FileFormat ASE
```


3D Studio Max's ASCII Scene Exporter format.

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

### AMF {#AMF}
```
public static final FileFormat AMF
```


Additive manufacturing file format

### VRML {#VRML}
```
public static final FileFormat VRML
```


The Virtual Reality Modeling Language

### ASPOSE3D_WEB {#ASPOSE3D-WEB}
```
public static final FileFormat ASPOSE3D_WEB
```


Aspose.3D Web format.

### HTML5 {#HTML5}
```
public static final FileFormat HTML5
```


HTML5 File

### ZIP {#ZIP}
```
public static final FileFormat ZIP
```


Zip archive that contains other 3d file format.

### USD {#USD}
```
public static final FileFormat USD
```


Universal Scene Description

### USDZ {#USDZ}
```
public static final FileFormat USDZ
```


Compressed Universal Scene Description

### XYZ {#XYZ}
```
public static final FileFormat XYZ
```


Xyz point cloud file

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

### getVersion() {#getVersion--}
```
public Version getVersion()
```


Gets file format version

**Returns:**
com.aspose.threed.Version
### getFormatByExtension(String extensionName) {#getFormatByExtension-java.lang.String-}
```
public static FileFormat getFormatByExtension(String extensionName)
```


Gets the preferred file format from the file extension name The extension name should starts with a dot('.').

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| extensionName | java.lang.String |  |

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat)
### getCanExport() {#getCanExport--}
```
public boolean getCanExport()
```


Gets whether Aspose.3D supports export scene to current file format.

**Returns:**
boolean
### getCanImport() {#getCanImport--}
```
public boolean getCanImport()
```


Gets whether Aspose.3D supports import scene from current file format.

**Returns:**
boolean
### getExtension() {#getExtension--}
```
public String getExtension()
```


Gets the extension name of this type.

**Returns:**
java.lang.String
### getExtensions() {#getExtensions--}
```
public String[] getExtensions()
```


Gets the extension names of this type.

**Returns:**
java.lang.String[]
### getContentType() {#getContentType--}
```
public FileContentType getContentType()
```


Gets file format content type

**Returns:**
[FileContentType](../../com.aspose.threed/filecontenttype)
### getFileFormatType() {#getFileFormatType--}
```
public FileFormatType getFileFormatType()
```


Gets file format type

**Returns:**
[FileFormatType](../../com.aspose.threed/fileformattype)
### detect(Stream stream, String fileName) {#detect-com.aspose.threed.Stream-java.lang.String-}
```
public static FileFormat detect(Stream stream, String fileName)
```


Detect the file format from data stream, file name is optional for guessing types that has no magic header.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |
| fileName | java.lang.String |  |

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat)
### detect(String fileName) {#detect-java.lang.String-}
```
public static FileFormat detect(String fileName)
```


Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat)
### createLoadOptions() {#createLoadOptions--}
```
public LoadOptions createLoadOptions()
```


Create a default load options for this file format

**Returns:**
[LoadOptions](../../com.aspose.threed/loadoptions)
### createSaveOptions() {#createSaveOptions--}
```
public SaveOptions createSaveOptions()
```


Create a default save options for this file format

**Returns:**
[SaveOptions](../../com.aspose.threed/saveoptions)
### toString() {#toString--}
```
public String toString()
```


Formats to string

**Returns:**
java.lang.String - Object string
