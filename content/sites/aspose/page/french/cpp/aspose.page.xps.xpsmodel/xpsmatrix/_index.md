---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix classe"
linktitle: "XpsMatrix"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix classe. Classe encapsulant les caractéristiques de l'élément de propriété MatrixTransform. Cet élément définit une transformation matricielle affine arbitraire utilisée pour manipuler les systèmes de coordonnées des éléments en C++."
type: docs
weight: 2600
url: /fr/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Classe encapsulant les fonctionnalités de l'élément de propriété MatrixTransform. Cet élément définit une transformation matricielle affine arbitraire utilisée pour manipuler les systèmes de coordonnées des éléments.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Clone cette matrice de transformation. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Détermine si l'objet spécifié [System::Object](../../system/object/) est égal à cette instance. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | L'implémentation réelle. |
| [get_IsIdentity](./get_isidentity/)() | Obtient une valeur indiquant si cette instance est la matrice identité. |
| [get_M11](./get_m11/)() | Obtient l'élément M11. |
| [get_M12](./get_m12/)() | Obtient l'élément M12. |
| [get_M21](./get_m21/)() | Obtient l'élément M21. |
| [get_M22](./get_m22/)() | Obtient l'élément M22. |
| [get_M31](./get_m31/)() | Obtient l'élément M31. |
| [get_M32](./get_m32/)() | Obtient l'élément M32. |
| [GetHashCode](./gethashcode/)() const override | Renvoie un code de hachage pour cette instance. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multiplie cette matrice par la matrice spécifiée par le *matrix* dans l'ordre spécifié par *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Multiplie cette matrice par la matrice spécifiée par le *matrix*  dans l'ordre par défaut (Prepend). |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multiplie cette matrice par la matrice spécifiée par le *matrix* dans l'ordre spécifié par *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Multiplie cette matrice par la matrice spécifiée par le *matrix*  dans l'ordre par défaut (Prepend). |
| [Reset](./reset/)() | Réinitialise cette Matrice à la matrice identité. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Applique une rotation horaire de *angle*  à cette Matrice dans l'ordre spécifié par *matrixOrder*. |
| [Rotate](./rotate/)(float) | Applique une rotation horaire de *angle*  à cette Matrice dans l'ordre par défaut (Prepend). |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Applique une rotation horaire de *angle*  autour du *pivot*  à cette Matrice dans l'ordre spécifié par *matrixOrder*. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Applique une rotation horaire de *angle*  autour du *pivot*  à cette Matrice dans l'ordre par défaut (Prepend). |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette Matrice dans l'ordre spécifié par *matrixOrder*. |
| [Scale](./scale/)(float, float) | Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette Matrice dans l'ordre par défaut (Prepend). |
| [Skew](./skew/)(double, double) | Applique la transformation de cisaillement spécifiée à cette Matrice. |
| [ToString](./tostring/)() const override | Renvoie la représentation sous forme de chaîne de cette instance [XpsMatrix](./). |
| [Transform](./transform/)(System::Drawing::RectangleF) | Applique la transformation affine représentée par cette Matrice à un rectangle spécifié. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Applique la transformation affine représentée par cette Matrice à un point spécifié. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Applique la transformation affine représentée par cette Matrice à une partie spécifiée d'un tableau de points. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Applique la transformation affine représentée par cette Matrice à un tableau de points spécifié. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Applique le vecteur de translation spécifié à cette Matrice dans l'ordre spécifié par *matrixOrder*. |
| [Translate](./translate/)(float, float) | Applique le vecteur de translation spécifié à cette Matrice. |
## Voir aussi

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
