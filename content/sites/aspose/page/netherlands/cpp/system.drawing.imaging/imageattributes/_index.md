---
title: "System::Drawing::Imaging::ImageAttributes class"
linktitle: "ImageAttributes"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::ImageAttributes class. Vertegenwoordigt informatie over hoe afbeeldingskleuren worden gemanipuleerd tijdens het renderen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Vertegenwoordigt informatie over hoe afbeeldingskleuren worden gemanipuleerd tijdens het renderen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ImageAttributes : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | NOG NIET GEÏMPLENTEERD. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [Clone](./clone/)() | Maakt een kopie van het huidige object. |
| [Dispose](./dispose/)() | Geeft alle door het huidige object verworven besturingssysteembronnen vrij. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [ImageAttributes](./imageattributes/)() | Standaardconstructor. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | NOG NIET GEÏMPLENTEERD. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Stelt de kleur‑aanpassingsmatrix in. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | NOG NIET GEÏMPLENTEERD. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Stelt de wrap‑modus en kleur in die worden gebruikt om te bepalen hoe een textuur over een vorm wordt getegeld, of op de grenzen van de vorm. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
