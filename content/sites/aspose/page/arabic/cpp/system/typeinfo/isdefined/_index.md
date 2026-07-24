---
title: "System::TypeInfo::IsDefined طريقة"
linktitle: "IsDefined"
second_title: "Aspose.Page لـ C++"
description: "System::TypeInfo::IsDefined method. غير مطبق. يوضح ما إذا كان سمة واحدة أو أكثر من النوع المحدد أو من أنواعه المشتقة مطبقة على هذا العضو في C++."
type: docs
weight: 4400
url: /ar/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


غير مُنفّذ. يوضح ما إذا كان أحد أو أكثر من سمات النوع المحدد أو أنواعه المشتقة مطبّقًا على هذا العضو.

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| attributeType | const TypeInfo\& | نوع السمة المخصصة للبحث عنها. البحث يشمل الأنواع المشتقة. |
| inherit | bool | true للبحث في سلسلة الوراثة لهذا العضو للعثور على السمات؛ وإلا، false. يتم تجاهل هذا المعامل للخصائص والأحداث. |

### ReturnValue

true إذا تم تطبيق نسخة واحدة أو أكثر من attributeType أو أي من أنواعه المشتقة على هذا العضو؛ وإلا، false.

## انظر أيضًا

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
