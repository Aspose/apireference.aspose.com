---
title: "طريقة Aspose::Font::Cff::CffEncoding::UnicodeToGid"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Cff::CffEncoding::UnicodeToGid. تقوم بفك ترميز يونيكود وتُرجع معرف الحرف. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. يمكن أن يكون معرف حرف CFF Font مثالًا على فئة (GlyphStringId) أو فئة (GlyphUInt32Id) في C++."
type: docs
weight: 900
url: /ar/cpp/aspose.font.cff/cffencoding/unicodetogid/
---
## CffEncoding::UnicodeToGid method


يقوم بفك ترميز يونيكود ويُرجع معرف الحرف. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. معرف حرف CFF [Font](../../../aspose.font/font/) يمكن أن يكون مثالًا على فئة ([GlyphStringId](../)) أو فئة ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::UnicodeToGid(uint32_t unicode) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | uint32_t | يونيكود للحصول على معرف الشكل له. |

### ReturnValue

معرف الشكل المرتبط بيونيكود الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
