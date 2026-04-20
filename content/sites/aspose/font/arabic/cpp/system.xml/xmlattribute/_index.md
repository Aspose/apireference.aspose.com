---
title: "System::Xml::XmlAttribute فئة"
linktitle: "XmlAttribute"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlAttribute فئة. تمثل سمة. القيم الصالحة والافتراضية للسمة معرفة في تعريف نوع المستند (DTD) أو المخطط في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


يمثل سمة. القيم الصالحة والافتراضية للسمة معرفة في تعريف نوع المستند (DTD) أو المخطط.

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | يضيف العقدة المحددة إلى نهاية قائمة العقد الفرعية لهذه العقدة. |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_BaseURI](./get_baseuri/)() override | يعيد معرف الموارد الموحد (URI) الأساسي للعقدة. |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة. |
| [get_NamespaceURI](./get_namespaceuri/)() override | يعيد URI مساحة الاسم لهذه العقدة. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_OwnerDocument](./get_ownerdocument/)() override | يعيد [XmlDocument](../xmldocument/) الذي تنتمي إليه هذه العقدة. |
| virtual [get_OwnerElement](./get_ownerelement/)() | يعيد [XmlElement](../xmlelement/) الذي تنتمي إليه السمة. |
| [get_Prefix](./get_prefix/)() override | يعيد بادئة مساحة الاسم لهذه العقدة. |
| [get_SchemaInfo](./get_schemainfo/)() override | يعيد مجموعة معلومات ما بعد التحقق من المخطط (post-schema-validation-infoset) التي تم تعيينها لهذه العقدة نتيجة للتحقق من المخطط. |
| virtual [get_Specified](./get_specified/)() | يعيد قيمة تشير إلى ما إذا تم تعيين قيمة السمة صراحةً. |
| [get_Value](./get_value/)() override | يعيد قيمة العقدة. |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | يدرج العقدة المحددة مباشرةً بعد عقدة الإشارة المحددة. |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | يدرج العقدة المحددة مباشرةً قبل عقدة الإشارة المحددة. |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | يضيف العقدة المحددة إلى بداية قائمة العقد الفرعية لهذه العقدة. |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | يزيل العقدة الفرعية المحددة. |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | يستبدل العقدة الفرعية المحددة بالعقدة الفرعية الجديدة المحددة. |
| [set_InnerText](./set_innertext/)(String) override | يضبط القيم المدمجة للعقدة وجميع أبنائها. |
| [set_InnerXml](./set_innerxml/)(String) override | يضبط قيمة السمة. |
| [set_Prefix](./set_prefix/)(String) override | يضبط بادئة مساحة الاسم لهذه العقدة. |
| [set_Value](./set_value/)(String) override | يضبط قيمة العقدة. |
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
