---
title: "System::Drawing::Imaging::ImageAttributes класс"
linktitle: "ImageAttributes"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Imaging::ImageAttributes класс. Представляет информацию о том, как цвета изображения изменяются во время рендеринга. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 900
url: /ru/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Представляет информацию о том, как цвета изображения изменяются во время рендеринга. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class ImageAttributes : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | НЕ РЕАЛИЗОВАНО. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [Clone](./clone/)() | Создаёт копию текущего объекта. |
| [Dispose](./dispose/)() | Освобождает все ресурсы операционной системы, захваченные текущим объектом. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [ImageAttributes](./imageattributes/)() | Конструктор по умолчанию. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | НЕ РЕАЛИЗОВАНО. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Устанавливает матрицу коррекции цвета. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | НЕ РЕАЛИЗОВАНО. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Устанавливает режим обтекания и цвет, используемые для определения того, как текстура заполняет форму или её границы. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
