---
title: IGeometry.Disjoint
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Bestämmer om denna geometri är osammanhängande från en specificerad geometri.
type: docs
weight: 180
url: /sv/net/aspose.gis.geometries/igeometry/disjoint/
---
## IGeometry.Disjoint method

Bestämmer om denna geometri är osammanhängande från en specificerad geometri.

```csharp
public bool Disjoint(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri. |

### Returvärde

`true` om denna geometri är "spatialt osammanhängande" från en annan geometri.`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Anmärkningar

Den här metoden testar om geometrier är disjunkta i termer av DE-9IM skärningsmatris. I grund och botten testar den att två geometrier inte har några gemensamma punkter. Denna metod motsvarar: Se OpenGIS Simple Features Specification för mer information om DE-9IM.

```csharp
this.Relate(other, "FF*FF****");
```

### Se även

* method [Intersects](../intersects/)
* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


