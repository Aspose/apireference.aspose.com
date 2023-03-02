---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters klass. Parametrar för att skapa projicerad SRS. Vissa parametrar har standardvärden. Vissa parametrar har rimliga standardvärden så du behöver inte bara tilldela dem. Om du tilldelarnull för dessa parametrar kommer ett standardvärde att användas. ProjectionMethodName ochBase har inga standardvärden  du måste tilldela några ickenull värde till dessa egenskaper.
type: docs
weight: 2230
url: /sv/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Parametrar för att skapa projicerad SRS. Vissa parametrar har standardvärden. Vissa parametrar har rimliga standardvärden, så du behöver inte bara tilldela dem. Om du tilldelar`null` för dessa parametrar kommer ett standardvärde att användas. [`ProjectionMethodName`](./projectionmethodname/) och[`Base`](./base/) har inga standardvärden - du måste tilldela några icke`null` värde till dessa egenskaper.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | Default_Constructor |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Axlarnas ordning. Standard tillXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | Geografisk bas SRS (SRS som projektionen tillämpas på). Du MÅSTE ställa in den här egenskapen till att inte`null` värde för att skapa giltig SRS, den här egenskapen har ingen standard. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | Enheter som ska användas i denna SRS. Standard är[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Namn på projicerad SRS. Standard är "Unamed". |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Identifierare av projektionsmetod. Det finns inget standardvärde, du kan ställa in den här parametern till inte`null` värde, om du vill bifoga identifierare till projektion. Om du gör det - det är upp till dig att se till att identifieraren i konsekvent projektionsmetod namn (projektionsmetodnamnet kommer inte att ändras när du ställer in den här egenskapen). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Namn på projektionsmetod. Det finns ingen standard och du MÅSTE ställa in denna parameter på inte`null` värde, eftersom projicerad SRS utan projektionsnamn är värdelös. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | Axel som beskriver X (horisontell) dimension. Standard för axel med östlig riktning. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Axel som beskriver Y (vertikal) dimension. Standard för axel med nordlig riktning. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Lägger till projektionsparameter till denna SRS. Om parameter med ett sådant namn redan har lagts till - uppdatera den. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Hämtar projektionsparameter med angivet namn. |

### Se även

* namnutrymme [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* hopsättning [Aspose.GIS](../../)


