---
title: "classe System::Drawing::Pen"
linktitle: "Pen"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Pen. Représente des propriétés telles que la couleur, la largeur, etc. des lignes et courbes dessinées. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1500
url: /fr/cpp/system.drawing/pen/
---
## Pen class


Représente des propriétés telles que la couleur, la largeur, etc. des lignes et courbes dessinées. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class Pen : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Renvoie une copie de l'objet actuel. |
| [Dispose](./dispose/)() | Libère toutes les ressources opérationnelles acquises par l'objet actuel. |
| [get_Alignment](./get_alignment/)() const | Renvoie une valeur indiquant l'alignement de l'objet [Pen](./) actuel. |
| [get_Brush](./get_brush/)() | Renvoie l'objet [Brush](../brush/) de ce stylo. |
| [get_Color](./get_color/)() const | Renvoie la couleur de ce stylo. |
| [get_CompoundArray](./get_compoundarray/)() const | Renvoie un tableau de valeurs qui spécifie un stylo composé. |
| [get_DashCap](./get_dashcap/)() const | Renvoie une valeur indiquant le cap utilisé aux deux extrémités d'une ligne pointillée. |
| [get_DashOffset](./get_dashoffset/)() const | Renvoie la distance du début d'une ligne au début d'un motif de tirets. |
| [get_DashPattern](./get_dashpattern/)() const | Renvoie un tableau indiquant le motif de tirets personnalisé dans une ligne pointillée. |
| [get_DashStyle](./get_dashstyle/)() const | Renvoie une valeur qui indique le style de tiret de l'objet [Pen](./) actuel. |
| [get_EndCap](./get_endcap/)() const | Renvoie une valeur qui indique le cap de fin de ligne de l'objet [Pen](./) actuel. |
| [get_LineJoin](./get_linejoin/)() const | Renvoie une valeur qui indique comment les lignes tracées par cet objet [Pen](./) sont jointes. |
| [get_MiterLimit](./get_miterlimit/)() const | Renvoie la limite de l'épaisseur de la jointure sur un coin en onglet. |
| [get_PenType](./get_pentype/)() const | NON IMPLEMENTÉ. |
| [get_StartCap](./get_startcap/)() const | Renvoie une valeur qui indique le cap de départ de ligne de l'objet [Pen](./) actuel. |
| [get_Transform](./get_transform/)() | Renvoie une copie d'un objet Matrix qui spécifie les transformations géométriques pour le stylo représenté par l'objet actuel. |
| [get_Width](./get_width/)() const | Renvoie la largeur de l'objet [Pen](./) actuel. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Multiplie la matrice de transformation de l'objet actuel par la matrice spécifiée. |
| [Pen](./pen/)(const Color\&) | Construit un nouvel objet [Pen](./) représentant la couleur spécifiée. |
| [Pen](./pen/)(const Color\&, float) | Construit un nouvel objet [Pen](./) représentant la couleur et la largeur spécifiées. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | Construit un nouvel objet [Pen](./) et l'initialise avec l'objet [Brush](../brush/) spécifié. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | Construit un nouvel objet [Pen](./) et l'initialise avec l'objet [Brush](../brush/) spécifié. |
| [ResetTransform](./resettransform/)() | Réinitialise la matrice de transformation de l'objet actuel afin qu'elle devienne une matrice identité. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Fait pivoter la transformation géométrique locale de l'angle spécifié dans l'ordre spécifié. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Met à l'échelle la transformation géométrique locale par les facteurs spécifiés dans l'ordre spécifié. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | Définit l'alignement de l'objet [Pen](./) actuel. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | Définit l'objet [Brush](../brush/) de ce stylo. |
| [set_Color](./set_color/)(const Color\&) | Définit la couleur de ce stylo. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | Définit un tableau de valeurs qui spécifie un stylo composé. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Définit le cap de fin de ligne personnalisé. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Définit le cap de départ de ligne personnalisé. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | Définit une valeur qui spécifie le cap utilisé aux deux extrémités d'une ligne en pointillés. |
| [set_DashOffset](./set_dashoffset/)(float) | Définit la distance du début d'une ligne au commencement d'un motif de tirets. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | Définit un tableau spécifiant un motif de tirets personnalisé dans une ligne en pointillés. Le tableau est composé de nombres qui indiquent les longueurs des tirets et espaces alternés. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | Définit une valeur qui spécifie le style de tiret de l'objet [Pen](./) actuel. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | Définit le cap de fin de ligne de l'objet [Pen](./) actuel. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | Définit une valeur qui indique comment les lignes tracées par cet objet [Pen](./) sont jointes. |
| [set_MiterLimit](./set_miterlimit/)(float) | Définit la limite de l'épaisseur de la jointure sur un coin en onglet. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | Définit le cap de départ de ligne de l'objet [Pen](./) actuel. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Définit un objet Matrix qui spécifie les transformations géométriques pour le stylo représenté par l'objet actuel. |
| [set_Width](./set_width/)(float) | Définit la largeur de l'objet [Pen](./) actuel. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | NON IMPLEMENTÉ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Déplace la transformation géométrique locale selon les dimensions spécifiées dans l'ordre spécifié. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
