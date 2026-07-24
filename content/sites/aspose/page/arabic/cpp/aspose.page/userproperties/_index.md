---
title: "فئة Aspose::Page::UserProperties"
linktitle: "UserProperties"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::UserProperties. فئة خصائص خاصة تسمح بتعيين وإرجاع الخصائص ذات النوع المحدد. كما تسمح بربط كائنين خاصين بالخصائص الافتراضية للبحث إذا لم يحتوي كائن الخصائص هذا على الخاصية في C++."
type: docs
weight: 1600
url: /ar/cpp/aspose.page/userproperties/
---
## UserProperties class


فئة خاصية مميزة تسمح بتعيين وإرجاع الخصائص ذات النوع المحدد. كما تسمح بربط كائنين خاصية افتراضيين للبحث إذا لم يحتوي كائن الخاصية هذا على الخاصية.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | يحصل على قيمة الخاصية النصية. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | يحصل على قيمة الخاصية النصية. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | يحصل على قيمة الخاصية اللونية. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | يحصل على قيمة الخاصية اللونية. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | يحصل على قيمة الخاصية ذات النوع المزدوج. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | يحصل على قيمة الخاصية ذات النوع المزدوج. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | يحصل على قيمة الخاصية ذات النوع العائم. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | يحصل على قيمة الخاصية ذات النوع العائم. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | يحصل على قيمة الخاصية العددية. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | يحصل على قيمة الخاصية العددية. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | يحصل على قيمة خاصية الهوامش. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | يحصل على قيمة خاصية الهوامش. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | يحصل على قيمة خاصية المصفوفة. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | يحصل على قيمة خاصية المصفوفة. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | يحصل على قيمة خاصية المستطيل. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | يحصل على قيمة خاصية المستطيل. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | يحصل على قيمة خاصية الحجم. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | يحصل على قيمة خاصية الحجم. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | يحصل على قيمة خاصية مصفوفة السلاسل. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | يحصل على قيمة خاصية مصفوفة السلاسل. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [IsProperty](./isproperty/)(System::String) | يحصل على قيمة الخاصية المنطقية. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | يحصل على قيمة الخاصية المنطقية. إذا كانت الخاصية المطلوبة غير موجودة، يرجع القيمة الافتراضية المقدمة. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | يرجع أسماء الخصائص. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | ينسخ الخصائص، بما في ذلك القيم الافتراضية، إلى هذا [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | يضبط قيمة الخاصية النصية. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | يضبط قيمة خاصية مصفوفة السلاسل. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | يضبط قيمة خاصية مصفوفة السلاسل في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | يضبط قيمة خاصية اللون. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | يضبط قيمة خاصية اللون في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | يضبط قيمة خاصية المستطيل. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | يضبط قيمة خاصية المستطيل في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | يضبط قيمة خاصية الهوامش. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | يضبط قيمة خاصية الهوامش في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | يضبط قيمة خاصية الحجم. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | يضبط قيمة خاصية الحجم في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | يضبط قيمة خاصية العدد الصحيح. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | يضبط قيمة خاصية العدد الصحيح في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, double) | يضبط قيمة خاصية مزدوجة. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | يضبط قيمة خاصية مزدوجة في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, float) | يضبط قيمة خاصية عائمة. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | يضبط قيمة خاصية عائمة في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | يضبط قيمة خاصية منطقية. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | يضبط قيمة خاصية منطقية في جدول الخصائص المحدد. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | يضبط قيمة خاصية المصفوفة. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | يضبط قيمة خاصية المصفوفة في جدول الخصائص المحدد. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |
| [UserProperties](./userproperties/)() | يُهيئ نسخة فارغة من الفئة [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | يُهيئ نسخة من الفئة [UserProperties](./) بالقيم الافتراضية. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | يبني [UserProperties](./) مع جدول defaults و altDefaults، يتم البحث فيهما بهذا الترتيب. |
## انظر أيضًا

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
