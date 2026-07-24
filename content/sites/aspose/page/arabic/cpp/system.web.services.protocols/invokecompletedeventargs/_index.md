---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs فئة"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Page لـ C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs فئة. يتم تمرير نسخة من هذه الفئة كمعامل إلى المفوض InvokeCompletedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.web.services.protocols/invokecompletedeventargs/
---
## InvokeCompletedEventArgs class


يتم تمرير نسخة من هذه الفئة كمعامل إلى المفوض InvokeCompletedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class InvokeCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Results](./get_results/)() | إرجاع مجموعة من نتائج العمليات غير المتزامنة. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/)(Exception, bool, System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | ينشئ نسخة جديدة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل [EventArgs](../../system/eventargs/) مؤشرًا مشتركًا "فارغًا" (null-pointer). |
## انظر أيضًا

* Class [AsyncCompletedEventArgs](../../system.componentmodel/asynccompletedeventargs/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
