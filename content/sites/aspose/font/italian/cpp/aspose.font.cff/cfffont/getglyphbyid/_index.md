---
title: "Aspose::Font::Cff::CffFont::GetGlyphById metodo"
linktitle: "GetGlyphById"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Cff::CffFont::GetGlyphById metodo. Restituisce il glifo per ID glifo. L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. L'ID glifo del carattere CFF può essere un'istanza della classe (GlyphStringId) o della classe (GlyphUInt32Id) in C++."
type: docs
weight: 1800
url: /it/cpp/aspose.font.cff/cfffont/getglyphbyid/
---
## CffFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Restituisce il glifo per ID glifo. L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. L'ID glifo del [Font](../../../aspose.font/font/) CFF può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Id del glifo. |

### ReturnValue

Glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(System::String) method


Restituisce il glifo per nome glifo.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::String glyphName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphName | System::String | Nome del glifo. |

### ReturnValue

Glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(uint32_t) method


Restituisce il glifo per ID del glifo.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(uint32_t id)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | uint32_t | Id del glifo. |

### ReturnValue

Glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
