---
title: "Aspose::Font::Ttf::TtfFont класс"
linktitle: "TtfFont"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Ttf::TtfFont класс. Представляет TrueType Font (TTF) в C++."
type: docs
weight: 600
url: /ru/cpp/aspose.font.ttf/ttffont/
---
## TtfFont class


Представляет TrueType [Font](../../aspose.font/font/) (TTF).

```cpp
class TtfFont : public Aspose::Font::Font
```

## Методы

| Метод | Описание |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Преобразует [Font](../../aspose.font/font/) в другой формат. |
| [Convert](./convert/)(Aspose::Font::FontType, System::SharedPtr\<System::Collections::Generic::ICollection\<uint32_t\>\>) | Преобразует [Font](../../aspose.font/font/) в другой формат с ограниченным набором символов. |
| virtual [get_CffFont](./get_cfffont/)() | Получает CFF [Font](../../aspose.font/font/) при наличии. |
| [get_Encoding](./get_encoding/)() override | Получает кодировку [Font](../../aspose.font/font/). |
| [get_FontDefinition](./get_fontdefinition/)() override | Получает определение [Font](../../aspose.font/font/). |
| [get_FontFamily](./get_fontfamily/)() override | Получает или задаёт семейство [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | Получает или задаёт имя гарнитуры [Font](../../aspose.font/font/). |
| [get_FontNames](./get_fontnames/)() override | Получает имена [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Получает стиль [Font](../../aspose.font/font/). Это значение вычисляется и представляется в обобщённом типе. |
| [get_FontType](./get_fonttype/)() override | Получает тип [Font](../../aspose.font/font/). Возвращает значение [FontType.TTF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | Получает спецификацию типа идентификатора глифа. |
| [get_IsSymbolic](./get_issymbolic/)() | Возвращает true, если [Font](../../aspose.font/font/) является символическим. |
| [get_Metrics](./get_metrics/)() override | Получает метрики [Font](../../aspose.font/font/). |
| [get_NumGlyphs](./get_numglyphs/)() override | Получает количество глифов в [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Получает имена Postscript [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Получает или задает стиль [Font](../../aspose.font/font/). Это необработанное строковое значение, предоставляемое файлом [Font](../../aspose.font/font/). |
| virtual [get_TtfTables](./get_ttftables/)() | Получает таблицы TTF. |
| [GetAllGlyphIds](./getallglyphids/)() override | Возвращает массив всех идентификаторов глифов, доступных в [Font](../../aspose.font/font/). Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF [Font](../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). Адресация глифов по имени (строка) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае наличия внутри CFF [Font](../../aspose.font/font/), для адресации глифов по имени используются структуры CFF. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF [Font](../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). Адресация глифов по имени (строка) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае наличия внутри CFF [Font](../../aspose.font/font/), для адресации глифов по имени используются структуры CFF. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Возвращает глиф по имени глифа. Адресация глифов по имени (строка) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае наличия внутри CFF [Font](../../aspose.font/font/), для адресации глифов по имени используются структуры CFF. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Возвращает глиф по идентификатору глифа. |
| virtual [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) | Получает глиф по переданному идентификатору глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF [Font](../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). Адресация глифов по имени (строка) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае наличия внутри CFF [Font](../../aspose.font/font/), для адресации глифов по имени используются структуры CFF. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) | Получает глиф по переданному имени глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) | Получает глиф по переданному индексу глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Получить представление глифов для текста. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Получает или задаёт семейство [Font](../../aspose.font/font/). |
| [set_FontName](./set_fontname/)(System::String) override | Получает или задаёт имя гарнитуры [Font](../../aspose.font/font/). |
| [set_Style](./set_style/)(System::String) override | Получает или задает стиль [Font](../../aspose.font/font/). Это необработанное строковое значение, предоставляемое файлом [Font](../../aspose.font/font/). |
## См. также

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
