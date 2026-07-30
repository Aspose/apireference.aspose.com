---
title: "فئة System::Web::Services::Protocols::InvokeCompletedEventArgs"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Web::Services::Protocols::InvokeCompletedEventArgs. يتم تمرير نسخة من هذه الفئة كمعامل إلى المفوض InvokeCompletedEventHandler. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.web.services.protocols/invokecompletedeventargs/
---
## InvokeCompletedEventArgs class


يتم تمرير نسخة من هذه الفئة كمعامل إلى المفوض InvokeCompletedEventHandler. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class InvokeCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Results](./get_results/)() | يعيد مجموعة من نتائج العمليات غير المتزامنة. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/)(Exception, bool, System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | ينشئ نسخة جديدة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## انظر أيضًا

* Class [AsyncCompletedEventArgs](../../system.componentmodel/asynccompletedeventargs/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
