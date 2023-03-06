---
title: ICurve.ToLinearGeometry
second_title: Aspose.GIS voor .NET API-referentie
description: ICurve methode. Krijgt een geschatte of gelijkwaardige nietkromme versie van deze geometrie met de standaardwaardetolerantie .
type: docs
weight: 50
url: /nl/net/aspose.gis.geometries/icurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Krijgt een geschatte of gelijkwaardige niet-kromme versie van deze geometrie met de standaardwaarde`tolerantie` .

```csharp
public ILineString ToLinearGeometry()
```

### Winstwaarde

EEN[`ILineString`](../../ilinestring/) die deze curve benadert of equivalent is. Dit is het equivalent van`ToLinearGeometry` met standaard`tolerantie` . Standaard`tolerantie` s waarde is afhankelijk van[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) van deze geometrie:  Voor geprojecteerde SRS-tolerantie is 0,001 meter (in SRS-eenheden) Voor geografische SRS-tolerantie is`1e-5` graden (in SRS-eenheden) Voor onbekende SRS Tolerantie is`1e-5` Raadpleeg voor meer details over welke transformaties worden toegepast`ToLinearGeometry` specificatie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [ILineString](../../ilinestring/)
* interface [ICurve](../)
* naamruimte [Aspose.Gis.Geometries](../../icurve/)
* montage [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Krijgt geschatte of equivalente niet-kromme versie van deze geometrie met behulp van de gespecificeerde`tolerantie` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tolerance | Double | De`tolerantie`gebruiken. Het resultaat is gegarandeerd minder dan`tolerantie` weg van de gebogen geometrie, tenzij het aantal punten dat nodig is om de geometrie te lineariseren het maximum per kwadrant overschrijdt, momenteel gelijk aan 10.000 punten. |

### Winstwaarde

EEN[`ILineString`](../../ilinestring/) die deze curve benadert of equivalent is:  Als dit object is[`ILineString`](../../ilinestring/) zelf is het resultaat gelijk aan dit object Als dit object is[`ICircularString`](../../icircularstring/) het resultaat is de circulaire string gelineariseerd met de gespecificeerde*tolerance* Als dit object is[`ICompoundCurve`](../../icompoundcurve/) - alle krommen daaruit worden gelineariseerd en vervolgens samengevoegd[`ILineString`](../../ilinestring/)

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | `tolerantie` is kleiner dan of gelijk aan`0` . |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |

### Zie ook

* interface [ILineString](../../ilinestring/)
* interface [ICurve](../)
* naamruimte [Aspose.Gis.Geometries](../../icurve/)
* montage [Aspose.GIS](../../../)


