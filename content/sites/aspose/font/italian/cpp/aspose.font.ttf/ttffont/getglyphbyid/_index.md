---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphById metodo"
linktitle: "GetGlyphById"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphById metodo. Restituisce il glifo per ID glifo. L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. L'ID glifo del Font TTF può essere un'istanza della classe (GlyphStringId) o della classe (GlyphUInt32Id). L'indirizzamento del glifo per nome (stringa) è supportato per i Font TTF tramite la mappatura della tabella Post. In caso di Font CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome in C++."
type: docs
weight: 1800
url: /it/cpp/aspose.font.ttf/ttffont/getglyphbyid/
---
## TtfFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Restituisce il glifo per ID glifo. L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. L'ID glifo del TTF [Font](../../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). L'indirizzamento del glifo per nome (stringa) è supportato per i Font TTF tramite la mappatura della tabella Post. In caso di [Font](../../../aspose.font/font/) CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
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
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(System::String) method


Restituisce il glifo per nome glifo. L'indirizzamento del glifo per nome (stringa) è supportato per i font TTF tramite la mappatura della tabella Post. In caso di [Font](../../../aspose.font/font/) CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::String glyphName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphName | System::String | Identificatore di stringa del glifo. |

### ReturnValue

Glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(uint32_t) method


Restituisce il glifo per ID del glifo.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(uint32_t id)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | uint32_t | Indice del glifo. |

### ReturnValue

Glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
