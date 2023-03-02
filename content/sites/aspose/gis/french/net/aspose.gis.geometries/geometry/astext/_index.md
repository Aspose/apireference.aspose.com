---
title: Geometry.AsText
second_title: Référence de l'API Aspose.GIS pour .NET
description: Geometry méthode. Traduit cette géométrie en sa représentation textuelle connue.
type: docs
weight: 130
url: /fr/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

Traduit cette géométrie en sa représentation textuelle connue.

```csharp
public string AsText()
```

### Return_Value

Représentation textuelle bien connue de cette géométrie.

### Remarques

La sortie de cette méthode est dansIso Variante WKT. Le format numérique par défaut est[`General`](../../../aspose.gis/numericformat/general/) (avec une précision "0").

### Voir également

* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Traduit cette géométrie en sa représentation textuelle connue.

```csharp
public string AsText(WktVariant variant)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| variant | WktVariant | Variante de texte bien connue à utiliser. |

### Return_Value

Représentation textuelle bien connue de cette géométrie.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | La géométrie ne peut pas être représentée dans la variante WKT demandée. Actuellement, cela se produit lorsque [`HasCurveGeometry`](../hascurvegeometry/) de la géométrie est`true` et la variante WKT est SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* N'est pas valide[`WktVariant`](../../wktvariant/). |

### Remarques

Le format numérique par défaut est[`General`](../../../aspose.gis/numericformat/general/) (avec une précision "0").

### Voir également

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Traduit cette géométrie en sa représentation textuelle connue.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| variant | WktVariant | Variante de texte bien connue à utiliser. |
| format | NumericFormat | Format de coordonnées pour la conversion en chaîne. Voir le[`NumericFormat`](../../../aspose.gis/numericformat/) pour l'obtenir. |

### Return_Value

Représentation textuelle bien connue de cette géométrie.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | La géométrie ne peut pas être représentée dans la variante WKT demandée. Actuellement, cela se produit lorsque [`HasCurveGeometry`](../hascurvegeometry/) de la géométrie est`true` et la variante WKT est SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* N'est pas valide[`WktVariant`](../../wktvariant/). |

### Voir également

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)


