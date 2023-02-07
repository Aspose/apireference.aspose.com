---
title: FileFormat
second_title: Aspose.3D voor .NET API-referentie
description: Bestandsformaatdefinitie
type: docs
weight: 1000
url: /nl/net/aspose.threed/fileformat/
---
## FileFormat class

Bestandsformaatdefinitie

```csharp
public class FileFormat
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport/) { get; } | Krijgt of Aspose.3D het exporteren van scènes naar het huidige bestandsformaat ondersteunt. |
| [CanImport](../../aspose.threed/fileformat/canimport/) { get; } | Krijgt of Aspose.3D het importeren van scènes uit het huidige bestandsformaat ondersteunt. |
| [ContentType](../../aspose.threed/fileformat/contenttype/) { get; } | Krijgt bestandsformaat inhoudstype |
| [Extension](../../aspose.threed/fileformat/extension/) { get; } | Krijgt de extensienaam van dit type. |
| [Extensions](../../aspose.threed/fileformat/extensions/) { get; } | Haalt de extensienamen van dit type op. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype/) { get; } | Krijgt bestandsformaat type |
| [Version](../../aspose.threed/fileformat/version/) { get; } | Krijgt bestandsformaat versie |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect/#detect_1)(string) | Detecteer het bestandsformaat van de bestandsnaam, het bestand moet leesbaar zijn zodat Aspose.3D het bestandsformaat kan detecteren via de bestandskop. |
| static [Detect](../../aspose.threed/fileformat/detect/#detect)(Stream, string) | Detecteer het bestandsformaat van de gegevensstroom, de bestandsnaam is optioneel voor het raden van typen die geen magische kop hebben. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension/)(string) | Haalt het gewenste bestandsformaat op uit de bestandsextensie naam De extensienaam moet beginnen met een punt ('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions/)() | Maak een standaard laadoptie voor dit bestandsformaat |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions/)() | Maak een standaard opslagoptie voor dit bestandsformaat |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | Formaat naar string |

## Velden

| Naam | Beschrijving |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf/) | Additief fabricagebestandsformaat |
| static readonly [ASE](../../aspose.threed/fileformat/ase/) | ASCII Scene Exporter-indeling van 3D Studio Max. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb/) | Aspose.3D Webformaat. |
| static readonly [Collada](../../aspose.threed/fileformat/collada/) | Collada-bestandsindeling |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds/) | Bestandsformaat van 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf/) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii/) | ASCII FBX-bestandsindeling, met versie 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary/) | Binair FBX-bestandsformaat, met versie 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii/) | ASCII FBX-bestandsindeling, met versie 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary/) | Binair FBX-bestandsformaat, met versie 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii/) | ASCII FBX-bestandsindeling, met versie 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary/) | Binair FBX-bestandsformaat, met versie 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii/) | ASCII FBX-bestandsindeling, met versie 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary/) | Binair FBX-bestandsformaat, met versie 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii/) | ASCII FBX-bestandsindeling, met versie 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary/) | Binair FBX-bestandsformaat, met versie 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii/) | ASCII FBX-bestandsindeling, met versie 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary/) | Binair FBX-bestandsformaat, met versie 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii/) | ASCII FBX-bestandsindeling, met versie 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary/) | Binair FBX-bestandsformaat, met versie 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf/) | glTF van Khronos Group |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2/) | glTF-versie 2.0 van Khronos Group |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary/) | glTF-versie 2.0 van Khronos Group |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary/) | glTF van Khronos Group in binair formaat |
| static readonly [HTML5](../../aspose.threed/fileformat/html5/) | HTML5-bestand |
| static readonly [MayaASCII](../../aspose.threed/fileformat/mayaascii/) | Autodesk Maya in ASCII-indeling |
| static readonly [MayaBinary](../../aspose.threed/fileformat/mayabinary/) | Autodesk Maya in binair formaat |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf/) | Microsoft 3D-productieformaat |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd/) | PCL-puntenwolkgegevensbestand in ASCII-modus |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary/) | PCL-puntenwolkgegevensbestand in binaire modus |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8/) | Siemens JT-bestand versie 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9/) | Siemens JT-bestand versie 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii/) | ASCII STL-bestandsformaat |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary/) | Binair STL-bestandsformaat |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d/) | Universal3D-bestandsindeling |
| static readonly [USD](../../aspose.threed/fileformat/usd/) | Universele scènebeschrijving |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz/) | Gecomprimeerde universele scènebeschrijving |
| static readonly [VRML](../../aspose.threed/fileformat/vrml/) | De Virtual Reality-modelleringstaal |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj/) | Wavefront's Obj-bestandsindeling |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary/) | DirectX X-bestand in binair formaat |
| static readonly [XText](../../aspose.threed/fileformat/xtext/) | DirectX X-bestand in binair formaat |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz/) | Xyz-puntenwolkbestand |
| static readonly [Zip](../../aspose.threed/fileformat/zip/) | Zip-archief dat een ander 3D-bestandsformaat bevat. |
| static readonly [Draco](../../aspose.threed/fileformat/draco/) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf/) | Adobe's Portable Document Format |
| static readonly [PLY](../../aspose.threed/fileformat/ply/) | Polygoon-bestandsindeling of Stanford Triangle-indeling |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary/) | AVEVA Plant Design Management Systeem Model in binair formaat |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext/) | AVEVA Plant Design Managementsysteem Model in tekstformaat |

### Zie ook

* naamruimte [Aspose.ThreeD](../../aspose.threed/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
