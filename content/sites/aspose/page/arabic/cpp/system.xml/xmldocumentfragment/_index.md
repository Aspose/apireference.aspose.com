---
title: "System::Xml::XmlDocumentFragment فئة"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlDocumentFragment فئة. يمثل كائنًا خفيف الوزن مفيدًا لعمليات إدراج الشجرة في C++."
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
| [get_InnerXml](./get_innerxml/)() override | يرجع العلامة التي تمثل أبناء هذه العقدة. |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يرجع الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة الحالية. |
| [get_OwnerDocument](./get_ownerdocument/)() override | يرجع [XmlDocument](../xmldocument/) التي تنتمي إليها هذه العقدة. |
| [set_InnerXml](./set_innerxml/)(String) override | يضبط الترميز الذي يمثل أبناء هذه العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
