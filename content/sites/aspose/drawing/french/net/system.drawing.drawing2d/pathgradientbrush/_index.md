---
title: PathGradientBrush
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Encapsule unBrush objet qui remplit lintérieur dunGraphicsPath objet avec un dégradé. Cette classe ne peut pas être héritée.
type: docs
weight: 400
url: /fr/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Encapsule unBrush objet qui remplit l'intérieur d'unGraphicsPath objet avec un dégradé. Cette classe ne peut pas être héritée.

```csharp
public sealed class PathGradientBrush : Brush
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PathGradientBrush](pathgradientbrush#constructor)(GraphicsPath) | Initialise une nouvelle instance du[`PathGradientBrush`](../pathgradientbrush) classe avec le chemin spécifié. |
| [PathGradientBrush](pathgradientbrush#constructor_1)(PointF[]) | Initialise une nouvelle instance du[`PathGradientBrush`](../pathgradientbrush) classe avec les points spécifiés. |
| [PathGradientBrush](pathgradientbrush#constructor_3)(Point[]) | Initialise une nouvelle instance du[`PathGradientBrush`](../pathgradientbrush) classe avec les points spécifiés. |
| [PathGradientBrush](pathgradientbrush#constructor_2)(PointF[], WrapMode) | Initialise une nouvelle instance du[`PathGradientBrush`](../pathgradientbrush) classe avec les points spécifiés et le mode wrap. |
| [PathGradientBrush](pathgradientbrush#constructor_4)(Point[], WrapMode) | Initialise une nouvelle instance du[`PathGradientBrush`](../pathgradientbrush) classe avec les points spécifiés et le mode wrap. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend) { get; set; } | Obtient ou définit unBlend qui spécifie les positions et les facteurs qui définissent une atténuation personnalisée pour le gradient. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor) { get; set; } | Obtient ou définit la couleur au centre du dégradé du chemin. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint) { get; set; } | Obtient ou définit le point central du dégradé du chemin. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales) { get; set; } | Obtient ou définit le point focal pour l'atténuation du dégradé. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors) { get; set; } | Obtient ou définit unColorBlendqui définit un dégradé linéaire multicolore. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle) { get; } | Obtient un rectangle englobant pour celaPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors) { get; set; } | Obtient ou définit un tableau de couleurs qui correspondent aux points du chemin thisPathGradientBrush remplit. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform) { get; set; } | Obtient ou définit une copie duMatrix qui définit une transformation géométrique locale pour cettePathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode) { get; set; } | Obtient ou définit unWrapMode qui indique le wrap mode pour celaPathGradientBrush . |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone)() | Crée une copie exacte de ceciPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Libère toutes les ressources utilisées par cet objet Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform)(Matrix) | Met à jour la matrice de transformation du pinceau avec le produit de la matrice de transformation du pinceau multiplié par une autre matrice. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Met à jour la matrice de transformation du pinceau avec le produit de la matrice de transformation du pinceau multiplié par une autre matrice. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform)() | Réinitialise leTransform propriété à l'identité. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform)(float) | Fait pivoter la transformation géométrique locale de la quantité spécifiée. Cette méthode ajoute la rotation à la transformation. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Fait pivoter la transformation géométrique locale de la quantité spécifiée dans l'ordre spécifié. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform)(float, float) | Met à l'échelle la transformation géométrique locale selon les quantités spécifiées. Cette méthode ajoute la matrice de mise à l'échelle à la transformation. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Met à l'échelle la transformation géométrique locale selon les quantités spécifiées dans l'ordre spécifié. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Crée un dégradé avec une couleur centrale et une atténuation linéaire vers une couleur environnante. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Crée un dégradé avec une couleur centrale et une atténuation linéaire pour chaque couleur environnante. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape)(float) | Crée un pinceau dégradé qui change de couleur à partir du centre du chemin jusqu'à la limite du chemin. La transition d'une couleur à une autre est basée sur une courbe en forme de cloche. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Crée un pinceau dégradé qui change de couleur à partir du centre du chemin jusqu'à la limite du chemin. La transition d'une couleur à une autre est basée sur une courbe en forme de cloche. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform)(float, float) | Applique la traduction spécifiée à la transformation géométrique locale. Cette méthode ajoute la traduction au début de la transformation. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Applique la translation spécifiée à la transformation géométrique locale dans l'ordre spécifié. |

### Voir également

* class [Brush](../../system.drawing/brush)
* espace de noms [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
