---
title: IGeometryCollection.ToLinearGeometry
second_title: Aspose.GIS för .NET API Referens
description: IGeometryCollection metod. Får ungefärlig eller likvärdig ickekurv version av denna geometri med standardtolerans .
type: docs
weight: 60
url: /sv/net/aspose.gis.geometries/igeometrycollection/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Får ungefärlig eller likvärdig icke-kurv version av denna geometri med standard`tolerans` .

```csharp
public IGeometryCollection ToLinearGeometry()
```

### Returvärde

En geometri som inte har några kurvgeometrier. Detta är motsvarigheten till`ToLinearGeometry` with default`tolerans` . Standard`tolerans` s värde är beroende av[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) av denna geometri:  För projicerad SRS är toleransen 0,001 meter (i SRS-enheter) För geografisk SRS Tolerans är`1e-5` grader (i SRS-enheter) För okänd SRS Tolerans är`1e-5` Se mer information om vilka transformationer som tillämpas`ToLinearGeometry` specifikation.

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException | Denna geometri är ogiltig på ett sådant sätt att operationen inte kan slutföras. |

### Se även

* interface [IGeometryCollection](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometrycollection/)
* hopsättning [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Får ungefärlig eller likvärdig icke-kurv version av denna geometri med den angivna`tolerans` .

```csharp
public IGeometryCollection ToLinearGeometry(double tolerance)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| tolerance | Double | Den`tolerans`att använda. Resultatet blir garanterat mindre än`tolerans` bort från den krökta geometrin, såvida inte antalet punkter som behövs för att linjärisera geometrin överstiger maximivärdet per kvadrant, för närvarande lika med 10000 punkter. |

### Returvärde

En geometri som inte har några kurvgeometrier. Följande transformationer tillämpas: CircularString s är linearized (omvandlas tillLineString s med specificerad*tolerance* )CompoundCurve s ansluts till`LineString` sCurvePolygon s förvandlas tillPolygon sMultiCurve s förvandlas tillMultiCurve sMultiSurface s förvandlas tillMultiPolygon s Som ett resultat[`HasCurveGeometry`](../../igeometry/hascurvegeometry/) av utgångsgeometrin är`false` .

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | `tolerans` är mindre än eller lika med`0` . |
| InvalidOperationException | Denna geometri är ogiltig på ett sådant sätt att operationen inte kan slutföras. |

### Se även

* interface [IGeometryCollection](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometrycollection/)
* hopsättning [Aspose.GIS](../../../)


