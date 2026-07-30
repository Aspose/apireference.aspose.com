---
title: "classe System::Drawing::Drawing2D::PathGradientBrush"
linktitle: "PathGradientBrush"
second_title: "Aspose.Font pour C++"
description: "classe System::Drawing::Drawing2D::PathGradientBrush. Représente un pinceau qui remplit l'intérieur d'un objet GraphicsPath avec un dégradé. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


Représente un pinceau qui remplit l'intérieur d'un objet [GraphicsPath](../graphicspath/) avec un dégradé. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Crée une copie de l'objet actuel. |
| [get_Blend](./get_blend/)() const | NON IMPLEMENTÉ. |
| [get_CenterColor](./get_centercolor/)() const | Renvoie une couleur qui se trouve au centre du chemin rempli par l'objet actuel. |
| [get_CenterPoint](./get_centerpoint/)() const | Obtient le point central du dégradé. |
| [get_FocusScales](./get_focusscales/)() const | Obtient le point de focalisation pour la chute du dégradé. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Renvoie une valeur qui définit un dégradé linéaire multicolore. |
| [get_Rectangle](./get_rectangle/)() | NON IMPLEMENTÉ. |
| [get_SurroundColors](./get_surroundcolors/)() const | Renvoie les couleurs qui correspondent aux points du chemin que ce [PathGradientBrush](./) remplit. |
| [get_Transform](./get_transform/)() const | Renvoie une copie d'un objet [Matrix](../matrix/) qui spécifie les transformations géométriques pour le pinceau représenté par l'objet actuel. |
| [get_WrapMode](./get_wrapmode/)() const | Renvoie le mode d'habillage. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Multiplie la matrice de transformation de l'objet actuel par la matrice spécifiée. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | Informations RTTI. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | Construit une nouvelle instance de la classe [PathGradientBrush](./). |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | Construit une nouvelle instance de la classe [PathGradientBrush](./). |
| [ResetTransform](./resettransform/)() | Réinitialise la matrice de transformation de l'objet actuel afin qu'elle devienne une matrice identité. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Fait pivoter la transformation géométrique locale de l'angle spécifié dans l'ordre spécifié. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Met à l'échelle la transformation géométrique locale par les facteurs spécifiés dans l'ordre spécifié. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Définit un mélange qui spécifie les facteurs et les positions des couleurs de base pour ce pinceau. |
| [set_CenterColor](./set_centercolor/)(Color) | Définit une couleur qui se trouve au centre du chemin rempli par l'objet actuel. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | Définit le point central du dégradé. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | Définit le point de focalisation pour la chute du dégradé. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Définit une valeur qui définit un dégradé linéaire multicolore. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | Définit les couleurs qui correspondent aux points du chemin que remplit ce [PathGradientBrush](./). |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Définit un objet [Matrix](../matrix/) qui spécifie les transformations géométriques pour le pinceau représenté par l'objet actuel. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Définit le mode d'enroulement. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | NON IMPLEMENTÉ. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | NON IMPLEMENTÉ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Déplace la transformation géométrique locale selon les dimensions spécifiées dans l'ordre spécifié. |
## Voir aussi

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
