---
title: "Aspose::Font::Sources::FontDefinition Klasse"
linktitle: "FontDefinition"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Sources::FontDefinition Klasse. Stellt die Definition eines Font‑Dateisatzes dar. Diese Klasse enthält Felder, die nicht mit internen Font‑Daten zusammenhängen. Diese Felder beschreiben die Font‑Platzierung und weitere Daten, die zum Laden einer Font aus einer Font‑Quelle (Datei, Speicher usw.) in C++ benötigt werden."
type: docs
weight: 300
url: /de/cpp/aspose.font.sources/fontdefinition/
---
## FontDefinition class


Stellt die [Font](../../aspose.font/font/)-Dateisatzdefinition dar. Diese Klasse enthält Felder, die nicht mit internen Font‑Daten zusammenhängen. Diese Felder beschreiben die Font‑Platzierung und weitere Daten, die zum Laden einer Font aus einer Font‑Quelle (Datei, Speicher usw.) benötigt werden.

```cpp
class FontDefinition : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Erstellt eine ein‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<StreamSource\>) | Erstellt eine ein‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Erstellt eine ein‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Erstellt eine ein‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Erstellt eine ein‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Erstellt eine ein‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Erstellt eine Mehr‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Erstellt eine Mehr‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Erstellt eine Mehr‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Erstellt eine Mehr‑Datei‑[Font](../../aspose.font/font/)-Definition. |
| [get_FileDefinitions](./get_filedefinitions/)() const | Liest die Sammlung von Dateidefinitionen. |
| virtual [get_FontName](./get_fontname/)() | Gibt den Namen der [Font](../../aspose.font/font/)-Datei zurück. |
| virtual [get_FontNames](./get_fontnames/)() | Ruft die Namen des [Font](../../aspose.font/font/) als ein [MultiLanguageString](../../aspose.font/multilanguagestring/) ab. |
| [get_FontType](./get_fonttype/)() const | Ruft den Typ des [Font](../../aspose.font/font/) ab. |
| virtual [get_PostscriptName](./get_postscriptname/)() | Ruft den PostScript-[Font](../../aspose.font/font/) Namen ab. |
| [get_PostscriptNames](./get_postscriptnames/)() const | Ruft die PostScript-[Font](../../aspose.font/font/) Namen als ein [MultiLanguageString](../../aspose.font/multilanguagestring/) ab. |
| static [Open](./open/)(System::String, Aspose::Font::FontType) | Gibt die [FontDefinition](./) für die Schriftdatei und den Font-Typ zurück. |
| static [Open](./open/)(System::SharedPtr\<StreamSource\>, Aspose::Font::FontType) | Gibt die [FontDefinition](./) für die Font-Stream-Quelle und den Font-Typ zurück. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
