---
title: "فئة System::Xml::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlNodeChangedEventArgs. توفر بيانات لأحداث XmlDocument::NodeChanged و XmlDocument::NodeChanging و XmlDocument::NodeInserted و XmlDocument::NodeInserting و XmlDocument::NodeRemoved و XmlDocument::NodeRemoving في C++."
type: docs
weight: 2600
url: /ar/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


يوفر البيانات لأحداث **XmlDocument::NodeChanged**، **XmlDocument::NodeChanging**، **XmlDocument::NodeInserted**، **XmlDocument::NodeInserting**، **XmlDocument::NodeRemoved** و **XmlDocument::NodeRemoving**.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Action](./get_action/)() | يعيد قيمة تشير إلى نوع حدث تغيير العقدة الذي يحدث. |
| [get_NewParent](./get_newparent/)() | يعيد قيمة [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) بعد إكمال العملية. |
| [get_NewValue](./get_newvalue/)() | يعيد القيمة الجديدة للعقدة. |
| [get_Node](./get_node/)() | يعيد الـ[XmlNode](../xmlnode/) الذي يتم إضافته أو إزالته أو تغييره. |
| [get_OldParent](./get_oldparent/)() | يعيد قيمة [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) قبل بدء العملية. |
| [get_OldValue](./get_oldvalue/)() | يعيد القيمة الأصلية للعقدة. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | ينشئ مثيلاً جديداً من الفئة [XmlNodeChangedEventArgs](./). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
