---
title: "System::Drawing::ImageFormatConverter فئة"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::ImageFormatConverter فئة. يحول كائنات ImageFormat من نوع بيانات إلى آخر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1400
url: /ar/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


يحول كائنات ImageFormat من نوع بيانات إلى آخر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | يحول الكائنات. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | يحول الكائنات. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | يحول الكائنات. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | يحول السلسلة إلى كائن. |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | يحول الكائن إلى نوع محدد. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | يحول الكائن إلى نوع محدد. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | يحول الكائن إلى نوع محدد. |
| [ImageFormatConverter](./imageformatconverter/)() | ينشئ مثيلاً جديداً من [ImageFormatConverter](./). |
## انظر أيضًا

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
