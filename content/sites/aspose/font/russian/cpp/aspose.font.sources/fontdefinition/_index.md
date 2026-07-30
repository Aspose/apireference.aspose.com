---
title: "Aspose::Font::Sources::FontDefinition класс"
linktitle: "FontDefinition"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Sources::FontDefinition класс. Представляет определение набора файлов шрифта. Этот класс содержит поля, не связанные с внутренними данными шрифта. Эти поля описывают размещение шрифта и другие данные, необходимые для загрузки шрифта из какого-либо источника шрифта (файл, память и т.д.) в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.font.sources/fontdefinition/
---
## FontDefinition class


Представляет определение набора файлов [Font](../../aspose.font/font/). Этот класс содержит поля, не связанные с внутренними данными шрифта. Эти поля описывают размещение шрифта и другие данные, необходимые для загрузки шрифта из какого-либо источника шрифта (файл, память и т.д.).

```cpp
class FontDefinition : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Создаёт определение [Font](../../aspose.font/font/) в одном файле. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<StreamSource\>) | Создаёт определение [Font](../../aspose.font/font/) в одном файле. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Создаёт определение [Font](../../aspose.font/font/) в одном файле. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Создаёт определение [Font](../../aspose.font/font/) в одном файле. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Создаёт определение [Font](../../aspose.font/font/) в одном файле. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Создаёт определение [Font](../../aspose.font/font/) в одном файле. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Создаёт определение [Font](../../aspose.font/font/) в нескольких файлах. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Создаёт определение [Font](../../aspose.font/font/) в нескольких файлах. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Создаёт определение [Font](../../aspose.font/font/) в нескольких файлах. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Создаёт определение [Font](../../aspose.font/font/) в нескольких файлах. |
| [get_FileDefinitions](./get_filedefinitions/)() const | Получает коллекцию определений файлов. |
| virtual [get_FontName](./get_fontname/)() | Возвращает имя [Font](../../aspose.font/font/). |
| virtual [get_FontNames](./get_fontnames/)() | Получает имена [Font](../../aspose.font/font/) как [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| [get_FontType](./get_fonttype/)() const | Получает тип [Font](../../aspose.font/font/). |
| virtual [get_PostscriptName](./get_postscriptname/)() | Получает postscript-имя [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() const | Получает postscript-имена [Font](../../aspose.font/font/) как [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| static [Open](./open/)(System::String, Aspose::Font::FontType) | Возвращает [FontDefinition](./) для файла шрифта и типа шрифта. |
| static [Open](./open/)(System::SharedPtr\<StreamSource\>, Aspose::Font::FontType) | Возвращает [FontDefinition](./) для источника потока шрифта и типа шрифта. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
