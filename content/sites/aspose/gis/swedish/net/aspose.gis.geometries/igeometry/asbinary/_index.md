---
title: IGeometry.AsBinary
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Översätter denna geometri till dess välkända binära representation.
type: docs
weight: 100
url: /sv/net/aspose.gis.geometries/igeometry/asbinary/
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

* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
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
* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


