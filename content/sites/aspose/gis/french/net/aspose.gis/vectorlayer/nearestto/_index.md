---
title: VectorLayer.NearestTo
second_title: Référence de l'API Aspose.GIS pour .NET
description: VectorLayer méthode. Obtient lentité la plus proche des coordonnées fournies.
type: docs
weight: 150
url: /fr/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Obtient l'entité la plus proche des coordonnées fournies.

```csharp
public Feature NearestTo(double x, double y)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| x | Double | X de la coordonnée. |
| y | Double | Y de la coordonnée. |

### Return_Value

L'entité la plus proche des coordonnées fournies.

### Voir également

* class [Feature](../../feature/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Obtient l'entité la plus proche du point fourni.

```csharp
public Feature NearestTo(IPoint point)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| point | IPoint | Le point. |

### Return_Value

L'entité la plus proche du point fourni.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le point est`null`. |
| ArgumentException | Le point est vide ou non valide. |

### Voir également

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)


