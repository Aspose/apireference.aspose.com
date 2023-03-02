---
title: Extent.Contains
second_title: Aspose.GIS voor .NET API-referentie
description: Extent methode. Bepaalt of dit bereik een coördinaat bevat dat is gedefinieerd door de argumenten.
type: docs
weight: 120
url: /nl/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

Bepaalt of dit bereik een coördinaat bevat dat is gedefinieerd door de argumenten.

```csharp
public bool Contains(double x, double y)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | Double | X van de coördinaat. |
| y | Double | Y van de coördinaat. |

### Winstwaarde

Waarde, die aangeeft of de coördinaat zich binnen het begrenzingsvak bevindt.

### Opmerkingen

Coördinaten op de grens hiervan[`Extent`](../) are wordt geacht hierdoor te zijn ingeperkt[`Extent`](../) .

### Zie ook

* class [Extent](../)
* naamruimte [Aspose.Gis](../../extent/)
* montage [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

Bepaalt of dit bereik het argument bevat.

```csharp
public bool Contains(Extent extent)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| extent | Extent | Een andere mate. |

### Winstwaarde

Waarde, die aangeeft of dit bereik het argument bevat.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van deze omvang en het argument zijn beide niet`null` en niet gelijk aan elkaar. |

### Opmerkingen

Coördinaten op de grens hiervan[`Extent`](../) are wordt geacht hierdoor te zijn ingeperkt[`Extent`](../) . Om deze reden wordt aangenomen dat gelijke delen elkaar bevatten.

### Zie ook

* class [Extent](../)
* naamruimte [Aspose.Gis](../../extent/)
* montage [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

Bepaalt of dit bereik het argument bevat.

```csharp
public bool Contains(IGeometry geometry)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| geometry | IGeometry | Een geometrie om te testen op insluiting. |

### Winstwaarde

Waarde, die aangeeft of dit bereik het argument bevat.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van deze omvang en het argument zijn beide niet`null` en niet gelijk aan elkaar. |

### Opmerkingen

Coördinaten op de grens hiervan[`Extent`](../) are wordt geacht hierdoor te zijn ingeperkt[`Extent`](../) .

### Zie ook

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* naamruimte [Aspose.Gis](../../extent/)
* montage [Aspose.GIS](../../../)


