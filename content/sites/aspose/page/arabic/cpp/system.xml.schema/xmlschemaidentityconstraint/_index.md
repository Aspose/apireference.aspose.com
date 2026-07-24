---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint فئة"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint فئة. فئة لقيود الهوية: key, keyref, و unique العناصر في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


فئة لقيود الهوية: عناصر **key** و **keyref** و **unique**.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Fields](./get_fields/)() | يعيد مجموعة الحقول التي تُطبق كعناصر فرعية لمحدد تعبير XML Path Language ([XPath](../../system.xml.xpath/)). |
| [get_Name](./get_name/)() | يعيد اسم قيد الهوية. |
| [get_QualifiedName](./get_qualifiedname/)() | يعيد الاسم المؤهل لقيد الهوية، الذي يحتوي على تفسير ما بعد التجميع لقيمة **QualifiedName**. |
| [get_Selector](./get_selector/)() | يعيد عنصر **selector** لتعبير [XPath](../../system.xml.xpath/). |
| [set_Name](./set_name/)(const String\&) | يضبط اسم قيد الهوية. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | يضبط عنصر **selector** لتعبير [XPath](../../system.xml.xpath/). |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaIdentityConstraint](./). |
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
