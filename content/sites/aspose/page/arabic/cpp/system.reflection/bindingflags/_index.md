---
title: "تعداد System::Reflection::BindingFlags"
linktitle: "BindingFlags"
second_title: "Aspose.Page لـ C++"
description: "تعداد System::Reflection::BindingFlags. يحدد أوضاع البحث عن الأعضاء والأنواع والارتباطات في C++."
type: docs
weight: 1100
url: /ar/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


يحدد الأعضاء وأنماط البحث عن الأنواع والربط.

```cpp
enum class BindingFlags
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Default | 0 | لا خيارات خاصة. |
| IgnoreCase | 1 | تجاهل حالة الأحرف في الاسم عند البحث عن العنصر. |
| DeclaredOnly | 2 | ابحث فقط عن الأعضاء المعلنة في النوع وليس في الأنواع الأساسية. |
| Instance | 4 | ابحث عبر الأعضاء المثيلة. |
| Static | 8 | ابحث عبر الأعضاء الساكنة. |
| Public | 16 | ابحث عبر الأعضاء العامة. |
| NonPublic | 32 | ابحث عبر الأعضاء غير العامة. |
| FlattenHierarchy | 64 | ابحث عبر الأعضاء الساكنة العامة والمحمية للنوع الأساسي. |
| InvokeMethod | 256 | ينفّذ الطريقة. |
| CreateInstance | 512 | ينشئ نسخة من النوع المنعكس. |
| GetField | 1024 | يحصل على قيمة الحقل. |
| SetField | 2048 | يضبط قيمة الحقل. |
| GetProperty | 4096 | يسترجع قيمة الخاصية. |
| SetProperty | 8192 | يضبط قيمة الخاصية. |
| PutDispProperty | 16384 | يضع خاصية COM. |
| PutRefDispProperty | 32768 | يضع خاصية مرجع COM. |
| ExactBinding | 65536 | يجب أن يكون ربط النوع دقيقًا، دون أي تغييرات في النوع. |
| SuppressChangeType | 131072 | غير مدعوم. |
| OptionalParamBinding | 262144 | يختار التحميل الزائد بناءً على عدد الوسائط. |
| IgnoreReturn | 16777216 | يتجاهل قيمة الإرجاع لتفاعل COM. |

## انظر أيضًا

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
