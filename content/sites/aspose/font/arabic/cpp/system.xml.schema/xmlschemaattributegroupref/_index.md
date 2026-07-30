---
title: "فئة System::Xml::Schema::XmlSchemaAttributeGroupRef"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaAttributeGroupRef. تمثّل عنصر **attributeGroup** مع الخاصية **ref** من مخطط XML كما هو محدد من قبل . AttributesGroupRef هو المرجع لـ **attributeGroup**، خاصية الاسم تحتوي على مجموعة السمات التي يتم الإشارة إليها في C++."
type: docs
weight: 1300
url: /ar/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


يمثّل عنصر **attributeGroup** مع الخاصية **ref** من مخطط XML [Schema](../) كما هو محدد من قبل [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef هو المرجع لـ **attributeGroup**، خاصية الاسم تحتوي على مجموعة السمات التي يتم الإشارة إليها.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_RefName](./get_refname/)() | يعيد اسم عنصر **attributeGroup** المشار إليه. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم عنصر **attributeGroup** المشار إليه. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaAttributeGroupRef](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
