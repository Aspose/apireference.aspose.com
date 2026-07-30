---
title: "System::ComponentModel::RunWorkerCompletedEventArgs class"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "System::ComponentModel::RunWorkerCompletedEventArgs class. يتم تمرير نسخة من هذه الفئة كمعامل إلى المفوض RunWorkerCompletedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1300
url: /ar/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


يتم تمرير نسخة من هذه الفئة كمعامل إلى المفوض RunWorkerCompletedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Result](./get_result/)() const | يحصل على قيمة تمثل نتيجة عملية غير متزامنة. |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | معلومات RTTI. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## انظر أيضًا

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
