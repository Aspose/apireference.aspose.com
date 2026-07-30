---
title: "Aspose::Font::Cff::CffFont класс"
linktitle: "CffFont"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Cff::CffFont класс. Представляет Compact Font Format (CFF) в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.cff/cfffont/
---
## CffFont class


Представляет Compact [Font](../../aspose.font/font/) Format (CFF).

```cpp
class CffFont : public Aspose::Font::Font
```

## Методы

| Метод | Описание |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Преобразует [Font](../../aspose.font/font/) в другой формат. |
| [get_CommonFontsSettings](./get_commonfontssettings/)() const | Получает/устанавливает настройки, общие для шрифтов CFF. Эти настройки используются в разных сценариях и могут быть изменены для каждого отдельного шрифта. |
| [get_Encoding](./get_encoding/)() override | Получает кодировку [Font](../../aspose.font/font/). |
| [get_FontDefinition](./get_fontdefinition/)() override | Получает определение [Font](../../aspose.font/font/). |
| [get_FontFamily](./get_fontfamily/)() override | Получает семью [Font](../../aspose.font/font/). Сеттер семьи [Font](../../aspose.font/font/) ещё не реализован. |
| [get_FontName](./get_fontname/)() override | Получает имя начертания [Font](../../aspose.font/font/). |
| [get_FontNames](./get_fontnames/)() override | Получить имена [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Получает стиль [Font](../../aspose.font/font/). Это значение вычисляется и представляется в обобщённом типе. |
| [get_FontType](./get_fonttype/)() override | Получает тип [Font](../../aspose.font/font/). Возвращает значение [FontType.CFF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | Получает спецификацию типа идентификатора глифа. |
| [get_IsCidKeyedFont](./get_iscidkeyedfont/)() | Получает значение, указывающее, что [Font](../../aspose.font/font/) использует cid‑ключи. |
| [get_Metrics](./get_metrics/)() override | Получает метрики [Font](../../aspose.font/font/). |
| [get_NumGlyphs](./get_numglyphs/)() override | Получает количество глифов в [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Получает postscript‑имена [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Получает стиль [Font](../../aspose.font/font/). Это необработанное строковое значение, предоставленное файлом [Font](../../aspose.font/font/). |
| [get_TopDictDataProvider](./get_topdictdataprovider/)() | Получает аксессор для первого DICT верхнего уровня в структуре Top DICT INDEX. |
| [GetAllGlyphIds](./getallglyphids/)() override | Возвращает массив всех идентификаторов глифов, доступных в [Font](../../aspose.font/font/). Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF [Font](../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF [Font](../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). |
| [GetGlyphById](./getglyphbyid/)(System::String) | Возвращает глиф по имени глифа. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Возвращает глиф по идентификатору глифа. |
| [GetIndexDataProvider](./getindexdataprovider/)(CffDataProviders::CffIndexProviderType) | Получает провайдер для указанного типа структуры CFF INDEX. |
| [set_CommonFontsSettings](./set_commonfontssettings/)(System::SharedPtr\<CffFontsSettings\>) | Получает/устанавливает настройки, общие для шрифтов CFF. Эти настройки используются в разных сценариях и могут быть изменены для каждого отдельного шрифта. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Получает семью [Font](../../aspose.font/font/). Сеттер семьи [Font](../../aspose.font/font/) ещё не реализован. |
| [set_FontName](./set_fontname/)(System::String) override | Устанавливает имя начертания [Font](../../aspose.font/font/). |
| [set_Style](./set_style/)(System::String) override | Устанавливает стиль [Font](../../aspose.font/font/). Это необработанное строковое значение, предоставленное файлом [Font](../../aspose.font/font/). |
## См. также

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
