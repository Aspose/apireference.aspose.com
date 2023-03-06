---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid classe. Una griglia di precisione delle coordinate allinterno di un livello FileGDB.
type: docs
weight: 250
url: /it/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

Una griglia di precisione delle coordinate all'interno di un livello FileGDB.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | Default_Costruttore |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | Ottiene o imposta l'origine della coordinata M. Se impostato su`null` viene utilizzato il valore predefinito. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | Ottiene o imposta la scala della coordinata M. Se impostato su`null` viene utilizzato il valore predefinito. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | Ottiene o imposta l'origine della coordinata X. Se impostato su`null` viene utilizzato il valore predefinito. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | Ottiene o imposta la scala delle coordinate X e Y. Se impostato su`null` viene utilizzato il valore predefinito. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Ottiene o imposta l'origine della coordinata Y. Se impostato su`null` viene utilizzato il valore predefinito. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Ottiene o imposta l'origine della coordinata Z. Se impostato su`null` viene utilizzato il valore predefinito. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Ottiene o imposta la scala della coordinata Z. Se impostato su`null` viene utilizzato il valore predefinito. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Crea nuovo`FileGdbCoordinatePrecisionGrid` tale che tutti i valori all'interno di un rettangolo siano rappresentabili. |

### Osservazioni

La griglia di precisione delle coordinate definisce il dominio valido e la risoluzione delle coordinate nel livello FileGDB. Origin definisce il percorso per coordinare la griglia di precisione nello spazio. La scala definisce la risoluzione (maggiore è la scala , più precisi sono i valori scritti). La griglia di precisione specifica l'intervallo di valori valido per le coordinate: Ogni coordinata in[`VectorLayer`](../../aspose.gis/vectorlayer/)devono essere all'interno di questo intervallo. Le coordinate al di fuori dell'intervallo possono causare errori di lettura in seguito e verranno elaborate in modo errato da ArcGIS. Se non specifichi alcuna proprietà (mantienile`null` ) verranno utilizzati i valori predefiniti. I valori predefiniti dipendono da[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) del[`VectorLayer`](../../aspose.gis/vectorlayer/) . Per area geografica[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) i valori predefiniti sono: Per proiettato[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) i valori predefiniti sono: dove`XYTolleranza` ,`ZTolleranza` E`Tolleranza` sono valori da[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### Guarda anche

* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* assemblea [Aspose.GIS](../../)


