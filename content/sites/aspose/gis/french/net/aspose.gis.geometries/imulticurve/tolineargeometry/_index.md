---
title: IMultiCurve.ToLinearGeometry
second_title: Référence de l'API Aspose.GIS pour .NET
description: IMultiCurve méthode. Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défauttolérance .
type: docs
weight: 20
url: /fr/net/aspose.gis.geometries/imulticurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### Return_Value

A[`IMultiLineString`](../../imultilinestring/) qui se rapproche ou équivaut à ceci[`IMultiCurve`](../). C'est l'équivalent de`ToLinearGeometry` with par défaut`tolérance` . Défaut`tolérance` la valeur de s dépend de[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) de cette géométrie :  Pour la tolérance SRS projetée est de 0,001 mètre (en unités SRS) Pour la tolérance géographique SRS est`1e-5` degrés (en unités SRS) Pour une tolérance SRS inconnue est`1e-5` Pour plus de détails sur les transformations appliquées, reportez-vous à`ToLinearGeometry` spécification.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | Cette géométrie est invalide de telle sorte que cette opération ne peut pas être terminée. |

### Voir également

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* espace de noms [Aspose.Gis.Geometries](../../imulticurve/)
* Assemblée [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| tolerance | Double | Le`tolérance`utiliser. Le résultat est garanti inférieur à`tolérance` loin de la géométrie courbe, sauf si le nombre de points nécessaires pour linéariser la géométrie dépasse le maximum par quadrant, actuellement égal à 10000 points. |

### Return_Value

A[`IMultiLineString`](../../imultilinestring/) qui se rapproche ou équivaut à ceci[`IMultiCurve`](../) :  Si cet objet est[`IMultiLineString`](../../imultilinestring/) lui-même le résultat est équivalent à cet objet Si cet objet n'est pas[`IMultiLineString`](../../imultilinestring/) - toutes les courbes sont linéarisées et nouvelles`IMultiLineString` est créé

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | `tolérance` est inférieur ou égal à`0` . |
| InvalidOperationException | Cette géométrie est invalide de telle sorte que cette opération ne peut pas être terminée. |

### Voir également

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* espace de noms [Aspose.Gis.Geometries](../../imulticurve/)
* Assemblée [Aspose.GIS](../../../)


