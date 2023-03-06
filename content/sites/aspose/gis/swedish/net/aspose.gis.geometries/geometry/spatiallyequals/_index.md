---
title: Geometry.SpatiallyEquals
second_title: Aspose.GIS för .NET API Referens
description: Geometry metod. Bestämmer om denna geometri är rumsligt lika med en specificerad geometri.
type: docs
weight: 370
url: /sv/net/aspose.gis.geometries/geometry/spatiallyequals/
---
## Geometry.SpatiallyEquals method

Bestämmer om denna geometri är rumsligt lika med en specificerad geometri.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri. |

### Returvärde

`true` om denna geometri "rumsmässigt är lika med" specificerad geometri.`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Anmärkningar

Denna metod testar jämlikhet i termer av DE-9IM skärningsmatris. Det beror inte på order av komponenter (t.ex. ordning av inre ringar i polygon), Z- och M-värden. I grund och botten testar det att två geometrier upptar samma "utrymme" när de projiceras på tvådimensionellt utrymme. Denna metod motsvarar: Se OpenGIS Simple Features Specification för mer information om DE-9IM.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Se även

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)


