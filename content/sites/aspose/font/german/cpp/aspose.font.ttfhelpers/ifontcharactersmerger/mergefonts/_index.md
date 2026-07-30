---
title: "Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts Methode"
linktitle: "MergeFonts"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts Methode. Fügt Schriftarten basierend auf den übergebenen Glyphenlisten zusammen. Sucht für jede übergebene Glyphe nach einem Zeichencode und fügt den gefundenen Zeichencode mit der entsprechenden Glyphe in die resultierende neue Schriftart in C++ ein."
type: docs
weight: 100
url: /de/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Führt Schriften basierend auf übergebenen Glyphenlisten zusammen. Sucht für jede übergebene Glyphe einen Zeichencode und fügt den gefundenen Zeichencode mit der entsprechenden Glyphe in die resultierende neue Schrift ein.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font1Glyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font2Glyphs, System::String newFontName)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font1Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Liste der Glyphen der ersten Schriftart |
| font2Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Liste der Glyphen der zweiten Schriftart |
| newFontName | System::String | Gewünschter Name für die resultierende Schriftart |

### ReturnValue

Zusammengeführte Schriftart

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Fügt Schriftarten basierend auf übergebenen Listen von Zeichencodes zusammen. Um die gewünschte resultierende Schriftart zu erstellen, übergeben Sie einfach die Symbolcodes aus den Originalschriftarten, die Sie in die resultierende Schriftart aufnehmen möchten. [Glyphs](../../../aspose.font.glyphs/) die zu den übergebenen Codes gehören, werden automatisch gefunden. Zum Beispiel, wenn Sie Glyphen, die den Buchstaben A und B aus der ersten Schriftart und Glyphen, die den Buchstaben C und D aus der zweiten Schriftart zugeordnet sind, in die resultierende Schriftart aufnehmen möchten, rufen Sie diese Methode wie folgt auf: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")**

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> font1CharCodes, System::ArrayPtr<uint32_t> font2CharCodes, System::String newFontName)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font1CharCodes | System::ArrayPtr\<uint32_t\> | Codes, die aus der ersten Schriftart übernommen werden |
| font2CharCodes | System::ArrayPtr\<uint32_t\> | Codes, die aus der zweiten Schriftart übernommen werden |
| newFontName | System::String | Gewünschter Name für die resultierende Schriftart |

### ReturnValue

Zusammengeführte Schriftart

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Diese Methodenvariante ist für Fälle gedacht, in denen Sie Zeichencodes für Glyphen in der resultierenden Schrift explizit festlegen möchten. Es ist nicht zwingend erforderlich, dass der für die Glyphe angegebene Code in der Originalschrift enthalten ist. Der Sinn des übergebenen Codes besteht darin, dass er mit dem entsprechenden Glyphenkennzeichen in der resultierenden Schrift verknüpft wird. Daher lautet die Regel zur Verarbeitung jedes durch den Wörterbuchparameter [code, glyph identifier] übergebenen Paares, dass nur das Glyphenkennzeichen aus der Originalschrift übernommen und anschließend mit dem entsprechenden Code in der resultierenden Schrift verknüpft wird. Dies kann hilfreich sein, wenn einige Codes der ersten Schrift mit denselben Codes der zweiten Schrift kollidieren.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font1Dict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font2Dict, System::String newFontName)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font1Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Wörterbuch mit Paaren [Symbolcode, Glyphenidentifikator] aus der ersten Schriftart |
| font2Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Wörterbuch mit Paaren [Symbolcode, Glyphenidentifikator] aus der zweiten Schriftart |
| newFontName | System::String | Gewünschter Name für die resultierende Schriftart |

### ReturnValue

Zusammengeführte Schriftart

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
