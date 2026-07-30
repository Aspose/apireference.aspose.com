---
title: "فئة System::ComponentModel::CancelEventArgs"
linktitle: "CancelEventArgs"
second_title: "Aspose.Font لـ C++"
description: "فئة System::ComponentModel::CancelEventArgs. معلمات الحدث القابل للإلغاء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


معلمات الحدث القابل للإلغاء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CancelEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | معلومات RTTI. |
| [CancelEventArgs](./canceleventargs/)() | منشئ؛ يضبط خاصية Cancel إلى false. |
| [get_Cancel](./get_cancel/)() | يحصل على القيمة التي تشير إلى ما إذا كان يجب إلغاء الحدث. |
| [set_Cancel](./set_cancel/)(bool) | يضبط القيمة التي تشير إلى ما إذا كان يجب إلغاء الحدث. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
