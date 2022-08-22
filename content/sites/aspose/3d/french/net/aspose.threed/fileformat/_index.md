---
title: FileFormat
second_title: Référence de l'API Aspose.3D pour .NET
description: Définition du format de fichier
type: docs
weight: 1000
url: /fr/net/aspose.threed/fileformat/
---
## FileFormat class

Définition du format de fichier

```csharp
public class FileFormat
```

## Propriétés

| Nom | La description |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | Obtient si Aspose.3D prend en charge l'exportation de la scène au format de fichier actuel. |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | Obtient si Aspose.3D prend en charge l'importation de la scène à partir du format de fichier actuel. |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | Obtient le type de contenu du format de fichier |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | Obtient le nom de l'extension de ce type. |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | Obtient les noms d'extension de ce type. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | Obtient le type de format de fichier |
| [Version](../../aspose.threed/fileformat/version) { get; } | Obtient la version du format de fichier |

## Méthodes

| Nom | La description |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | Détecter le format de fichier à partir du nom de fichier, le fichier doit être lisible afin qu'Aspose.3D puisse détecter le format de fichier via l'en-tête de fichier. |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | Détecter le format de fichier à partir du flux de données, le nom du fichier est facultatif pour deviner les types qui n'ont pas d'en-tête magique. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | Obtient le format de fichier préféré à partir du nom d'extension de fichier Le nom d'extension doit commencer par un point ('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | Créer une option de chargement par défaut pour ce format de fichier |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | Créer des options d'enregistrement par défaut pour ce format de fichier |
| override [ToString](../../aspose.threed/fileformat/tostring)() | Formate en chaîne |

## Des champs

| Nom | La description |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | Format de fichier de fabrication additive |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | Format d'exportation de scène ASCII de 3D Studio Max. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Aspose.Format Web 3D. |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | Format de fichier Collada |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | Format de fichier de 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | Format de fichier ASCII FBX, avec la version 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | Format de fichier FBX binaire, avec la version 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | Format de fichier ASCII FBX, avec la version 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | Format de fichier FBX binaire, avec la version 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | Format de fichier ASCII FBX, avec la version 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | Format de fichier FBX binaire, avec la version 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | Format de fichier ASCII FBX, avec la version 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | Format de fichier FBX binaire, avec la version 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | Format de fichier ASCII FBX, avec la version 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | Format de fichier FBX binaire, avec la version 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | Format de fichier ASCII FBX, avec la version 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | Format de fichier FBX binaire, avec la version 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | Format de fichier ASCII FBX, avec la version 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | Format de fichier FBX binaire, avec la version 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | glTF du groupe Khronos |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | glTF du groupe Khronos version 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | glTF du groupe Khronos version 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | glTF du groupe Khronos au format binaire |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | Fichier HTML5 |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Format de fabrication Microsoft 3D |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | Fichier de données de nuages de points PCL en mode ASCII |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | Fichier de données de nuages de points PCL en mode binaire |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | Fichier Siemens JT Version 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | Fichier Siemens JT version 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | format de fichier ASCII STL |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | Format de fichier STL binaire |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | Format de fichier Universal3D |
| static readonly [USD](../../aspose.threed/fileformat/usd) | Description de scène universelle |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | Description de la scène universelle compressée |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | Le langage de modélisation de la réalité virtuelle |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | Format de fichier Obj de Wavefront |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | Fichier DirectX X au format binaire |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | Fichier DirectX X au format binaire |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | Fichier de nuage de points Xyz |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | Archive Zip contenant un autre format de fichier 3D. |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | Format de document portable d'Adobe |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | Format de fichier polygone ou Format de triangle de Stanford |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | Modèle de système de gestion de la conception d'usine AVEVA au format binaire |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | Modèle de système de gestion de la conception d'usine AVEVA au format texte |

### Voir également

* espace de noms [Aspose.ThreeD](../../aspose.threed)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
