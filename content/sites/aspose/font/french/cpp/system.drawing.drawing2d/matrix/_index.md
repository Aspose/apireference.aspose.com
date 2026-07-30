---
title: "Classe System::Drawing::Drawing2D::Matrix"
linktitle: "Matrix"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Drawing2D::Matrix. Représente une matrice 3x3 qui définit les opérations de transformation. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


Représente une matrice 3x3 qui définit les opérations de transformation. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class Matrix : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() const | Crée une copie de l'objet actuel. |
| [Dispose](./dispose/)() | Libère toutes les ressources du système d'exploitation acquises par l'objet actuel. |
| [Equals](./equals/)(ptr) override | Teste si l’objet spécifié est un [Matrix](./) et est identique à cet objet. |
| [get_Elements](./get_elements/)() const | Renvoie un tableau contenant les éléments de la matrice dans l’ordre suivant : m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | Détermine si la matrice représentée par l’objet actuel est une matrice identité. |
| [get_IsInvertible](./get_isinvertible/)() const | Détermine si la matrice représentée par l’objet actuel est inversible. |
| [get_OffsetX](./get_offsetx/)() const | Renvoie la valeur de translation X de la matrice représentée par l’objet actuel. |
| [get_OffsetY](./get_offsety/)() const | Renvoie la valeur de translation Y de la matrice représentée par l’objet actuel. |
| [Invert](./invert/)() | Inverse la matrice représentée par l’objet actuel. |
| [Matrix](./matrix/)() | Construit une nouvelle instance de la classe [Matrix](./) qui représente une matrice identité. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | Construit une nouvelle instance de la classe [Matrix](./) et l’initialise avec les valeurs spécifiées. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | Construit une nouvelle instance de la classe [Matrix](./) correspondant à la transformation géométrique définie par le rectangle et le tableau de points spécifiés. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | Construit une nouvelle instance de la classe [Matrix](./) correspondant à la transformation géométrique définie par le rectangle et le tableau de points spécifiés. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | Multiplie la matrice représentée par l’objet actuel par la matrice spécifiée. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Multiplie la matrice représentée par l’objet actuel par la matrice spécifiée. |
| [Reset](./reset/)() | Réinitialise la matrice représentée par l’objet actuel afin qu’elle devienne une matrice identité. |
| [Rotate](./rotate/)(float) | Fait pivoter la matrice représentée par l’objet actuel dans le sens horaire de l’angle spécifié. |
| [Rotate](./rotate/)(float, MatrixOrder) | Fait pivoter la matrice représentée par l’objet actuel dans le sens horaire autour de l’origine de l’angle spécifié. |
| [RotateAt](./rotateat/)(float, const PointF\&) | Fait pivoter la matrice représentée par l’objet actuel dans le sens horaire autour du point spécifié de l’angle spécifié. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | Fait pivoter la matrice représentée par l’objet actuel dans le sens horaire autour du point spécifié de l’angle spécifié. |
| [Scale](./scale/)(float, float) | Applique le vecteur d’échelle spécifié à la matrice représentée par l’objet actuel. |
| [Scale](./scale/)(float, float, MatrixOrder) | Applique le vecteur d’échelle spécifié à la matrice représentée par l’objet actuel. |
| [Shear](./shear/)(float, float) | Applique le vecteur de cisaillement spécifié à la matrice représentée par l’objet actuel. |
| [Shear](./shear/)(float, float, MatrixOrder) | Applique le vecteur de cisaillement spécifié à la matrice représentée par l’objet actuel. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | Applique la transformation géométrique définie par la matrice représentée par l’objet actuel aux points spécifiés. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | Applique la transformation géométrique définie par la matrice représentée par l’objet actuel aux points spécifiés. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | Applique la transformation géométrique définie par la matrice représentée par l’objet actuel aux points spécifiés. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | Applique la transformation géométrique définie par la matrice représentée par l’objet actuel aux points spécifiés. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | Applique uniquement les composantes d’échelle et de rotation de la matrice représentée par l’objet actuel aux points spécifiés. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | Applique uniquement les composantes d’échelle et de rotation de la matrice représentée par l’objet actuel aux points spécifiés. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | Applique uniquement les composantes d’échelle et de rotation de la matrice représentée par l’objet actuel aux points spécifiés. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | Applique uniquement les composantes d’échelle et de rotation de la matrice représentée par l’objet actuel aux points spécifiés. |
| [Translate](./translate/)(float, float) | Applique le vecteur de translation spécifié à la matrice représentée par l'objet actuel. |
| [Translate](./translate/)(float, float, MatrixOrder) | Applique le vecteur de translation spécifié à la matrice représentée par l'objet actuel. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | Multiplie chaque vecteur d'un tableau par la matrice représentée par l'objet actuel. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | Multiplie chaque vecteur d'un tableau par la matrice représentée par l'objet actuel. |
| virtual [~Matrix](./~matrix/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
