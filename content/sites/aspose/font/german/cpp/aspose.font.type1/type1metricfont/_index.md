---
title: "Aspose::Font::Type1::Type1MetricFont Klasse"
linktitle: "Type1MetricFont"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Type1::Type1MetricFont Klasse. Type1-Metrik-Schrift-Implementierung. Diese Type1-Schrift wird ausschließlich mit Metriken erstellt. Glyphen-Abruffunktionen und einige andere, die eine echte Schrift benötigen, sind nicht erlaubt; nicht erlaubte Funktionen werfen die Ausnahme Type1NotSupportedException. Andere Eigenschaften (FontName, Weight, Metrics und Encoding) werden aus der Metrikdatei in C++ verwendet."
type: docs
weight: 500
url: /de/cpp/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class


[Type1](../) metric font implementation. This type1 font is created using metrics only. [Glyphs](../../aspose.font.glyphs/) retrieval functions and some other that require real font are not allowed, not allowed functions throw exception [Type1NotSupportedException](../). Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

```cpp
class Type1MetricFont : public Aspose::Font::Type1::Type1Font
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Kodierung ist in der Metrikdatei definiert. StandardAdobeEncoding: Die Kodierung wird automatisch befüllt. |
| [get_FontFamily](./get_fontfamily/)() override | Liefert die Familie des [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | Liefert den Namen des [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Gibt den [Font](../../aspose.font/font/) Stil zurück. Dies ist ein berechneter Wert, der in einem verallgemeinerten Typ dargestellt wird. |
| [get_NumGlyphs](./get_numglyphs/)() override | Ermittelt die Anzahl der Glyphen im [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Liefert den Stil des [Font](../../aspose.font/font/). |
| [GetAllGlyphIds](./getallglyphids/)() override | Gibt alle Glyphen-IDs zurück, die im [Font](../../aspose.font/font/) verfügbar sind. Nicht unterstützt für den Typ [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::String) override | Gibt die Glyphe anhand der Glyphen-ID zurück. Nicht unterstützt für den Typ [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Gibt die Glyphe anhand der Glyphen-ID zurück. Nicht unterstützt für den Typ [Type1MetricFont](./). |
## Siehe auch

* Class [Type1Font](../type1font/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
