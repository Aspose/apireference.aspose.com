---
title: Class SVGMatrix
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.DataTypes.SVGMatrix classe. De nombreuses opérations graphiques de SVG utilisent des matrices 2x3 de la forme  ace bdf qui lorsquelles sont développées en une matrice 3x3 à des fins darithmétique matricielle deviennent  ace bdf 0 0 1
type: docs
weight: 240
url: /fr/net/aspose.svg.datatypes/svgmatrix/
---
## SVGMatrix class

De nombreuses opérations graphiques de SVG utilisent des matrices 2x3 de la forme : [ace] [bdf] qui, lorsqu'elles sont développées en une matrice 3x3 à des fins d'arithmétique matricielle, deviennent : [ace] [bdf] [0 0 1]

```csharp
public class SVGMatrix : SVGValueType
```

## Propriétés

| Nom | La description |
| --- | --- |
| [A](../../aspose.svg.datatypes/svgmatrix/a/) { get; set; } | Le composant A de la matrice. |
| [B](../../aspose.svg.datatypes/svgmatrix/b/) { get; set; } | La composante B de la matrice. |
| [C](../../aspose.svg.datatypes/svgmatrix/c/) { get; set; } | Le composant C de la matrice. |
| [D](../../aspose.svg.datatypes/svgmatrix/d/) { get; set; } | Le composant D de la matrice. |
| [E](../../aspose.svg.datatypes/svgmatrix/e/) { get; set; } | Le composant E de la matrice. |
| [F](../../aspose.svg.datatypes/svgmatrix/f/) { get; set; } | La composante F de la matrice. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Libère les ressources non gérées et - éventuellement - gérées. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |
| [Multiply](../../aspose.svg.datatypes/svgmatrix/multiply/)(SVGMatrix) | Effectue une multiplication matricielle. Cette matrice est post-multipliée par une autre matrice, renvoyant la nouvelle matrice résultante. |
| [Rotate](../../aspose.svg.datatypes/svgmatrix/rotate/)(float) | Post-multiplie une transformation de rotation sur la matrice actuelle et renvoie la matrice résultante. |
| [Scale](../../aspose.svg.datatypes/svgmatrix/scale/)(float) | Post-multiplie une transformation d'échelle uniforme sur la matrice actuelle et renvoie la matrice résultante. |
| [ScaleNonUniform](../../aspose.svg.datatypes/svgmatrix/scalenonuniform/)(float, float) | Post-multiplie une transformation d'échelle non uniforme sur la matrice actuelle et renvoie la matrice résultante. |
| [SkewX](../../aspose.svg.datatypes/svgmatrix/skewx/)(float) | Post-multiplie une transformation skewX sur la matrice actuelle et renvoie la matrice résultante. |
| [SkewY](../../aspose.svg.datatypes/svgmatrix/skewy/)(float) | Post-multiplie une transformation asymétrique sur la matrice actuelle et renvoie la matrice résultante. |
| override [ToString](../../aspose.svg.datatypes/svgmatrix/tostring/)() | Renvoie unString qui représente cette instance. |
| [Translate](../../aspose.svg.datatypes/svgmatrix/translate/)(float, float) | Post-multiplie une transformation de translation sur la matrice actuelle et renvoie la matrice résultante. |

### Voir également

* class [SVGValueType](../svgvaluetype/)
* espace de noms [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* Assemblée [Aspose.SVG](../../)


