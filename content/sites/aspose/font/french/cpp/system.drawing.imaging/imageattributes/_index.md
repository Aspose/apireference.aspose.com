---
title: "Classe System::Drawing::Imaging::ImageAttributes"
linktitle: "ImageAttributes"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Imaging::ImageAttributes. Représente les informations sur la façon dont les couleurs d'image sont manipulées lors du rendu. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Représente les informations sur la façon dont les couleurs d'image sont manipulées lors du rendu. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class ImageAttributes : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | NON IMPLEMENTÉ. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [Clone](./clone/)() | Crée une copie de l'objet actuel. |
| [Dispose](./dispose/)() | Libère toutes les ressources du système d'exploitation acquises par l'objet actuel. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | NON IMPLEMENTÉ. |
| [ImageAttributes](./imageattributes/)() | Constructeur par défaut. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | NON IMPLEMENTÉ. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | NON IMPLEMENTÉ. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | NON IMPLEMENTÉ. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Définit la matrice d'ajustement des couleurs. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | NON IMPLEMENTÉ. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | NON IMPLEMENTÉ. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | NON IMPLEMENTÉ. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | NON IMPLEMENTÉ. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | NON IMPLEMENTÉ. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | NON IMPLEMENTÉ. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Définit le mode d'enveloppement et la couleur utilisés pour décider comment carreler une texture sur une forme, ou aux limites de la forme. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
