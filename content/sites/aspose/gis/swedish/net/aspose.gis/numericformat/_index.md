---
title: Class NumericFormat
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.NumericFormat klass. NumericFormat används för att formatera vanliga numeriska typer i text.
type: docs
weight: 1290
url: /sv/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` används för att formatera vanliga numeriska typer i text.

```csharp
public abstract class NumericFormat
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | Konverterar och försöker säkerställa att ett numeriskt värde som konverteras till en sträng tolkas tillbaka till samma numeriska värde. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | Konverterar ett tal till en fast punkttext utan en vetenskaplig notation. |
| static [General](../../aspose.gis/numericformat/general/)(int) | Konverterar ett tal till det mer kompakta av antingen fixpunkts- eller vetenskaplig notation, beroende på typen av siffra och om en precisionsspecifikator finns. Rekommenderas att använda. |

### Anmärkningar

Det finns tre typer av`NumericFormat` :  Allmänt - fast punkt eller vetenskaplig notation. Ett visst antal siffror är signifikanta. RoundTrip - fast punkt eller vetenskaplig notation. Max antal siffror är signifikanta. Platt - fast punktnotation. Ett visst antal siffror är signifikanta. A`NumericFormat` kan ställas in på[`IGeometry`](../../aspose.gis.geometries/igeometry/) via[`AsText`](../../aspose.gis.geometries/igeometry/astext/) för att specificera det numeriska formatet vid översättning av geometri till dess välkända text (WKT) representation.

### Se även

* namnutrymme [Aspose.Gis](../../aspose.gis/)
* hopsättning [Aspose.GIS](../../)


