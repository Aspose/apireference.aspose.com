---
title: "طريقة System::Attribute::GetCustomAttribute"
linktitle: "GetCustomAttribute"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Attribute::GetCustomAttribute. تُرجع سمة مخصصة من نوع محدد مطبقة على النوع المحدد في C++."
type: docs
weight: 100
url: /ar/cpp/system/attribute/getcustomattribute/
---
## Attribute::GetCustomAttribute method


يعيد سمة مخصصة من نوع محدد مطبقة على النوع المحدد.

```cpp
static Object::ptr System::Attribute::GetCustomAttribute(const TypeInfo &type, const TypeInfo &attributeType)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نوع | const TypeInfo\& | نوع السمة التي يتم استرجاعها |
| attributeType | const TypeInfo\& | نوع السمة المراد استرجاعها |

### ReturnValue

سمة مسترجعة أو null إذا كان النوع المحدد لا يحتوي على سمة من النوع المحدد.

## انظر أيضًا

* Typedef [ptr](../../object/ptr/)
* Class [TypeInfo](../../typeinfo/)
* Class [Attribute](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
