---
title: "Aspose::Font::TtfHelpers::IFontCharactersMerger Klasse"
linktitle: "IFontCharactersMerger"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfHelpers::IFontCharactersMerger Klasse. Deklariert Hilfsfunktionen zum Zusammenführen von TrueType-Schriften. Die als Parameter übergebene Schrift font1 wird als primäre Schrift betrachtet. Das bedeutet, dass viele Eigenschaften der endgültig zusammengeführten Schrift, wie Metriken, Kodierungsstruktur und andere, aus dieser primären Schrift in C++ übernommen werden."
type: docs
weight: 200
url: /de/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger class


Deklariert Hilfsfunktionen zum Zusammenführen von TrueType-Schriften. [Font](../../aspose.font/font/) , die als Parameter font1 übergeben wird, gilt als primär. Das bedeutet, dass viele Eigenschaften, die mit der endgültig zusammengeführten Schrift zusammenhängen, wie Metriken, Kodierungsstruktur und andere, aus dieser primären Schrift übernommen werden.

```cpp
class IFontCharactersMerger : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | Führt Schriften basierend auf übergebenen Glyphenlisten zusammen. Sucht für jede übergebene Glyphe einen Zeichencode und fügt den gefundenen Zeichencode mit der entsprechenden Glyphe in die resultierende neue Schrift ein. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | Mergt Schriften basierend auf übergebenen Zeichencode-Listen. Um die gewünschte resultierende Schrift zu erstellen, übergeben Sie einfach Symbolcodes aus den Originalschriften, die Sie in die resultierende Schrift aufnehmen möchten. [Glyphs](../../aspose.font.glyphs/) die zu den übergebenen Codes gehören, werden automatisch gefunden. Zum Beispiel, wenn Sie Glyphen, die den Buchstaben A und B aus der ersten Schrift und Glyphen, die den Buchstaben C und D aus der zweiten Schrift zugeordnet sind, in die resultierende Schrift aufnehmen möchten, rufen Sie diese Methode wie folgt auf: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | Diese Methodenvariante ist für Fälle gedacht, in denen Sie Zeichencodes für Glyphen in der resultierenden Schrift explizit festlegen möchten. Es ist nicht zwingend erforderlich, dass der für die Glyphe angegebene Code in der Originalschrift enthalten ist. Der Sinn des übergebenen Codes besteht darin, dass er mit dem entsprechenden Glyphenkennzeichen in der resultierenden Schrift verknüpft wird. Daher lautet die Regel zur Verarbeitung jedes durch den Wörterbuchparameter [code, glyph identifier] übergebenen Paares, dass nur das Glyphenkennzeichen aus der Originalschrift übernommen und anschließend mit dem entsprechenden Code in der resultierenden Schrift verknüpft wird. Dies kann hilfreich sein, wenn einige Codes der ersten Schrift mit denselben Codes der zweiten Schrift kollidieren. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TtfHelpers](../)
* Library [Aspose.Font for C++](../../)
