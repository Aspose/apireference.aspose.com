---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGid method"
linktitle: "DecodeToGid"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGid method. Ottiene il Gid per il charCode fornito. Questo metodo è progettato per i CFF CIDFonts, dove il charCode deve essere un valore CID valido. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'id del glifo del Font CFF può essere un'istanza della classe (GlyphStringId) o della classe (GlyphUInt32Id) in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding::DecodeToGid method


Ottiene il Gid per il charCode fornito. Questo metodo è progettato per i CFF CIDFonts, dove il charCode deve essere un valore CID valido. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'id del glifo del CFF [Font](../../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGid(uint32_t charCode) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charCode | uint32_t | Codice carattere (CID) per cui ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo al CID fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
