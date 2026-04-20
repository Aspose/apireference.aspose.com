---
title: "فئة System::ComponentModel::PropertyChangedEventArgs"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "فئة System::ComponentModel::PropertyChangedEventArgs. معلمات حدث PropertyChanged. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


معلمات حدث PropertyChanged. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | معلومات RTTI. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | يُهيئ معلمات حدث PropertyChanged. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
