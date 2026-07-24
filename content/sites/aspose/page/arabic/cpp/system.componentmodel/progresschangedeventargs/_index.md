---
title: "System::ComponentModel::ProgressChangedEventArgs فئة"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Page لـ C++"
description: "System::ComponentModel::ProgressChangedEventArgs فئة. يتم تمرير نسخة من هذه الفئة كمعامل إلى مندوب ProgressChangedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


يتم تمرير نسخة من هذه الفئة كمعامل إلى مندوب ProgressChangedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل المؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | يحصل على نسبة تقدم المهمة غير المتزامنة. |
| [get_UserState](./get_userstate/)() const | يحصل على حالة مستخدم فريدة. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | منشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل [EventArgs](../../system/eventargs/) مؤشرًا مشتركًا "فارغًا" (null-pointer). |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
