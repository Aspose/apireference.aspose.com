---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class. يمثل عنصر union للأنواع البسيطة من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). يمكن استخدام نوع union لتحديد محتوى simpleType. يجب أن تكون قيمة عنصر simpleType أحد مجموعة من الأنواع البديلة المحددة في union. أنواع union هي دائمًا أنواع مشتقة ويجب أن تشمل على الأقل نوعين بديلين في C++."
type: docs
weight: 6600
url: /ar/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


يمثل عنصر **union** للأنواع البسيطة من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). يمكن استخدام نوع **union** لتحديد محتوى **simpleType**. يجب أن تكون قيمة عنصر **simpleType** أحد مجموعة من الأنواع البديلة المحددة في union. أنواع union هي دائمًا أنواع مشتقة ويجب أن تشمل على الأقل نوعين بديلين.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | يعيد مصفوفة من كائنات [XmlSchemaSimpleType](../xmlschemasimpletype/) تمثل نوع عنصر **simpleType** بناءً على قيمتي [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) و [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) للنوع البسيط. |
| [get_BaseTypes](./get_basetypes/)() | يعيد مجموعة الأنواع الأساسية. |
| [get_MemberTypes](./get_membertypes/)() | يعيد المصفوفة من أسماء الأعضاء المؤهلة لأنواع البيانات المدمجة أو عناصر **simpleType** المعرفة في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | يضبط المصفوفة من أسماء الأعضاء المؤهلة لأنواع البيانات المدمجة أو عناصر **simpleType** المعرفة في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaSimpleTypeUnion](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
