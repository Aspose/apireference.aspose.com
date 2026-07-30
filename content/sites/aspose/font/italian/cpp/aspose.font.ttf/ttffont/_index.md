---
title: "Aspose::Font::Ttf::TtfFont classe"
linktitle: "TtfFont"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::TtfFont classe. Rappresenta il Font TrueType (TTF) in C++."
type: docs
weight: 600
url: /it/cpp/aspose.font.ttf/ttffont/
---
## TtfFont class


Rappresenta il TrueType [Font](../../aspose.font/font/) (TTF).

```cpp
class TtfFont : public Aspose::Font::Font
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Converte il [Font](../../aspose.font/font/) in un altro formato. |
| [Convert](./convert/)(Aspose::Font::FontType, System::SharedPtr\<System::Collections::Generic::ICollection\<uint32_t\>\>) | Converte il [Font](../../aspose.font/font/) in un altro formato con un set di caratteri limitato. |
| virtual [get_CffFont](./get_cfffont/)() | Ottiene il CFF [Font](../../aspose.font/font/) se presente. |
| [get_Encoding](./get_encoding/)() override | Ottiene la codifica del [Font](../../aspose.font/font/). |
| [get_FontDefinition](./get_fontdefinition/)() override | Ottiene la definizione del [Font](../../aspose.font/font/). |
| [get_FontFamily](./get_fontfamily/)() override | Ottiene o imposta la famiglia del [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | Ottiene o imposta il nome della faccia del [Font](../../aspose.font/font/). |
| [get_FontNames](./get_fontnames/)() override | Ottiene i nomi del [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Ottiene lo stile del [Font](../../aspose.font/font/). Questo è un valore calcolato e rappresentato in tipo generalizzato. |
| [get_FontType](./get_fonttype/)() override | Ottiene il tipo del [Font](../../aspose.font/font/). Restituisce il valore [FontType.TTF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | Ottiene la specifica del tipo di ID glifo. |
| [get_IsSymbolic](./get_issymbolic/)() | Restituisce true se il [Font](../../aspose.font/font/) è simbolico. |
| [get_Metrics](./get_metrics/)() override | Ottiene le metriche del [Font](../../aspose.font/font/). |
| [get_NumGlyphs](./get_numglyphs/)() override | Ottiene il numero di glifi nel [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Ottiene i nomi Postscript del [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Ottiene o imposta lo stile del [Font](../../aspose.font/font/). Questo è un valore stringa grezzo fornito dal file [Font](../../aspose.font/font/). |
| virtual [get_TtfTables](./get_ttftables/)() | Ottiene le tabelle TTF. |
| [GetAllGlyphIds](./getallglyphids/)() override | Restituisce un array di tutti gli ID dei glifi, disponibili nel [Font](../../aspose.font/font/). L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'ID del glifo del [Font](../../aspose.font/font/) TTF può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). L'indirizzamento dei glifi per nome (stringa) è supportato per i font TTF tramite la mappatura della tabella Post. Nel caso di un [Font](../../aspose.font/font/) CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Restituisce il glifo per ID del glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'ID del glifo del [Font](../../aspose.font/font/) TTF può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). L'indirizzamento dei glifi per nome (stringa) è supportato per i font TTF tramite la mappatura della tabella Post. Nel caso di un [Font](../../aspose.font/font/) CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Restituisce il glifo per nome del glifo. L'indirizzamento dei glifi per nome (stringa) è supportato per i font TTF tramite la mappatura della tabella Post. Nel caso di un [Font](../../aspose.font/font/) CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Restituisce il glifo per ID del glifo. |
| virtual [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) | Ottiene un glifo tramite l'identificatore del glifo fornito e riempie la lista di identificatori di glifi fornita con i componenti di questo glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'ID del glifo del [Font](../../aspose.font/font/) TTF può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). L'indirizzamento dei glifi per nome (stringa) è supportato per i font TTF tramite la mappatura della tabella Post. Nel caso di un [Font](../../aspose.font/font/) CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) | Ottiene un glifo per nome del glifo fornito e riempie la lista di identificatori di glifi fornita con i componenti di questo glifo. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) | Ottiene un glifo per indice del glifo fornito e riempie la lista di identificatori di glifi fornita con i componenti di questo glifo. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Ottieni la rappresentazione dei glifi per il testo. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Ottiene o imposta la famiglia del [Font](../../aspose.font/font/). |
| [set_FontName](./set_fontname/)(System::String) override | Ottiene o imposta il nome della faccia del [Font](../../aspose.font/font/). |
| [set_Style](./set_style/)(System::String) override | Ottiene o imposta lo stile del [Font](../../aspose.font/font/). Questo è un valore stringa grezzo fornito dal file [Font](../../aspose.font/font/). |
## Vedi anche

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
