---
title: TopoJsonDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS för .NET API Referens
description: TopoJsonDriver metod. Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen.
type: docs
weight: 60
url: /sv/net/aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem/
---
## TopoJsonDriver.SupportsSpatialReferenceSystem method

Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen.

```csharp
public override bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Booleskt värde, som indikerar om specificerat rumsligt referenssystem stöds av drivrutinen.

### Anmärkningar

För TopoJSON är det enda stödda rumsliga referenssystemet "null", eftersom det inte finns något sätt att lagra rumslig referenssysteminformation i TopoJSON-filen och TopoJSON-specifikationen anger inte vad är det rumsliga referenssystemet för geometrier i TopoJSON-filen..

### Se även

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [TopoJsonDriver](../)
* namnutrymme [Aspose.Gis.Formats.TopoJson](../../topojsondriver/)
* hopsättning [Aspose.GIS](../../../)


