---
title: VectorLayer.Item
second_title: Référence de l'API Aspose.GIS pour .NET
description: VectorLayer propriété. Obtient leFeature à lindex spécifié.
type: docs
weight: 70
url: /fr/net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

Obtient le[`Feature`](../../feature/) à l'index spécifié.

```csharp
public virtual Feature this[int index] { get; }
```

| Paramètre | La description |
| --- | --- |
| index | L'index de la fonction. |

### Valeur de la propriété

Le[`Feature`](../../feature/) .

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | est levée si la couche est ouverte en écriture seule. |
| ArgumentOutOfRangeException | L'index est hors plage. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de la fonctionnalité à partir du fichier. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [Feature](../../feature/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)


