---
title: "Aspose::Font::Cff::CffEncoding::UnicodeToGid method"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Cff::CffEncoding::UnicodeToGid method. Decodifica un unicode e restituisce l'id del glifo. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'id del glifo del Font CFF può essere un'istanza della classe (GlyphStringId) o della classe (GlyphUInt32Id) in C++."
type: docs
weight: 900
url: /it/cpp/aspose.font.cff/cffencoding/unicodetogid/
---
## CffEncoding::UnicodeToGid method


Decodifica un unicode e restituisce l'id del glifo. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'id del glifo del CFF [Font](../../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::UnicodeToGid(uint32_t unicode) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| unicode | uint32_t | Unicode per ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo all'Unicode fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
