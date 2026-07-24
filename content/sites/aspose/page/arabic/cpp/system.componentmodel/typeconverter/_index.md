---
title: "الفئة System::ComponentModel::TypeConverter"
linktitle: "TypeConverter"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::ComponentModel::TypeConverter. الفئة التي تتعامل مع تحويل الأنواع في نموذج المكوّن. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1400
url: /ar/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


الفئة التي تتعامل مع تحويل الأنواع في نموذج المكوّن. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TypeConverter : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | يقوم بتحويل الكائنات. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | يقوم بتحويل الكائنات. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | يقوم بتحويل السلسلة إلى كائن. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | يحوّل السلسلة الثابتة إلى كائن. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | يحوّل السلسلة الثابتة إلى كائن. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | يقوم بتحويل السلسلة إلى كائن. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | يقوم بتحويل السلسلة إلى كائن. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | يقوم بتحويل السلسلة إلى كائن. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | يقوم بتحويل الكائن إلى نوع محدد. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | يقوم بتحويل الكائن إلى نوع محدد. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | يحوّل الكائن إلى سلسلة ثابتة. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | يحوّل الكائن إلى سلسلة ثابتة. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | يحوّل الكائن إلى سلسلة. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | يحوّل الكائن إلى سلسلة. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | يحوّل الكائن إلى سلسلة. |
| [TypeConverter](./typeconverter/)() | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
