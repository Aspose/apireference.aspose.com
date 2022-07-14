---
title: TtfFont
second_title: Справочник по API Aspose.Font для .NET
description: Представляет шрифт TrueType TTF.
type: docs
weight: 630
url: /ru/net/aspose.font.ttf/ttffont/
---
## TtfFont class

Представляет шрифт TrueType (TTF).

```csharp
public class TtfFont : Font
```

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont) { get; } | Получает шрифт CFF, если он присутствует. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding) { get; } | Получает кодировку шрифта. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition) { get; } | Получает определение шрифта. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily) { get; set; } | Получает или устанавливает семейство шрифтов. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname) { get; set; } | Получает или устанавливает имя начертания шрифта. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames) { get; } | Получает имена шрифтов. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Получает функцию сохранения шрифта. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle) { get; } | Получает стиль шрифта. Это значение вычисляется и представляется в обобщенном виде. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype) { get; } | Получает тип шрифта. Возвращает значение FontType.TTF. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Аксессуар глифа шрифта. Извлекает глифы и идентификаторы глифов. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype) { get; } | Получает спецификацию типа идентификатора глифа. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic) { get; } | Возвращает true, если Font является символьным. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics) { get; } | Получает метрики шрифта. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs) { get; } | Получает количество глифов в шрифте. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames) { get; } | Получает имена шрифтов Postscript. |
| override [Style](../../aspose.font.ttf/ttffont/style) { get; set; } | Получает или устанавливает стиль шрифта. Это необработанное строковое значение, предоставленное файлом шрифта. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables) { get; } | Получает таблицы TTF. |

## Методы

| Имя | Описание |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert)(FontType) | Преобразует шрифт в другой формат. |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids)() | Возвращает массив всех идентификаторов глифов, доступных в Шрифте. Идентификатор глифа — это уникальный номер глифа, который зависит от типа шрифта. Идентификатор глифа шрифта TTF может быть экземпляром класса ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) или класса ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id)) . Адресация глифа имени (строки) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае, если CFF Font внутри, структуры CFF используются для адресации глифов по имени. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid)(GlyphId) | Возвращает глиф по идентификатору глифа. Идентификатор глифа — это уникальный номер глифа, который зависит от типа шрифта. Идентификатор глифа шрифта TTF может быть экземпляром класса ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) или класса ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id)) . Адресация глифа имени (строки) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае, если CFF Font внутри, структуры CFF используются для адресации глифов по имени. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_1)(string) | Возвращает глиф по имени глифа. Адресация глифа имени (строки) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае, если CFF Font внутри, структуры CFF используются для адресации глифов по имени. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_2)(uint) | Возвращает глиф по идентификатору глифа. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | Получает глиф по переданному идентификатору глифа и заполняет переданный список идентификаторов глифа компонентами этого глифа. Идентификатор глифа — это уникальный номер глифа, который зависит от типа шрифта. Идентификатор глифа шрифта TTF может быть экземпляром класса ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) или класса ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id)) . Адресация глифа имени (строки) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае, если CFF Font внутри, структуры CFF используются для адресации глифов по имени. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_1)(string, GlyphIdList) | Получает глиф по переданному имени глифа и заполняет переданный список идентификаторов глифа компонентами этого глифа. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_2)(uint, GlyphIdList) | Получает глиф по переданному индексу глифа и заполняет переданный список идентификаторов глифа компонентами этого глифа. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext)(string) | Получить представление глифов для текста. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Сохраняет шрифт в исходном формате. |
| virtual [Save](../../aspose.font/font/save)(string) | Сохраняет шрифт в исходном формате. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Сохраняет шрифт в указанном формате. |

### Смотрите также

* class [Font](../../aspose.font/font)
* пространство имен [Aspose.Font.Ttf](../../aspose.font.ttf)
* сборка [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
