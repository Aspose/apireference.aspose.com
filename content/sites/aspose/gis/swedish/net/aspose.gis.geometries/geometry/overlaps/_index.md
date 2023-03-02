---
title: Geometry.Overlaps
second_title: Aspose.GIS för .NET API Referens
description: Geometry metod. Bestämmer om denna geometri överlappar med en specificerad geometri.
type: docs
weight: 290
url: /sv/net/aspose.gis.geometries/geometry/overlaps/
---
## Geometry.Overlaps method

Bestämmer om denna geometri överlappar med en specificerad geometri.

```csharp
public bool Overlaps(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri. |

### Returvärde

`true` om denna geometri är "spatialt överlappar" en annan geometri.`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Anmärkningar

Denna metod testar om geometrier är överlappningar i termer av DE-9IM skärningsmatris. Två geometrier överlappar om de har några men inte alla inre punkter gemensamma och skärningspunkten mellan geometrierna har samma dimension som geometrierna själva. För tvåPoint geometrier eller tvåSurface geometrier denna metod motsvarar: För tvåLine geometrier denna metod motsvarar: För två geometrier som inte är lika[`Dimension`](../../igeometry/dimension/) denna metod återkommer alltid`false`. Se OpenGIS Simple Features Specification för mer information om DE-9IM och "spatialt överlappande" relation.

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Se även

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)


