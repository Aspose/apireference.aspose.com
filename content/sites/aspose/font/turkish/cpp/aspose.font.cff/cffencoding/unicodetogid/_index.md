---
title: "Aspose::Font::Cff::CffEncoding::UnicodeToGid yöntemi"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Cff::CffEncoding::UnicodeToGid yöntemi. Bir unicode'ı çözer ve glif kimliğini döndürür. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. CFF Font glif kimliği, C++'da (GlyphStringId) sınıfının ya da (GlyphUInt32Id) sınıfının bir örneği olabilir."
type: docs
weight: 900
url: /tr/cpp/aspose.font.cff/cffencoding/unicodetogid/
---
## CffEncoding::UnicodeToGid method


Bir unicode'ı çözer ve glif kimliğini döndürür. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. CFF [Font](../../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::UnicodeToGid(uint32_t unicode) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| unicode | uint32_t | Glyph tanımlayıcısını almak için unicode. |

### ReturnValue

Geçilen unicode'a ilişkin glyph tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
