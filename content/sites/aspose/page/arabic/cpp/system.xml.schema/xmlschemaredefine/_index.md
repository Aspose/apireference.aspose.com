---
title: "الفئة System::Xml::Schema::XmlSchemaRedefine"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaRedefine. تمثل عنصر إعادة التعريف من مخطط XML كما حددته مجموعة الويب العالمية (W3C). يمكن استخدام هذه الفئة للسماح بأنواع بسيطة ومعقدة، ومجموعات ومجموعات سمات من ملفات مخطط خارجية أن تُعاد تعريفها في المخطط الحالي. يمكن أيضًا استخدام هذه الفئة لتوفير إصدار للعناصر المخططة في C++."
type: docs
weight: 5600
url: /ar/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


يمثل عنصر **redefine** من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). يمكن استخدام هذه الفئة للسماح بأنواع بسيطة ومعقدة، مجموعات ومجموعات سمات من ملفات مخطط خارجية أن تُعاد تعريفها في المخطط الحالي. يمكن أيضًا استخدام هذه الفئة لتوفير إصدارات لعناصر المخطط.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | يعيد [XmlSchemaObjectTable](../xmlschemaobjecttable/) ، لجميع السمات في المخطط، والذي يحتوي على تفسير ما بعد التجميع لقيمة **AttributeGroups**. |
| [get_Groups](./get_groups/)() | يعيد [XmlSchemaObjectTable](../xmlschemaobjecttable/)، لجميع المجموعات في المخطط، والذي يحتوي على تفسير ما بعد التجميع لقيمة **Groups**. |
| [get_Items](./get_items/)() | يعيد مجموعة الفئات التالية: [XmlSchemaAnnotation](../xmlschemaannotation/)، [XmlSchemaAttributeGroup](../xmlschemaattributegroup/)، [XmlSchemaComplexType](../xmlschemacomplextype/)، [XmlSchemaSimpleType](../xmlschemasimpletype/)، و[XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | يعيد [XmlSchemaObjectTable](../xmlschemaobjecttable/)، لجميع الأنواع البسيطة والمعقدة في المخطط، والذي يحتوي على تفسير ما بعد التجميع لقيمة **SchemaTypes**. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaRedefine](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
