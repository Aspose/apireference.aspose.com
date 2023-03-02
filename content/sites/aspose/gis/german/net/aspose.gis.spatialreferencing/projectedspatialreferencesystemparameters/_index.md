---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters klas. Parameter zum Erstellen von projizierten SRS. Einige Parameter haben Voreinstellungen. Einige Parameter haben vernünftige Voreinstellungen sodass Sie nicht nur diese zuweisen müssen. Wenn Sie zuweisennull Für diese Parameter wird ein Standardwert verwendet. ProjectionMethodName UndBase haben keine Voreinstellungen  Sie müssen einige nicht zuweisennull Wert für diese Eigenschaften.
type: docs
weight: 2230
url: /de/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Parameter zum Erstellen von projizierten SRS. Einige Parameter haben Voreinstellungen. Einige Parameter haben vernünftige Voreinstellungen, sodass Sie nicht nur diese zuweisen müssen. Wenn Sie zuweisen`null` Für diese Parameter wird ein Standardwert verwendet. [`ProjectionMethodName`](./projectionmethodname/) Und[`Base`](./base/) haben keine Voreinstellungen - Sie müssen einige nicht zuweisen`null` Wert für diese Eigenschaften.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | Default_Constructor |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Reihenfolge der Achsen. Standardmäßig aufXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | Geografische SRS-Basis (SRS, auf die die Projektion angewendet wird). Sie MÜSSEN diese Eigenschaft auf „nicht“ setzen`null` Wert, um gültige SRS zu erstellen, diese Eigenschaft hat keinen Standardwert. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | In diesem SRS zu verwendende Einheiten. Standard ist[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Name des geplanten SRS. Standard ist "Unbenannt". |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Kennung der Projektionsmethode. Es gibt keinen Standardwert, Sie können diesen Parameter auf not setzen`null` Wert, , wenn Sie eine Kennung an die Projektion anhängen möchten. Wenn Sie dies tun, liegt es an Ihnen, sicherzustellen, dass dieser Bezeichner im Namen der Projektionsmethode konsistent ist (der Name der Projektionsmethode ändert sich nicht, wenn Sie diese Eigenschaft festlegen). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Name der Projektionsmethode. Es gibt keinen Standardwert und Sie MÜSSEN diesen Parameter auf not setzen`null` Wert, da projizierte SRS ohne Projektionsnamen nutzlos ist. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | Achse, die die X-Dimension (horizontal) beschreibt. Standardmäßig Achse mit östlicher Richtung. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Achse, die die Y-Dimension (vertikal) beschreibt. Standardmäßig Achse mit Nordrichtung. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Fügt diesem SRS Projektionsparameter hinzu. Wenn ein Parameter mit diesem Namen bereits hinzugefügt wurde, aktualisieren Sie ihn. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Ruft Projektionsparameter mit dem angegebenen Namen ab. |

### Siehe auch

* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Montage [Aspose.GIS](../../)


