---
title: "فئة System::Xml::XmlDeclaration"
linktitle: "XmlDeclaration"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlDeclaration. تمثل عقدة إعلان XML <?xml version=''1.0''...?> في C++."
type: docs
weight: 1300
url: /ar/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


يمثل عقدة إعلان XML **<?xml version='1.0'...?>**.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_Encoding](./get_encoding/)() | يعيد مستوى الترميز لمستند XML. |
| [get_InnerText](./get_innertext/)() override | يعيد القيم المدمجة لـ [XmlDeclaration](./). |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يرجع الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة الحالية. |
| [get_Standalone](./get_standalone/)() | يعيد قيمة السمة standalone. |
| [get_Value](./get_value/)() override | يعيد قيمة [XmlDeclaration](./). |
| [get_Version](./get_version/)() | يعيد نسخة XML للمستند. |
| [set_Encoding](./set_encoding/)(const String\&) | يضبط مستوى الترميز لمستند XML. |
| [set_InnerText](./set_innertext/)(String) override | يضبط القيم المدمجة لـ [XmlDeclaration](./). |
| [set_Standalone](./set_standalone/)(const String\&) | يضبط قيمة السمة standalone. |
| [set_Value](./set_value/)(String) override | يضبط قيمة [XmlDeclaration](./). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. نظرًا لأن عقد [XmlDeclaration](./) لا تحتوي على أبناء، فإن هذه الطريقة لا تأثير لها. |
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
