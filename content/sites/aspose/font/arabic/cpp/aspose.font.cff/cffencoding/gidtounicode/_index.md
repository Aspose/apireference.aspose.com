---
title: "طريقة Aspose::Font::Cff::CffEncoding::GidToUnicode method"
linktitle: "GidToUnicode"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Cff::CffEncoding::GidToUnicode method. تقوم بفك تشفير Gid إلى Unicode. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. يمكن أن يكون معرف حرف CFF Font مثالًا على الفئة (GlyphStringId) أو الفئة (GlyphUInt32Id) في C++."
type: docs
weight: 800
url: /ar/cpp/aspose.font.cff/cffencoding/gidtounicode/
---
## CffEncoding::GidToUnicode method


يقوم بفك تشفير Gid إلى Unicode. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. معرف حرف CFF [Font](../../../aspose.font/font/) يمكن أن يكون مثالًا على الفئة ([GlyphStringId](../)) أو الفئة ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Cff::CffEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | معرف الشكل للرمز المراد فك ترميزه. |

### ReturnValue

قيمة يونيكود المرتبطة بمعرف الشكل الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
