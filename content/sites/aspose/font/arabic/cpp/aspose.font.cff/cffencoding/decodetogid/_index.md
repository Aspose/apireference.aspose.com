---
title: "طريقة Aspose::Font::Cff::CffEncoding::DecodeToGid"
linktitle: "DecodeToGid"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Cff::CffEncoding::DecodeToGid. تحصل على Gid لـ charCode الممرَّر. تم تصميم هذه الطريقة لخطوط CFF CIDFonts، حيث يجب أن يكون charCode قيمة CID صالحة. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. يمكن أن يكون معرف حرف CFF Font مثالًا على فئة (GlyphStringId) أو فئة (GlyphUInt32Id) في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding::DecodeToGid method


تحصل على Gid لـ charCode الممرَّر. تم تصميم هذه الطريقة لخطوط CFF CIDFonts، حيث يجب أن يكون charCode قيمة CID صالحة. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. معرف حرف CFF [Font](../../../aspose.font/font/) يمكن أن يكون مثالًا على فئة ([GlyphStringId](../)) أو فئة ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGid(uint32_t charCode) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| charCode | uint32_t | رمز الحرف (CID) للحصول على معرف الحرف. |

### ReturnValue

معرف الحرف المتعلق بـ CID الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
