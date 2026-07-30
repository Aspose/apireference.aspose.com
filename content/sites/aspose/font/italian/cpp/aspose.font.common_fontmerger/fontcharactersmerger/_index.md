---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger classe"
linktitle: "FontCharactersMerger"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger classe. Dichiara la funzionalità per unire font di tipi diversi. È necessaria una coppia di font per l'operazione di fusione. Un font di questa coppia è considerato primario. Ciò significa che molte caratteristiche, relative al font finale unito, come metriche, struttura di codifica e altre, saranno prese da questo font primario. Un altro font di questa coppia (secondario) fornisce solo i glifi per il font finale unito in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.common_fontmerger/fontcharactersmerger/
---
## FontCharactersMerger class


Dichiara la funzionalità per unire caratteri di diversi tipi. È necessaria una coppia di caratteri per l'operazione di unione. Un carattere di questa coppia è considerato primario. Ciò significa che molte caratteristiche, relative al carattere unito finale, come metriche, struttura di codifica e altre, saranno prese da questo carattere primario. Un altro carattere della coppia (secondario) fornisce solo i glifi per il carattere unito finale.

```cpp
class FontCharactersMerger : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_PrimaryFont](./get_primaryfont/)() | Ottiene il font primario. |
| virtual [get_SecondaryFont](./get_secondaryfont/)() | Ottiene il font secondario. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | Unisce i font in base alle liste di glifi passate. Cerca un codice carattere per ogni glifo passato e aggiunge il codice carattere trovato con il glifo corrispondente nel nuovo font risultante. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | Unisce i font in base alle liste di codici carattere passate. Per creare il font risultante desiderato, basta passare i codici simbolo dei font originali che si desidera includere nel font risultante. [Glyphs](../../aspose.font.glyphs/) relativi ai codici passati saranno trovati automaticamente. Per esempio, se si desidera includere nel font risultante i glifi relativi alle lettere A e B dal primo font e i glifi relativi alle lettere C e D dal secondo font, basta chiamare questo metodo così: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | Questa versione del metodo è progettata per i casi in cui si desidera impostare esplicitamente i codici carattere per i glifi nel font risultante. Non è obbligatorio che il codice per il glifo fornito sia incluso nel font originale. Il senso del codice passato è che sarà associato all'identificatore del glifo corrispondente nel font risultante. Pertanto, la regola per elaborare ogni coppia passata tramite il parametro dizionario [code, glyph identifier] è che solo l'identificatore del glifo verrà preso dal font originale e poi sarà collegato al codice corrispondente nel font risultante. Può essere utile quando alcuni codici dal primo font confliggono con gli stessi codici dal secondo font. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Common_FontMerger](../)
* Library [Aspose.Font for C++](../../)
