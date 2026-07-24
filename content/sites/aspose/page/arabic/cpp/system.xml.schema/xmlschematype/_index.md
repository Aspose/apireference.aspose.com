---
title: "الفئة System::Xml::Schema::XmlSchemaType"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaType. الفئة الأساسية لجميع الأنواع البسيطة والأنواع المركبة في C++."
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
| [get_BaseSchemaType](./get_baseschematype/)() | يعيد نوع الكائن بعد التجميع أو نوع بيانات XML [Schema](../) Definition Language (XSD) المدمج، عنصر simpleType، أو عنصر complexType. هذه قيمة مجموعة معلومات بعد تجميع المخطط. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | يعيد القيمة بعد التجميع لنوع القاعدة لهذا النوع من المخطط. |
| [get_Datatype](./get_datatype/)() | يعيد القيمة بعد التجميع لنوع البيانات للنوع المركب. |
| [get_DerivedBy](./get_derivedby/)() | يعيد معلومات ما بعد التجميع حول كيفية اشتقاق هذا العنصر من نوعه الأساسي. |
| [get_Final](./get_final/)() | يعيد السمة **Final** لاشتقاق النوع التي تشير إلى ما إذا كان يُسمح بمزيد من الاشتقاقات. |
| [get_FinalResolved](./get_finalresolved/)() | يعيد تفسير ما بعد التجميع للقيمة [XmlSchemaType::get_Final](./get_final/). |
| virtual [get_IsMixed](./get_ismixed/)() | يعيد قيمة تشير إلى ما إذا كان لهذا النوع نموذج محتوى مختلط. هذه الاستدعاء صالح فقط في نوع مركب. |
| [get_Name](./get_name/)() | يعيد اسم النوع. |
| [get_QualifiedName](./get_qualifiedname/)() | يعيد الاسم المؤهل للنوع المبني من السمة **Name** لهذا النوع. هذه قيمة ما بعد تجميع المخطط. |
| [get_TypeCode](./get_typecode/)() | يعيد [XmlTypeCode](../xmltypecode/) للنوع. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | يعيد [XmlSchemaComplexType](../xmlschemacomplextype/) الذي يمثل النوع المركب المدمج للنوع المركب المحدد. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | يعيد [XmlSchemaComplexType](../xmlschemacomplextype/) الذي يمثل النوع المركب المدمج للنوع المركب المحدد بالاسم المؤهل. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | يعيد [XmlSchemaSimpleType](../xmlschemasimpletype/) الذي يمثل النوع البسيط المدمج للنوع البسيط المحدد بالاسم المؤهل. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | يعيد [XmlSchemaSimpleType](../xmlschemasimpletype/) الذي يمثل النوع البسيط المدمج للنوع البسيط المحدد. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | يعيد قيمة تشير إلى ما إذا كان نوع المخطط المشتق المحدد مشتقًا من نوع المخطط الأساسي المحدد. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | يضبط السمة النهائية لاستنتاج النوع التي تشير إلى ما إذا كان يُسمح بمزيد من الاستنتاجات. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | يضبط قيمة تشير إلى ما إذا كان لهذا النوع نموذج محتوى مختلط. هذا الاستدعاء صالح فقط في نوع مركب. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم النوع. |
| [XmlSchemaType](./xmlschematype/)() | ينشئ مثيلًا جديدًا من الفئة [XmlSchemaType](./). |
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
