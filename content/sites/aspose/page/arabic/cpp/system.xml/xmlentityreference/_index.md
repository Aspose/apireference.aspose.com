---
title: "System::Xml::XmlEntityReference class"
linktitle: "XmlEntityReference"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlEntityReference class. يمثل عقدة إشارة كيان في C++."
type: docs
weight: 1900
url: /ar/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


يمثل عقدة مرجع كيان.

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_BaseURI](./get_baseuri/)() override | يعيد معرف المورد الموحد (URI) الأساسي للعقدة الحالية. |
| [get_IsReadOnly](./get_isreadonly/)() override | يرجع قيمة تشير إلى ما إذا كانت العقدة للقراءة فقط. |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يعيد اسم العقدة. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة. |
| [get_Value](./get_value/)() override | يرجع قيمة العقدة. |
| [set_Value](./set_value/)(String) override | يضبط قيمة العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
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
