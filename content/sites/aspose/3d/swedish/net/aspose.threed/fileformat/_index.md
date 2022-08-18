---
title: FileFormat
second_title: Aspose.3D för .NET API-referens
description: Filformat definition
type: docs
weight: 1000
url: /sv/net/aspose.threed/fileformat/
---
## FileFormat class

Filformat definition

```csharp
public class FileFormat
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | Får om Aspose.3D stöder export av scen till aktuellt filformat. |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | Får om Aspose.3D stöder import av scen från aktuellt filformat. |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | Hämtar filformat innehållstyp |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | Hämtar tilläggsnamnet av denna typ. |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | Hämtar tilläggsnamnen av denna typ. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | Hämtar filformat type |
| [Version](../../aspose.threed/fileformat/version) { get; } | Hämtar filformat version |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | Upptäck filformatet från filnamnet, filen måste vara läsbar så att Aspose.3D kan upptäcka filformatet via filhuvudet. |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | Upptäck filformatet från dataströmmen, filnamnet är valfritt för gissningstyper som inte har någon magisk rubrik. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | Får det föredragna filformatet från filtillägget name Tilläggsnamnet ska börja med en punkt('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | Skapa ett standardinläsningsalternativ för detta filformat |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | Skapa ett standardsparalternativ för detta filformat |
| override [ToString](../../aspose.threed/fileformat/tostring)() | Formaterar till string |

## Fält

| namn | Beskrivning |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | Additiv tillverkning fil format |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | 3D Studio Maxs ASCII Scene Exporter-format. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Aspose.3D webbformat. |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | Collada filformat |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | 3D Studios filformat |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | ASCII FBX-filformat, med 6.1.0 version |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | Binärt FBX-filformat, med 6.1.0 version |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | ASCII FBX-filformat, med 7.2.0 version |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | Binärt FBX-filformat, med 7.2.0 version |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | ASCII FBX-filformat, med 7.3.0 version |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | Binärt FBX-filformat, med 7.3.0 version |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | ASCII FBX-filformat, med 7.4.0 version |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | Binärt FBX-filformat, med 7.4.0 version |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | ASCII FBX-filformat, med 7.5.0 version |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | Binärt FBX-filformat, med 7.5.0 version |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | ASCII FBX-filformat, med 7.6.0 version |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | Binärt FBX-filformat, med 7.6.0 version |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | ASCII FBX-filformat, med 7.7.0 version |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | Binärt FBX-filformat, med 7.7.0 version |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | Khronos Groups glTF |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | Khronos Groups glTF version 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | Khronos Groups glTF version 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | Khronos Groups glTF i binärt format |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | HTML5 File |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Microsoft 3D Manufacturing Format |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | PCL Point Cloud Datafil i ASCII-läge |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | PCL Point Cloud Datafil i binärt läge |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | Siemens JT File Version 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | Siemens JT File Version 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | ASCII STL filformat |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | Binärt STL-filformat |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | Universal3D filformat |
| static readonly [USD](../../aspose.threed/fileformat/usd) | Universal Scen Description |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | Beskrivning av komprimerad universell scen |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | The Virtual Reality Modeling Language |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | Wavefronts Obj filformat |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | DirectX X-fil i binärt format |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | DirectX X-fil i binärt format |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | Xyz point cloud file |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | Zip-arkiv som innehåller andra 3d-filformat. |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | Adobes portabla dokumentformat |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | Polygonfilformat eller Stanford Triangle Format |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | AVEVA Plant Design Management System Modell i binärt format |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | AVEVA Plant Design Management System Modell i textformat |

### Se även

* namnutrymme [Aspose.ThreeD](../../aspose.threed)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
