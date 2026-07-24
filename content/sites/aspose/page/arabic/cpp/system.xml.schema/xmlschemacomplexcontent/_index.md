---
title: "الفئة System::Xml::Schema::XmlSchemaComplexContent"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaComplexContent. تمثّل عنصر complexContent من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). تمثّل هذه الفئة نموذج المحتوى المعقّد للأنواع المعقّدة. تحتوي على امتدادات أو قيود على نوع معقّد يمتلك إما عناصر فقط أو محتوى مختلط في C++."
type: docs
weight: 1800
url: /ar/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


يمثّل العنصر **complexContent** من XML [Schema](../) كما هو محدد من قبل اتحاد [Web](../../system.web/) العالمي (W3C). تمثّل هذه الفئة نموذج المحتوى المعقّد للأنواع المعقّدة. تحتوي على امتدادات أو قيود على نوع معقّد يمتلك إما عناصر فقط أو محتوى مختلط.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Content](./get_content/)() override | يعيد المحتوى. |
| [get_IsMixed](./get_ismixed/)() | يعيد معلومات تحدد ما إذا كان النوع يمتلك نموذج محتوى مختلط. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | يضبط المحتوى. |
| [set_IsMixed](./set_ismixed/)(bool) | يضبط معلومات تحدد ما إذا كان النوع يمتلك نموذج محتوى مختلط. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | يُنشئ مثيلاً جديدًا من الفئة [XmlSchemaComplexContent](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
