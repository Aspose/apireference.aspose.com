---
title: "طريقة System::Drawing::Graphics::MeasureCharacterRanges"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Drawing::Graphics::MeasureCharacterRanges. تُرجِع مصفوفة من المناطق، كل منها يحد مواضع الأحرف في السلسلة المحددة في C++."
type: docs
weight: 6400
url: /ar/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


إرجاع مصفوفة من المناطق، كل منها يحد مواضع الأحرف في السلسلة المحددة.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | const System::String\& | السلسلة المراد قياسها |
| font | const SharedPtr\<Font\>\& | الخط المستخدم أثناء قياس السلسلة |
| layoutRect | RectangleF | مستطيل التخطيط المستخدم أثناء قياس السلسلة |
| stringFormat | const SharedPtr\<StringFormat\>\& | تنسيق السلسلة، يحتوي على نطاقات الأحرف للقياس |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
