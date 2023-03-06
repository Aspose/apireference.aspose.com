---
title: FeaturesSequence.WhereIntersects
second_title: Aspose.GIS for .NET API Reference
description: FeaturesSequence method. Filters features based on the union of all geometries in other features sequence.
type: docs
weight: 100
url: /net/aspose.gis/featuressequence/whereintersects/
---
## WhereIntersects(FeaturesSequence) {#whereintersects_1}

Filters features based on the union of all geometries in other features sequence.

```csharp
public FeaturesSequence WhereIntersects(FeaturesSequence sequence)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sequence | FeaturesSequence | Other features sequence. |

### Return Value

Features that intersect with the union of all geometries in other features sequence.

### See Also

* class [FeaturesSequence](../)
* namespace [Aspose.Gis](../../featuressequence/)
* assembly [Aspose.GIS](../../../)

---

## WhereIntersects(IGeometry) {#whereintersects_2}

Filters features based on the provided geometry.

```csharp
public virtual FeaturesSequence WhereIntersects(IGeometry geometry)
```

| Parameter | Type | Description |
| --- | --- | --- |
| geometry | IGeometry | Filter geometry. |

### Return Value

Features that intersect with the provided geometry.

### See Also

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [FeaturesSequence](../)
* namespace [Aspose.Gis](../../featuressequence/)
* assembly [Aspose.GIS](../../../)

---

## WhereIntersects(Extent) {#whereintersects}

Filters features based on the extent.

```csharp
public virtual FeaturesSequence WhereIntersects(Extent extent)
```

| Parameter | Type | Description |
| --- | --- | --- |
| extent | Extent | Filter extent. |

### Return Value

Features that intersect with the provided geometry.

### See Also

* class [Extent](../../extent/)
* class [FeaturesSequence](../)
* namespace [Aspose.Gis](../../featuressequence/)
* assembly [Aspose.GIS](../../../)


