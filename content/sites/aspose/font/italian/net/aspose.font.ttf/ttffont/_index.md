---
title: TtfFont
second_title: Aspose.Font per Riferimento API .NET
description: Rappresenta il carattere TrueType TTF.
type: docs
weight: 630
url: /it/net/aspose.font.ttf/ttffont/
---
## TtfFont class

Rappresenta il carattere TrueType (TTF).

```csharp
public class TtfFont : Font
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont) { get; } | Ottiene il carattere CFF se presente. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding) { get; } | Ottiene la codifica dei caratteri. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition) { get; } | Ottiene la definizione del carattere. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily) { get; set; } | Ottiene o imposta la famiglia di caratteri. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname) { get; set; } | Ottiene o imposta il nome del carattere del carattere. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames) { get; } | Ottiene i nomi dei caratteri. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Ottiene la funzionalità di salvataggio dei caratteri. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle) { get; } | Ottiene lo stile del carattere. Questo è un valore calcolato e rappresentato in tipo generalizzato. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype) { get; } | Ottiene il tipo di carattere. Restituisce il valore FontType.TTF. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Accessorio per glifo dei caratteri. Recupera glifi e identificatori di glifi. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype) { get; } | Ottiene la specifica del tipo di ID glifo. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic) { get; } | Restituisce true nel caso in cui il carattere sia simbolico. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics) { get; } | Ottiene le metriche dei caratteri. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs) { get; } | Ottiene il numero di glifi nel Font. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames) { get; } | Ottiene i nomi dei caratteri Postscript. |
| override [Style](../../aspose.font.ttf/ttffont/style) { get; set; } | Ottiene o imposta lo stile del carattere. Questo è un valore di stringa non elaborato fornito dal file del carattere. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables) { get; } | Ottiene tabelle TTF. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert)(FontType) | Converte il carattere in un altro formato. |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids)() | Restituisce l'array di tutti gli ID glifi, disponibili in Font. L'ID glifo è un numero univoco per un glifo, che dipende dal tipo di carattere. TTF L'ID glifo del carattere può essere un'istanza di ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) classe o ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. L'indirizzamento del glifo del nome (stringa) è supportato per i caratteri TTF tramite la mappatura della tabella Post. Nel caso in cui il carattere CFF all'interno, le strutture CFF vengono utilizzate per indirizzare i glifi per nome. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid)(GlyphId) | Restituisce glifo per id glifo. L'ID glifo è un numero univoco per un glifo, che dipende dal tipo di carattere. L'ID glifo del carattere TTF può essere un'istanza di ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) classe o ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. L'indirizzamento del glifo del nome (stringa) è supportato per i caratteri TTF tramite la mappatura della tabella Post. Nel caso in cui il carattere CFF all'interno, le strutture CFF vengono utilizzate per indirizzare i glifi per nome. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_1)(string) | Restituisce il glifo in base al nome del glifo. Nome (stringa) L'indirizzamento del glifo è supportato per i caratteri TTF tramite la mappatura della tabella Post. Nel caso in cui il carattere CFF all'interno, le strutture CFF vengono utilizzate per indirizzare i glifi per nome. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_2)(uint) | Restituisce glifo per id glifo. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | Ottiene un glifo per identificatore di glifo passato e riempie l'elenco passato di identificatori di glifo con i componenti di questo glifo. L'ID glifo è un numero univoco per un glifo, che dipende dal tipo di carattere. TTF L'ID glifo del carattere può essere un'istanza di ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) classe o ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. L'indirizzamento del glifo del nome (stringa) è supportato per i caratteri TTF tramite la mappatura della tabella Post. Nel caso in cui il carattere CFF all'interno, le strutture CFF vengono utilizzate per indirizzare i glifi per nome. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_1)(string, GlyphIdList) | Ottiene un glifo in base al nome del glifo passato e riempie l'elenco passato di identificatori di glifo con i componenti di questo glifo. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_2)(uint, GlyphIdList) | Ottiene un glifo per indice di glifo passato e riempie l'elenco passato di identificatori di glifi con i componenti di questo glifo. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext)(string) | Ottieni la rappresentazione dei glifi per il testo. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Salva il carattere nel formato originale. |
| virtual [Save](../../aspose.font/font/save)(string) | Salva il carattere nel formato originale. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Salva il carattere nel formato specificato. |

### Guarda anche

* class [Font](../../aspose.font/font)
* spazio dei nomi [Aspose.Font.Ttf](../../aspose.font.ttf)
* assemblea [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
