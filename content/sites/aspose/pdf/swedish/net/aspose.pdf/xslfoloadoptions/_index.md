---
title: XslFoLoadOptions
second_title: Aspose.PDF för .NET API Referens
description: Representerar alternativ för att ladda/importera XSL-FO-fil till pdf-dokument.
type: docs
weight: 7580
url: /sv/net/aspose.pdf/xslfoloadoptions/
---
## XslFoLoadOptions class

Representerar alternativ för att ladda/importera XSL-FO-fil till pdf-dokument.

```csharp
public sealed class XslFoLoadOptions : XmlLoadOptions
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [XslFoLoadOptions](xslfoloadoptions#constructor)() | Skapar[`XslFoLoadOptions`](../xslfoloadoptions) objekt utan xsl-data. |
| [XslFoLoadOptions](xslfoloadoptions#constructor_1)(Stream) | Skapar[`XslFoLoadOptions`](../xslfoloadoptions) objekt med xsl-data. |
| [XslFoLoadOptions](xslfoloadoptions#constructor_2)(string) | Skapar[`XslFoLoadOptions`](../xslfoloadoptions) objekt med xsl-data. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [BasePath](../../aspose.pdf/xslfoloadoptions/basepath) { get; set; } | Bassökvägen/webbadressen från vilken det söks relativa sökvägar till externa resurser (om några) som refereras till i inläst SVG-fil. |
| [LoadFormat](../../aspose.pdf/loadoptions/loadformat) { get; } | Representerar filformat som[`LoadOptions`](../loadoptions) beskriver. |
| [WarningHandler](../../aspose.pdf/loadoptions/warninghandler) { get; set; } | Återuppringning för att hantera eventuella genererade varningar. WarningHandler returnerar ReturnAction enum-objektet som anger antingen Fortsätt eller Avbryt. Fortsätt är standardåtgärden och Load-operationen fortsätter, men användaren kan också returnera Avbryt i vilket fall Load-operationen bör upphöra. |
| [XslStream](../../aspose.pdf/xmlloadoptions/xslstream) { get; } | Får xsl-data för att konvertera xml till pdf-dokument. |
| [XsltArgumentList](../../aspose.pdf/xslfoloadoptions/xsltargumentlist) { get; set; } | XsltArgumentList för att infoga värden i befintliga xls-parametrar  XLS-filen har 'animal'-parameter utan värde: XsltArgumentList args = new XsltArgumentList(); args.AddParam("djur", "", "katt"); antar nu att det finns en 'd_animal' ' parameter med värdet 'cat' i XLS-filen. |

## Fält

| namn | Beskrivning |
| --- | --- |
| [ParsingErrorsHandlingType](../../aspose.pdf/xslfoloadoptions/parsingerrorshandlingtype) | Käll XSLFO-dokument kan innehålla formateringsfel. Denna uppräkning räknar upp möjliga strategier för att hantera felen |

### Se även

* class [XmlLoadOptions](../xmlloadoptions)
* namnutrymme [Aspose.Pdf](../../aspose.pdf)
* hopsättning [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
