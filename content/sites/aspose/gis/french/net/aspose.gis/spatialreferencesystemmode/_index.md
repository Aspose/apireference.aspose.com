---
title: Enum SpatialReferenceSystemMode
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.SpatialReferenceSystemMode énumération. Spécifie un mode décriture du système de référence spatiale SRS dans la base de données sil sagit dun SRS inconnu.
type: docs
weight: 2020
url: /fr/net/aspose.gis/spatialreferencesystemmode/
---
## SpatialReferenceSystemMode enumeration

Spécifie un mode d'écriture du système de référence spatiale (SRS) dans la base de données s'il s'agit d'un SRS inconnu.

```csharp
public enum SpatialReferenceSystemMode
```

### Valeurs

| Nom | Évaluer | La description |
| --- | --- | --- |
| ThrowException | `0` | Levez des exceptions s'il s'agit d'un SRS inconnu pour la base de données. |
| WriteInSystemTable | `1` | Écrivez les informations SRS dans la table système s'il s'agit d'un SRS inconnu pour la base de données. |
| SetupToZero | `2` | Configurez le SRID d'une géométrie sur "zéro" s'il s'agit d'un SRS inconnu pour la base de données. |

### Voir également

* espace de noms [Aspose.Gis](../../aspose.gis/)
* Assemblée [Aspose.GIS](../../)


