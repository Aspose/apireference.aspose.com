---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGid yöntemi"
linktitle: "DecodeToGid"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGid yöntemi. Geçilen charCode için Gid alır. Bu yöntem, charCode'un geçerli bir CID değeri olması gereken CFF CIDFonts için tasarlanmıştır. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. CFF Font glif kimliği, C++'da (GlyphStringId) sınıfının ya da (GlyphUInt32Id) sınıfının bir örneği olabilir."
type: docs
weight: 100
url: /tr/cpp/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding::DecodeToGid method


Geçilen charCode için Gid alır. Bu yöntem, charCode'un geçerli bir CID değeri olması gereken CFF CIDFonts için tasarlanmıştır. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. CFF [Font](../../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGid(uint32_t charCode) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| charCode | uint32_t | Glif tanımlayıcısını almak için karakter kodu (CID). |

### ReturnValue

Geçilen CID ile ilişkili glif tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
