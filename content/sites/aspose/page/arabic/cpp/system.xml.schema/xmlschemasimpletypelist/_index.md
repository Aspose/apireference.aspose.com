---
title: "فئة System::Xml::Schema::XmlSchemaSimpleTypeList"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaSimpleTypeList. تمثل عنصر القائمة من مخطط XML كما حددته مجموعة الويب العالمية (W3C). يمكن استخدام هذه الفئة لتعريف عنصر simpleType كقائمة من القيم لنوع بيانات محدد في C++."
type: docs
weight: 6400
url: /ar/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


يمثل عنصر **list** من XML [Schema](../) كما حددته مجموعة الويب العالمية [Web](../../system.web/). يمكن استخدام هذه الفئة لتعريف عنصر **simpleType** كقائمة من القيم لنوع بيانات محدد.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | يرجع [XmlSchemaSimpleType](../xmlschemasimpletype/) الذي يمثل نوع عنصر **simpleType** بناءً على قيمتي [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) و [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) للنوع البسيط. |
| [get_ItemType](./get_itemtype/)() | يرجع عنصر **simpleType** المشتق من النوع المحدد بواسطة القيمة الأساسية. |
| [get_ItemTypeName](./get_itemtypename/)() | يرجع اسم نوع بيانات مدمج أو عنصر **simpleType** معرف في هذا المخطط (أو مخطط آخر يشير إليه مساحة الاسم المحددة). |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط [XmlSchemaSimpleType](../xmlschemasimpletype/) الذي يمثل نوع عنصر **simpleType** بناءً على قيمتي [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) و [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) للنوع البسيط. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط عنصر **simpleType** المشتق من النوع المحدد بواسطة القيمة الأساسية. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم نوع بيانات مدمج أو عنصر **simpleType** معرف في هذا المخطط (أو مخطط آخر يشير إليه مساحة الاسم المحددة). |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | يُنشئ مثيلاً جديدًا للفئة [XmlSchemaSimpleTypeList](./). |
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
