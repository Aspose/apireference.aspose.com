---
title: Class XpsMatrix
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsModel.XpsMatrix classe. Classe incorporant les fonctionnalités de lélément de propriété MatrixTransform. Cet élément définit une transformation de matrice affine arbitraire utilisée pour manipuler les systèmes de coordonnées des éléments.
type: docs
weight: 3220
url: /fr/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Classe incorporant les fonctionnalités de l'élément de propriété MatrixTransform. Cet élément définit une transformation de matrice affine arbitraire utilisée pour manipuler les systèmes de coordonnées des éléments.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Propriétés

| Nom | La description |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | Obtient une valeur indiquant si cette instance est une matrice d'identité. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | Obtient l'élément M11. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | Obtient l'élément M12. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | Obtient l'élément M21. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | Obtient l'élément M22. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | Obtient l'élément M31. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | Obtient l'élément M32. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | Clone cette matrice de transformation. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | Détermine si la valeur spécifiéeObject est égal à cette instance. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | Renvoie un code de hachage pour cette instance. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | Multiplie cette matrice par la matrice spécifiée par le*matrix* dans l'ordre par défaut (préfixe). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | Multiplie cette matrice par la matrice spécifiée par le*matrix* dans l'ordre par défaut (préfixe). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | Multiplie cette matrice par la matrice spécifiée par le*matrix* dans l'ordre spécifié par*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | Multiplie cette matrice par la matrice spécifiée par le*matrix* dans l'ordre spécifié par*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | Réinitialise cette matrice à la matrice d'identité. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | Applique une rotation dans le sens des aiguilles d'une*angle* à cette matrice dans l'ordre par défaut (préfixe). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | Applique une rotation dans le sens des aiguilles d'une*angle* à cette matrice dans order spécifié par*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | Applique une rotation dans le sens des aiguilles d'une*angle* autour de la*pivot* à cette matrice dans l'ordre par défaut (préfixe). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | Applique une rotation dans le sens des aiguilles d'une*angle* autour de la*pivot* à cette matrice dans l'ordre spécifié par*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette matrice dans l'ordre par défaut (préfixe). |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette matrice dans l'ordre spécifié par*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | Applique la transformation d'inclinaison spécifiée à cette matrice. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | Renvoie la représentation sous forme de chaîne de ce`XpsMatrix` instance. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | Applique la transformation affine représentée par cette matrice à un rectangle spécifié. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | Applique la transformation affine représentée par cette matrice à un point spécifié. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | Applique la transformation affine représentée par cette matrice à un tableau de points spécifié. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | Applique la transformation affine représentée par cette matrice à une partie spécifiée du tableau de points. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | Applique le vecteur de translation spécifié à cette matrice. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | Applique le vecteur de translation spécifié à cette matrice dans l'ordre spécifié par*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | La mise en œuvre réelle. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | Implémente l'opérateur ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | Implémente l'opérateur !=. |

### Voir également

* class [XpsObject](../xpsobject/)
* espace de noms [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* Assemblée [Aspose.Page](../../)


