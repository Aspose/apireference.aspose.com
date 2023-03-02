---
title: IGeometry.Touches
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Bestämmer om denna geometri och en specificerad geometri berör.
type: docs
weight: 360
url: /sv/net/aspose.gis.geometries/igeometry/touches/
---
## IGeometry.Touches method

Bestämmer om denna geometri och en specificerad geometri berör.

```csharp
public bool Touches(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri. |

### Returvärde

`true` om denna geometri är "rumsligt berör" en annan geometri.`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Anmärkningar

Denna metod testar om geometrier berör varandra i termer av DE-9IM skärningsmatris. Två geometrier berör varandra om de har minst en gränspunkt gemensam, men inga inre punkter. Det vill säga: två[`LineString`](../../linestring/)berör varandra om de delar en ändpunkt, men inte delar ett segment, två polygoner berör varandra om de delar en del av yttre eller inre ring, men deras inre överlappar inte varandra. Denna metod motsvarar: Se OpenGIS Simple Features Specification för mer information om DE-9IM och "spatially touches" relation.

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### Se även

* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


