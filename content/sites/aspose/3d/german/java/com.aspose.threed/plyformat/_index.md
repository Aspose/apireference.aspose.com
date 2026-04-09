---
title: PlyFormat
second_title: Aspose.3D für Java API-Referenz
description: Das PLY-Format.
type: docs
weight: 129
url: /de/java/com.aspose.threed/plyformat/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.FileFormat](../../com.aspose.threed/fileformat)
```
public class PlyFormat extends FileFormat
```

Das PLY-Format. **Beispiel:** Der folgende Code zeigt, wie man ein Mesh aus einer PLY-Datei dekodiert:

```
//Generate a test file for decoding
             FileFormat.PLY.encode(new Sphere(), "sphere.ply");
             //Decode the file
             var mesh = (Mesh)FileFormat.PLY.decode("sphere.ply")
```
## Felder

| Feld | Beschreibung |
| --- | --- |
| [AMF](#AMF) | Dateiformat für additive Fertigung |
| [ASE](#ASE) | ASCII‑Szenenexporter‑Format von 3D Studio Max. |
| [ASPOSE3D_WEB](#ASPOSE3D-WEB) | Aspose.3D Web‑Format. |
| [BLENDER](#BLENDER) | 3D‑Dateiformat von Blender |
| [COLLADA](#COLLADA) | Collada‑Dateiformat |
| [DISCREET3DS](#DISCREET3DS) | Dateiformat von 3D Studio |
| [DRACO](#DRACO) | Google Draco Mesh |
| [DXF](#DXF) | AutoCAD DXF |
| [FBX6100ASCII](#FBX6100ASCII) | ASCII‑FBX‑Dateiformat, Version 6.1.0 |
| [FBX6100_BINARY](#FBX6100-BINARY) | Binäres FBX‑Dateiformat, mit Version 6.1.0 |
| [FBX7200ASCII](#FBX7200ASCII) | ASCII‑FBX‑Dateiformat, mit Version 7.2.0 |
| [FBX7200_BINARY](#FBX7200-BINARY) | Binäres FBX‑Dateiformat, mit Version 7.2.0 |
| [FBX7300ASCII](#FBX7300ASCII) | ASCII‑FBX‑Dateiformat, mit Version 7.3.0 |
| [FBX7300_BINARY](#FBX7300-BINARY) | Binäres FBX‑Dateiformat, mit Version 7.3.0 |
| [FBX7400ASCII](#FBX7400ASCII) | ASCII‑FBX‑Dateiformat, mit Version 7.4.0 |
| [FBX7400_BINARY](#FBX7400-BINARY) | Binäres FBX‑Dateiformat, mit Version 7.4.0 |
| [FBX7500ASCII](#FBX7500ASCII) | ASCII FBX-Dateiformat, Version 7.5.0 |
| [FBX7500_BINARY](#FBX7500-BINARY) | Binäres FBX-Dateiformat, Version 7.5.0 |
| [FBX7600ASCII](#FBX7600ASCII) | ASCII FBX-Dateiformat, Version 7.6.0 |
| [FBX7600_BINARY](#FBX7600-BINARY) | Binäres FBX-Dateiformat, Version 7.6.0 |
| [FBX7700ASCII](#FBX7700ASCII) | ASCII FBX-Dateiformat, Version 7.7.0 |
| [FBX7700_BINARY](#FBX7700-BINARY) | Binäres FBX-Dateiformat, Version 7.7.0 |
| [GLTF](#GLTF) | glTF der Khronos Group |
| [GLTF2](#GLTF2) | glTF der Khronos Group Version 2.0 |
| [GLTF2_BINARY](#GLTF2-BINARY) | glTF der Khronos Group Version 2.0 |
| [GLTF_BINARY](#GLTF-BINARY) | glTF der Khronos Group im Binärformat |
| [HTML5](#HTML5) | HTML5-Datei |
| [IFC](#IFC) | ISO 16739-1 Industry Foundation Classes Datenmodell. |
| [MAYAASCII](#MAYAASCII) | Autodesk Maya im ASCII-Format |
| [MAYA_BINARY](#MAYA-BINARY) | Autodesk Maya im Binärformat |
| [MICROSOFT3MF](#MICROSOFT3MF) | Microsoft 3D Manufacturing Format |
| [PCD](#PCD) | PCL Point Cloud Data-Datei im ASCII-Modus |
| [PCD_BINARY](#PCD-BINARY) | PCL Point Cloud Data-Datei im Binärmodus |
| [PDF](#PDF) | Adobe Portable Document Format |
| [PLY](#PLY) | Polygon File Format oder Stanford Triangle Format |
| [RVM_BINARY](#RVM-BINARY) | AVEVA Plant Design Management System Modell im Binärformat |
| [RVM_TEXT](#RVM-TEXT) | AVEVA Plant Design Management System Modell im Textformat |
| [SIEMENSJT8](#SIEMENSJT8) | Siemens JT-Datei Version 8 |
| [SIEMENSJT9](#SIEMENSJT9) | Siemens JT-Datei Version 9 |
| [STLASCII](#STLASCII) | ASCII STL-Dateiformat |
| [STL_BINARY](#STL-BINARY) | Binäres STL-Dateiformat |
| [UNIVERSAL3D](#UNIVERSAL3D) | Universal3D-Dateiformat |
| [USD](#USD) | Universelle Szenenbeschreibung |
| [USDA](#USDA) | Universelle Szenenbeschreibung im ASCII-Format. |
| [USDZ](#USDZ) | Komprimierte Universelle Szenenbeschreibung |
| [VRML](#VRML) | Die Virtual Reality Modeling Language |
| [WAVEFRONTOBJ](#WAVEFRONTOBJ) | Wavefronts Obj-Dateiformat |
| [XYZ](#XYZ) | Xyz-Punktwolken-Datei |
| [X_BINARY](#X-BINARY) | DirectX X-Datei im Binärformat |
| [X_TEXT](#X-TEXT) | DirectX X-Datei im Binärformat |
| [ZIP](#ZIP) | Zip-Archiv, das andere 3D-Dateiformate enthält. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [createLoadOptions()](#createLoadOptions--) | Standard-Ladeoptionen für dieses Dateiformat erstellen |
| [createSaveOptions()](#createSaveOptions--) | Standard-Speicheroptionen für dieses Dateiformat erstellen |
| [decode(Stream stream)](#decode-com.aspose.threed.Stream-) | Dekodiere eine Punktwolke oder ein Mesh aus dem angegebenen Stream. |
| [decode(Stream stream, PlyLoadOptions opt)](#decode-com.aspose.threed.Stream-com.aspose.threed.PlyLoadOptions-) | Dekodiere eine Punktwolke oder ein Mesh aus dem angegebenen Stream. |
| [decode(String fileName)](#decode-java.lang.String-) | Dekodiere eine Punktwolke oder ein Mesh aus dem angegebenen Stream. |
| [decode(String fileName, PlyLoadOptions opt)](#decode-java.lang.String-com.aspose.threed.PlyLoadOptions-) | Dekodiere eine Punktwolke oder ein Mesh aus dem angegebenen Stream. |
| [detect(Stream stream, String fileName)](#detect-com.aspose.threed.Stream-java.lang.String-) | Erkennen Sie das Dateiformat aus dem Datenstrom, der Dateiname ist optional, um Typen zu erraten, die keinen Magic-Header haben. |
| [detect(String fileName)](#detect-java.lang.String-) | Erkennen Sie das Dateiformat anhand des Dateinamens, die Datei muss lesbar sein, damit Aspose.3D das Dateiformat über den Dateikopf erkennen kann. |
| [encode(Entity entity, Stream stream)](#encode-com.aspose.threed.Entity-com.aspose.threed.Stream-) | Kodieren Sie die Entität und speichern Sie das Ergebnis im Stream. |
| [encode(Entity entity, Stream stream, PlySaveOptions opt)](#encode-com.aspose.threed.Entity-com.aspose.threed.Stream-com.aspose.threed.PlySaveOptions-) | Kodieren Sie die Entität und speichern Sie das Ergebnis im Stream. |
| [encode(Entity entity, String fileName)](#encode-com.aspose.threed.Entity-java.lang.String-) | Kodieren Sie die Entität und speichern Sie das Ergebnis in einer externen Datei. |
| [encode(Entity entity, String fileName, PlySaveOptions opt)](#encode-com.aspose.threed.Entity-java.lang.String-com.aspose.threed.PlySaveOptions-) | Kodieren Sie die Entität und speichern Sie das Ergebnis in einer externen Datei. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCanExport()](#getCanExport--) | Ermittelt, ob Aspose.3D den Export von Szenen in das aktuelle Dateiformat unterstützt. |
| [getCanImport()](#getCanImport--) | Ermittelt, ob Aspose.3D den Import von Szenen aus dem aktuellen Dateiformat unterstützt. |
| [getClass()](#getClass--) |  |
| [getContentType()](#getContentType--) | Ermittelt den Inhaltstyp des Dateiformats |
| [getExtension()](#getExtension--) | Ermittelt den Erweiterungsnamen dieses Typs. |
| [getExtensions()](#getExtensions--) | Ermittelt die Erweiterungsnamen dieses Typs. |
| [getFileFormatType()](#getFileFormatType--) | Ermittelt den Dateiformattyp |
| [getFormatByExtension(String extensionName)](#getFormatByExtension-java.lang.String-) | Ermittelt das bevorzugte Dateiformat anhand des Dateierweiterungsnamens. Der Erweiterungsname sollte mit einem Punkt ('.') beginnen. |
| [getFormats()](#getFormats--) | Zugriff auf alle unterstützten Formate |
| [getVersion()](#getVersion--) | Ermittelt die Dateiformatversion |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | Formate in Zeichenkette |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AMF {#AMF}
```
public static final FileFormat AMF
```


Dateiformat für additive Fertigung

### ASE {#ASE}
```
public static final FileFormat ASE
```


ASCII‑Szenenexporter‑Format von 3D Studio Max.

### ASPOSE3D_WEB {#ASPOSE3D-WEB}
```
public static final FileFormat ASPOSE3D_WEB
```


Aspose.3D Web‑Format.

### BLENDER {#BLENDER}
```
public static final FileFormat BLENDER
```


3D‑Dateiformat von Blender

### COLLADA {#COLLADA}
```
public static final FileFormat COLLADA
```


Collada‑Dateiformat

### DISCREET3DS {#DISCREET3DS}
```
public static final FileFormat DISCREET3DS
```


Dateiformat von 3D Studio

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


ASCII‑FBX‑Dateiformat, Version 6.1.0

### FBX6100_BINARY {#FBX6100-BINARY}
```
public static final FileFormat FBX6100_BINARY
```


Binäres FBX‑Dateiformat, mit Version 6.1.0

### FBX7200ASCII {#FBX7200ASCII}
```
public static final FileFormat FBX7200ASCII
```


ASCII‑FBX‑Dateiformat, mit Version 7.2.0

### FBX7200_BINARY {#FBX7200-BINARY}
```
public static final FileFormat FBX7200_BINARY
```


Binäres FBX‑Dateiformat, mit Version 7.2.0

### FBX7300ASCII {#FBX7300ASCII}
```
public static final FileFormat FBX7300ASCII
```


ASCII‑FBX‑Dateiformat, mit Version 7.3.0

### FBX7300_BINARY {#FBX7300-BINARY}
```
public static final FileFormat FBX7300_BINARY
```


Binäres FBX‑Dateiformat, mit Version 7.3.0

### FBX7400ASCII {#FBX7400ASCII}
```
public static final FileFormat FBX7400ASCII
```


ASCII‑FBX‑Dateiformat, mit Version 7.4.0

### FBX7400_BINARY {#FBX7400-BINARY}
```
public static final FileFormat FBX7400_BINARY
```


Binäres FBX‑Dateiformat, mit Version 7.4.0

### FBX7500ASCII {#FBX7500ASCII}
```
public static final FileFormat FBX7500ASCII
```


ASCII FBX-Dateiformat, Version 7.5.0

### FBX7500_BINARY {#FBX7500-BINARY}
```
public static final FileFormat FBX7500_BINARY
```


Binäres FBX-Dateiformat, Version 7.5.0

### FBX7600ASCII {#FBX7600ASCII}
```
public static final FileFormat FBX7600ASCII
```


ASCII FBX-Dateiformat, Version 7.6.0

### FBX7600_BINARY {#FBX7600-BINARY}
```
public static final FileFormat FBX7600_BINARY
```


Binäres FBX-Dateiformat, Version 7.6.0

### FBX7700ASCII {#FBX7700ASCII}
```
public static final FileFormat FBX7700ASCII
```


ASCII FBX-Dateiformat, Version 7.7.0

### FBX7700_BINARY {#FBX7700-BINARY}
```
public static final FileFormat FBX7700_BINARY
```


Binäres FBX-Dateiformat, Version 7.7.0

### GLTF {#GLTF}
```
public static final FileFormat GLTF
```


glTF der Khronos Group

### GLTF2 {#GLTF2}
```
public static final FileFormat GLTF2
```


glTF der Khronos Group Version 2.0

### GLTF2_BINARY {#GLTF2-BINARY}
```
public static final FileFormat GLTF2_BINARY
```


glTF der Khronos Group Version 2.0

### GLTF_BINARY {#GLTF-BINARY}
```
public static final FileFormat GLTF_BINARY
```


glTF der Khronos Group im Binärformat

### HTML5 {#HTML5}
```
public static final FileFormat HTML5
```


HTML5-Datei

### IFC {#IFC}
```
public static final FileFormat IFC
```


ISO 16739-1 Industry Foundation Classes Datenmodell.

### MAYAASCII {#MAYAASCII}
```
public static final FileFormat MAYAASCII
```


Autodesk Maya im ASCII-Format

### MAYA_BINARY {#MAYA-BINARY}
```
public static final FileFormat MAYA_BINARY
```


Autodesk Maya im Binärformat

### MICROSOFT3MF {#MICROSOFT3MF}
```
public static final Microsoft3MFFormat MICROSOFT3MF
```


Microsoft 3D Manufacturing Format

### PCD {#PCD}
```
public static final FileFormat PCD
```


PCL Point Cloud Data-Datei im ASCII-Modus

### PCD_BINARY {#PCD-BINARY}
```
public static final FileFormat PCD_BINARY
```


PCL Point Cloud Data-Datei im Binärmodus

### PDF {#PDF}
```
public static final PdfFormat PDF
```


Adobe Portable Document Format

### PLY {#PLY}
```
public static final PlyFormat PLY
```


Polygon File Format oder Stanford Triangle Format

### RVM_BINARY {#RVM-BINARY}
```
public static final RvmFormat RVM_BINARY
```


AVEVA Plant Design Management System Modell im Binärformat

### RVM_TEXT {#RVM-TEXT}
```
public static final RvmFormat RVM_TEXT
```


AVEVA Plant Design Management System Modell im Textformat

### SIEMENSJT8 {#SIEMENSJT8}
```
public static final FileFormat SIEMENSJT8
```


Siemens JT-Datei Version 8

### SIEMENSJT9 {#SIEMENSJT9}
```
public static final FileFormat SIEMENSJT9
```


Siemens JT-Datei Version 9

### STLASCII {#STLASCII}
```
public static final FileFormat STLASCII
```


ASCII STL-Dateiformat

### STL_BINARY {#STL-BINARY}
```
public static final FileFormat STL_BINARY
```


Binäres STL-Dateiformat

### UNIVERSAL3D {#UNIVERSAL3D}
```
public static final FileFormat UNIVERSAL3D
```


Universal3D-Dateiformat

### USD {#USD}
```
public static final FileFormat USD
```


Universelle Szenenbeschreibung

### USDA {#USDA}
```
public static final FileFormat USDA
```


Universelle Szenenbeschreibung im ASCII-Format.

### USDZ {#USDZ}
```
public static final FileFormat USDZ
```


Komprimierte Universelle Szenenbeschreibung

### VRML {#VRML}
```
public static final FileFormat VRML
```


Die Virtual Reality Modeling Language

### WAVEFRONTOBJ {#WAVEFRONTOBJ}
```
public static final FileFormat WAVEFRONTOBJ
```


Wavefronts Obj-Dateiformat

### XYZ {#XYZ}
```
public static final FileFormat XYZ
```


Xyz-Punktwolken-Datei

### X_BINARY {#X-BINARY}
```
public static final FileFormat X_BINARY
```


DirectX X-Datei im Binärformat

### X_TEXT {#X-TEXT}
```
public static final FileFormat X_TEXT
```


DirectX X-Datei im Binärformat

### ZIP {#ZIP}
```
public static final FileFormat ZIP
```


Zip-Archiv, das andere 3D-Dateiformate enthält.

### createLoadOptions() {#createLoadOptions--}
```
public LoadOptions createLoadOptions()
```


Standard-Ladeoptionen für dieses Dateiformat erstellen

**Returns:**
[LoadOptions](../../com.aspose.threed/loadoptions) - A default load option for current format
### createSaveOptions() {#createSaveOptions--}
```
public SaveOptions createSaveOptions()
```


Standard-Speicheroptionen für dieses Dateiformat erstellen

**Returns:**
[SaveOptions](../../com.aspose.threed/saveoptions) - A default save option for current format
### decode(Stream stream) {#decode-com.aspose.threed.Stream-}
```
public Geometry decode(Stream stream)
```


Dekodiere eine Punktwolke oder ein Mesh aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Der Eingabestream |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A [Mesh](../../com.aspose.threed/mesh) or [PointCloud](../../com.aspose.threed/pointcloud) instance **Example:** The following code shows how to decode a mesh from a PLY file:

```
//Generate a test file for decoding
             FileFormat.PLY.encode(new Sphere(), "sphere.ply");
             //Decode the file
             var mesh = (Mesh)FileFormat.PLY.decode("sphere.ply")
```
### decode(Stream stream, PlyLoadOptions opt) {#decode-com.aspose.threed.Stream-com.aspose.threed.PlyLoadOptions-}
```
public Geometry decode(Stream stream, PlyLoadOptions opt)
```


Dekodiere eine Punktwolke oder ein Mesh aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Der Eingabestream |
| opt | [PlyLoadOptions](../../com.aspose.threed/plyloadoptions) | Die Ladeoption des PLY-Formats |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A [Mesh](../../com.aspose.threed/mesh) or [PointCloud](../../com.aspose.threed/pointcloud) instance **Example:** The following code shows how to decode a mesh from a PLY file:

```
//Generate a test file for decoding
             FileFormat.PLY.encode(new Sphere(), "sphere.ply");
             //Decode the file
             var mesh = (Mesh)FileFormat.PLY.decode("sphere.ply")
```
### decode(String fileName) {#decode-java.lang.String-}
```
public Geometry decode(String fileName)
```


Dekodiere eine Punktwolke oder ein Mesh aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Der Eingabestream |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A [Mesh](../../com.aspose.threed/mesh) or [PointCloud](../../com.aspose.threed/pointcloud) instance **Example:** The following code shows how to decode a mesh from a PLY file:

```
//Generate a test file for decoding
             FileFormat.PLY.encode(new Sphere(), "sphere.ply");
             //Decode the file
             var mesh = (Mesh)FileFormat.PLY.decode("sphere.ply")
```
### decode(String fileName, PlyLoadOptions opt) {#decode-java.lang.String-com.aspose.threed.PlyLoadOptions-}
```
public Geometry decode(String fileName, PlyLoadOptions opt)
```


Dekodiere eine Punktwolke oder ein Mesh aus dem angegebenen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Der Eingabestream |
| opt | [PlyLoadOptions](../../com.aspose.threed/plyloadoptions) | Die Ladeoption des PLY-Formats |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A [Mesh](../../com.aspose.threed/mesh) or [PointCloud](../../com.aspose.threed/pointcloud) instance **Example:** The following code shows how to decode a mesh from a PLY file:

```
//Generate a test file for decoding
             FileFormat.PLY.encode(new Sphere(), "sphere.ply");
             //Decode the file
             var mesh = (Mesh)FileFormat.PLY.decode("sphere.ply")
```
### detect(Stream stream, String fileName) {#detect-com.aspose.threed.Stream-java.lang.String-}
```
public static FileFormat detect(Stream stream, String fileName)
```


Erkennen Sie das Dateiformat aus dem Datenstrom, der Dateiname ist optional, um Typen zu erraten, die keinen Magic-Header haben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) | Strom, der zu erkennende Daten enthält |
| fileName | java.lang.String | Ursprünglicher Dateiname der Daten, als Hinweis verwendet. |

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat) - The [FileFormat](../../com.aspose.threed/fileformat) instance of the detected type or null if failed.
### detect(String fileName) {#detect-java.lang.String-}
```
public static FileFormat detect(String fileName)
```


Erkennen Sie das Dateiformat anhand des Dateinamens, die Datei muss lesbar sein, damit Aspose.3D das Dateiformat über den Dateikopf erkennen kann.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Pfad zur Datei, um das Dateiformat zu erkennen. |

**Returns:**
[FileFormat](../../com.aspose.threed/fileformat) - The [FileFormat](../../com.aspose.threed/fileformat) instance of the detected type or null if failed.
### encode(Entity entity, Stream stream) {#encode-com.aspose.threed.Entity-com.aspose.threed.Stream-}
```
public void encode(Entity entity, Stream stream)
```


Kodieren Sie die Entität und speichern Sie das Ergebnis im Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | Die zu kodierende Entität |
|  | stream | [Stream](../../com.aspose.threed/stream) | Der Stream, in den geschrieben wird, diese Methode schließt diesen Stream nicht **Beispiel:** Der folgende Code zeigt, wie man ein Mesh in eine PLY-Datei kodiert: |

```
Mesh mesh = (new Sphere()).toMesh();
             //encode mesh into PLY format
             FileFormat.PLY.encode(mesh, "sphere.ply");
``` |

### encode(Entity entity, Stream stream, PlySaveOptions opt) {#encode-com.aspose.threed.Entity-com.aspose.threed.Stream-com.aspose.threed.PlySaveOptions-}
```
public void encode(Entity entity, Stream stream, PlySaveOptions opt)
```


Kodieren Sie die Entität und speichern Sie das Ergebnis im Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | Die zu kodierende Entität |
| stream | [Stream](../../com.aspose.threed/stream) | Der Stream, in den geschrieben wird, diese Methode schließt diesen Stream nicht |
|  | opt | [PlySaveOptions](../../com.aspose.threed/plysaveoptions) | Speicheroptionen **Beispiel:** Der folgende Code zeigt, wie man ein Mesh in eine PLY-Datei kodiert: |

```
Mesh mesh = (new Sphere()).toMesh();
             //encode mesh into PLY format
             FileFormat.PLY.encode(mesh, "sphere.ply");
``` |

### encode(Entity entity, String fileName) {#encode-com.aspose.threed.Entity-java.lang.String-}
```
public void encode(Entity entity, String fileName)
```


Kodieren Sie die Entität und speichern Sie das Ergebnis in einer externen Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | Die zu kodierende Entität |
|  | fileName | java.lang.String | Die Datei, in die geschrieben wird **Beispiel:** Der folgende Code zeigt, wie man ein Mesh in eine PLY-Datei kodiert: |

```
Mesh mesh = (new Sphere()).toMesh();
             //encode mesh into PLY format
             FileFormat.PLY.encode(mesh, "sphere.ply");
``` |

### encode(Entity entity, String fileName, PlySaveOptions opt) {#encode-com.aspose.threed.Entity-java.lang.String-com.aspose.threed.PlySaveOptions-}
```
public void encode(Entity entity, String fileName, PlySaveOptions opt)
```


Kodieren Sie die Entität und speichern Sie das Ergebnis in einer externen Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | Die zu kodierende Entität |
| fileName | java.lang.String | Die Datei, in die geschrieben werden soll |
|  | opt | [PlySaveOptions](../../com.aspose.threed/plysaveoptions) | Speicheroptionen **Beispiel:** Der folgende Code zeigt, wie man ein Mesh in eine PLY-Datei kodiert: |

```
Mesh mesh = (new Sphere()).toMesh();
             //encode mesh into PLY format
             FileFormat.PLY.encode(mesh, "sphere.ply");
``` |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getCanExport() {#getCanExport--}
```
public boolean getCanExport()
```


Ermittelt, ob Aspose.3D den Export von Szenen in das aktuelle Dateiformat unterstützt.

**Returns:**
boolean - ob Aspose.3D den Export einer Szene in das aktuelle Dateiformat unterstützt. **Beispiel:** Der folgende Code zeigt, wie geprüft werden kann, ob das Exportieren in das angegebene Format unterstützt wird.

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


Ermittelt, ob Aspose.3D den Import von Szenen aus dem aktuellen Dateiformat unterstützt.

**Returns:**
boolean - ob Aspose.3D den Import einer Szene aus dem aktuellen Dateiformat unterstützt. **Beispiel:** Der folgende Code zeigt, wie geprüft werden kann, ob das Importieren aus dem angegebenen Format unterstützt wird.

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


Ermittelt den Inhaltstyp des Dateiformats

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


Ermittelt den Erweiterungsnamen dieses Typs.

**Returns:**
java.lang.String - der Erweiterungsname dieses Typs. **Beispiel:**

```
var format = FileFormat.MAYA_BINARY;
     System.out.printf("Extension of %s is %s", format, format.getExtension());
```
### getExtensions() {#getExtensions--}
```
public String[] getExtensions()
```


Ermittelt die Erweiterungsnamen dieses Typs.

**Returns:**
java.lang.String[] - die Erweiterungsnamen dieses Typs.
### getFileFormatType() {#getFileFormatType--}
```
public FileFormatType getFileFormatType()
```


Ermittelt den Dateiformattyp

**Returns:**
[FileFormatType](../../com.aspose.threed/fileformattype) - file format type
### getFormatByExtension(String extensionName) {#getFormatByExtension-java.lang.String-}
```
public static FileFormat getFormatByExtension(String extensionName)
```


Ermittelt das bevorzugte Dateiformat anhand des Dateierweiterungsnamens. Der Erweiterungsname sollte mit einem Punkt ('.') beginnen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| extensionName | java.lang.String | Der Erweiterungsname beginnt mit '.' für die Abfrage. |

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


Zugriff auf alle unterstützten Formate

**Returns:**
java.util.List<com.aspose.threed.FileFormat> - Zugriff auf alle unterstützten Formate
### getVersion() {#getVersion--}
```
public Version getVersion()
```


Ermittelt die Dateiformatversion

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


Formate in Zeichenkette

**Returns:**
java.lang.String - Objektzeichenkette
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

