---
title: "طريقة System::String::ToByteArray"
linktitle: "ToByteArray"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::ToByteArray. تحول السلسلة أو الجزء الفرعي إلى مصفوفة من البايتات في C++."
type: docs
weight: 4700
url: /ar/cpp/system/string/tobytearray/
---
## String::ToByteArray method


يحوّل السلسلة أو الجزء الفرعي إلى مصفوفة من البايتات.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| startIndex | int32_t | فهرس بدء الجزء الفرعي. |
| الطول | int32_t | طول الجزء الفرعي. |
| LE | bool | إذا كان true، يتم ترميز الأحرف باستخدام ترتيب البايت الصغير؛ وإلا، يستخدم ترتيب البايت الكبير. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
