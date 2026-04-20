---
title: "System::Text::RegularExpressions::Group class"
linktitle: "Group"
second_title: "Aspose.Font لـ C++"
description: "System::Text::RegularExpressions::Group class. نتيجة المطابقة التي تم إجراؤها بواسطة مجموعة التقاط واحدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.text.regularexpressions/group/
---
## Group class


نتيجة المطابقة التي تم إجراؤها بواسطة مجموعة التقاط واحدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | يضيف التقاطاً إلى المجموعة. |
| [get_Captures](./get_captures/)() | يحصل على الالتقاطات المتاحة. |
| [get_Success](./get_success/)() | يتحقق مما إذا كان الالتقاط ناجحاً لهذه المجموعة. |
| [Group](./group/)(const UStringPtr\&, int, int) | المُنشئ. |
| [Group](./group/)() | منشئ مجموعة فارغة. |
## انظر أيضًا

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
