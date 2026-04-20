---
title: "الفئة System::ComponentModel::ProgressChangedEventArgs"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::ComponentModel::ProgressChangedEventArgs. يتم تمرير نسخة من هذه الفئة كمعامل إلى التفويض ProgressChangedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


يتم تمرير نسخة من هذه الفئة كمعامل إلى التفويض ProgressChangedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | يحصل على نسبة تقدم المهمة غير المتزامنة. |
| [get_UserState](./get_userstate/)() const | يحصل على حالة مستخدم فريدة. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | المُنشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
