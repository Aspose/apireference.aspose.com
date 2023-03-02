---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Aspose.GIS voor .NET API-referentie
description: FileGdbCoordinatePrecisionGrid methode. Creëert nieuweBestandGdbCoordinatePrecisionGrid zodat alle waarden binnen een rechthoek kunnen worden weergegeven.
type: docs
weight: 20
url: /nl/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

Creëert nieuwe`BestandGdbCoordinatePrecisionGrid` zodat alle waarden binnen een rechthoek kunnen worden weergegeven.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| p1 | IPoint | Een hoek van de rechthoek. |
| p2 | IPoint | Tegenoverliggende hoek van de rechthoek. Moet dezelfde afmetingen hebben als*p1*. |

### Winstwaarde

De`BestandGdbCoordinatePrecisionGrid`zodat alle waarden binnen een rechthoek kunnen worden weergegeven. Waarden buiten de rechthoek kunnen niet worden weergegeven, dus alle coördinaten die naar FileGDB layer worden geschreven, moeten zich binnen de rechthoek bevinden.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null` . |
| ArgumentException | *p1* En*p2* vormen geen geldige niet-lege rechthoek: *p1* of*p2* is leeg. HasZ' vlaggen van*p1* is niet gelijk aan 'HasZ' vlag van*p2* HasM' vlaggen van*p1* is niet gelijk aan 'HasM' vlag van*p2* X' coördinaat van*p1* is gelijk aan 'X'-coördinaat van*p2* Y'-coördinaat van*p1* is gelijk aan 'Y'-coördinaat van*p2* Z' coördinaat van*p1* is gelijk aan 'Z'-coördinaat van*p2* M' coördinaat van*p1* is gelijk aan 'M' coördinaat van*p2* Elke coördinaat isNaN of oneindig. |

### Zie ook

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* naamruimte [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* montage [Aspose.GIS](../../../)


