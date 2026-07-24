---
title: "طريقة System::String::ToByteArray"
linktitle: "ToByteArray"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::String::ToByteArray. تقوم بتحويل السلسلة أو جزء منها إلى مصفوفة من البايتات في C++."
type: docs
weight: 4700
url: /ar/cpp/system/string/tobytearray/
---
## String::ToByteArray method


يحوّل السلسلة أو السلسلة الفرعية إلى مصفوفة من البايتات.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| startIndex | int32_t | فهرس بدء السلسلة الفرعية. |
| الطول | int32_t | طول السلسلة الفرعية. |
| LE | bool | إذا كان true، يتم ترميز الأحرف باستخدام ترتيب البايت الصغير؛ وإلا، يتم استخدام ترتيب البايت الكبير. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
