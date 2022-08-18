---
title: FileFormat
second_title: Riferimento API Aspose.3D per .NET
description: Definizione formato file
type: docs
weight: 1000
url: /it/net/aspose.threed/fileformat/
---
## FileFormat class

Definizione formato file

```csharp
public class FileFormat
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | Ottiene se Aspose.3D supporta l'esportazione della scena nel formato file corrente. |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | Ottiene se Aspose.3D supporta l'importazione di scene dal formato file corrente. |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | Ottiene il tipo di contenuto del formato file |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | Ottiene il nome dell'estensione di questo tipo. |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | Ottiene i nomi di estensione di questo tipo. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | Ottiene il tipo di formato file |
| [Version](../../aspose.threed/fileformat/version) { get; } | Ottiene la versione del formato file |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | Rileva il formato del file dal nome del file, il file deve essere leggibile in modo che Aspose.3D possa rilevare il formato del file tramite l'intestazione del file. |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | Rileva il formato del file dal flusso di dati, il nome del file è facoltativo per indovinare i tipi che non hanno intestazione magica. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | Ottiene il formato file preferito dall'estensione del file name Il nome dell'estensione dovrebbe iniziare con un punto('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | Crea opzioni di caricamento predefinite per questo formato file |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | Crea opzioni di salvataggio predefinite per questo formato file |
| override [ToString](../../aspose.threed/fileformat/tostring)() | Formatta in stringa |

## Campi

| Nome | Descrizione |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | Formato file di produzione additiva |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | Formato ASCII Scene Exporter di 3D Studio Max. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Aspose.Formato Web 3D. |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | Formato file Collada |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | Formato file di 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | Formato file ASCII FBX, con versione 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | Formato file FBX binario, con versione 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | Formato file ASCII FBX, con versione 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | Formato file FBX binario, con versione 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | Formato file ASCII FBX, con versione 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | Formato file FBX binario, con versione 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | Formato file ASCII FBX, con versione 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | Formato file FBX binario, con versione 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | Formato file ASCII FBX, con versione 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | Formato file FBX binario, con versione 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | Formato file ASCII FBX, con versione 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | Formato file FBX binario, con versione 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | Formato file ASCII FBX, con versione 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | Formato file FBX binario, con versione 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | glTF del Gruppo Khronos |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | Versione glTF del Gruppo Khronos 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | Versione glTF del Gruppo Khronos 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | glTF del Gruppo Khronos in formato binario |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | File HTML5 |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Formato di produzione 3D Microsoft |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | File dati nuvola di punti PCL in modalità ASCII |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | File dati nuvola di punti PCL in modalità binaria |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | File Siemens JT versione 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | File Siemens JT versione 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | Formato file ASCII STL |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | Formato file STL binario |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | Formato file 3D universale |
| static readonly [USD](../../aspose.threed/fileformat/usd) | Descrizione scena universale |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | Descrizione scena universale compressa |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | Il linguaggio di modellazione della realtà virtuale |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | Formato file Obj di Wavefront |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | File DirectX X in formato binario |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | File DirectX X in formato binario |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | File nuvola di punti Xyz |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | Archivio zip che contiene altri formati di file 3d. |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | Formato documento portatile di Adobe |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | Formato file poligono o formato triangolo Stanford |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | AVEVA Plant Design Management System Modello in formato binario |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | AVEVA Plant Design Management System Modello in formato testo |

### Guarda anche

* spazio dei nomi [Aspose.ThreeD](../../aspose.threed)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
