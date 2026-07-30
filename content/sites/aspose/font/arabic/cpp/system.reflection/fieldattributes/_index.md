---
title: "System::Reflection::FieldAttributes تعداد"
linktitle: "FieldAttributes"
second_title: "Aspose.Font لـ C++"
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
| PrivateScope | 0 | أعضاء غير قابلين للإشارة. |
| Private | 1 | أعضاء خاصة. |
| FamANDAssem | 2 | أعضاء خاصة ومحدودة النطاق التجميعي. |
| Assembly | 3 | أعضاء محدودة النطاق التجميعي. |
| العائلة | 4 | أعضاء يمكن الوصول إليها حسب النوع والأنواع الفرعية. |
| FamORAssem | 5 | أعضاء يمكن الوصول إليها حسب النوع والأنواع الفرعية والتجميع. |
| Public | 6 | أعضاء يمكن للجميع الوصول إليها. |
| Static | 16 | أعضاء ثابتة على عكس الأعضاء المثيلة. |
| InitOnly | 32 | أعضاء ثابتة لا يمكن إلا تهيئتها ولا يمكن تغييرها. |
| حرفي | 64 | أعضاء ثابتة وقت التجميع. |
| NotSerialized | 128 | أعضاء غير مُسلسلة. |
| SpecialName | 512 | حقل خاص لأحد الأسماء أدناه. |
| PinvokeImpl | 8192 | تنفيذ Interop المُعاد توجيهه. |
| ReservedMask | 38144 | أعلام محجوزة للاستخدام في وقت التشغيل فقط. |
| RTSpecialName | 1024 | يجب على Runtime التحقق من ترميز الاسم. |
| HasFieldMarshal | 4096 | معلومات التحويل موجودة. |
| HasDefault | 32768 | القيمة الافتراضية موجودة. |
| HasFieldRVA | 256 | RVA موجود. |

## انظر أيضًا

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
