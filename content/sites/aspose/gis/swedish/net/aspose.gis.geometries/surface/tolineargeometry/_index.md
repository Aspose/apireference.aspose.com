---
title: Surface.ToLinearGeometry
second_title: Aspose.GIS för .NET API Referens
description: Surface metod. Får ungefärlig eller likvärdig ickekurv version av denna geometri med standardtolerans .
type: docs
weight: 40
url: /sv/net/aspose.gis.geometries/surface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Får ungefärlig eller likvärdig icke-kurv version av denna geometri med standard`tolerans` .

```csharp
public IPolygon ToLinearGeometry()
```

### Returvärde

A[`IPolygon`](../../ipolygon/) som är ungefärlig eller likvärdig med detta`ISyta`. Detta är motsvarigheten till[`ToLinearGeometry`](../../isurface/tolineargeometry/) with default`tolerans` . Standard`tolerans` s värde är beroende av[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) av denna geometri:  För projicerad SRS är toleransen 0,001 meter (i SRS-enheter) För geografisk SRS Tolerans är`1e-5` grader (i SRS-enheter) För okänd SRS Tolerans är`1e-5` Se mer information om vilka transformationer som tillämpas[`ToLinearGeometry`](../../isurface/tolineargeometry/) specifikation.

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException | Denna geometri är ogiltig på ett sådant sätt att operationen inte kan slutföras. |

### Se även

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* namnutrymme [Aspose.Gis.Geometries](../../surface/)
* hopsättning [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Får ungefärlig eller likvärdig icke-kurv version av denna geometri med den angivna`tolerans` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| tolerance | Double | Den`tolerans`att använda. Resultatet blir garanterat mindre än`tolerans` bort från den krökta geometrin, såvida inte antalet punkter som behövs för att linjärisera geometrin överstiger maximivärdet per kvadrant, för närvarande lika med 10000 punkter. |

### Returvärde

A[`IPolygon`](../../ipolygon/) som är ungefärlig eller likvärdig med detta`ISyta` :  Om detta objekt är[`IPolygon`](../../ipolygon/) i sig är resultatet ekvivalent med detta objekt Om detta objekt inte är det[`IPolygon`](../../ipolygon/) den är linjäriserad och[`IPolygon`](../../ipolygon/) är skapad

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | `tolerans` är mindre än eller lika med`0` . |
| InvalidOperationException | Denna geometri är ogiltig på ett sådant sätt att operationen inte kan slutföras. |

### Se även

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* namnutrymme [Aspose.Gis.Geometries](../../surface/)
* hopsättning [Aspose.GIS](../../../)


