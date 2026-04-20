---
title: "فئة System::Xml::Schema::XmlSchemaIdentityConstraint"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint class. فئة لقيود الهوية: المفتاح، المفتاح المرجعي، والعناصر الفريدة في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


فئة لقيود الهوية: عناصر **key**، **keyref**، و**unique**.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Fields](./get_fields/)() | يرجع مجموعة الحقول التي تُطبق كأطفال لتعبير محدد لغة مسار XML ([XPath](../../system.xml.xpath/)). |
| [get_Name](./get_name/)() | يرجع اسم قيد الهوية. |
| [get_QualifiedName](./get_qualifiedname/)() | يرجع الاسم المؤهل لقيد الهوية، والذي يحتوي على تفسير ما بعد التجميع لقيمة **QualifiedName**. |
| [get_Selector](./get_selector/)() | يرجع عنصر **selector** لتعبير [XPath](../../system.xml.xpath/). |
| [set_Name](./set_name/)(const String\&) | يضبط اسم قيد الهوية. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | يضبط عنصر **selector** لتعبير [XPath](../../system.xml.xpath/). |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | ينشئ مثيلاً جديداً للفئة [XmlSchemaIdentityConstraint](./). |
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
