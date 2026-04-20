---
title: "تعداد System::Reflection::BindingFlags"
linktitle: "BindingFlags"
second_title: "Aspose.Font لـ C++"
description: "تعداد System::Reflection::BindingFlags. يحدد أعضاء وأنماط البحث عن الأنواع والارتباطات في C++."
type: docs
weight: 1100
url: /ar/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


يحدد أعضاء وأنماط البحث عن الأنواع والربط.

```cpp
enum class BindingFlags
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| الافتراضي | 0 | لا توجد خيارات خاصة. |
| IgnoreCase | 1 | تجاهل حالة الاسم عند البحث عن العنصر. |
| DeclaredOnly | 2 | ابحث فقط عن الأعضاء المعلنة في النوع وليس في الأنواع الأساسية. |
| Instance | 4 | ابحث في الأعضاء الخاصة بالمثيل. |
| Static | 8 | ابحث في الأعضاء الثابتة. |
| Public | 16 | ابحث في الأعضاء العامة. |
| NonPublic | 32 | ابحث في الأعضاء غير العامة. |
| FlattenHierarchy | 64 | ابحث في الأعضاء الثابتة العامة والمحمية للنوع الأساسي. |
| InvokeMethod | 256 | ينفذ الطريقة. |
| CreateInstance | 512 | ينشئ نسخة من النوع المنعكس. |
| GetField | 1024 | يحصل على قيمة الحقل. |
| SetField | 2048 | يضبط قيمة الحقل. |
| GetProperty | 4096 | يحصل على قيمة الخاصية. |
| SetProperty | 8192 | يضبط قيمة الخاصية. |
| PutDispProperty | 16384 | يضع خاصية COM. |
| PutRefDispProperty | 32768 | يضع خاصية مرجع COM. |
| ExactBinding | 65536 | يجب أن يكون ربط النوع دقيقًا، دون أي تغييرات في النوع. |
| SuppressChangeType | 131072 | غير مدعوم. |
| OptionalParamBinding | 262144 | يختار التحميل الزائد بناءً على عدد الوسائط. |
| IgnoreReturn | 16777216 | يتجاهل قيمة الإرجاع في تفاعل COM. |

## انظر أيضًا

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
