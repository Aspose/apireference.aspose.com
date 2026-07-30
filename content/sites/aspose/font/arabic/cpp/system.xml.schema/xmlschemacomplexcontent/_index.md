---
title: "System::Xml::Schema::XmlSchemaComplexContent class"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaComplexContent class. يمثل عنصر complexContent من XML Schema كما هو محدد من قبل World Wide Web Consortium (W3C). تمثل هذه الفئة نموذج المحتوى المعقد للأنواع المعقدة. تحتوي على امتدادات أو قيود على نوع معقد يحتوي إما على عناصر فقط أو محتوى مختلط في C++."
type: docs
weight: 1800
url: /ar/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


يمثل عنصر **complexContent** من XML [Schema](../) كما هو محدد من قبل World Wide [Web](../../system.web/) Consortium (W3C). تمثل هذه الفئة نموذج المحتوى المعقد للأنواع المعقدة. تحتوي على امتدادات أو قيود على نوع معقد يحتوي إما على عناصر فقط أو محتوى مختلط.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Content](./get_content/)() override | يعيد المحتوى. |
| [get_IsMixed](./get_ismixed/)() | يعيد معلومات تحدد ما إذا كان النوع يحتوي على نموذج محتوى مختلط. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | يضبط المحتوى. |
| [set_IsMixed](./set_ismixed/)(bool) | يضبط معلومات تحدد ما إذا كان النوع يحتوي على نموذج محتوى مختلط. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | ينشئ مثيلاً جديدًا من الفئة [XmlSchemaComplexContent](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
