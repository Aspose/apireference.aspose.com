---
title: "System::Xml::Schema::XmlSchemaKeyref class"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaKeyref class. تمثّل هذه الفئة عنصر keyref من XMLSchema كما حددته مجموعة الويب العالمية (W3C) في C++."
type: docs
weight: 4000
url: /ar/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


تمثّل هذه الفئة العنصر **keyref** من XMLSchema كما حددته مجموعة الويب العالمية [Web](../../system.web/).

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Refer](./get_refer/)() | يرجع اسم المفتاح الذي يشير إليه هذا القيد في نوع بسيط أو مركب آخر. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم المفتاح الذي يشير إليه هذا القيد في نوع بسيط أو مركب آخر. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | ينشئ مثيلاً جديداً للفئة [XmlSchemaKeyref](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
