---
title: CsvDriver
second_title: Référence de l'API Aspose.GIS pour .NET
description: Un pilote pour le format CSV.
type: docs
weight: 180
url: /fr/net/aspose.gis.formats.csv/csvdriver/
---
## CsvDriver class

Un pilote pour le format CSV.

```csharp
public class CsvDriver : FileDriver
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [CsvDriver](csvdriver)() | Default_Constructor |

## Propriétés

| Nom | La description |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.csv/csvdriver/cancreatedatasets) { get; } | Obtient une valeur indiquant si ce pilote peut créer des ensembles de données. |
| override [CanCreateLayers](../../aspose.gis.formats.csv/csvdriver/cancreatelayers) { get; } | Obtient une valeur indiquant si ce pilote peut créer des couches vectorielles. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Obtient une valeur indiquant si ce pilote peut ouvrir des ensembles de données. |
| override [CanOpenLayers](../../aspose.gis.formats.csv/csvdriver/canopenlayers) { get; } | Obtient une valeur indiquant si ce pilote peut ouvrir des couches vectorielles. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Crée un ensemble de données. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Crée un ensemble de données. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | Crée un ensemble de données. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Crée un ensemble de données. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_3)(AbstractPath, CsvOptions) | Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_9)(string, CsvOptions) | Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_4)(AbstractPath, CsvOptions, SpatialReferenceSystem) | Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| override [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Ouvre un calque pour modification. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Ouvre un calque pour modification. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Ouvre le jeu de données. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Ouvre le jeu de données. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Ouvre le jeu de données. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Ouvre le jeu de données. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Ouvre le calque pour la lecture. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Ouvre le calque pour la lecture. |
| [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_2)(AbstractPath, CsvOptions) | Ouvre un calque pour la lecture. |
| override [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Ouvre un calque pour la lecture. |
| [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_5)(string, CsvOptions) | Ouvre un calque pour la lecture. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Ouvre le calque pour la lecture. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.csv/csvdriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Détermine si le système de référence spatiale spécifié est pris en charge par le pilote. |

### Voir également

* class [FileDriver](../../aspose.gis/filedriver)
* espace de noms [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
