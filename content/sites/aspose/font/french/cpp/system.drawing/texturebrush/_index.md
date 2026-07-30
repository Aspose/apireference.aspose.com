---
title: "Classe System::Drawing::TextureBrush"
linktitle: "TextureBrush"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::TextureBrush. Représente un pinceau qui utilise une image pour remplir l'intérieur d'une forme. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2800
url: /fr/cpp/system.drawing/texturebrush/
---
## TextureBrush class


Représente un pinceau qui utilise une image pour remplir l'intérieur d'une forme. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Crée une copie de l'objet actuel. |
| [get_Image](./get_image/)() | Renvoie une image utilisée par l'objet [TextureBrush](./) actuel. |
| [get_Transform](./get_transform/)() | Renvoie une copie d'un objet Matrix qui spécifie les transformations géométriques pour le pinceau représenté par l'objet actuel. |
| [get_WrapMode](./get_wrapmode/)() | Renvoie une valeur qui spécifie la façon dont le pinceau représenté par l'objet actuel est répété. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Multiplie la matrice de transformation de l'objet actuel par la matrice spécifiée. |
| [ResetTransform](./resettransform/)() | Réinitialise la matrice de transformation de l'objet actuel afin qu'elle devienne une matrice identité. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Fait pivoter la transformation géométrique locale de l'angle spécifié dans l'ordre spécifié. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Met à l'échelle la transformation géométrique locale par les facteurs spécifiés dans l'ordre spécifié. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | Définit un objet Matrix qui spécifie les transformations géométriques pour le pinceau représenté par l'objet actuel. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | Définit une valeur qui spécifie la façon dont le pinceau représenté par l'objet actuel est répété. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | Construit une nouvelle instance de la classe [TextureBrush](./) qui utilise l'image spécifiée. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | Construit une nouvelle instance de la classe [TextureBrush](./) qui utilise l'image spécifiée. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | Construit une nouvelle instance de la classe [TextureBrush](./) qui utilise l'image spécifiée. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | Construit une nouvelle instance de la classe [TextureBrush](./) qui utilise l'image spécifiée. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | Construit une nouvelle instance de la classe [TextureBrush](./) qui utilise l'image spécifiée. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Déplace la transformation géométrique locale selon les dimensions spécifiées dans l'ordre spécifié. |
| virtual [~TextureBrush](./~texturebrush/)() | Destructeur. |
## Voir aussi

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
