---
title: "فئة System::Xml::XmlProcessingInstruction"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlProcessingInstruction. تمثل تعليمات المعالجة، التي يحددها XML للاحتفاظ بمعلومات خاصة بالمعالج في نص المستند في C++."
type: docs
weight: 3100
url: /ar/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


يمثل تعليمًا معالجة، حيث يحدد XML ذلك للحفاظ على معلومات خاصة بالمعالج في نص المستند.

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_Data](./get_data/)() | يعيد محتوى تعليمات المعالجة، مستثنياً الهدف. |
| [get_InnerText](./get_innertext/)() override | يرجع القيم المدمجة للعقدة وجميع أبنائها. |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يرجع الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة الحالية. |
| [get_Target](./get_target/)() | يعيد هدف تعليمات المعالجة. |
| [get_Value](./get_value/)() override | يرجع قيمة العقدة. |
| [set_Data](./set_data/)(const String\&) | يضبط محتوى تعليمات المعالجة، مستثنياً الهدف. |
| [set_InnerText](./set_innertext/)(String) override | يضبط القيم المتسلسلة للعقدة وجميع أبنائها. |
| [set_Value](./set_value/)(String) override | يضبط قيمة العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى الـ [XmlWriter](../xmlwriter/) المحدد. نظرًا لأن عقد الـ ProcessingInstruction لا تملك أبناء، فإن هذه الطريقة لا تأثير لها. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
