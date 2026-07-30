---
title: "classe Aspose::Font::Type1::Type1MetricFont"
linktitle: "Type1MetricFont"
second_title: "Aspose.Font per C++"
description: "classe Aspose::Font::Type1::Type1MetricFont. Implementazione del font metric Type1. Questo font type1 è creato utilizzando solo le metriche. Le funzioni di recupero dei glifi e altre che richiedono un font reale non sono consentite; le funzioni non consentite generano l'eccezione Type1NotSupportedException. Altre proprietà (FontName, Weight, Metrics e Encoding) sono prelevate dal file di metriche in C++."
type: docs
weight: 500
url: /it/cpp/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class


[Type1](../) metric font implementation. This type1 font is created using metrics only. [Glyphs](../../aspose.font.glyphs/) retrieval functions and some other that require real font are not allowed, not allowed functions throw exception [Type1NotSupportedException](../). Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

```cpp
class Type1MetricFont : public Aspose::Font::Type1::Type1Font
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | La codifica è definita nel file di metriche. StandardAdobeEncoding: la codifica viene popolata automaticamente. |
| [get_FontFamily](./get_fontfamily/)() override | Ottiene la famiglia del [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | Ottiene il nome del [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Ottiene lo stile del [Font](../../aspose.font/font/). Questo è un valore calcolato e rappresentato in tipo generalizzato. |
| [get_NumGlyphs](./get_numglyphs/)() override | Ottiene il numero di glifi nel [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Ottiene lo stile del [Font](../../aspose.font/font/). |
| [GetAllGlyphIds](./getallglyphids/)() override | Restituisce tutti gli ID dei glifi disponibili nel [Font](../../aspose.font/font/). Non supportato per il tipo [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::String) override | Restituisce il glifo per ID glifo. Non supportato per il tipo [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Restituisce il glifo per ID glifo. Non supportato per il tipo [Type1MetricFont](./). |
## Vedi anche

* Class [Type1Font](../type1font/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
