---
title: "فئة System::Xml::XmlDocumentFragment"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlDocumentFragment. تمثل كائناً خفيف الوزن مفيداً لعمليات إدراج الشجرة في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


يمثل كائنًا خفيف الوزن مفيدًا لعمليات إدراج الشجرة.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_InnerXml](./get_innerxml/)() override | يعيد الترميز الذي يمثل أبناء هذه العقدة. |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_OwnerDocument](./get_ownerdocument/)() override | يعيد [XmlDocument](../xmldocument/) الذي تنتمي إليه هذه العقدة. |
| [set_InnerXml](./set_innerxml/)(String) override | يضبط الترميز الذي يمثل أبناء هذه العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
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
