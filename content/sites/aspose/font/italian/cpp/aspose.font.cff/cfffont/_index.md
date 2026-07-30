---
title: "Aspose::Font::Cff::CffFont classe"
linktitle: "CffFont"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Cff::CffFont classe. Rappresenta il Compact Font Format (CFF) in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.cff/cfffont/
---
## CffFont class


Rappresenta il Compact [Font](../../aspose.font/font/) Format (CFF).

```cpp
class CffFont : public Aspose::Font::Font
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Converte il [Font](../../aspose.font/font/) in un altro formato. |
| [get_CommonFontsSettings](./get_commonfontssettings/)() const | Ottiene/imposta le impostazioni comuni ai font CFF. Queste impostazioni sono utilizzate in diversi scenari e possono essere modificate per ogni singolo font. |
| [get_Encoding](./get_encoding/)() override | Ottiene la codifica del [Font](../../aspose.font/font/). |
| [get_FontDefinition](./get_fontdefinition/)() override | Ottiene la definizione del [Font](../../aspose.font/font/). |
| [get_FontFamily](./get_fontfamily/)() override | Ottiene la famiglia di [Font](../../aspose.font/font/). Il setter della famiglia di [Font](../../aspose.font/font/) non è ancora implementato. |
| [get_FontName](./get_fontname/)() override | Ottiene il nome del face del [Font](../../aspose.font/font/). |
| [get_FontNames](./get_fontnames/)() override | Ottieni i nomi del [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Ottiene lo stile del [Font](../../aspose.font/font/). Questo è un valore calcolato e rappresentato in tipo generalizzato. |
| [get_FontType](./get_fonttype/)() override | Ottiene il tipo di [Font](../../aspose.font/font/). Restituisce il valore [FontType.CFF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | Ottiene la specifica del tipo di ID glifo. |
| [get_IsCidKeyedFont](./get_iscidkeyedfont/)() | Ottiene il valore che indica che il [Font](../../aspose.font/font/) è cid-keyed. |
| [get_Metrics](./get_metrics/)() override | Ottiene le metriche del [Font](../../aspose.font/font/). |
| [get_NumGlyphs](./get_numglyphs/)() override | Ottiene il numero di glifi nel [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Ottiene i nomi postscript del [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Ottiene lo stile del [Font](../../aspose.font/font/). Questo è un valore stringa grezzo fornito dal file [Font](../../aspose.font/font/). |
| [get_TopDictDataProvider](./get_topdictdataprovider/)() | Ottiene l'accessor per il primo DICT di livello superiore nella struttura Top DICT INDEX. |
| [GetAllGlyphIds](./getallglyphids/)() override | Restituisce un array di tutti gli ID glifo, disponibili nel [Font](../../aspose.font/font/). L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di font. L'ID glifo CFF del [Font](../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Restituisce il glifo per ID glifo. L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di font. L'ID glifo CFF del [Font](../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). |
| [GetGlyphById](./getglyphbyid/)(System::String) | Restituisce il glifo per nome glifo. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Restituisce il glifo per ID del glifo. |
| [GetIndexDataProvider](./getindexdataprovider/)(CffDataProviders::CffIndexProviderType) | Ottiene il provider per il tipo di struttura CFF INDEX specificato. |
| [set_CommonFontsSettings](./set_commonfontssettings/)(System::SharedPtr\<CffFontsSettings\>) | Ottiene/imposta le impostazioni comuni ai font CFF. Queste impostazioni sono utilizzate in diversi scenari e possono essere modificate per ogni singolo font. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Ottiene la famiglia di [Font](../../aspose.font/font/). Il setter della famiglia di [Font](../../aspose.font/font/) non è ancora implementato. |
| [set_FontName](./set_fontname/)(System::String) override | Imposta il nome del face del [Font](../../aspose.font/font/). |
| [set_Style](./set_style/)(System::String) override | Imposta lo stile del [Font](../../aspose.font/font/). Questo è un valore stringa grezzo fornito dal file [Font](../../aspose.font/font/). |
## Vedi anche

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
