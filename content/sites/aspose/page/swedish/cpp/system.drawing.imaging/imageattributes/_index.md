---
title: "System::Drawing::Imaging::ImageAttributes klass"
linktitle: "ImageAttributes"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Imaging::ImageAttributes klass. Representerar information om hur bildfärger manipuleras under rendering. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 900
url: /sv/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Representerar information om hur bildfärger manipuleras under rendering. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class ImageAttributes : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | INTE IMPLEMENTERAT. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [Clone](./clone/)() | Skapar en kopia av det aktuella objektet. |
| [Dispose](./dispose/)() | Frigör alla operativsystemresurser som erhållits av det aktuella objektet. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | INTE IMPLEMENTERAT. |
| [ImageAttributes](./imageattributes/)() | Standardkonstruktor. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | INTE IMPLEMENTERAT. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | INTE IMPLEMENTERAT. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | INTE IMPLEMENTERAT. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Ställer in färgjusteringsmatrisen. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | INTE IMPLEMENTERAT. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | INTE IMPLEMENTERAT. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | INTE IMPLEMENTERAT. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | INTE IMPLEMENTERAT. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | INTE IMPLEMENTERAT. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | INTE IMPLEMENTERAT. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Ställer in omslagsläget och färgen som används för att bestämma hur en textur ska tileas över en form, eller vid formgränser. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
