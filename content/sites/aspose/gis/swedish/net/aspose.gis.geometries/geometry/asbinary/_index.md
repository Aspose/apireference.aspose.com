---
title: Geometry.AsBinary
second_title: Aspose.GIS för .NET API Referens
description: Geometry metod. Översätter denna geometri till dess välkända binära representation.
type: docs
weight: 110
url: /sv/net/aspose.gis.geometries/geometry/asbinary/
---
## AsBinary() {#asbinary}

Översätter denna geometri till dess välkända binära representation.

```csharp
public byte[] AsBinary()
```

### Returvärde

Välkänd binär representation av denna geometri.

### Anmärkningar

Utgången av denna metod är inIso WKB variant.

### Se även

* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

Översätter denna geometri till dess välkända binära representation.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| variant | WkbVariant | Välkänd binär variant att använda. |

### Returvärde

Välkänd binär representation av denna geometri.

### Undantag

| undantag | skick |
| --- | --- |
| NotSupportedException | Geometri kan inte representeras i begärd WKB-variant. För närvarande händer detta när [`HasCurveGeometry`](../hascurvegeometry/) av geometri är`true` och WKB-varianten är SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* är inte en giltig[`WkbVariant`](../../wkbvariant/). |

### Se även

* enum [WkbVariant](../../wkbvariant/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)


