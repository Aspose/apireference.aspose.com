---
title: FileGdbOptions.XYTolerance
second_title: Aspose.GIS för .NET API Referens
description: FileGdbOptions fast egendom. X och Ysnäpptolerans.
type: docs
weight: 70
url: /sv/net/aspose.gis.formats.filegdb/filegdboptions/xytolerance/
---
## FileGdbOptions.XYTolerance property

X- och Y-snäpptolerans.

```csharp
public double? XYTolerance { get; set; }
```

### Anmärkningar

Detta är ett skapande alternativ och det påverkar inte läsningen. Den här parametern styr en snapping-tolerans som används för avancerade ArcGIS-funktioner. Den påverkar inte Aspose.GIS-beteendet, men den kan användas av ArcGIS. Enheten för parametern är enheten för det rumsliga referenssystemet. Om satt till`null` används standardinställningen. Standardvärdet beror på rumsliga referenssystem och är lika med 0,000000008983153 grader för geografiska system eller 0,001 meter för projicerade system (värden omvandlas till rumsliga referenssystemenheter). Om det rumsliga referenssystemet är okänt är standard_001_0.00.

### Se även

* class [FileGdbOptions](../)
* namnutrymme [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* hopsättning [Aspose.GIS](../../../)


