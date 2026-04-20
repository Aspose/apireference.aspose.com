---
title: "طريقة System::TypeInfo::IsDefined"
linktitle: "IsDefined"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::TypeInfo::IsDefined. غير منفذة. تشير إلى ما إذا كان سمة واحدة أو أكثر من النوع المحدد أو من أنواعه المشتقة مطبقة على هذا العضو في C++."
type: docs
weight: 4400
url: /ar/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


غير مُنفَّذ. يشير إلى ما إذا كان يتم تطبيق سمة واحدة أو أكثر من النوع المحدد أو من أنواعه المشتقة على هذا العضو.

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| attributeType | const TypeInfo\& | نوع السمة المخصصة للبحث عنها. يتضمن البحث الأنواع المشتقة. |
| inherit | bool | صحيح للبحث في سلسلة وراثة هذا العضو للعثور على السمات؛ وإلا، خطأ. يتم تجاهل هذا المعامل للخصائص والأحداث. |

### ReturnValue

صحيح إذا تم تطبيق نسخة واحدة أو أكثر من attributeType أو أي من أنواعه المشتقة على هذا العضو؛ وإلا، خطأ.

## انظر أيضًا

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
