---
title: FileGdbOptions.GeometryFieldName
second_title: Aspose.GIS för .NET API Referens
description: FileGdbOptions fast egendom. Namn på geometrifältet.
type: docs
weight: 40
url: /sv/net/aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/
---
## FileGdbOptions.GeometryFieldName property

Namn på geometrifältet.

```csharp
public string GeometryFieldName { get; set; }
```

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Värdet är inte ett giltigt fältnamn. Ett giltigt fältnamn måste:  Vara inte`null` och inte tomtBörja med latinsk bokstav eller understreckInnehåller endast latinska bokstäver, siffror eller understreck |

### Anmärkningar

Detta är ett skapande alternativ och det påverkar inte läsningen. Definierar namnet på geometrifältet (kolumn). Standardinställningen är "SHAPE". Om något attribut i[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) har ett namn som är lika med värdet på den här egenskapen, då döps om detta attribut.

### Se även

* class [FileGdbOptions](../)
* namnutrymme [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* hopsättning [Aspose.GIS](../../../)


