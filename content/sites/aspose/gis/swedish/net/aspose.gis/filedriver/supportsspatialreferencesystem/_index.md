---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS för .NET API Referens
description: FileDriver metod. Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen.
type: docs
weight: 100
url: /sv/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Booleskt värde, som indikerar om specificerat rumsligt referenssystem stöds av drivrutinen. `null` anses stöds av alla drivrutiner.

### Anmärkningar

Om det rumsliga referenssystemet inte stöds, och du skickar det till[`CreateLayer`](../createlayer/) metod, aNotSupportedException kommer att kastas.

### Se även

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)


