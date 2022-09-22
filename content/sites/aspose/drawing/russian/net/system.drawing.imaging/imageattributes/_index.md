---
title: ImageAttributes
second_title: Справочник по API Aspose.Drawing для .NET
description: Содержит информацию об управлении цветами растровых изображений и метафайлов во время рендеринга.
type: docs
weight: 740
url: /ru/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Содержит информацию об управлении цветами растровых изображений и метафайлов во время рендеринга.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [ImageAttributes](imageattributes)() | Инициализирует новый экземпляр[`ImageAttributes`](../imageattributes) класс. |

## Методы

| Имя | Описание |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | Очищает таблицу переназначения цветов кисти от этогоImageAttributes объект. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | Очищает ключ цвета (диапазон прозрачности) для категории по умолчанию. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | Очищает ключ цвета (диапазон прозрачности) для указанной категории. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | Очищает матрицу настройки цвета для категории по умолчанию. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | Очищает матрицу настройки цвета для указанной категории. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | Отключает гамма-коррекцию для категории по умолчанию. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | Отключает гамма-коррекцию для указанной категории. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | Очищает настройку NoOp для категории по умолчанию. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | Очищает настройку NoOp для указанной категории. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | Очищает настройку выходного канала CMYK (голубой-пурпурный-желтый-черный) для категории по умолчанию. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | Очищает настройку выходного канала (голубой-пурпурный-желтый-черный) для указанной категории. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | Очищает настройку цветового профиля выходного канала для категории по умолчанию. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Очищает настройку цветового профиля выходного канала для указанной категории. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | Очищает таблицу переназначения цветов для категории по умолчанию. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | Очищает таблицу переназначения цветов для указанной категории. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | Очищает пороговое значение для категории по умолчанию. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | Очищает пороговое значение для указанной категории. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | Создает точную копию этогоImageAttributes объект. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | Освобождает все ресурсы, используемые этимImageAttributes объект. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | Настраивает цвета в палитре в соответствии с настройками настройки указанной категории. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | Устанавливает таблицу переназначения цветов для категории кистей. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | Устанавливает ключ цвета для категории по умолчанию. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | Устанавливает цветовой ключ (диапазон прозрачности) для указанной категории. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | Задает матрицу настройки цвета и матрицу настройки оттенков серого для категории по умолчанию. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Задает матрицу настройки цвета и матрицу настройки оттенков серого для категории по умолчанию. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Задает матрицу настройки цвета и матрицу настройки оттенков серого для указанной категории. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | Задает матрицу настройки цвета для категории по умолчанию. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Задает матрицу настройки цвета для категории по умолчанию. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Задает матрицу настройки цвета для указанной категории. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | Устанавливает значение гаммы для категории по умолчанию. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | Устанавливает значение гаммы для указанной категории. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | Отключает настройку цвета для категории по умолчанию. Вы можете вызвать[`ClearNoOp`](./clearnoop) метод для восстановления настроек настройки цвета, которые были на месте до вызова в[`SetNoOp`](./setnoop) метод. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | Отключает настройку цвета для указанной категории. Вы можете позвонить в[`ClearNoOp`](./clearnoop) , чтобы восстановить параметры регулировки цвета, которые были установлены до call для[`SetNoOp`](./setnoop) метод. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | Устанавливает выходной канал CMYK (голубой-пурпурный-желтый-черный) для категории по умолчанию. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Устанавливает выходной канал CMYK (голубой-пурпурный-желтый-черный) для указанной категории. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | Устанавливает файл цветового профиля выходного канала для категории по умолчанию. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Устанавливает файл цветового профиля выходного канала для указанной категории. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | Задает таблицу переназначения цветов для категории по умолчанию. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | Задает таблицу переназначения цветов для указанной категории. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | Устанавливает порог (диапазон прозрачности) для категории по умолчанию. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | Устанавливает порог (диапазон прозрачности) для указанной категории. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | Устанавливает режим наложения, который используется для принятия решения о том, как размещать текстуру поперек формы или по ее границам. Текстура накладывается на форму, чтобы заполнить ее, когда текстура меньше, чем форма, которую она заполняет. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | Устанавливает режим обтекания и цвет, используемые для принятия решения о том, как размещать текстуру поперек формы или по границам формы. Текстура накладывается на форму, чтобы заполнить ее, когда текстура меньше, чем форма, которую она заполняет. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | Устанавливает режим обтекания и цвет, используемые для принятия решения о том, как размещать текстуру поперек формы или по границам формы. Текстура накладывается на форму, чтобы заполнить ее, когда текстура меньше, чем форма, которую она заполняет. |

### Смотрите также

* пространство имен [System.Drawing.Imaging](../../system.drawing.imaging)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
