---
title: Class OutputStream
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.IO.OutputStream klass. En surrogatström omsluter den verkliga utströmmen och kontrollerar åtkomsten till den. OutputStream innehåller URIdata som beskriver platsen för utgångsströmmen.
type: docs
weight: 1980
url: /sv/net/aspose.svg.io/outputstream/
---
## OutputStream class

En surrogatström omsluter den verkliga utströmmen och kontrollerar åtkomsten till den. `OutputStream` innehåller URI-data som beskriver platsen för utgångsströmmen.

```csharp
public class OutputStream : Stream
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [OutputStream](outputstream/)(Stream, string) | Initierar en ny instans av`OutputStream` class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [CanRead](../../aspose.svg.io/outputstream/canread/) { get; } | Får ett värde som indikerar om den lindade utströmmen stöder läsning. |
| override [CanSeek](../../aspose.svg.io/outputstream/canseek/) { get; } | Får ett värde som indikerar om den lindade utströmmen stöder sökning. |
| override [CanWrite](../../aspose.svg.io/outputstream/canwrite/) { get; } | Får ett värde som indikerar om den lindade utdataströmmen stöder skrivning. |
| override [Length](../../aspose.svg.io/outputstream/length/) { get; } | Hämtar längden i byte för den lindade utströmmen. |
| override [Position](../../aspose.svg.io/outputstream/position/) { get; set; } | Hämtar eller ställer in positionen inom den lindade utströmmen. |
| [Uri](../../aspose.svg.io/outputstream/uri/) { get; } | Hämtar URI för strömningsplatsen. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| override [Close](../../aspose.svg.io/outputstream/close/)() | Stänger den lindade utströmmen och den aktuella strömmen. |
| override [Flush](../../aspose.svg.io/outputstream/flush/)() | Rensar alla buffertar för den lindade utströmmen och gör att all buffrad data skrivs till den underliggande enheten. |
| override [Read](../../aspose.svg.io/outputstream/read/)(byte[], int, int) | Läser en sekvens av byte från den lindade utdataströmmen och flyttar fram positionen i strömmen med antalet lästa byte. |
| override [Seek](../../aspose.svg.io/outputstream/seek/)(long, SeekOrigin) | Ställer in positionen inom den lindade utströmmen. |
| override [SetLength](../../aspose.svg.io/outputstream/setlength/)(long) | Ställer in längden på den lindade utströmmen. |
| override [Write](../../aspose.svg.io/outputstream/write/)(byte[], int, int) | Skriver en sekvens av byte till den omslutna output -strömmen och flyttar fram den aktuella positionen inom denna ström med antalet bytes som skrivs. |

### Se även

* namnutrymme [Aspose.Svg.IO](../../aspose.svg.io/)
* hopsättning [Aspose.SVG](../../)


