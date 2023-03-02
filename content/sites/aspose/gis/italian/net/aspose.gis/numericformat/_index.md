---
title: Class NumericFormat
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.NumericFormat classe. NumericFormat vengono utilizzati per formattare tipi numerici comuni nel testo.
type: docs
weight: 1290
url: /it/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` vengono utilizzati per formattare tipi numerici comuni nel testo.

```csharp
public abstract class NumericFormat
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | Converte e tenta di garantire che un valore numerico convertito in una stringa venga analizzato nuovamente nello stesso valore numerico. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | Converte un numero in un testo a virgola fissa senza notazione scientifica. |
| static [General](../../aspose.gis/numericformat/general/)(int) | Converte un numero nella notazione scientifica oa virgola fissa più compatta, a seconda del tipo di numero e della presenza di un identificatore di precisione. Consigliato da usare. |

### Osservazioni

Ci sono tre tipi di`NumericFormat` :  Generale - notazione a virgola fissa o scientifica. Un certo numero di cifre è significativo. RoundTrip - notazione a virgola fissa o scientifica. Il numero massimo di cifre è significativo. Flat - notazione a virgola fissa. Un certo numero di cifre è significativo. A`NumericFormat` può essere impostato su[`IGeometry`](../../aspose.gis.geometries/igeometry/) attraverso[`AsText`](../../aspose.gis.geometries/igeometry/astext/) per specificare il formato numerico durante la traduzione della geometria nella sua rappresentazione Well-Known Text (WKT).

### Guarda anche

* spazio dei nomi [Aspose.Gis](../../aspose.gis/)
* assemblea [Aspose.GIS](../../)


