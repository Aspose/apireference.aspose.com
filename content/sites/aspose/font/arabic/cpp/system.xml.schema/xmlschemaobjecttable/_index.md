---
title: "System::Xml::Schema::XmlSchemaObjectTable فئة"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaObjectTable فئة. يوفر المجموعات للعناصر المحتواة في فئة XmlSchema (على سبيل المثال، Attributes، AttributeGroups، Elements، وما إلى ذلك) في C++."
type: docs
weight: 5300
url: /ar/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


يوفر المجموعات للعناصر المحتواة في فئة [XmlSchema](../xmlschema/) (على سبيل المثال، Attributes، AttributeGroups، Elements، وما إلى ذلك).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | يحدد ما إذا كان الاسم المؤهل المحدد موجودًا في المجموعة. |
| [get_Count](./get_count/)() | يعيد عدد العناصر المحتواة في [XmlSchemaObjectTable](./). |
| [get_Names](./get_names/)() | يعيد مجموعة من جميع العناصر المسماة في [XmlSchemaObjectTable](./). |
| [get_Values](./get_values/)() | يعيد مجموعة من جميع القيم لجميع العناصر في [XmlSchemaObjectTable](./). |
| [GetEnumerator](./getenumerator/)() override | يعيد عدادًا يمكنه التكرار عبر [XmlSchemaObjectTable](./). |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | يعيد العنصر في [XmlSchemaObjectTable](./) المحدد بالاسم المؤهل. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
