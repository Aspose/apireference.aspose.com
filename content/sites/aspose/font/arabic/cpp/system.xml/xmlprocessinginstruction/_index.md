---
title: "System::Xml::XmlProcessingInstruction فئة"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlProcessingInstruction فئة. تمثل تعليماً للمعالجة، والذي تعرفه XML للحفاظ على معلومات خاصة بالمعالج في نص المستند في C++."
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
| [get_Data](./get_data/)() | يعيد محتوى التعليمة المعالجة، مستثنياً الهدف. |
| [get_InnerText](./get_innertext/)() override | يعيد القيم المدمجة للعقدة وجميع أبنائها. |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_Target](./get_target/)() | يعيد هدف التعليمة المعالجة. |
| [get_Value](./get_value/)() override | يعيد قيمة العقدة. |
| [set_Data](./set_data/)(const String\&) | يضبط محتوى التعليمة المعالجة، مستثنياً الهدف. |
| [set_InnerText](./set_innertext/)(String) override | يضبط القيم المدمجة للعقدة وجميع أبنائها. |
| [set_Value](./set_value/)(String) override | يضبط قيمة العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. لأن عقد ProcessingInstruction لا تحتوي على أبناء، فإن هذه الطريقة لا تأثير لها. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
