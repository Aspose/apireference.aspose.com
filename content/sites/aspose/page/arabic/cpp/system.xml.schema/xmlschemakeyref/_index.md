---
title: "System::Xml::Schema::XmlSchemaKeyref فئة"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaKeyref class. تمثل هذه الفئة عنصر keyref من XMLSchema كما حددته مجموعة الويب العالمية (W3C) في C++."
type: docs
weight: 4000
url: /ar/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


تمثل هذه الفئة عنصر **keyref** من XMLSchema كما حددته مجموعة الويب العالمية [الويب](../../system.web/) (W3C).

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Refer](./get_refer/)() | يرجع اسم المفتاح الذي يشير إليه هذا القيد في نوع بسيط أو مركب آخر. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم المفتاح الذي يشير إليه هذا القيد في نوع بسيط أو مركب آخر. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaKeyref](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
