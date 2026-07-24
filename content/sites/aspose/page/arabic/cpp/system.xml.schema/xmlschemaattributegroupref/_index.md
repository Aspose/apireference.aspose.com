---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef فئة"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef فئة. يمثل عنصر attributeGroup مع السمة ref من مخطط XML كما هو محدد. AttributesGroupRef هو المرجع لـ attributeGroup، خاصية الاسم تحتوي على مجموعة السمات المرجعية في C++."
type: docs
weight: 1300
url: /ar/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


يمثل عنصر **attributeGroup** مع السمة **ref** من مخطط XML [Schema](../) كما هو محدد من قبل [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef هو المرجع لـ attributeGroup، خاصية الاسم تحتوي على مجموعة السمات المرجعية.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_RefName](./get_refname/)() | يرجع اسم عنصر **attributeGroup** المرجع. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم عنصر **attributeGroup** المرجع. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | ينشئ مثيلًا جديدًا للفئة [XmlSchemaAttributeGroupRef](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
