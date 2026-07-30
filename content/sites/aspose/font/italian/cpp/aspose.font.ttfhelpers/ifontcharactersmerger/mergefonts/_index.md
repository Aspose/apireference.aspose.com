---
title: "Metodo Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts"
linktitle: "MergeFonts"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts. Unisce i font in base alle liste di glifi fornite. Cerca un codice di carattere per ogni glifo fornito e aggiunge il codice di carattere trovato con il glifo corrispondente nel nuovo font risultante in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Unisce i font in base alle liste di glifi passate. Cerca un codice di carattere per ogni glifo passato e aggiunge il codice di carattere trovato con il glifo corrispondente nel nuovo font risultante.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font1Glyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font2Glyphs, System::String newFontName)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font1Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Elenco dei glifi del primo font |
| font2Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Elenco dei glifi del secondo font |
| newFontName | System::String | Nome desiderato per il font risultante |

### ReturnValue

Font unito

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Unisce i font in base alle liste di codici di carattere fornite. Per creare il font risultante desiderato basta passare i codici dei simboli dai font originali che si desidera includere nel font risultante. [Glyphs](../../../aspose.font.glyphs/) relativi ai codici forniti verranno trovati automaticamente. Ad esempio, se si desidera includere nel font risultante i glifi relativi alle lettere A e B dal primo font e i glifi relativi alle lettere C e D dal secondo font, basta chiamare questo metodo così: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")**

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> font1CharCodes, System::ArrayPtr<uint32_t> font2CharCodes, System::String newFontName)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font1CharCodes | System::ArrayPtr\<uint32_t\> | Codici da prendere dal primo font |
| font2CharCodes | System::ArrayPtr\<uint32_t\> | Codici da prendere dal secondo font |
| newFontName | System::String | Nome desiderato per il font risultante |

### ReturnValue

Font unito

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Questa versione del metodo è progettata per i casi in cui si desidera impostare esplicitamente i codici carattere per i glifi nel font risultante. Non è obbligatorio che il codice per il glifo fornito sia incluso nel font originale. Il senso del codice passato è che sarà associato all'identificatore del glifo corrispondente nel font risultante. Pertanto, la regola per elaborare ogni coppia passata tramite il parametro dizionario [code, glyph identifier] è che solo l'identificatore del glifo verrà preso dal font originale e poi sarà collegato al codice corrispondente nel font risultante. Può essere utile quando alcuni codici dal primo font confliggono con gli stessi codici dal secondo font.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font1Dict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font2Dict, System::String newFontName)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font1Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Dizionario con coppie [symbol code, glyph identifier] dal primo font |
| font2Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Dizionario con coppie [symbol code, glyph identifier] dal secondo font |
| newFontName | System::String | Nome desiderato per il font risultante |

### ReturnValue

Font unito

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
