---
title: "طريقة Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized. طريقة فك ترميز معلمة. غير مدعومة لنوع الخط CFF في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.cff/cffencoding/decodetogidparameterized/
---
## CffEncoding::DecodeToGidParameterized method


طريقة فك ترميز معلمة. غير مدعومة لنوع CFF [Font](../../../aspose.font/font/).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | تنفيذ واجهة [IEncodingParameters](../../../aspose.font/iencodingparameters/). |
| charCode | uint32_t | رمز الحرف للحصول على معرف الشكل له. |

### ReturnValue

معرف الحرف المتعلق بـ charCode الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
