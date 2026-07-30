---
title: "Aspose::Font::Cff::CffEncoding::GidToUnicode yöntemi"
linktitle: "GidToUnicode"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Cff::CffEncoding::GidToUnicode yöntemi. Gid'yi unicode'a çözer. Glif kimliği, font türüne bağlı olan bir glif için benzersiz bir sayıdır. CFF Font glif kimliği, C++'da (GlyphStringId) sınıfının ya da (GlyphUInt32Id) sınıfının bir örneği olabilir."
type: docs
weight: 800
url: /tr/cpp/aspose.font.cff/cffencoding/gidtounicode/
---
## CffEncoding::GidToUnicode method


Gid'yi unicode'a çözer. Glif kimliği, font türüne bağlı olan bir glif için benzersiz bir sayıdır. CFF [Font](../../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir.

```cpp
uint32_t Aspose::Font::Cff::CffEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Çözülecek sembolün glyph tanımlayıcısı. |

### ReturnValue

Geçilen glyph kimliğine ilişkin Unicode değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
