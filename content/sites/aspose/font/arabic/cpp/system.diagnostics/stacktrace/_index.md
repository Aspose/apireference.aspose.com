---
title: "الفئة System::Diagnostics::StackTrace"
linktitle: "StackTrace"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Diagnostics::StackTrace. مجموعة من إطارات المكدس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. يجب دائماً تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


مجموعة من إطارات المكدس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. يجب دائماً تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StackTrace : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | يحصل على عدد الإطارات في تتبع المكدس. |
| virtual [GetFrame](./getframe/)(uint32_t) | يحصل على إطار المكدس. |
| [operator=](./operator=/)(const StackTrace\&) const | لا تعيين. |
| [StackTrace](./stacktrace/)() | ينشئ تتبع مكدس يصف حالة المكدس الحالية. |
| [StackTrace](./stacktrace/)(bool) | ينشئ تتبع مكدس يصف حالة المكدس الحالية. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | لا نسخ. |
| virtual [~StackTrace](./~stacktrace/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
