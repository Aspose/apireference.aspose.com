---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger Klasse"
linktitle: "FontCharactersMerger"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger Klasse. Deklariert die Funktionalität zum Zusammenführen von Schriften verschiedener Typen. Ein Schriftenpaar wird für den Merge-Vorgang benötigt. Eine Schrift aus diesem Paar wird als primär betrachtet. Das bedeutet, dass viele Eigenschaften, die die endgültige zusammengeführte Schrift betreffen, wie Metriken, Kodierungsstruktur und andere, von dieser primären Schrift übernommen werden. Die andere Schrift aus diesem Paar (sekundär) liefert nur Glyphen für die endgültige zusammengeführte Schrift in C++."
type: docs
weight: 100
url: /de/cpp/aspose.font.common_fontmerger/fontcharactersmerger/
---
## FontCharactersMerger class


Deklariert die Funktionalität zum Zusammenführen von Schriftarten unterschiedlicher Typen. Ein Schriftarten‑Paar wird für den Merge‑Vorgang benötigt. Eine Schriftart dieses Paares wird als primär betrachtet. Das bedeutet, dass viele Eigenschaften des endgültigen zusammengeführten Schriftsatzes, wie Metriken, Kodierungsstruktur und andere, von dieser primären Schriftart übernommen werden. Die andere Schriftart des Paares (sekundär) liefert nur Glyphen für den endgültigen zusammengeführten Schriftsatz.

```cpp
class FontCharactersMerger : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_PrimaryFont](./get_primaryfont/)() | Gibt die primäre Schrift zurück. |
| virtual [get_SecondaryFont](./get_secondaryfont/)() | Gibt die sekundäre Schrift zurück. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | Führt Schriften basierend auf übergebenen Glyphenlisten zusammen. Sucht für jede übergebene Glyphe nach einem Zeichencode und fügt den gefundenen Zeichencode mit der entsprechenden Glyphe in die resultierende neue Schrift ein. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | Mergt Schriften basierend auf übergebenen Zeichencode-Listen. Um die gewünschte resultierende Schrift zu erstellen, übergeben Sie einfach Symbolcodes aus den Originalschriften, die Sie in die resultierende Schrift aufnehmen möchten. [Glyphs](../../aspose.font.glyphs/) die zu den übergebenen Codes gehören, werden automatisch gefunden. Zum Beispiel, wenn Sie Glyphen, die den Buchstaben A und B aus der ersten Schrift und Glyphen, die den Buchstaben C und D aus der zweiten Schrift zugeordnet sind, in die resultierende Schrift aufnehmen möchten, rufen Sie diese Methode wie folgt auf: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | Diese Methodenvariante ist für Fälle gedacht, in denen Sie Zeichencodes für Glyphen in der resultierenden Schrift explizit festlegen möchten. Es ist nicht zwingend erforderlich, dass der für die Glyphe angegebene Code in der Originalschrift enthalten ist. Der Sinn des übergebenen Codes besteht darin, dass er mit dem entsprechenden Glyphenkennzeichen in der resultierenden Schrift verknüpft wird. Daher lautet die Regel zur Verarbeitung jedes durch den Wörterbuchparameter [code, glyph identifier] übergebenen Paares, dass nur das Glyphenkennzeichen aus der Originalschrift übernommen und anschließend mit dem entsprechenden Code in der resultierenden Schrift verknüpft wird. Dies kann hilfreich sein, wenn einige Codes der ersten Schrift mit denselben Codes der zweiten Schrift kollidieren. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Common_FontMerger](../)
* Library [Aspose.Font for C++](../../)
