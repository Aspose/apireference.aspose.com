---
title: "Aspose::Font::Cff::CffEncoding::GidToUnicode metodo"
linktitle: "GidToUnicode"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Cff::CffEncoding::GidToUnicode metodo. Decodifica Gid in Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'id del glifo del Font CFF può essere un'istanza della classe (GlyphStringId) o della classe (GlyphUInt32Id) in C++."
type: docs
weight: 800
url: /it/cpp/aspose.font.cff/cffencoding/gidtounicode/
---
## CffEncoding::GidToUnicode method


Decodifica Gid in Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'id del glifo CFF [Font](../../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Cff::CffEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Identificatore del glifo del simbolo da decodificare. |

### ReturnValue

Valore Unicode relativo all'id del glifo fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
