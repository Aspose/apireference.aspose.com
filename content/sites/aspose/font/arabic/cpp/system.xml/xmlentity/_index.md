---
title: "System::Xml::XmlEntity class"
linktitle: "XmlEntity"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlEntity class. يمثل إعلان كيان، مثل <!ENTITY... > في C++."
type: docs
weight: 1800
url: /ar/cpp/system.xml/xmlentity/
---
## XmlEntity class


يمثل إعلان كيان، مثل **<!ENTITY... >**.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد الكيان. استدعاء هذه الطريقة على كائن [XmlEntity](./) يطرح استثناءً. |
| [get_BaseURI](./get_baseuri/)() override | يرجع معرف الموارد الموحد (URI) الأساسي للعقدة الحالية. |
| [get_InnerText](./get_innertext/)() override | يرجع القيم المدمجة لعقدة الكيان وجميع أبنائها. |
| [get_InnerXml](./get_innerxml/)() override | يعيد الترميز الذي يمثل أبناء هذه العقدة. |
| [get_IsReadOnly](./get_isreadonly/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة للقراءة فقط. |
| [get_LocalName](./get_localname/)() override | يرجع اسم العقدة بدون بادئة النطاق. |
| [get_Name](./get_name/)() override | يرجع اسم العقدة. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة. |
| [get_NotationName](./get_notationname/)() | يرجع اسم السمة الاختيارية NDATA في إعلان الكيان. |
| [get_OuterXml](./get_outerxml/)() override | يعيد الترميز الذي يمثل هذه العقدة وجميع أبنائها. |
| [get_PublicId](./get_publicid/)() | يرجع قيمة المعرف العام في إعلان الكيان. |
| [get_SystemId](./get_systemid/)() | يرجع قيمة المعرف النظامي في إعلان الكيان. |
| [set_InnerText](./set_innertext/)(String) override | يضبط القيم المدمجة لعقدة الكيان وجميع أبنائها. |
| [set_InnerXml](./set_innerxml/)(String) override | يضبط الترميز الذي يمثل أبناء هذه العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. بالنسبة لعقد [XmlEntity](./)، لا تؤثر هذه الطريقة. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. بالنسبة لعقد [XmlEntity](./)، لا تؤثر هذه الطريقة. |
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
