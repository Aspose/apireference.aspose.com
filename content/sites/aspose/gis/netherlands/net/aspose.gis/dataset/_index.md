---
title: Class Dataset
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Dataset klas. Een dataset is de verzameling vanVectorLayer instanties.
type: docs
weight: 80
url: /nl/net/aspose.gis/dataset/
---
## Dataset class

Een dataset is de verzameling van[`VectorLayer`](../vectorlayer/) instanties.

```csharp
public abstract class Dataset : IDisposable
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | Krijgt een waarde die aangeeft of deze gegevensset vectorlagen kan maken. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | Krijgt een waarde die aangeeft of deze dataset vectorlagen kan verwijderen. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | Krijgt de[`Driver`](./driver/) die deze dataset heeft geïnstantieerd. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | Krijgt het aantal lagen in deze dataset. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | Creëert een dataset. |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | Creëert een dataset. |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Creëert een dataset. |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | Creëert een dataset. |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | Opent de dataset. |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | Opent de dataset. |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | Opent de dataset. |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Opent de dataset. |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | Opent de dataset. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | Maakt een nieuwe vectorlaag en opent deze om toe te voegen. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | Maakt een nieuwe vectorlaag en opent deze om toe te voegen. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | Maakt een nieuwe vectorlaag en opent deze om toe te voegen. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | Maakt een nieuwe vectorlaag met opgegeven naam en opent deze om toe te voegen. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | Maakt een nieuwe vectorlaag met opgegeven naam en opent deze om toe te voegen. |
| [Dispose](../../aspose.gis/dataset/dispose/)() | Geeft de bronnen vrij die worden gebruikt door de`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | Opent de laag met opgegeven naam voor bewerking. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | Haalt de naam op van de laag op opgegeven index. |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | Opent de laag met opgegeven naam om te lezen. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | Opent de laag op gespecificeerde index om te lezen. |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | Verwijdert de vectorlaag met opgegeven naam. |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | Verwijdert de vectorlaag op gespecificeerde index. |

### Zie ook

* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


