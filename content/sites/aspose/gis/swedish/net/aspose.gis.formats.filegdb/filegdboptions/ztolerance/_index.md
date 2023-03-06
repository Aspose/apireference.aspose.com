---
title: FileGdbOptions.ZTolerance
second_title: Aspose.GIS för .NET API Referens
description: FileGdbOptions fast egendom. Z snäpptolerans.
type: docs
weight: 80
url: /sv/net/aspose.gis.formats.filegdb/filegdboptions/ztolerance/
---
## FileGdbOptions.ZTolerance property

Z snäpptolerans.

```csharp
public double? ZTolerance { get; set; }
```

### Anmärkningar

Detta är ett skapande alternativ och det påverkar inte läsningen. Den här parametern styr en snapping-tolerans som används för avancerade ArcGIS-funktioner. Den påverkar inte Aspose.GIS-beteendet, men den kan användas av ArcGIS. Enheten för parametern är enheten för det rumsliga referenssystemet. Om satt till`null` , används standardinställningen. Om det rumsliga referenssystemet är unknown eller har mindre än tre dimensioner är standardvärdet 0,001. Om det rumsliga referenssystemet har tre dimensioner är standardvärdet 0,001 meter omvandlat till enheten för den tredje dimensionen.

### Se även

* class [FileGdbOptions](../)
* namnutrymme [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* hopsättning [Aspose.GIS](../../../)


