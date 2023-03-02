---
title: Geometry.Intersects
second_title: Aspose.GIS för .NET API Referens
description: Geometry metod. Bestämmer om denna geometri skär en specificerad utsträckning.
type: docs
weight: 280
url: /sv/net/aspose.gis.geometries/geometry/intersects/
---
## Intersects(Extent) {#intersects}

Bestämmer om denna geometri skär en specificerad utsträckning.

```csharp
public bool Intersects(Extent extent)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| extent | Extent | Omfattningen. |

### Returvärde

`true` om denna geometri skär utsträckningen;`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |

### Se även

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Bestämmer om denna geometri och en specificerad geometri skär varandra.

```csharp
public bool Intersects(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri. |

### Returvärde

`true` om denna geometri "spatialt skär" en annan geometri.`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Anmärkningar

Denna metod motsvarar: Detta är negationen av[`Disjoint`](../../igeometry/disjoint/) . Ser[`Disjoint`](../../igeometry/disjoint/) för mer information.

```csharp
!this.Disjoint(other);
```

### Se även

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)


