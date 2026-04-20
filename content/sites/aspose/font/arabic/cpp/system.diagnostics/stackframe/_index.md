---
title: "System::Diagnostics::StackFrame class"
linktitle: "StackFrame"
second_title: "Aspose.Font لـ C++"
description: "System::Diagnostics::StackFrame class. يحصل على معلومات حول إطار مكدس واحد. فقط MSVS. يجب إنشاء كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.diagnostics/stackframe/
---
## StackFrame class


يحصل على معلومات حول إطار مكدس واحد. فقط MSVS. يجب إنشاء كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StackFrame : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | يحصل على رقم العمود. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | يحصل على رقم السطر. |
| virtual [GetFileName](./getfilename/)() | يحصل على اسم الملف. |
| [GetMethod](./getmethod/)() | يحصل على معلومات الطريقة. |
| [operator=](./operator=/)(const StackFrame\&) const | بدون تعديل. |
| [StackFrame](./stackframe/)(int) | ينشئ إطار مكدس على إزاحة المكدس الحالية. |
| [StackFrame](./stackframe/)(const StackFrame\&) | لا نسخ. |
| virtual [~StackFrame](./~stackframe/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
