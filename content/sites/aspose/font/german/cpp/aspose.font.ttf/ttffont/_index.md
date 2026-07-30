---
title: "Aspose::Font::Ttf::TtfFont Klasse"
linktitle: "TtfFont"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Ttf::TtfFont Klasse. Stellt TrueType-Schrift (TTF) in C++ dar."
type: docs
weight: 600
url: /de/cpp/aspose.font.ttf/ttffont/
---
## TtfFont class


Stellt TrueType [Font](../../aspose.font/font/) (TTF) dar.

```cpp
class TtfFont : public Aspose::Font::Font
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Konvertiert das [Font](../../aspose.font/font/) in ein anderes Format. |
| [Convert](./convert/)(Aspose::Font::FontType, System::SharedPtr\<System::Collections::Generic::ICollection\<uint32_t\>\>) | Konvertiert das [Font](../../aspose.font/font/) in ein anderes Format mit begrenztem Zeichensatz. |
| virtual [get_CffFont](./get_cfffont/)() | Gibt CFF [Font](../../aspose.font/font/) zurück, falls vorhanden. |
| [get_Encoding](./get_encoding/)() override | Gibt die [Font](../../aspose.font/font/) Kodierung zurück. |
| [get_FontDefinition](./get_fontdefinition/)() override | Gibt die [Font](../../aspose.font/font/) Definition zurück. |
| [get_FontFamily](./get_fontfamily/)() override | Liest oder setzt die [Font](../../aspose.font/font/) Familie. |
| [get_FontName](./get_fontname/)() override | Liest oder setzt den [Font](../../aspose.font/font/) Schriftartnamen. |
| [get_FontNames](./get_fontnames/)() override | Gibt die [Font](../../aspose.font/font/) Namen zurück. |
| [get_FontStyle](./get_fontstyle/)() override | Gibt den [Font](../../aspose.font/font/) Stil zurück. Dies ist ein berechneter Wert, der in einem verallgemeinerten Typ dargestellt wird. |
| [get_FontType](./get_fonttype/)() override | Gibt den [Font](../../aspose.font/font/) Typ zurück. Liefert den Wert [FontType.TTF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | Gibt die Glyphen-ID-Typenspezifikation zurück. |
| [get_IsSymbolic](./get_issymbolic/)() | Gibt true zurück, falls das [Font](../../aspose.font/font/) symbolisch ist. |
| [get_Metrics](./get_metrics/)() override | Gibt die [Font](../../aspose.font/font/) Metriken zurück. |
| [get_NumGlyphs](./get_numglyphs/)() override | Ermittelt die Anzahl der Glyphen im [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Ermittelt die Postscript-[Font](../../aspose.font/font/)-Namen. |
| [get_Style](./get_style/)() override | Liest oder setzt den Stil des [Font](../../aspose.font/font/). Dies ist ein Rohzeichenkettenwert, der von der [Font](../../aspose.font/font/)-Datei bereitgestellt wird. |
| virtual [get_TtfTables](./get_ttftables/)() | Ermittelt TTF-Tabellen. |
| [GetAllGlyphIds](./getallglyphids/)() override | Gibt ein Array aller Glyphen‑IDs zurück, die im [Font](../../aspose.font/font/) verfügbar sind. Eine Glyphen‑ID ist eine eindeutige Nummer für eine Glyphe, die vom Font‑Typ abhängt. Die TTF-[Font](../../aspose.font/font/)-Glyphen‑ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. Die Glyphenadressierung per Name (String) wird für TTF‑Fonts über die Post‑Tabellenabbildung unterstützt. Falls ein CFF-[Font](../../aspose.font/font/) enthalten ist, werden die CFF‑Strukturen verwendet, um Glyphen per Name anzusprechen. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Gibt die Glyphe anhand ihrer Glyphen‑ID zurück. Eine Glyphen‑ID ist eine eindeutige Nummer für eine Glyphe, die vom Font‑Typ abhängt. Die TTF-[Font](../../aspose.font/font/)-Glyphen‑ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. Die Glyphenadressierung per Name (String) wird für TTF‑Fonts über die Post‑Tabellenabbildung unterstützt. Falls ein CFF-[Font](../../aspose.font/font/) enthalten ist, werden die CFF‑Strukturen verwendet, um Glyphen per Name anzusprechen. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Gibt die Glyphe anhand ihres Namens zurück. Die Glyphenadressierung per Name (String) wird für TTF‑Fonts über die Post‑Tabellenabbildung unterstützt. Falls ein CFF-[Font](../../aspose.font/font/) enthalten ist, werden die CFF‑Strukturen verwendet, um Glyphen per Name anzusprechen. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Gibt die Glyphe anhand ihrer Glyphen‑ID zurück. |
| virtual [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) | Liest eine Glyphe anhand der übergebenen Glyphen‑ID und füllt die übergebene Liste von Glyphen‑IDs mit den Komponenten dieser Glyphe. Eine Glyphen‑ID ist eine eindeutige Nummer für eine Glyphe, die vom Font‑Typ abhängt. Die TTF-[Font](../../aspose.font/font/)-Glyphen‑ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. Die Glyphenadressierung per Name (String) wird für TTF‑Fonts über die Post‑Tabellenabbildung unterstützt. Falls ein CFF-[Font](../../aspose.font/font/) enthalten ist, werden die CFF‑Strukturen verwendet, um Glyphen per Name anzusprechen. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) | Liest eine Glyphe anhand des übergebenen Namens und füllt die übergebene Liste von Glyphen‑IDs mit den Komponenten dieser Glyphe. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) | Liest eine Glyphe anhand des übergebenen Indexes und füllt die übergebene Liste von Glyphen‑IDs mit den Komponenten dieser Glyphe. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Erhalte die Glyphenrepräsentation für Text. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Liest oder setzt die [Font](../../aspose.font/font/) Familie. |
| [set_FontName](./set_fontname/)(System::String) override | Liest oder setzt den [Font](../../aspose.font/font/) Schriftartnamen. |
| [set_Style](./set_style/)(System::String) override | Liest oder setzt den Stil des [Font](../../aspose.font/font/). Dies ist ein Rohzeichenkettenwert, der von der [Font](../../aspose.font/font/)-Datei bereitgestellt wird. |
## Siehe auch

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
