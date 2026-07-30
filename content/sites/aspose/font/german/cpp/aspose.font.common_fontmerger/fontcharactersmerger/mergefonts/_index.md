---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts Methode"
linktitle: "MergeFonts"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts Methode. Fügt Schriftarten basierend auf übergebenen Glyphenlisten zusammen. Sucht für jedes übergebene Glyphen nach einem Zeichencode und fügt den gefundenen Zeichencode zusammen mit dem entsprechenden Glyphen in die resultierende neue Schriftart in C++ ein."
type: docs
weight: 300
url: /de/cpp/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Führt Schriften basierend auf übergebenen Glyphenlisten zusammen. Sucht für jede übergebene Glyphe nach einem Zeichencode und fügt den gefundenen Zeichencode mit der entsprechenden Glyphe in die resultierende neue Schrift ein.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> primaryFontGlyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> secondaryFontGlyphs, System::String newFontName)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| primaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Liste der Glyphen, die aus der primären Schriftart übernommen werden sollen |
| secondaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Liste der Glyphen, die aus der sekundären Schriftart übernommen werden sollen |
| newFontName | System::String | Gewünschter Name für die resultierende Schriftart |

### ReturnValue

Zusammengeführte Schriftart

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Fügt Schriftarten basierend auf übergebenen Listen von Zeichencodes zusammen. Um die gewünschte resultierende Schriftart zu erstellen, übergeben Sie einfach die Symbolcodes aus den Originalschriftarten, die Sie in die resultierende Schriftart aufnehmen möchten. [Glyphs](../../../aspose.font.glyphs/) die zu den übergebenen Codes gehören, werden automatisch gefunden. Zum Beispiel, wenn Sie Glyphen, die den Buchstaben A und B aus der ersten Schriftart und Glyphen, die den Buchstaben C und D aus der zweiten Schriftart zugeordnet sind, in die resultierende Schriftart aufnehmen möchten, rufen Sie diese Methode wie folgt auf: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")**

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> primaryFontCharCodes, System::ArrayPtr<uint32_t> secondaryFontCharCodes, System::String newFontName)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| primaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Codes, die aus der primären Schriftart übernommen werden sollen |
| secondaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Codes, die aus der sekundären Schriftart übernommen werden sollen |
| newFontName | System::String | Gewünschter Name für die resultierende Schriftart |

### ReturnValue

Zusammengeführte Schriftart

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Diese Methodenvariante ist für Fälle gedacht, in denen Sie Zeichencodes für Glyphen in der resultierenden Schrift explizit festlegen möchten. Es ist nicht zwingend erforderlich, dass der für die Glyphe angegebene Code in der Originalschrift enthalten ist. Der Sinn des übergebenen Codes besteht darin, dass er mit dem entsprechenden Glyphenkennzeichen in der resultierenden Schrift verknüpft wird. Daher lautet die Regel zur Verarbeitung jedes durch den Wörterbuchparameter [code, glyph identifier] übergebenen Paares, dass nur das Glyphenkennzeichen aus der Originalschrift übernommen und anschließend mit dem entsprechenden Code in der resultierenden Schrift verknüpft wird. Dies kann hilfreich sein, wenn einige Codes der ersten Schrift mit denselben Codes der zweiten Schrift kollidieren.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> primaryFontDict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> secondaryFontDict, System::String newFontName)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| primaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Wörterbuch mit Paaren [Symbolcode, Glyphenkennung] aus der primären Schriftart |
| secondaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Wörterbuch mit Paaren [Symbolcode, Glyphenkennung] aus der sekundären Schriftart |
| newFontName | System::String | Gewünschter Name für die resultierende Schriftart |

### ReturnValue

Zusammengeführte Schriftart

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
