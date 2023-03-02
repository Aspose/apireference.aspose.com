---
title: GdalDriver.CreateLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: GdalDriver méthode. Crée une couche et louvre pour ajouter de nouvelles fonctionnalités.
type: docs
weight: 40
url: /fr/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | DriverOptions | Options spécifiques au pilote. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | La couche existe déjà. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* espace de noms [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* Assemblée [Aspose.GIS](../../../)


