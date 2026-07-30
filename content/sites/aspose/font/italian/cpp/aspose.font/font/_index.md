---
title: "Aspose::Font::Font classe"
linktitle: "Font"
second_title: "Aspose.Font per C++"
description: "Classe Aspose::Font::Font. Rappresenta la classe Font di base in C++."
type: docs
weight: 400
url: /it/cpp/aspose.font/font/
---
## Font class


Rappresenta la classe [Font](./) di base.

```cpp
class Font : public virtual Aspose::Font::IFont,
             public Aspose::Font::Glyphs::IGlyphAccessor,
             public Aspose::Font::IFontSaver,
             public Aspose::Font::Licensing::IVentureLicenseTarget
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Convert](./convert/)(Aspose::Font::FontType) | Converte il/la [Font](./) in un altro formato. |
| virtual [get_Encoding](./get_encoding/)() | Ottiene la codifica del/la [Font](./). |
| virtual [get_FontDefinition](./get_fontdefinition/)() | Ottiene la definizione del/la [Font](./). |
| virtual [get_FontFamily](./get_fontfamily/)() | Ottiene o imposta la famiglia del/la [Font](./). |
| virtual [get_FontName](./get_fontname/)() | Ottiene o imposta il nome del carattere del/la [Font](./). |
| virtual [get_FontNames](./get_fontnames/)() | Ottiene i nomi del/la [Font](./). |
| [get_FontSaver](./get_fontsaver/)() override | Ottiene la funzionalità di salvataggio del/la [Font](./). |
| virtual [get_FontStyle](./get_fontstyle/)() | Ottiene lo stile del/la [Font](./). Questo è un valore calcolato e rappresentato in tipo generico. |
| virtual [get_FontType](./get_fonttype/)() | Ottiene il tipo del/la [Font](./). |
| [get_GlyphAccessor](./get_glyphaccessor/)() override | [Font](./) accessor dei glifi. Recupera i glifi e gli identificatori dei glifi. |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | Specificazione del tipo di ID glifo. Per gli utenti che hanno bisogno di conoscere il vero tipo di 'bytes[]'. |
| virtual [get_Metrics](./get_metrics/)() | Ottiene le metriche del/la [Font](./). |
| virtual [get_NumGlyphs](./get_numglyphs/)() | Ottiene il numero di glifi nel/la [Font](./). |
| virtual [get_PostscriptNames](./get_postscriptnames/)() | Ottiene i nomi PostScript del/la [Font](./). |
| virtual [get_Style](./get_style/)() | Ottiene o imposta lo stile del/la [Font](./). Questo è un valore stringa grezzo fornito dal file [Font](./). |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Restituisce tutti gli ID dei glifi disponibili nel/la [Font](./). L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di [Type1](../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) | Restituisce il glifo per ID glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. GlyphId - oggetto derivato. Per esempio: l'ID di [Type1](../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Ottiene la rappresentazione dei glifi per il testo. |
| static [Open](./open/)(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) | Apre un font, usando l'oggetto FontDefinition. |
| static [Open](./open/)(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) | Apre un font, usando il tipo di font e la sorgente di flusso. |
| static [Open](./open/)(Aspose::Font::FontType, System::String) | Apre un font, usando il tipo di font e il nome del file del font. |
| static [Open](./open/)(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) | Apre un font, usando il tipo di font e l'array di byte dei dati del font. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) override | Salva il/la [Font](./) nel formato originale. |
| [Save](./save/)(System::String) override | Salva il/la [Font](./) nel formato originale. |
| [SaveToFormat](./savetoformat/)(System::SharedPtr\<System::IO::Stream\>, FontSavingFormats) override | Salva il/la [Font](./) nel formato specificato. |
| virtual [set_FontFamily](./set_fontfamily/)(System::String) | Ottiene o imposta la famiglia del/la [Font](./). |
| virtual [set_FontName](./set_fontname/)(System::String) | Ottiene o imposta il nome del carattere del/la [Font](./). |
| virtual [set_Style](./set_style/)(System::String) | Ottiene o imposta lo stile del/la [Font](./). Questo è un valore stringa grezzo fornito dal file [Font](./). |
## Vedi anche

* Class [IFont](../ifont/)
* Class [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* Class [IFontSaver](../ifontsaver/)
* Class [IVentureLicenseTarget](../../aspose.font.licensing/iventurelicensetarget/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
