---
title: "فئة System::ComponentModel::AsyncCompletedEventArgs"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "فئة System::ComponentModel::AsyncCompletedEventArgs. يتم تمرير نسخة من هذه الفئة كمعامل إلى مندوب AsyncCompletedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


يتم تمرير نسخة من هذه الفئة كمعامل إلى مندوب AsyncCompletedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | المُنشئ. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | يُنشئ مثيلًا جديدًا من الفئة [System.ComponentModel.AsyncCompletedEventArgs](./). |
| [get_Cancelled](./get_cancelled/)() const | يحصل على قيمة تُشير إلى ما إذا كانت عملية غير متزامنة قد أُلغيت. true إذا أُلغيت العملية الخلفية؛ وإلا false. القيمة الافتراضية هي false. |
| [get_Error](./get_error/)() const | يحصل على قيمة تُشير إلى الخطأ الذي حدث أثناء عملية غير متزامنة. |
| [get_UserState](./get_userstate/)() const | يحصل على المعرف الفريد للمهمة غير المتزامنة. مرجع كائن يحدد المهمة غير المتزامنة بشكل فريد؛ وإلا null إذا لم يتم تعيين قيمة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
