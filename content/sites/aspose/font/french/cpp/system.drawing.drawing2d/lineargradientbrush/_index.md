---
title: "System::Drawing::Drawing2D::LinearGradientBrush classe"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush class. Représente un pinceau à dégradé linéaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


Représente un pinceau à dégradé linéaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Crée une copie de l'objet actuel. |
| [get_Blend](./get_blend/)() const | Renvoie un mélange qui spécifie les facteurs et les positions des couleurs de base pour ce pinceau. |
| [get_GammaCorrection](./get_gammacorrection/)() const | Renvoie une valeur indiquant que la correction gamma est activée pour ce pinceau. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Renvoie un objet [ColorBlend](../colorblend/) qui définit un dégradé linéaire multicolore. |
| [get_LinearColors](./get_linearcolors/)() const | Renvoie les couleurs de départ et d'arrivée de ce dégradé. |
| [get_Rectangle](./get_rectangle/)() | Renvoie un rectangle englobant. |
| [get_Transform](./get_transform/)() const | Renvoie une copie d'un objet [Matrix](../matrix/) qui spécifie les transformations géométriques pour le pinceau représenté par l'objet actuel. |
| [get_WrapMode](./get_wrapmode/)() const | Renvoie le mode d'habillage. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | Informations RTTI. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | Construit une nouvelle instance de [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | Construit une nouvelle instance de [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | Construit une nouvelle instance de [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | Construit une nouvelle instance de [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | Construit une nouvelle instance de [LinearGradientBrush](./). |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Multiplie la matrice de transformation de l'objet actuel par la matrice spécifiée. |
| [ResetTransform](./resettransform/)() | Réinitialise la matrice de transformation de l'objet actuel. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | Fait pivoter la matrice de transformation de l'objet actuel. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | Met à l'échelle la matrice de transformation de l'objet actuel. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Définit un mélange qui spécifie les facteurs et les positions des couleurs de base pour ce pinceau. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | Définit l'état de la correction gamma pour ce pinceau. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Définit un objet [ColorBlend](../colorblend/) qui définit un dégradé linéaire multicolore. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | Définit les couleurs de départ et d'arrivée de ce dégradé. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Définit un objet [Matrix](../matrix/) qui spécifie les transformations géométriques pour le pinceau représenté par l'objet actuel. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Définit le mode d'enroulement. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | NON IMPLEMENTÉ. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | NON IMPLEMENTÉ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Applique une translation à la matrice de transformation de l'objet actuel. |
## Voir aussi

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
