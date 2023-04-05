---
title: Interface ITrFont
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.ITrFont интерфейс. Этот интерфейс дает доступ к основным параметрам шрифта.
type: docs
weight: 260
url: /ru/net/aspose.page/itrfont/
---
## ITrFont interface

Этот интерфейс дает доступ к основным параметрам шрифта.

```csharp
public interface ITrFont
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [CharStrings](../../aspose.page/itrfont/charstrings/) { get; } | Возвращает соответствие между именем персонажа и глифом. |
| [Encoding](../../aspose.page/itrfont/encoding/) { get; } | Возвращает массив enbcoding. |
| [EncodingTable](../../aspose.page/itrfont/encodingtable/) { get; } | Возвращает имя кодировки. |
| [FID](../../aspose.page/itrfont/fid/) { get; } | Возвращает идентификатор шрифта. |
| [Font](../../aspose.page/itrfont/font/) { get; } | Возвращает DrFont, соответствующий этому шрифту. |
| [FontName](../../aspose.page/itrfont/fontname/) { get; } | Возвращает имя шрифта. |
| [FontType](../../aspose.page/itrfont/fonttype/) { get; } | Возвращает тип шрифта по классификации Adobe. |
| [NativeFont](../../aspose.page/itrfont/nativefont/) { get; } | Возвращает System.Drawing.Font, соответствующий этому шрифту. |
| [Size](../../aspose.page/itrfont/size/) { get; } | Возвращает размер шрифта. |
| [Style](../../aspose.page/itrfont/style/) { get; } | Возвращает стиль шрифта. |
| [Transform](../../aspose.page/itrfont/transform/) { get; } | Возвращает преобразование шрифта. |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../aspose.page/itrfont/clone/)() | Клонирует шрифт. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont)(float) | Создает эквивалент этого шрифта с новым размером. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_3)(FontStyle) | Создает эквивалент этого шрифта с новым стилем. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_2)(Matrix) | f character Создает эквивалент этого шрифта с новым преобразованием. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_1)(float, FontStyle) | Создает эквивалент этого шрифта с новым размером и стилем. |
| [GetCharWidth](../../aspose.page/itrfont/getcharwidth/)(char) | Возвращает ширину символа. |
| [GetOutline](../../aspose.page/itrfont/getoutline/)(char, float, float) | Возвращает контур глифа в указанном месте. |

### Смотрите также

* пространство имен [Aspose.Page](../../aspose.page/)
* сборка [Aspose.Page](../../)


