---
title: "Aspose::Font::Font Klasse"
linktitle: "Font"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Font Klasse. Stellt die Basisklasse Font in C++ dar."
type: docs
weight: 400
url: /de/cpp/aspose.font/font/
---
## Font class


Stellt die Basisklasse [Font](./) dar.

```cpp
class Font : public virtual Aspose::Font::IFont,
             public Aspose::Font::Glyphs::IGlyphAccessor,
             public Aspose::Font::IFontSaver,
             public Aspose::Font::Licensing::IVentureLicenseTarget
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Convert](./convert/)(Aspose::Font::FontType) | Konvertiert das [Font](./) in ein anderes Format. |
| virtual [get_Encoding](./get_encoding/)() | Ermittelt die Kodierung des [Font](./). |
| virtual [get_FontDefinition](./get_fontdefinition/)() | Ermittelt die Definition des [Font](./). |
| virtual [get_FontFamily](./get_fontfamily/)() | Ermittelt oder setzt die Familie des [Font](./). |
| virtual [get_FontName](./get_fontname/)() | Ermittelt oder setzt den Schriftartnamen des [Font](./). |
| virtual [get_FontNames](./get_fontnames/)() | Ermittelt die Namen des [Font](./). |
| [get_FontSaver](./get_fontsaver/)() override | Ermittelt die Speicherfunktionalität des [Font](./). |
| virtual [get_FontStyle](./get_fontstyle/)() | Ermittelt den Stil des [Font](./). Dies ist ein berechneter Wert, der in einem verallgemeinerten Typ dargestellt wird. |
| virtual [get_FontType](./get_fonttype/)() | Ermittelt den Typ des [Font](./). |
| [get_GlyphAccessor](./get_glyphaccessor/)() override | [Font](./) Glyph-Zugriff. Ruft Glyphs und Glyph-Identifikatoren ab. |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | Spezifikation des Glyph-ID-Typs. Für Verbraucher, die den tatsächlichen Typ von 'bytes[]' kennen müssen. |
| virtual [get_Metrics](./get_metrics/)() | Ermittelt die Metriken des [Font](./). |
| virtual [get_NumGlyphs](./get_numglyphs/)() | Ermittelt die Anzahl der Glyphs im [Font](./). |
| virtual [get_PostscriptNames](./get_postscriptnames/)() | Ermittelt die PostScript-Namen des [Font](./). |
| virtual [get_Style](./get_style/)() | Ermittelt oder setzt den Stil des [Font](./). Dies ist ein roher Zeichenkettenwert, der von der [Font](./)-Datei bereitgestellt wird. |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Gibt alle Glyph-IDs zurück, die im [Font](./) verfügbar sind. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein Integer-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) | Gibt ein Glyph anhand seiner Glyph-ID zurück. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. GlyphId – abgeleitetes Objekt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein Integer-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Ermittelt die Glyph-Darstellung für Text. |
| static [Open](./open/)(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) | Öffnet eine Schriftart unter Verwendung eines FontDefinition-Objekts. |
| static [Open](./open/)(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) | Öffnet eine Schriftart unter Verwendung von Schriftarttyp und Stream-Quelle. |
| static [Open](./open/)(Aspose::Font::FontType, System::String) | Öffnet eine Schriftart unter Verwendung von Schriftarttyp und Schriftartdateinamen. |
| static [Open](./open/)(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) | Öffnet eine Schriftart unter Verwendung von Schriftarttyp und Schriftartdaten-Byte-Array. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) override | Speichert das [Font](./) im Originalformat. |
| [Save](./save/)(System::String) override | Speichert das [Font](./) im Originalformat. |
| [SaveToFormat](./savetoformat/)(System::SharedPtr\<System::IO::Stream\>, FontSavingFormats) override | Speichert das [Font](./) im angegebenen Format. |
| virtual [set_FontFamily](./set_fontfamily/)(System::String) | Ermittelt oder setzt die Familie des [Font](./). |
| virtual [set_FontName](./set_fontname/)(System::String) | Ermittelt oder setzt den Schriftartnamen des [Font](./). |
| virtual [set_Style](./set_style/)(System::String) | Ermittelt oder setzt den Stil des [Font](./). Dies ist ein roher Zeichenkettenwert, der von der [Font](./)-Datei bereitgestellt wird. |
## Siehe auch

* Class [IFont](../ifont/)
* Class [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* Class [IFontSaver](../ifontsaver/)
* Class [IVentureLicenseTarget](../../aspose.font.licensing/iventurelicensetarget/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
