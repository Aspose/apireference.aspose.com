---
title: "طريقة System::Uri::HexUnescape"
linktitle: "HexUnescape"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Uri::HexUnescape. تُحوّل التمثيل الست عشري المحدد لحرف إلى حرف في C++."
type: docs
weight: 4000
url: /ar/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


يحوّل التمثيل الست عشري المحدد لحرف إلى حرف.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| النمط | const String\& | سلسلة تحتوي على التمثيل الست عشري لحرف |
| الفهرس | int32_t\& | الموضع في **pattern** حيث يبدأ التمثيل الست عشري لحرف |

### ReturnValue

الحرف الممثَّل بالترميز الست عشري في الموضع **index**. إذا لم يكن الحرف في **index** مُرمَّزًا ست عشريًا، يتم إرجاع الحرف في **index**. تُزاد قيمة **index** لتشير إلى الحرف التالي بعد الحرف المرجع.

## انظر أيضًا

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
