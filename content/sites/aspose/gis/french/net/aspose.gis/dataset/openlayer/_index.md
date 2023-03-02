---
title: Dataset.OpenLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: Dataset méthode. Ouvre le calque avec le nom spécifié pour la lecture.
type: docs
weight: 110
url: /fr/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

Ouvre le calque avec le nom spécifié pour la lecture.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| name | String | Nom du calque à ouvrir. |
| options | DriverOptions | Options ouvertes. |

### Return_Value

La couche s'est ouverte en lecture.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | La couche avec le nom spécifié n'existe pas ; L'objet Options a un type incorrect pour cet ensemble de données. |
| ArgumentException | L'objet Options a un type incorrect pour cet ensemble de données. |
| ArgumentNullException | Le nom est`null`. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de l'entité à partir de la couche. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* espace de noms [Aspose.Gis](../../dataset/)
* Assemblée [Aspose.GIS](../../../)


