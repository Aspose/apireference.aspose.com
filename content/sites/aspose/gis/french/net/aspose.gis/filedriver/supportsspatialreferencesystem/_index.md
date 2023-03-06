---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Référence de l'API Aspose.GIS pour .NET
description: FileDriver méthode. Détermine si le système de référence spatiale spécifié est pris en charge par le pilote.
type: docs
weight: 100
url: /fr/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Détermine si le système de référence spatiale spécifié est pris en charge par le pilote.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Valeur booléenne indiquant si le système de références spatiales spécifié est pris en charge par le pilote. `null` est considéré comme pris en charge par n'importe quel pilote.

### Remarques

Si le système de référence spatiale n'est pas pris en charge et que vous le transmettez à[`CreateLayer`](../createlayer/) méthode, aNotSupportedException sera lancé.

### Voir également

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)


