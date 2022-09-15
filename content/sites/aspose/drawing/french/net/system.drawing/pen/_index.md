---
title: Pen
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Définit un objet utilisé pour dessiner des lignes et des courbes.
type: docs
weight: 910
url: /fr/net/system.drawing/pen/
---
## Pen class

Définit un objet utilisé pour dessiner des lignes et des courbes.

```csharp
public class Pen : IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Pen](pen#constructor)(Brush) | Initialise une nouvelle instance du[`Pen`](../pen) classe avec le spécifiéBrush . |
| [Pen](pen#constructor_2)(Color) | Initialise une nouvelle instance du[`Pen`](../pen) classe avec le spécifiéColor . |
| [Pen](pen#constructor_1)(Brush, float) | Initialise une nouvelle instance de la classe Pen avec le pinceau et la largeur spécifiés. |
| [Pen](pen#constructor_3)(Color, float) | Initialise une nouvelle instance de la classe Pen avec les propriétés Color et Width spécifiées. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment) { get; set; } | Obtient ou définit l'alignement pour cePen . |
| [Brush](../../system.drawing/pen/brush) { get; set; } | Obtient ou définit le Brush qui détermine les attributs de cePen . |
| [Color](../../system.drawing/pen/color) { get; set; } | Obtient ou définit la couleur de cePen . |
| [CompoundArray](../../system.drawing/pen/compoundarray) { get; set; } | Obtient ou définit un tableau de valeurs qui spécifie un stylo composé. Un stylo composé dessine une ligne composée composée de lignes parallèles et d'espaces. |
| [CustomEndCap](../../system.drawing/pen/customendcap) { get; set; } | Obtient ou définit une limite personnalisée à utiliser à la fin des lignes dessinées avec cePen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap) { get; set; } | Obtient ou définit une limite personnalisée à utiliser au début des lignes dessinées avec cePen . |
| [DashCap](../../system.drawing/pen/dashcap) { get; set; } | Obtient ou définit le style de majuscule utilisé à la fin des tirets qui composent les lignes pointillées dessinées avec this Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset) { get; set; } | Obtient ou définit la distance entre le début d'une ligne et le début d'un motif en tirets. |
| [DashPattern](../../system.drawing/pen/dashpattern) { get; set; } | Obtient ou définit un tableau de tirets et d'espaces personnalisés. |
| [DashStyle](../../system.drawing/pen/dashstyle) { get; set; } | Obtient ou définit le style utilisé pour les lignes en pointillés dessinées avec cePen . |
| [EndCap](../../system.drawing/pen/endcap) { get; set; } | Obtient ou définit le style de majuscule utilisé à la fin des lignes dessinées avec ce Pen. |
| [LineJoin](../../system.drawing/pen/linejoin) { get; set; } | Obtient ou définit le style de jointure pour les extrémités de deux lignes consécutives dessinées avec ce Pen. |
| [MiterLimit](../../system.drawing/pen/miterlimit) { get; set; } | Obtient ou définit la limite de l'épaisseur de la jointure sur un coin en onglet. |
| [PenType](../../system.drawing/pen/pentype) { get; } | Obtient le style des lignes dessinées avec ce Pen. |
| [StartCap](../../system.drawing/pen/startcap) { get; set; } | Obtient ou définit le style de majuscule utilisé au début des lignes dessinées avec ce Pen. |
| [Transform](../../system.drawing/pen/transform) { get; set; } | Obtient ou définit une copie de la transformation géométrique pour cePen . |
| [Width](../../system.drawing/pen/width) { get; set; } | Obtient ou définit la largeur de ce Pen, en unités de l'objet Graphics utilisé pour le dessin. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clone](../../system.drawing/pen/clone)() | Crée une copie exacte de ceciPen . |
| [Dispose](../../system.drawing/pen/dispose)() | Libère toutes les ressources utilisées par ce Pen. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform)(Matrix) | Multiplie la matrice de transformation pour cettePen par le spécifiéMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multiplie la matrice de transformation pour cettePen par le spécifiéMatrix dans l'ordre spécifié. |
| [ResetTransform](../../system.drawing/pen/resettransform)() | Réinitialise la matrice de transformation géométrique pour cePen à l'identité. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform)(float) | Fait pivoter la transformation géométrique locale selon l'angle spécifié. Cette méthode ajoute la rotation à la transformation. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Fait pivoter la transformation géométrique locale de l'angle spécifié dans l'ordre spécifié. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform)(float, float) | Met à l'échelle la transformation géométrique locale par les facteurs spécifiés. Cette méthode ajoute la matrice de mise à l'échelle à la transformation. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Met à l'échelle la transformation géométrique locale par les facteurs spécifiés dans l'ordre spécifié. |
| [SetLineCap](../../system.drawing/pen/setlinecap)(LineCap, LineCap, DashCap) | Définit les valeurs qui déterminent le style de capuchon utilisé pour terminer les lignes dessinées par ce[`Pen`](../pen) . |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform)(float, float) | Traduit la transformation géométrique locale par les dimensions spécifiées. Cette méthode ajoute la traduction à la transformation. |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Traduit la transformation géométrique locale par les dimensions spécifiées dans l'ordre spécifié. |

### Voir également

* espace de noms [System.Drawing](../../system.drawing)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
