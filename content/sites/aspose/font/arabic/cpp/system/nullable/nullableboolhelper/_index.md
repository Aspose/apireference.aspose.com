---
title: "System::Nullable::NullableBoolHelper method"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Font لـ C++"
description: "System::Nullable::NullableBoolHelper method. دالة مساعدة للتحقق مما إذا كان **this** و **other** غير فارغين معًا واستدعاء دالة lambda إذا كان الأمر كذلك. تُستخدم في implementation.s في C++."
type: docs
weight: 800
url: /ar/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


دالة مساعدة للتحقق مما إذا كان هذا و **other** غير فارغين معاً واستدعاء دالة lambda إذا كان الأمر كذلك. تُستخدم في implementation.s.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع Nullable آخر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | const T1\& | قيمة Nullable أخرى للمقارنة معها. |
| f | const std::function\\<bool()>\\& | دالة lambda للاستدعاء إذا كان كل من **this** و **other** غير فارغين. |
| default_if_both_are_null | bool | القيمة المرجعة إذا كانت القيمتان فارغتين. |

### ReturnValue

false إذا كان أي من **this** أو **other** فارغًا؛ **default_if_both_are_null** إذا كان كلاهما فارغًا؛ نتيجة استدعاء **f** إذا كان كلاهما غير فارغ.

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
