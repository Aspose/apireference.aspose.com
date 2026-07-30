---
title: "فئة System::Xml::XmlNotation"
linktitle: "XmlNotation"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlNotation. تمثل إعلان تدوين، مثل <!NOTATION... > في C++."
type: docs
weight: 2900
url: /ar/cpp/system.xml/xmlnotation/
---
## XmlNotation class


يمثل إعلان تدوين، مثل **<!NOTATION... >**.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد التدوين. استدعاء هذه الطريقة على كائن [XmlNotation](./) يرمي استثناءً. |
| [get_InnerXml](./get_innerxml/)() override | يعيد الترميز الذي يمثل أبناء هذه العقدة. |
| [get_IsReadOnly](./get_isreadonly/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة للقراءة فقط. |
| [get_LocalName](./get_localname/)() override | يعيد اسم العقدة الحالية دون بادئة النطاق. |
| [get_Name](./get_name/)() override | يعيد اسم العقدة الحالية. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_OuterXml](./get_outerxml/)() override | يعيد الترميز الذي يمثل هذه العقدة وجميع أبنائها. |
| [get_PublicId](./get_publicid/)() | يعيد قيمة المعرف العام في إعلان التدوين. |
| [get_SystemId](./get_systemid/)() | يعيد قيمة المعرف النظامي في إعلان التدوين. |
| [set_InnerXml](./set_innerxml/)(String) override | يضبط الترميز الذي يمثل أبناء هذه العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. لا تؤثر هذه الطريقة على عقد [XmlNotation](./). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. لا تؤثر هذه الطريقة على عقد [XmlNotation](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
