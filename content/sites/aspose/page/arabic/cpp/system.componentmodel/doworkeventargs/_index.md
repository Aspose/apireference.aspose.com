---
title: "فئة System::ComponentModel::DoWorkEventArgs"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Page لـ C++"
description: "فئة System::ComponentModel::DoWorkEventArgs. معطيات حدث DoWork. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


معطيات حدث DoWork. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | معلومات RTTI. |
| [get_Argument](./get_argument/)() | يحصل على خاصية Argument؛ غير مُنفّذة. |
| [get_Result](./get_result/)() | يحصل على خاصية Result؛ غير مُنفّذة. |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | يضبط خاصية Result؛ غير مُنفّذة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل [EventArgs](../../system/eventargs/) مؤشرًا مشتركًا "فارغًا" (null-pointer). |
## انظر أيضًا

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
