---
title: "System::Drawing::ImageFormatConverter فئة"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::ImageFormatConverter فئة. يحول كائنات ImageFormat من نوع بيانات إلى آخر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1400
url: /ar/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


يقوم بتحويل كائنات ImageFormat من نوع بيانات إلى آخر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | يقوم بتحويل الكائنات. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | يقوم بتحويل الكائنات. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | يقوم بتحويل الكائنات. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | يقوم بتحويل السلسلة إلى كائن. |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | يقوم بتحويل الكائن إلى نوع محدد. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | يقوم بتحويل الكائن إلى نوع محدد. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | يقوم بتحويل الكائن إلى نوع محدد. |
| [ImageFormatConverter](./imageformatconverter/)() | يقوم بإنشاء نسخة جديدة من [ImageFormatConverter](./). |
## انظر أيضًا

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
