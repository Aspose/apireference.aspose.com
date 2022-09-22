---
title: Matrix
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Encapsule une matrice affine 3 par 3 qui représente une transformation géométrique. Cette classe ne peut pas être héritée.
type: docs
weight: 360
url: /fr/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Encapsule une matrice affine 3 par 3 qui représente une transformation géométrique. Cette classe ne peut pas être héritée.

```csharp
public sealed class Matrix : IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Matrix](matrix#constructor)() | Initialise une nouvelle instance de la classe Matrix en tant que matrice d'identité. |
| [Matrix](matrix#constructor_2)(Rectangle, Point[]) | Initialise une nouvelle instance du[`Matrix`](../matrix) class à la transformation géométrique définie par le rectangle et le tableau de points spécifiés. |
| [Matrix](matrix#constructor_3)(RectangleF, PointF[]) | Initialise une nouvelle instance du[`Matrix`](../matrix) class à la transformation géométrique définie par le rectangle et le tableau de points spécifiés. |
| [Matrix](matrix#constructor_1)(float, float, float, float, float, float) | Initialise une nouvelle instance de la classe Matrix avec les éléments spécifiés. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements) { get; } | Obtient un tableau de valeurs à virgule flottante qui représente les éléments de cette matrice. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity) { get; } | Obtient une valeur indiquant si cette matrice est la matrice d'identité. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible) { get; } | Obtient une valeur indiquant si cette matrice est inversible. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx) { get; } | Obtient la valeur de traduction x (la valeur dx ou l'élément de la troisième ligne et de la première colonne) de cette matrice. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety) { get; } | Obtient la valeur de traduction y (la valeur`mourir` valeur, ou l'élément de la troisième ligne et de la deuxième colonne) de cette matrice. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone)() | Crée une copie exacte de cette matrice. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose)() | Libère toutes les ressources utilisées par cette matrice. |
| [Invert](../../system.drawing.drawing2d/matrix/invert)() | Inverse cette Matrice, si elle est inversible. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply)(Matrix) | Multiplie ceciMatrix par la matrice spécifiée dans le*matrix* paramètre, en ajoutant le préfixe spécifiéMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | Multiplie ceciMatrix par la matrice spécifiée dans le*matrix* paramètre, et dans l'ordre spécifié dans le*order* paramètre. |
| [Reset](../../system.drawing.drawing2d/matrix/reset)() | Réinitialise ceciMatrixavoir les éléments de la matrice identité. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate)(float) | Préfixe à ceciMatrix une rotation dans le sens des aiguilles d'une montre, autour de l'origine et de l'angle spécifié. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate_1)(float, MatrixOrder) | Applique une rotation dans le sens des aiguilles d'une montre d'une quantité spécifiée dans le paramètre d'angle, autour de l'origine (zéro coordonnées x et y) pour cetteMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat)(float, PointF) | Applique une rotation dans le sens des aiguilles d'une montre à cette matrice autour du point spécifié dans le paramètre de point, et en ajoutant la rotation. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | Applique une rotation dans le sens des aiguilles d'une montre autour du point spécifié à cette matrice dans l'ordre spécifié. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale)(float, float) | Applique le vecteur d'échelle spécifié à cette matrice en ajoutant le vecteur d'échelle. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale_1)(float, float, MatrixOrder) | Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette matrice en utilisant l'ordre spécifié. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear)(float, float) | Applique le vecteur de cisaillement spécifié à cette matrice en ajoutant la transformation de cisaillement. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear_1)(float, float, MatrixOrder) | Applique le vecteur de cisaillement spécifié à cette matrice dans l'ordre spécifié. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints)(PointF[]) | Applique la transformation géométrique représentée par ceMatrix à un tableau de points spécifié. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints_1)(Point[]) | Applique la transformation géométrique représentée par ceMatrix à un tableau de points spécifié. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors)(PointF[]) | Multiplie chaque vecteur d'un tableau par la matrice. Les éléments de traduction de cette matrice (troisième ligne) sont ignorés. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate)(float, float) | Applique le vecteur de translation spécifié (offsetX et offsetY) à cette matrice en ajoutant le vecteur de translation au début. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate_1)(float, float, MatrixOrder) | Applique le vecteur de translation spécifié à cette matrice dans l'ordre spécifié. |

### Voir également

* espace de noms [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
