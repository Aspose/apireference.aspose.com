---
title: "فئة System::ComponentModel::AsyncCompletedEventArgs"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page لـ C++"
description: "فئة System::ComponentModel::AsyncCompletedEventArgs. يتم تمرير مثال من هذه الفئة كمعامل إلى مندوب AsyncCompletedEventHandler. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


يتم تمرير مثال من هذه الفئة كمعامل إلى مندوب AsyncCompletedEventHandler. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | منشئ. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | يُنشئ مثالاً جديداً من الفئة [System.ComponentModel.AsyncCompletedEventArgs](./). |
| [get_Cancelled](./get_cancelled/)() const | يحصل على قيمة تشير إلى ما إذا كانت عملية غير متزامنة قد أُلغيت. true إذا تم إلغاء العملية الخلفية؛ وإلا false. القيمة الافتراضية هي false. |
| [get_Error](./get_error/)() const | يحصل على قيمة تشير إلى الخطأ الذي حدث أثناء عملية غير متزامنة. |
| [get_UserState](./get_userstate/)() const | يحصل على المعرف الفريد للمهمة غير المتزامنة. مرجع كائن يحدد بشكل فريد المهمة غير المتزامنة؛ وإلا null إذا لم يتم تعيين قيمة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل [EventArgs](../../system/eventargs/) مؤشرًا مشتركًا "فارغًا" (null-pointer). |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
