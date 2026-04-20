---
title: "فئة System::Xml::Schema::XmlSchemaType"
linktitle: "XmlSchemaType"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaType. الفئة الأساسية لجميع الأنواع البسيطة والأنواع المركبة في C++."
type: docs
weight: 6800
url: /ar/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


الفئة الأساسية لجميع الأنواع البسيطة والمعقدة.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | يرجع نوع الكائن بعد التجميع أو نوع البيانات المدمج للـ XML [Schema](../) Definition Language (XSD)، أو عنصر simpleType، أو عنصر complexType. هذه قيمة مجموعة معلومات بعد تجميع المخطط. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | يرجع القيمة بعد التجميع للنوع الأساسي لهذا النوع في المخطط. |
| [get_Datatype](./get_datatype/)() | يرجع القيمة بعد التجميع لنوع البيانات للنوع المركب. |
| [get_DerivedBy](./get_derivedby/)() | يرجع معلومات بعد التجميع حول كيفية اشتقاق هذا العنصر من نوعه الأساسي. |
| [get_Final](./get_final/)() | يرجع السمة final لاشتقاق النوع التي تشير إلى ما إذا كان السماح بمزيد من الاشتقاقات مسموحًا. |
| [get_FinalResolved](./get_finalresolved/)() | يرجع تفسير ما بعد التجميع للقيمة [XmlSchemaType::get_Final](./get_final/). |
| virtual [get_IsMixed](./get_ismixed/)() | يرجع قيمة تشير إلى ما إذا كان لهذا النوع نموذج محتوى مختلط. هذه الدعوة صالحة فقط في نوع مركب. |
| [get_Name](./get_name/)() | يرجع اسم النوع. |
| [get_QualifiedName](./get_qualifiedname/)() | يرجع الاسم المؤهل للنوع المبني من السمة **Name** لهذا النوع. هذه قيمة بعد تجميع المخطط. |
| [get_TypeCode](./get_typecode/)() | يرجع الـ [XmlTypeCode](../xmltypecode/) للنوع. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | يرجع [XmlSchemaComplexType](../xmlschemacomplextype/) الذي يمثل النوع المركب المدمج للنوع المركب المحدد. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | يرجع [XmlSchemaComplexType](../xmlschemacomplextype/) الذي يمثل النوع المركب المدمج للنوع المركب المحدد بالاسم المؤهل. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | يرجع [XmlSchemaSimpleType](../xmlschemasimpletype/) الذي يمثل النوع البسيط المدمج للنوع البسيط المحدد بالاسم المؤهل. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | يرجع [XmlSchemaSimpleType](../xmlschemasimpletype/) الذي يمثل النوع البسيط المدمج للنوع البسيط المحدد. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | يرجع قيمة تشير إلى ما إذا كان نوع المخطط المشتق المحدد مشتقًا من نوع المخطط الأساسي المحدد. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | يضبط السمة final لاشتقاق النوع التي تشير إلى ما إذا كان السماح بمزيد من الاشتقاقات مسموحًا. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | يضبط قيمة تشير إلى ما إذا كان لهذا النوع نموذج محتوى مختلط. هذه الدعوة صالحة فقط في نوع مركب. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم النوع. |
| [XmlSchemaType](./xmlschematype/)() | يُنشئ مثيلاً جديدًا من الفئة [XmlSchemaType](./). |
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
