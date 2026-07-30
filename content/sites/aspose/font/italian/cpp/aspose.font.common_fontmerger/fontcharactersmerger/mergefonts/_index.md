---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts metodo"
linktitle: "MergeFonts"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts metodo. Unisce i font in base alle liste di glifi fornite. Cerca un codice di carattere per ogni glifo fornito e aggiunge il codice di carattere trovato con il glifo corrispondente nel nuovo font risultante in C++."
type: docs
weight: 300
url: /it/cpp/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Unisce i font in base alle liste di glifi passate. Cerca un codice carattere per ogni glifo passato e aggiunge il codice carattere trovato con il glifo corrispondente nel nuovo font risultante.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> primaryFontGlyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> secondaryFontGlyphs, System::String newFontName)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| primaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Elenco dei glifi da prendere dal font primario |
| secondaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Elenco dei glifi da prendere dal font secondario |
| newFontName | System::String | Nome desiderato per il font risultante |

### ReturnValue

Font unito

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Unisce i font in base alle liste di codici di carattere fornite. Per creare il font risultante desiderato basta passare i codici dei simboli dai font originali che si desidera includere nel font risultante. [Glyphs](../../../aspose.font.glyphs/) relativi ai codici forniti verranno trovati automaticamente. Ad esempio, se si desidera includere nel font risultante i glifi relativi alle lettere A e B dal primo font e i glifi relativi alle lettere C e D dal secondo font, basta chiamare questo metodo così: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")**

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> primaryFontCharCodes, System::ArrayPtr<uint32_t> secondaryFontCharCodes, System::String newFontName)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| primaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Codici da prendere dal font primario |
| secondaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Codici da prendere dal font secondario |
| newFontName | System::String | Nome desiderato per il font risultante |

### ReturnValue

Font unito

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Questa versione del metodo è progettata per i casi in cui si desidera impostare esplicitamente i codici carattere per i glifi nel font risultante. Non è obbligatorio che il codice per il glifo fornito sia incluso nel font originale. Il senso del codice passato è che sarà associato all'identificatore del glifo corrispondente nel font risultante. Pertanto, la regola per elaborare ogni coppia passata tramite il parametro dizionario [code, glyph identifier] è che solo l'identificatore del glifo verrà preso dal font originale e poi sarà collegato al codice corrispondente nel font risultante. Può essere utile quando alcuni codici dal primo font confliggono con gli stessi codici dal secondo font.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> primaryFontDict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> secondaryFontDict, System::String newFontName)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| primaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Dizionario con coppie [codice simbolo, identificatore glifo] dal font primario |
| secondaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Dizionario con coppie [codice simbolo, identificatore glifo] dal font secondario |
| newFontName | System::String | Nome desiderato per il font risultante |

### ReturnValue

Font unito

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
