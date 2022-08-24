---
title: MapInfoInterchangeDriver
second_title: Référence de l'API Aspose.GIS pour .NET
description: Un pilote pour le format déchange MapInfo.
type: docs
weight: 510
url: /fr/net/aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/
---
## MapInfoInterchangeDriver class

Un pilote pour le format d'échange MapInfo.

```csharp
public sealed class MapInfoInterchangeDriver : FileDriver
```

## Propriétés

| Nom | La description |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/cancreatedatasets) { get; } | Obtient une valeur indiquant si ce pilote peut créer des ensembles de données. |
| override [CanCreateLayers](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/cancreatelayers) { get; } | Obtient une valeur indiquant si ce pilote peut créer des couches vectorielles. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Obtient une valeur indiquant si ce pilote peut ouvrir des ensembles de données. |
| override [CanOpenLayers](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/canopenlayers) { get; } | Obtient une valeur indiquant si ce pilote peut ouvrir des couches vectorielles. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Crée un ensemble de données. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Crée un ensemble de données. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | Crée un ensemble de données. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Crée un ensemble de données. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_7)(string, MapInfoInterchangeOptions) | Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| override [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_8)(string, MapInfoInterchangeOptions, SpatialReferenceSystem) | Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Ouvre un calque pour modification. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Ouvre un calque pour modification. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Ouvre le jeu de données. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Ouvre le jeu de données. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Ouvre le jeu de données. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Ouvre le jeu de données. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Ouvre le calque pour la lecture. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Ouvre le calque pour la lecture. |
| override [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Ouvre un calque pour la lecture. |
| [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_2)(AbstractPath, MapInfoInterchangeOptions) | Ouvre un calque pour la lecture. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Ouvre le calque pour la lecture. |
| [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_5)(string, MapInfoInterchangeOptions) | Ouvre un calque pour la lecture. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Détermine si le système de référence spatiale spécifié est pris en charge par le pilote. |

### Voir également

* class [FileDriver](../../aspose.gis/filedriver)
* espace de noms [Aspose.Gis.Formats.MapInfoInterchange](../../aspose.gis.formats.mapinfointerchange)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
