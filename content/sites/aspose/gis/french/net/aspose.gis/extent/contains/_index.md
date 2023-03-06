---
title: Extent.Contains
second_title: Référence de l'API Aspose.GIS pour .NET
description: Extent méthode. Détermine si cette étendue contient une coordonnée définie par les arguments.
type: docs
weight: 120
url: /fr/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

Détermine si cette étendue contient une coordonnée définie par les arguments.

```csharp
public bool Contains(double x, double y)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| x | Double | X de la coordonnée. |
| y | Double | Y de la coordonnée. |

### Return_Value

Valeur, indiquant si la coordonnée est à l'intérieur de la boîte englobante.

### Remarques

Coordonnées situées aux limites de ce[`Extent`](../) sont considérés comme contenus par ceci[`Extent`](../) .

### Voir également

* class [Extent](../)
* espace de noms [Aspose.Gis](../../extent/)
* Assemblée [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

Détermine si cette extension contient l'argument.

```csharp
public bool Contains(Extent extent)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| extent | Extent | Une autre mesure. |

### Return_Value

Valeur, indiquant si cette extension contient l'argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de cette ampleur et l'argument n'est pas`null` et pas égaux les uns aux autres. |

### Remarques

Coordonnées situées aux limites de ce[`Extent`](../) sont considérés comme contenus par ceci[`Extent`](../) . Pour cette raison, des étendues égales sont considérées pour se contenir.

### Voir également

* class [Extent](../)
* espace de noms [Aspose.Gis](../../extent/)
* Assemblée [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

Détermine si cette extension contient l'argument.

```csharp
public bool Contains(IGeometry geometry)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| geometry | IGeometry | Une géométrie à tester pour le confinement. |

### Return_Value

Valeur, indiquant si cette extension contient l'argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de cette ampleur et l'argument n'est pas`null` et pas égaux les uns aux autres. |

### Remarques

Coordonnées situées aux limites de ce[`Extent`](../) sont considérés comme contenus par ceci[`Extent`](../) .

### Voir également

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* espace de noms [Aspose.Gis](../../extent/)
* Assemblée [Aspose.GIS](../../../)


