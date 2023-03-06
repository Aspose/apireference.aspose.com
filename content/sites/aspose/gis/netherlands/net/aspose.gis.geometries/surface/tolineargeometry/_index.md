---
title: Surface.ToLinearGeometry
second_title: Aspose.GIS voor .NET API-referentie
description: Surface methode. Krijgt een geschatte of gelijkwaardige nietkromme versie van deze geometrie met de standaardwaardetolerantie .
type: docs
weight: 40
url: /nl/net/aspose.gis.geometries/surface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Krijgt een geschatte of gelijkwaardige niet-kromme versie van deze geometrie met de standaardwaarde`tolerantie` .

```csharp
public IPolygon ToLinearGeometry()
```

### Winstwaarde

EEN[`IPolygon`](../../ipolygon/) die dit benadert of gelijkwaardig is`ISurface`. Dit is het equivalent van[`ToLinearGeometry`](../../isurface/tolineargeometry/) met standaard`tolerantie` . Standaard`tolerantie` s waarde is afhankelijk van[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) van deze geometrie:  Voor geprojecteerde SRS-tolerantie is 0,001 meter (in SRS-eenheden) Voor geografische SRS-tolerantie is`1e-5` graden (in SRS-eenheden) Voor onbekende SRS Tolerantie is`1e-5` Raadpleeg voor meer details over welke transformaties worden toegepast[`ToLinearGeometry`](../../isurface/tolineargeometry/) specificatie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* naamruimte [Aspose.Gis.Geometries](../../surface/)
* montage [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Krijgt geschatte of equivalente niet-kromme versie van deze geometrie met behulp van de gespecificeerde`tolerantie` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tolerance | Double | De`tolerantie`gebruiken. Het resultaat is gegarandeerd minder dan`tolerantie` weg van de gebogen geometrie, tenzij het aantal punten dat nodig is om de geometrie te lineariseren het maximum per kwadrant overschrijdt, momenteel gelijk aan 10.000 punten. |

### Winstwaarde

EEN[`IPolygon`](../../ipolygon/) die dit benadert of gelijkwaardig is`ISurface` :  Als dit object is[`IPolygon`](../../ipolygon/) zelf is het resultaat gelijk aan dit object Als dit object dat niet is[`IPolygon`](../../ipolygon/) het is gelineariseerd en[`IPolygon`](../../ipolygon/) is gemaakt

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | `tolerantie` is kleiner dan of gelijk aan`0` . |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* naamruimte [Aspose.Gis.Geometries](../../surface/)
* montage [Aspose.GIS](../../../)


