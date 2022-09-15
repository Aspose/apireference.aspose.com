---
title: LinearGradientBrush
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Encapsule unBrush avec un dégradé linéaire. Cette classe ne peut pas être héritée.
type: docs
weight: 340
url: /fr/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Encapsule unBrush avec un dégradé linéaire. Cette classe ne peut pas être héritée.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | Initialise une nouvelle instance du[`LinearGradientBrush`](../lineargradientbrush) classe avec les points et couleurs spécifiés. |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | Initialise une nouvelle instance du[`LinearGradientBrush`](../lineargradientbrush) classe avec les points et couleurs spécifiés. |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | Initialise une nouvelle instance du[`LinearGradientBrush`](../lineargradientbrush)classe basée sur un rectangle, couleurs de début et de fin et un angle d'orientation. |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Initialise une nouvelle instance du[`LinearGradientBrush`](../lineargradientbrush) classe basée sur un rectangle, couleurs de début et de fin et orientation. |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | Initialise une nouvelle instance du[`LinearGradientBrush`](../lineargradientbrush)classe basée sur un rectangle, couleurs de début et de fin et un angle d'orientation. |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Initialise une nouvelle instance du[`LinearGradientBrush`](../lineargradientbrush) classe basée sur un rectangle, couleurs de début et de fin, et un mode d'orientation. |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | Initialise une nouvelle instance du[`LinearGradientBrush`](../lineargradientbrush)classe basée sur un rectangle, couleurs de début et de fin et un angle d'orientation. |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | Initialise une nouvelle instance du[`LinearGradientBrush`](../lineargradientbrush)classe basée sur un rectangle, couleurs de début et de fin et un angle d'orientation. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | Obtient ou définit unBlend qui spécifie les positions et les facteurs qui définissent une atténuation custom pour le gradient. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | Obtient ou définit une valeur indiquant si la correction gamma est activée pour ceLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | Obtient ou définit unColorBlendqui définit un dégradé linéaire multicolore. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | Obtient ou définit les couleurs de début et de fin du dégradé. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | Obtient une région rectangulaire qui définit les points de départ et d'arrivée du dégradé. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | Obtient ou définit une copieMatrix qui définit une transformation géométrique locale pour cetteLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | Obtient ou définit unWrapMode énumération qui indique le wrap mode pour ceLinearGradientBrush . |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | Crée une copie exacte de ceciLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Libère toutes les ressources utilisées par cet objet Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | Multiplie leMatrix qui représente la transformée géométrique locale de cetteLinearGradientBrush par le spécifiéMatrix en ajoutant le spécifiéMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multiplie leMatrix qui représente la transformée géométrique locale de cetteLinearGradientBrush par le spécifiéMatrix dans l'ordre spécifié. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | Réinitialise leTransform propriété à l'identité. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | Fait pivoter la transformation géométrique locale de la quantité spécifiée. Cette méthode ajoute la rotation à la transformation. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Fait pivoter la transformation géométrique locale de la quantité spécifiée dans l'ordre spécifié. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | Met à l'échelle la transformation géométrique locale selon les quantités spécifiées. Cette méthode ajoute la matrice de mise à l'échelle à la transformation. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Met à l'échelle la transformation géométrique locale selon les quantités spécifiées dans l'ordre spécifié. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Crée un dégradé linéaire avec une couleur centrale et une atténuation linéaire vers une seule couleur aux deux extrémités. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Crée un dégradé linéaire avec une couleur centrale et une atténuation linéaire vers une seule couleur aux deux extrémités. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | Crée une atténuation du dégradé basée sur une courbe en forme de cloche. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Crée une atténuation du dégradé basée sur une courbe en forme de cloche. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | Traduit la transformation géométrique locale par les dimensions spécifiées. Cette méthode ajoute la traduction au début de la transformation. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Traduit la transformation géométrique locale par les dimensions spécifiées dans l'ordre spécifié. |

### Voir également

* class [Brush](../../system.drawing/brush)
* espace de noms [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
