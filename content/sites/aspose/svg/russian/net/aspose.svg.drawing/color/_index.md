---
title: Class Color
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Drawing.Color сорт. Класс Color позволяет задавать цвета как значения RedGreenBlue RGB значения HueSaturationLuminosity HSL значения HueSaturationValue HSV HueWhitenessBlackness HWB  значения значения яркостиAB LAB значения LuminanceChromaHue LCH значения CyanMagentaYellowKey CMYK значения естественных цветов NCOL или с названием цвета . Также доступен альфаканал для обозначения прозрачности.
type: docs
weight: 1390
url: /ru/net/aspose.svg.drawing/color/
---
## Color class

Класс Color позволяет задавать цвета как значения Red-Green-Blue (RGB), значения Hue-Saturation-Luminosity (HSL), значения Hue-Saturation-Value (HSV), Hue-Whiteness-Blackness (HWB) ) значения, значения яркости-AB (LAB), значения Luminance-Chroma-Hue (LCH), значения Cyan-Magenta-Yellow-Key (CMYK), значения естественных цветов (NCOL), или с названием цвета . Также доступен альфа-канал для обозначения прозрачности.

```csharp
public class Color
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Color](color/#constructor)() | Инициализирует новый экземпляр`Color` class. По умолчанию черный цвет. |
| [Color](color/#constructor_1)(byte, byte, byte) | Инициализирует новый экземпляр`Color`class. Все компоненты цвета должны быть в диапазоне 0-255. |
| [Color](color/#constructor_5)(float, float, float) | Инициализирует новый экземпляр`Color` class. Все компоненты цвета должны быть в диапазоне 0-1. |
| [Color](color/#constructor_3)(int, int, int) | Инициализирует новый экземпляр`Color`class. Все компоненты цвета должны быть в диапазоне 0-255. |
| [Color](color/#constructor_2)(byte, byte, byte, byte) | Инициализирует новый экземпляр`Color`class. Все компоненты цвета должны быть в диапазоне 0-255. |
| [Color](color/#constructor_6)(float, float, float, float) | Инициализирует новый экземпляр`Color` class. Все компоненты цвета должны быть в диапазоне 0-1. |
| [Color](color/#constructor_4)(int, int, int, int) | Инициализирует новый экземпляр`Color`class. Все компоненты цвета должны быть в диапазоне 0-255. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha/) { get; } | Представляет альфа-компонент цвета. |
| [Blue](../../aspose.svg.drawing/color/blue/) { get; } | Представляет синий компонент цвета. |
| [Green](../../aspose.svg.drawing/color/green/) { get; } | Представляет зеленый компонент цвета. |
| [Red](../../aspose.svg.drawing/color/red/) { get; } | Представляет красный компонент цвета |

## Методы

| Имя | Описание |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk/)(float, float, float, float) | Возвращает новый цвет с запрошенными значениями голубого, пурпурного, желтого, ключевого (черного) цвета. |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka/)(float, float, float, float, float) | Возвращает новый цвет с запрошенными значениями голубого, пурпурного, желтого, ключевого (черного) и альфа-канала. |
| static [FromGray](../../aspose.svg.drawing/color/fromgray/)(float) | Возвращает новый цвет с запрошенным значением серого. |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl/)(float, float, float) | Возвращает новый цвет с запрошенными значениями оттенка, насыщенности, насыщенности. |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla/)(float, float, float, float) | Возвращает новый цвет с запрошенными значениями оттенка, насыщенности, насыщенности, альфа-канала. |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv/)(float, float, float) | Возвращает новый цвет с запрошенным оттенком, насыщенностью, значением. |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva/)(float, float, float, float) | Возвращает новый цвет с запрошенным оттенком, насыщенностью, значением, альфа-каналом. |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb/)(float, float, float) | Возвращает новый цвет с запрошенными значениями оттенка, белизны, черноты. |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba/)(float, float, float, float) | Возвращает новый цвет с запрошенными значениями оттенка, белизны, черноты. |
| static [FromInt](../../aspose.svg.drawing/color/fromint/)(int) | Возвращает новый цвет с запрошенным значением ARGB. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab/)(float, float, float) | Возвращает новый цвет с запрошенными значениями светлоты, A, B. |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba/)(float, float, float, float) | Возвращает новый цвет с запрошенными значениями светлоты, A, B, альфа. |
| static [FromLch](../../aspose.svg.drawing/color/fromlch/)(float, float, float) | Возвращает новый цвет с запрошенными значениями яркости, цветности и оттенка. |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha/)(float, float, float, float) | Возвращает новый цвет с запрошенными значениями яркости, цветности, оттенка и альфа-канала. |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab/)(float, float, float) | Возвращает новый цвет с запрошенными значениями светлоты, A, B для модели OKLAB. |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba/)(float, float, float, float) | Возвращает новый цвет с запрошенными значениями светлоты, A, B, альфа для модели OKLAB. |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch/)(float, float, float) | Возвращает новый цвет с запрошенными значениями яркости, цветности и оттенка для модели OKLAB. |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha/)(float, float, float, float) | Возвращает новый цвет с запрошенными значениями яркости, цветности, оттенка, альфа-канала для модели OKLAB. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb)(byte, byte, byte) | Возвращает новый цвет с запрошенными значениями ged, green, blue. Все компоненты цвета должны быть в диапазоне 0-255. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_2)(float, float, float) | Возвращает новый цвет с запрошенными значениями ged, green, blue. Все компоненты цвета должны быть в диапазоне 0-1. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_1)(int, int, int) | Возвращает новый цвет с запрошенными значениями ged, green, blue. Все компоненты цвета должны быть в диапазоне 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba)(byte, byte, byte, byte) | Возвращает новый цвет с запрошенными значениями ged, green, blue, alpha. Все компоненты цвета должны быть в диапазоне 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_2)(float, float, float, float) | Возвращает новый цвет с запрошенными значениями ged, green, blue, alpha. Все компоненты цвета должны быть в диапазоне 0-1. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_1)(int, int, int, int) | Возвращает новый цвет с запрошенными значениями ged, green, blue, alpha. Все компоненты цвета должны быть в диапазоне 0-255. |
| static [FromString](../../aspose.svg.drawing/color/fromstring/)(string) | Разбирает строку, содержащую цвет CSS, и возвращает новый цвет. |
| static [FromUint](../../aspose.svg.drawing/color/fromuint/)(uint) | Возвращает новый цвет с запрошенным значением ARGB. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity/)(float) | Создает копию цвета с суммой его яркости и значения дельты. |
| [Convert](../../aspose.svg.drawing/color/convert/)(ColorModel) | Возвращает компоненты цвета в формате указанной цветовой модели. |
| override [Equals](../../aspose.svg.drawing/color/equals/)(object) | Определяет, является ли указанный`Color` равен этому экземпляру. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary/)() | Возвращает новый цвет, который находится на противоположной стороне цветового круга от исходного. |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode/)() | Возвращает хэш-код. |
| [GetHue](../../aspose.svg.drawing/color/gethue/)() | Возвращает оттенок цвета. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity/)() | Возвращает яркость цвета. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation/)() | Возвращает насыщенность цвета. |
| [ToInt](../../aspose.svg.drawing/color/toint/)() | Кодирует компоненты Color ARGB в int. |
| [ToName](../../aspose.svg.drawing/color/toname/)() | Возвращает название цвета, если оно соответствует цвету в списке именованных цветов CSS, или пустую строку. |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring/)(int) | Возвращает указанный цвет Natural colors (NCol), используя букву цвета с числом, чтобы указать расстояние (в процентах) от цвета. |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring/)() | Возвращает шестнадцатеричный цвет, указанный с помощью: #RRGGBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring/)() | Возвращает строку, содержащую цвет RGBA, заданный следующим образом: rgba(R, G, B, A). |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring/)() | Возвращает шестнадцатеричный цвет, указанный с помощью: #RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring/)() | Возвращает строку, содержащую цвет RGB, заданный следующим образом: rgb(R, G, B). |
| override [ToString](../../aspose.svg.drawing/color/tostring/)() | Возвращает строку, состоящую из значений компонента RGBA. |
| [ToUint](../../aspose.svg.drawing/color/touint/)() | Кодирует компоненты Color ARGB в беззнаковое целое число. |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha/)(float) | Создает копию цвета с указанным альфа-компонентом. |
| [WithHue](../../aspose.svg.drawing/color/withhue/)(float) | Создает копию цвета с указанным оттенком. |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity/)(float) | Создает копию цвета с указанной яркостью. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation/)(float) | Создает копию цвета с указанной насыщенностью. |

### Смотрите также

* пространство имен [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* сборка [Aspose.SVG](../../)


