---
title: FileFormat
second_title: Aspose.3D für .NET-API-Referenz
description: Definition des Dateiformats
type: docs
weight: 1000
url: /de/net/aspose.threed/fileformat/
---
## FileFormat class

Definition des Dateiformats

```csharp
public class FileFormat
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | Ruft ab, ob Aspose.3D den Export von Szenen in das aktuelle Dateiformat unterstützt. |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | Ruft ab, ob Aspose.3D den Import von Szenen aus dem aktuellen Dateiformat unterstützt. |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | Ruft den Inhalt des Dateiformats type ab |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | Ruft den Erweiterungsnamen dieses Typs ab. |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | Ruft die Erweiterungsnamen dieses Typs ab. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | Ruft das Dateiformat type ab |
| [Version](../../aspose.threed/fileformat/version) { get; } | Ruft die Dateiformatversion ab |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | Erkennt das Dateiformat anhand des Dateinamens, die Datei muss lesbar sein, damit Aspose.3D das Dateiformat anhand des Dateiheaders erkennen kann. |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | Erkennt das Dateiformat aus dem Datenstrom, der Dateiname ist optional, um Typen zu erraten, die keinen magischen Header haben. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | Ruft das bevorzugte Dateiformat aus dem Dateierweiterungsnamen ab Der Erweiterungsname sollte mit einem Punkt ('.') beginnen. |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | Standardladeoptionen für dieses Dateiformat erstellen |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | Standardspeicheroptionen für dieses Dateiformat erstellen |
| override [ToString](../../aspose.threed/fileformat/tostring)() | formatiert zu string |

## Felder

| Name | Beschreibung |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | Dateiformat für additive Fertigung |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | ASCII Scene Exporter-Format von 3D Studio Max. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Aspose.3D-Webformat. |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | Collada-Dateiformat |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | Dateiformat von 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | ASCII-FBX-Dateiformat, mit Version 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | Binäres FBX-Dateiformat, mit Version 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | ASCII-FBX-Dateiformat, mit Version 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | Binäres FBX-Dateiformat, mit Version 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | ASCII-FBX-Dateiformat, mit Version 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | Binäres FBX-Dateiformat, mit Version 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | ASCII-FBX-Dateiformat, mit Version 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | Binäres FBX-Dateiformat, mit Version 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | ASCII-FBX-Dateiformat, mit Version 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | Binäres FBX-Dateiformat, mit Version 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | ASCII-FBX-Dateiformat, mit Version 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | Binäres FBX-Dateiformat, mit Version 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | ASCII-FBX-Dateiformat, mit Version 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | Binäres FBX-Dateiformat, mit Version 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | glTF der Khronos-Gruppe |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | glTF-Version 2.0 der Khronos Group |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | glTF-Version 2.0 der Khronos Group |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | glTF der Khronos Group im Binärformat |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | HTML5-Datei |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Microsoft 3D-Fertigungsformat |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | PCL-Punktwolkendatendatei im ASCII-Modus |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | PCL-Punktwolkendatendatei im Binärmodus |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | Siemens JT-Datei Version 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | Siemens JT-Datei Version 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | ASCII-STL-Dateiformat |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | Binäres STL-Dateiformat |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | Universelles 3D-Dateiformat |
| static readonly [USD](../../aspose.threed/fileformat/usd) | Universelle Szenenbeschreibung |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | Komprimierte universelle Szenenbeschreibung |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | Die Virtual-Reality-Modellierungssprache |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | Obj-Dateiformat von Wavefront |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | DirectX X-Datei im Binärformat |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | DirectX X-Datei im Binärformat |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | Xyz-Punktwolkendatei |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | Zip-Archiv, das andere 3D-Dateiformate enthält. |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | Portable Document Format von Adobe |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | Polygondateiformat oder Stanford-Dreiecksformat |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | AVEVA Plant Design Management System Modell im Binärformat |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | AVEVA Plant Design Management System Modell im Textformat |

### Siehe auch

* namensraum [Aspose.ThreeD](../../aspose.threed)
* Montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
