---
title: "Aspose::Font::IFontEncoding::DecodeToGidParameterized طريقة"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::IFontEncoding::DecodeToGidParameterized طريقة. طريقة فك تشفير معلمة في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding::DecodeToGidParameterized method


طريقة فك الترميز المعلمة.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | تنفيذ واجهة [IEncodingParameters](../../iencodingparameters/). |
| charCode | uint32_t | رمز الحرف للحصول على معرف الشكل له. |

### ReturnValue

معرف الشكل مرتبط برمز الحرف الممرّر.
## ملاحظات


بعض أنواع الخطوط يمكن أن تحتوي على عدة خوارزميات/خرائط ترميز. لذلك، تُستخدم واجهة [IEncodingParameters](../../iencodingparameters/) لإنشاء معلمات ترميز خطية ملموسة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../iencodingparameters/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
