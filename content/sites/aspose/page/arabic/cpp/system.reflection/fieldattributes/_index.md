---
title: "System::Reflection::FieldAttributes enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Page لـ C++"
description: "System::Reflection::FieldAttributes تعداد. سمات الحقول المنعكسة في C++."
type: docs
weight: 1200
url: /ar/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


سمات الحقل المنعكسة.

```cpp
enum class FieldAttributes
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| FieldAccessMask | 7 | قناع وصول العضو. استخدم هذا القناع لاسترجاع معلومات إمكانية الوصول. |
| PrivateScope | 0 | الأعضاء غير القابلة للإشارة. |
| Private | 1 | الأعضاء الخاصة. |
| FamANDAssem | 2 | الأعضاء الخاصة وذات نطاق التجميع. |
| Assembly | 3 | الأعضاء ذات نطاق التجميع. |
| Family | 4 | الأعضاء المتاحة حسب النوع والأنواع الفرعية. |
| FamORAssem | 5 | الأعضاء المتاحة حسب النوع، الأنواع الفرعية والتجميع. |
| Public | 6 | الأعضاء المتاحة لأي شخص. |
| Static | 16 | الأعضاء الساكنة كعكس للأعضاء المثيلة. |
| InitOnly | 32 | الأعضاء الثابتة التي يمكن تهيئتها فقط ولا يمكن تغييرها. |
| حرفي | 64 | Compile time constant members. |
| NotSerialized | 128 | الأعضاء غير المتسلسلة. |
| SpecialName | 512 | حقل خاص لأحد الأسماء أدناه. |
| PinvokeImpl | 8192 | تنفيذ مُحوَّل عبر التفاعل بين الأنظمة. |
| ReservedMask | 38144 | أعلام محجوزة للاستخدام في وقت التشغيل فقط. |
| RTSpecialName | 1024 | يجب على وقت التشغيل التحقق من ترميز الاسم. |
| HasFieldMarshal | 4096 | معلومات التسلسل موجودة. |
| HasDefault | 32768 | القيمة الافتراضية موجودة. |
| HasFieldRVA | 256 | RVA موجود. |

## انظر أيضًا

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
