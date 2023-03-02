---
title: MultiSurface.ToLinearGeometry
second_title: Aspose.GIS voor .NET API-referentie
description: MultiSurface methode. Krijgt een geschatte of gelijkwaardige nietkromme versie van deze geometrie met de standaardwaardetolerantie .
type: docs
weight: 60
url: /nl/net/aspose.gis.geometries/multisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_4}

Krijgt een geschatte of gelijkwaardige niet-kromme versie van deze geometrie met de standaardwaarde`tolerantie` .

```csharp
public IMultiPolygon ToLinearGeometry()
```

### Winstwaarde

EEN[`IMultiPolygon`](../../imultipolygon/) die dit benadert of gelijkwaardig is[`IMultiSurface`](../../imultisurface/). Dit is het equivalent van[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) met standaard`tolerantie` . Standaard`tolerantie` s waarde is afhankelijk van[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) van deze geometrie:  Voor geprojecteerde SRS-tolerantie is 0,001 meter (in SRS-eenheden) Voor geografische SRS-tolerantie is`1e-5` graden (in SRS-eenheden) Voor onbekende SRS Tolerantie is`1e-5` Raadpleeg voor meer details over welke transformaties worden toegepast[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) specificatie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* naamruimte [Aspose.Gis.Geometries](../../multisurface/)
* montage [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_5}

Krijgt geschatte of equivalente niet-kromme versie van deze geometrie met behulp van de gespecificeerde`tolerantie` .

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tolerance | Double | De`tolerantie`gebruiken. Het resultaat is gegarandeerd minder dan`tolerantie` weg van de gebogen geometrie, tenzij het aantal punten dat nodig is om de geometrie te lineariseren het maximum per kwadrant overschrijdt, momenteel gelijk aan 10.000 punten. |

### Winstwaarde

EEN[`IMultiPolygon`](../../imultipolygon/) die dit benadert of gelijkwaardig is[`IMultiSurface`](../../imultisurface/) :  Als dit object is[`IMultiPolygon`](../../imultipolygon/) zelf is het resultaat gelijk aan dit object Als dit object dat niet is[`IMultiPolygon`](../../imultipolygon/) - alle oppervlakken zijn gelineariseerd en nieuw`IMultiPolygon` is gemaakt

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | `tolerantie` is kleiner dan of gelijk aan`0` . |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* naamruimte [Aspose.Gis.Geometries](../../multisurface/)
* montage [Aspose.GIS](../../../)


