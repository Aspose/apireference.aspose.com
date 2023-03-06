---
title: Class NumericFormat
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.NumericFormat classe. NumericFormat sont utilisés pour formater les types numériques courants dans le texte.
type: docs
weight: 1290
url: /fr/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` sont utilisés pour formater les types numériques courants dans le texte.

```csharp
public abstract class NumericFormat
```

## Propriétés

| Nom | La description |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | Convertit et tente de s'assurer qu'une valeur numérique qui est convertie en une chaîne est analysée de nouveau dans la même valeur numérique. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | Convertit un nombre en texte à virgule fixe sans notation scientifique. |
| static [General](../../aspose.gis/numericformat/general/)(int) | Convertit un nombre en la plus compacte des notations à virgule fixe ou scientifique, selon le type du nombre et si un spécificateur de précision est présent. Utilisation recommandée. |

### Remarques

Il existe trois types de`NumericFormat` :  Général - notation à virgule fixe ou scientifique. Un certain nombre de chiffres sont significatifs. RoundTrip - notation à virgule fixe ou scientifique. Max de chiffres sont significatifs. Bémol - notation à virgule fixe. Un certain nombre de chiffres sont significatifs. A`NumericFormat` peut être réglé sur[`IGeometry`](../../aspose.gis.geometries/igeometry/) via[`AsText`](../../aspose.gis.geometries/igeometry/astext/) afin de spécifier le format numérique lors de la traduction de la géométrie dans sa représentation Well-Known Text (WKT).

### Voir également

* espace de noms [Aspose.Gis](../../aspose.gis/)
* Assemblée [Aspose.GIS](../../)


