---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class. يمثل عنصر union للأنواع البسيطة من XML Schema كما هو محدد من قبل اتحاد الويب العالمي (W3C). يمكن استخدام نوع بيانات union لتحديد محتوى simpleType. يجب أن تكون قيمة عنصر simpleType أحد مجموعة من الأنواع البديلة المحددة في union. أنواع union هي دائمًا أنواع مشتقة ويجب أن تشمل على الأقل نوعين بديلين في C++."
type: docs
weight: 6600
url: /ar/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


يمثل عنصر **union** للأنواع البسيطة من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). يمكن استخدام نوع البيانات **union** لتحديد محتوى **simpleType**. يجب أن تكون قيمة عنصر **simpleType** أحد مجموعة من الأنواع البديلة المحددة في union. أنواع **union** هي دائمًا أنواع مشتقة ويجب أن تشمل على الأقل نوعين بديلين.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | يعيد مصفوفة من كائنات [XmlSchemaSimpleType](../xmlschemasimpletype/) التي تمثل نوع عنصر **simpleType** بناءً على قيمتي [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) و [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) للنوع البسيط. |
| [get_BaseTypes](./get_basetypes/)() | يعيد مجموعة الأنواع الأساسية. |
| [get_MemberTypes](./get_membertypes/)() | يعيد مصفوفة من أسماء الأعضاء المؤهلة للأنواع البيانات المدمجة أو عناصر **simpleType** المعرفة في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | يضبط مصفوفة من أسماء الأعضاء المؤهلة للأنواع البيانات المدمجة أو عناصر **simpleType** المعرفة في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaSimpleTypeUnion](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
