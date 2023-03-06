---
title: MultiCurve.ToLinearGeometry
second_title: Aspose.GIS voor .NET API-referentie
description: MultiCurve methode. Krijgt geschatte of equivalente nietkromme versie van deze geometrie met behulp van de gespecificeerdetolerantie .
type: docs
weight: 70
url: /nl/net/aspose.gis.geometries/multicurve/tolineargeometry/
---
## ToLinearGeometry(double) {#tolineargeometry_5}

Krijgt geschatte of equivalente niet-kromme versie van deze geometrie met behulp van de gespecificeerde`tolerantie` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tolerance | Double | De`tolerantie`gebruiken. Het resultaat is gegarandeerd minder dan`tolerantie` weg van de gebogen geometrie, tenzij het aantal punten dat nodig is om de geometrie te lineariseren het maximum per kwadrant overschrijdt, momenteel gelijk aan 10.000 punten. |

### Winstwaarde

EEN[`IMultiLineString`](../../imultilinestring/) die dit benadert of gelijkwaardig is[`IMultiCurve`](../../imulticurve/) :  Als dit object is[`IMultiLineString`](../../imultilinestring/) zelf is het resultaat gelijk aan dit object Als dit object dat niet is[`IMultiLineString`](../../imultilinestring/) - alle curven zijn gelineariseerd en nieuw`IMultiLineString` is gemaakt

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | `tolerantie` is kleiner dan of gelijk aan`0` . |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* naamruimte [Aspose.Gis.Geometries](../../multicurve/)
* montage [Aspose.GIS](../../../)

---

## ToLinearGeometry() {#tolineargeometry_4}

Krijgt een geschatte of gelijkwaardige niet-kromme versie van deze geometrie met de standaardwaarde`tolerantie` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### Winstwaarde

EEN[`IMultiLineString`](../../imultilinestring/) die dit benadert of gelijkwaardig is[`IMultiCurve`](../../imulticurve/). Dit is het equivalent van[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) met standaard`tolerantie` . Standaard`tolerantie` s waarde is afhankelijk van[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) van deze geometrie:  Voor geprojecteerde SRS-tolerantie is 0,001 meter (in SRS-eenheden) Voor geografische SRS-tolerantie is`1e-5` graden (in SRS-eenheden) Voor onbekende SRS Tolerantie is`1e-5` Raadpleeg voor meer details over welke transformaties worden toegepast[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) specificatie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* naamruimte [Aspose.Gis.Geometries](../../multicurve/)
* montage [Aspose.GIS](../../../)


