---
title: Curve.ToLinearGeometry
second_title: Référence de l'API Aspose.GIS pour .NET
description: Curve méthode. Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défauttolérance .
type: docs
weight: 70
url: /fr/net/aspose.gis.geometries/curve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` .

```csharp
public ILineString ToLinearGeometry()
```

### Return_Value

A[`ILineString`](../../ilinestring/) qui se rapproche ou l'équivalent de cette courbe. C'est l'équivalent de[`ToLinearGeometry`](../../icurve/tolineargeometry/) with par défaut`tolérance` . Défaut`tolérance` la valeur de s dépend de[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) de cette géométrie :  Pour la tolérance SRS projetée est de 0,001 mètre (en unités SRS) Pour la tolérance géographique SRS est`1e-5` degrés (en unités SRS) Pour une tolérance SRS inconnue est`1e-5` Pour plus de détails sur les transformations appliquées, reportez-vous à[`ToLinearGeometry`](../../icurve/tolineargeometry/) spécification.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | Cette géométrie est invalide de telle sorte que cette opération ne peut pas être terminée. |

### Voir également

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* espace de noms [Aspose.Gis.Geometries](../../curve/)
* Assemblée [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| tolerance | Double | Le`tolérance`utiliser. Le résultat est garanti inférieur à`tolérance` loin de la géométrie courbe, sauf si le nombre de points nécessaires pour linéariser la géométrie dépasse le maximum par quadrant, actuellement égal à 10000 points. |

### Return_Value

A[`ILineString`](../../ilinestring/) qui se rapproche ou équivaut à cette courbe :  Si cet objet est[`ILineString`](../../ilinestring/) lui-même le résultat est équivalent à cet objet Si cet objet est[`ICircularString`](../../icircularstring/) le résultat est la chaîne circulaire linéarisée avec le spécifié*tolerance* Si cet objet est[`ICompoundCurve`](../../icompoundcurve/) - toutes les courbes qui en découlent sont linéarisées puis jointes en[`ILineString`](../../ilinestring/)

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | `tolérance` est inférieur ou égal à`0` . |
| InvalidOperationException | Cette géométrie est invalide de telle sorte que cette opération ne peut pas être terminée. |

### Voir également

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* espace de noms [Aspose.Gis.Geometries](../../curve/)
* Assemblée [Aspose.GIS](../../../)


