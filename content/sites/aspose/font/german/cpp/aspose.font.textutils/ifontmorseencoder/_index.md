---
title: "Aspose::Font::TextUtils::IFontMorseEncoder class"
linktitle: "IFontMorseEncoder"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder class. Deklariert die Funktionalität zum Kodieren von Text mit Morsecode und zum Erhalten des Ergebnisses als Schriftglyphen in C++."
type: docs
weight: 200
url: /de/cpp/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder class


Deklariert Funktionalität zum Kodieren von Text mittels Morsecode und gibt das Ergebnis als Schriftart‑Glyphen zurück.

```cpp
class IFontMorseEncoder : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) | Kodiert Text mit Morsecode und gibt das Ergebnis als Menge von Glyphen (Glyphen-Identifikatoren) zurück. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) | Kodiert Text in Morsecode und gibt das Ergebnis als Menge von Glyphen (glyphId) zurück. Heuristische Analyse wird verwendet, um das Alphabet des Eingabetextes zu berechnen. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) | Kodiert Text mit Morsecode und zeichnet das Ergebnis im PNG-Format. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) | Kodiert Text in Morsecode und zeichnet das Ergebnis im PNG-Format. Heuristische Analyse wird verwendet, um das Alphabet des Eingabetextes zu berechnen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TextUtils](../)
* Library [Aspose.Font for C++](../../)
