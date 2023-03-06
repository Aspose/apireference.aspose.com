---
title: Class FileDriver
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.FileDriver classe. Un pilote pour un format de fichier spécifique.
type: docs
weight: 180
url: /fr/net/aspose.gis/filedriver/
---
## FileDriver class

Un pilote pour un format de fichier spécifique.

```csharp
public abstract class FileDriver : Driver
```

## Propriétés

| Nom | La description |
| --- | --- |
| abstract [CanCreateDatasets](../../aspose.gis/filedriver/cancreatedatasets/) { get; } | Obtient une valeur indiquant si ce pilote peut créer des ensembles de données. |
| abstract [CanCreateLayers](../../aspose.gis/filedriver/cancreatelayers/) { get; } | Obtient une valeur indiquant si ce pilote peut créer des couches vectorielles. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Obtient une valeur indiquant si ce pilote peut ouvrir des ensembles de données. |
| abstract [CanOpenLayers](../../aspose.gis/filedriver/canopenlayers/) { get; } | Obtient une valeur indiquant si ce pilote peut ouvrir des couches vectorielles. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset)(AbstractPath) | Crée un ensemble de données. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_2)(string) | Crée un ensemble de données. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | Crée un ensemble de données. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_3)(string, DriverOptions) | Crée un ensemble de données. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer)(AbstractPath) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_4)(string) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_1)(AbstractPath, DriverOptions) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_3)(AbstractPath, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_5)(string, DriverOptions) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_7)(string, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| abstract [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_6)(string, DriverOptions, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer)(AbstractPath, DriverOptions) | Ouvre un calque pour modification. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer_1)(string, DriverOptions) | Ouvre un calque pour modification. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset)(AbstractPath) | Ouvre le jeu de données. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_2)(string) | Ouvre le jeu de données. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | Ouvre le jeu de données. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_3)(string, DriverOptions) | Ouvre le jeu de données. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer)(AbstractPath) | Ouvre le calque pour la lecture. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_2)(string) | Ouvre le calque pour la lecture. |
| abstract [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Ouvre le calque pour la lecture. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_3)(string, DriverOptions) | Ouvre le calque pour la lecture. |
| abstract [SupportsSpatialReferenceSystem](../../aspose.gis/filedriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Détermine si le système de référence spatiale spécifié est pris en charge par le pilote. |

### Voir également

* class [Driver](../driver/)
* espace de noms [Aspose.Gis](../../aspose.gis/)
* Assemblée [Aspose.GIS](../../)


