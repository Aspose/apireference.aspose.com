---
title: Type1MetricFont
second_title: Aspose.Font per Riferimento API .NET
description: Implementazione del font di metrica Type1. Questo font di tipo 1 viene creato utilizzando solo le metriche. Le funzioni di recupero dei glifi e altre che richiedono caratteri reali non sono consentite funzioni non consentite generano eccezioniType1NotSupportedException . Altre proprietà FontName Weight Metrics e Encoding vengono utilizzate dal file delle metriche.
type: docs
weight: 1080
url: /it/net/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class

Implementazione del font di metrica Type1. Questo font di tipo 1 viene creato utilizzando solo le metriche. Le funzioni di recupero dei glifi e altre che richiedono caratteri reali non sono consentite, funzioni non consentite generano eccezioniType1NotSupportedException . Altre proprietà (FontName, Weight, Metrics e Encoding) vengono utilizzate dal file delle metriche.

```csharp
public class Type1MetricFont : Type1Font
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1metricfont/encoding) { get; } | La codifica è definita nel file delle metriche. StandardAdobeEncoding: la codifica viene popolata automaticamente |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition) { get; } | Ottiene la definizione del carattere. |
| override [FontFamily](../../aspose.font.type1/type1metricfont/fontfamily) { get; } | Ottiene la famiglia di caratteri. |
| override [FontName](../../aspose.font.type1/type1metricfont/fontname) { get; } | Ottiene il nome del carattere. |
| override [FontNames](../../aspose.font.type1/type1font/fontnames) { get; } | Ottiene i nomi dei caratteri. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Ottiene la funzionalità di salvataggio dei caratteri. |
| override [FontStyle](../../aspose.font.type1/type1metricfont/fontstyle) { get; } | Ottiene lo stile del carattere. Questo è un valore calcolato e rappresentato in tipo generalizzato. |
| override [FontType](../../aspose.font.type1/type1font/fonttype) { get; } | Ottiene il tipo di carattere. Restituisce il valore FontType.Type1. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Accessorio per glifo dei caratteri. Recupera glifi e identificatori di glifi. |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype) { get; } | Specifica del tipo di ID glifo. |
| override [Metrics](../../aspose.font.type1/type1font/metrics) { get; } | Ottiene le metriche dei caratteri. |
| override [NumGlyphs](../../aspose.font.type1/type1metricfont/numglyphs) { get; } | Ottiene il numero di glifi nel Font. |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames) { get; } | Ottiene i nomi dei caratteri PostScript. |
| override [Style](../../aspose.font.type1/type1metricfont/style) { get; } | Ottiene lo stile del carattere. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert)(FontType) | Converte il carattere in un altro formato. |
| override [GetAllGlyphIds](../../aspose.font.type1/type1metricfont/getallglyphids)() | Restituisce tutti gli ID glifi, disponibili in Font. Non supportato per[`Type1MetricFont`](../type1metricfont)digita. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid#getglyphbyid)(GlyphId) | Restituisce glifo per id glifo. Non supportato per[`Type1MetricFont`](../type1metricfont)digita. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid#getglyphbyid_1)(string) | Restituisce glifo per id glifo. Non supportato per[`Type1MetricFont`](../type1metricfont)digita. |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid)(uint) | Restituisce glifo per id glifo. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext)(string) | Ottiene la rappresentazione dei glifi per il testo. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Salva il carattere nel formato originale. |
| virtual [Save](../../aspose.font/font/save)(string) | Salva il carattere nel formato originale. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Salva il carattere nel formato specificato. |

### Esempi

Nota: se il file delle metriche definisce la codifica come "FontSpecific", l'utente deve fornire la codifica specifica nel modo seguente:  System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u"space", u"a1", ...}); FontEnvironment::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

### Guarda anche

* class [Type1Font](../type1font)
* spazio dei nomi [Aspose.Font.Type1](../../aspose.font.type1)
* assemblea [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
