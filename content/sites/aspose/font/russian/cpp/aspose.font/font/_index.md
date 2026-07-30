---
title: "Aspose::Font::Font класс"
linktitle: "Font"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Font класс. Представляет базовый класс Font в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.font/font/
---
## Font class


Представляет базовый класс [Font](./).

```cpp
class Font : public virtual Aspose::Font::IFont,
             public Aspose::Font::Glyphs::IGlyphAccessor,
             public Aspose::Font::IFontSaver,
             public Aspose::Font::Licensing::IVentureLicenseTarget
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Convert](./convert/)(Aspose::Font::FontType) | Преобразует [Font](./) в другой формат. |
| virtual [get_Encoding](./get_encoding/)() | Получает кодировку [Font](./). |
| virtual [get_FontDefinition](./get_fontdefinition/)() | Получает определение [Font](./). |
| virtual [get_FontFamily](./get_fontfamily/)() | Получает или задает семейство [Font](./). |
| virtual [get_FontName](./get_fontname/)() | Получает или задает имя гарнитуры [Font](./). |
| virtual [get_FontNames](./get_fontnames/)() | Получает имена [Font](./). |
| [get_FontSaver](./get_fontsaver/)() override | Получает функцию сохранения [Font](./). |
| virtual [get_FontStyle](./get_fontstyle/)() | Получает стиль [Font](./). Это значение вычисляется и представляется в обобщённом типе. |
| virtual [get_FontType](./get_fonttype/)() | Получает тип [Font](./). |
| [get_GlyphAccessor](./get_glyphaccessor/)() override | [Font](./) глиф-аксессор. Получает глифы и идентификаторы глифов. |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | Спецификация типа идентификатора глифа. Для потребителей, которым необходимо знать реальный тип 'bytes[]'. |
| virtual [get_Metrics](./get_metrics/)() | Получает метрики [Font](./). |
| virtual [get_NumGlyphs](./get_numglyphs/)() | Получает количество глифов в [Font](./). |
| virtual [get_PostscriptNames](./get_postscriptnames/)() | Получает имена postscript [Font](./). |
| virtual [get_Style](./get_style/)() | Получает или задает стиль [Font](./). Это необработанное строковое значение, предоставляемое файлом [Font](./). |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Возвращает все идентификаторы глифов, доступные в [Font](./). Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../aspose.font.type1/) является именем глифа, экземпляром класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) | Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. GlyphId — производный объект. Например: идентификатор [Type1](../../aspose.font.type1/) является именем глифа, экземпляром класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Получает представление глифов для текста. |
| static [Open](./open/)(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) | Открывает шрифт, используя объект FontDefinition. |
| static [Open](./open/)(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) | Открывает шрифт, используя тип шрифта и источник потока. |
| static [Open](./open/)(Aspose::Font::FontType, System::String) | Открывает шрифт, используя тип шрифта и имя файла шрифта. |
| static [Open](./open/)(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) | Открывает шрифт, используя тип шрифта и массив байтов данных шрифта. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) override | Сохраняет [Font](./) в оригинальном формате. |
| [Save](./save/)(System::String) override | Сохраняет [Font](./) в оригинальном формате. |
| [SaveToFormat](./savetoformat/)(System::SharedPtr\<System::IO::Stream\>, FontSavingFormats) override | Сохраняет [Font](./) в указанный формат. |
| virtual [set_FontFamily](./set_fontfamily/)(System::String) | Получает или задает семейство [Font](./). |
| virtual [set_FontName](./set_fontname/)(System::String) | Получает или задает имя гарнитуры [Font](./). |
| virtual [set_Style](./set_style/)(System::String) | Получает или задает стиль [Font](./). Это необработанное строковое значение, предоставляемое файлом [Font](./). |
## См. также

* Class [IFont](../ifont/)
* Class [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* Class [IFontSaver](../ifontsaver/)
* Class [IVentureLicenseTarget](../../aspose.font.licensing/iventurelicensetarget/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
