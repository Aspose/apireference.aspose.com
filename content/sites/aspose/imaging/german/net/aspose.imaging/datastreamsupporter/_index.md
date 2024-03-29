---
title: DataStreamSupporter
second_title: Aspose.Imaging für .NET-API-Referenz
description: Der Datenstromcontainer.
type: docs
weight: 810
url: /de/net/aspose.imaging/datastreamsupporter/
---
## DataStreamSupporter class

Der Datenstromcontainer.

```csharp
public abstract class DataStreamSupporter : DisposableObject
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [DataStreamContainer](../../aspose.imaging/datastreamsupporter/datastreamcontainer) { get; } | Ruft den Datenstrom des Objekts ab. |
| [Disposed](../../aspose.imaging/disposableobject/disposed) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz verworfen wird. |
| abstract [IsCached](../../aspose.imaging/datastreamsupporter/iscached) { get; } | Ruft einen Wert ab, der angibt, ob die Daten des Objekts derzeit zwischengespeichert sind und kein Datenlesen erforderlich ist. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| abstract [CacheData](../../aspose.imaging/datastreamsupporter/cachedata)() | Zwischenspeichert die Daten und stellt sicher, dass kein zusätzliches Laden von Daten aus der zugrunde liegenden Datei durchgeführt wird[`DataStreamContainer`](./datastreamcontainer) . |
| [Dispose](../../aspose.imaging/disposableobject/dispose)() | Verwirft die aktuelle Instanz. |
| virtual [Save](../../aspose.imaging/datastreamsupporter/save#save)() | Speichert die Daten des Objekts im aktuellen[`DataStreamSupporter`](../datastreamsupporter) . |
| [Save](../../aspose.imaging/datastreamsupporter/save#save_1)(Stream) | Speichert die Daten des Objekts im angegebenen Stream. |
| virtual [Save](../../aspose.imaging/datastreamsupporter/save#save_2)(string) | Speichert die Daten des Objekts am angegebenen Dateispeicherort. |
| virtual [Save](../../aspose.imaging/datastreamsupporter/save#save_3)(string, bool) | Speichert die Daten des Objekts am angegebenen Dateispeicherort. |

### Siehe auch

* class [DisposableObject](../disposableobject)
* namensraum [Aspose.Imaging](../../aspose.imaging)
* Montage [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
