---
title: Interface ICircularString
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Geometries.ICircularString gränssnitt. En kurva med flera vertex med cirkulär interpolation mellan punkter.
type: docs
weight: 960
url: /sv/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

En kurva med flera vertex med cirkulär interpolation mellan punkter.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## Metoder

| namn | Beskrivning |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | Får en redigerbar kopia av denna geometri. |

### Anmärkningar

Den`CircularString` består av ett eller flera cirkelbågssegment anslutna ände till ände. De första tre punkterna definierar det första segmentet. Den första punkten är startpunkten för bågen. Den andra punkten är vilken som helst mellanpunkt på bågen förutom start- eller slutpunkten. Den tredje punkten är slutet av bågen. Efterföljande bågar definieras endast av deras mellanliggande och slutpunkter, eftersom startpunkten implicit definieras som det föregående segmentets slutpunkt.

### Se även

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* namnutrymme [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* hopsättning [Aspose.GIS](../../)


