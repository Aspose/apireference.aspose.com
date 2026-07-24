---
title: "System::ComponentModel::PropertyChangedEventArgs class"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Page لـ C++"
description: "System::ComponentModel::PropertyChangedEventArgs class. وسائط حدث PropertyChanged. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


وسائط حدث PropertyChanged. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | معلومات RTTI. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | يقوم بتهيئة وسائط حدث PropertyChanged. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل [EventArgs](../../system/eventargs/) مؤشرًا مشتركًا "فارغًا" (null-pointer). |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
