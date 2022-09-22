---
title: Font
second_title: Справочник по API Aspose.Drawing для .NET
description: Определяет определенный формат текста включая начертание размер и атрибуты стиля шрифта. Этот класс не может быть унаследован.
type: docs
weight: 500
url: /ru/net/system.drawing/font/
---
## Font class

Определяет определенный формат текста, включая начертание, размер и атрибуты стиля шрифта. Этот класс не может быть унаследован.

```csharp
public sealed class Font : IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Font](font#constructor)(Font, FontStyle) | Инициализирует новый экземпляр[`Font`](../font) класс использует указанный существующийFont а такжеFontStyle перечисление.. |
| [Font](font#constructor_1)(FontFamily, float) | Инициализирует новый экземпляр[`Font`](../font) класс. |
| [Font](font#constructor_7)(string, float) | Инициализирует новый экземпляр[`Font`](../font) класс, использующий указанный размер. |
| [Font](font#constructor_2)(FontFamily, float, FontStyle) | Инициализирует новый экземпляр[`Font`](../font) класс с использованием указанного размера и стиля.. |
| [Font](font#constructor_6)(FontFamily, float, GraphicsUnit) | Инициализирует новый экземпляр[`Font`](../font) класс, используя указанный размер и единицу измерения. Устанавливает стиль наRegular . |
| [Font](font#constructor_8)(string, float, FontStyle) | Инициализирует новый экземпляр[`Font`](../font) класс с использованием указанного размера и стиля. |
| [Font](font#constructor_12)(string, float, GraphicsUnit) | Инициализирует новый экземпляр[`Font`](../font) класс, используя указанный размер и единицу измерения. Стиль настроен наRegular . |
| [Font](font#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Инициализирует новый экземпляр[`Font`](../font) класс, использующий указанный размер, стиль и единицу измерения. |
| [Font](font#constructor_9)(string, float, FontStyle, GraphicsUnit) | Инициализирует новый экземпляр[`Font`](../font) класс, использующий указанный размер, стиль и единицу измерения. |
| [Font](font#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Инициализирует новый экземпляр[`Font`](../font) класс, использующий указанный размер, стиль, единицу измерения и набор символов.. |
| [Font](font#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Инициализирует новый экземпляр[`Font`](../font)класс, использующий указанный размер, стиль, единицу измерения и набор символов. |
| [Font](font#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Инициализирует новый экземпляр[`Font`](../font) класс, использующий указанный размер, стиль, единицу измерения и набор символов.. |
| [Font](font#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Инициализирует новый экземпляр[`Font`](../font) class, используя указанный размер, стиль, единицу измерения и набор символов. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | Получает значение, указывающее, является ли этоFont выделен жирным шрифтом. |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | ПолучаетFontFamily связанные с этимFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | Получает значение байта, указывающее набор символов GDI, которыйFont использует. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | Получает значение, указывающее, является ли этоFont получен из вертикального шрифта GDI.. |
| [Height](../../system.drawing/font/height) { get; } | Получает межстрочный интервал этого шрифта. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | Получает значение, указывающее, является ли шрифт членомSystemFonts . |
| [Italic](../../system.drawing/font/italic) { get; } | Получает значение, указывающее, является ли этоFont выделено курсивом. |
| [Name](../../system.drawing/font/name) { get; } | Получает имя лица этогоFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | Получает имя изначально указанного шрифта. |
| [Size](../../system.drawing/font/size) { get; } | Получает размер em этогоFont измеряется в единицах, указанных параметром the Unit свойство. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | Получает размер em в пунктах этогоFont . |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | Получает значение, указывающее, является ли этоFont определяет горизонтальную линию через шрифт. |
| [Style](../../system.drawing/font/style) { get; } | Получает информацию о стиле для этогоFont . |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | Получает имя системного шрифта, если свойство IsSystemFont возвращает значение true. |
| [Underline](../../system.drawing/font/underline) { get; } | Получает значение, указывающее, является ли этоFont подчеркнуто. |
| [Unit](../../system.drawing/font/unit) { get; } | Получает единицу измерения для этогоFont . |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | Создает точную копию этогоFont . |
| [Dispose](../../system.drawing/font/dispose)() | Освобождает все ресурсы, используемые этимFont . |
| override [Equals](../../system.drawing/font/equals)(object) | Указывает, является ли указанный объектFont и имеет то же самоеFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , иUnit значения свойств, как этоFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | Получает хэш-код для этогоFont . |
| [GetHeight](../../system.drawing/font/getheight#getheight)() | Возвращает межстрочный интервал в пикселях для этого шрифта. |
| [GetHeight](../../system.drawing/font/getheight#getheight_1)(float) | Возвращает высоту в пикселях этогоFontпри отрисовке на устройство с указанным вертикальным разрешением. |
| [GetHeight](../../system.drawing/font/getheight#getheight_2)(Graphics) | Возвращает межстрочный интервал в текущих единицах указанногоGraphics , этого шрифта. |
| override [ToString](../../system.drawing/font/tostring)() | Возвращает удобочитаемое строковое представление этогоFont . |

### Смотрите также

* пространство имен [System.Drawing](../../system.drawing)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
