---
title: Class Dataset
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Dataset klas. Ein Datensatz ist die Sammlung vonVectorLayer Instanzen.
type: docs
weight: 80
url: /de/net/aspose.gis/dataset/
---
## Dataset class

Ein Datensatz ist die Sammlung von[`VectorLayer`](../vectorlayer/) Instanzen.

```csharp
public abstract class Dataset : IDisposable
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Datensatz Vektorebenen erstellen kann. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Datensatz Vektorebenen entfernen kann. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | Ruft die ab[`Driver`](./driver/) die dieses Dataset instanziiert hat. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | Ruft die Anzahl der Layer in diesem Datensatz ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | Erstellt einen Datensatz. |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | Erstellt einen Datensatz. |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Erstellt einen Datensatz. |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | Erstellt einen Datensatz. |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | Öffnet den Datensatz. |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | Öffnet den Datensatz. |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | Öffnet den Datensatz. |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Öffnet den Datensatz. |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | Öffnet den Datensatz. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | Erstellt eine neue Vektorebene und öffnet sie zum Anhängen. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | Erstellt eine neue Vektorebene und öffnet sie zum Anhängen. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | Erstellt eine neue Vektorebene und öffnet sie zum Anhängen. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | Erstellt eine neue Vektorebene mit dem angegebenen Namen und öffnet sie zum Anhängen. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | Erstellt eine neue Vektorebene mit dem angegebenen Namen und öffnet sie zum Anhängen. |
| [Dispose](../../aspose.gis/dataset/dispose/)() | Gibt die Ressourcen frei, die von verwendet werden`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | Öffnet die Ebene mit dem angegebenen Namen zur Bearbeitung. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | Ruft den Namen der Ebene am angegebenen Index ab. |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | Öffnet die Ebene mit dem angegebenen Namen zum Lesen. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | Öffnet die Ebene am angegebenen Index zum Lesen. |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | Entfernt die Vektorebene mit dem angegebenen Namen. |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | Entfernt die Vektorebene am angegebenen Index. |

### Siehe auch

* namensraum [Aspose.Gis](../../aspose.gis/)
* Montage [Aspose.GIS](../../)


