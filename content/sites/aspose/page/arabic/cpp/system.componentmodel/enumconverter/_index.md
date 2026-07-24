---
title: "System::ComponentModel::EnumConverter class"
linktitle: "EnumConverter"
second_title: "Aspose.Page لـ C++"
description: "System::ComponentModel::EnumConverter class. فئة وهمية لتمكين الكود المترجم الذي يستخدم EnumConverter من التجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


فئة وهمية لتمكين الكود المترجم الذي يستخدم EnumConverter من التجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | يتحقق مما إذا كانت الأنواع قابلة للتحويل؛ غير مُنفَّذ. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | يتحقق مما إذا كانت الأنواع قابلة للتحويل؛ غير مُنفَّذ. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | يقوم بالتحويل الفعلي للنوع؛ غير مُنفَّذ. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | يقوم بالتحويل الفعلي للنوع؛ غير مُنفَّذ. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | معلومات RTTI. |
| [get_EnumType](./get_enumtype/)() | يحصل على نوع التعداد الذي يعمل معه [EnumConverter](./)؛ غير مُنفّذ. |
## انظر أيضًا

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
