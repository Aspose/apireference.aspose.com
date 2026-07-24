---
title: "فئة System::Xml::XmlElement"
linktitle: "XmlElement"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlElement. تمثل عنصرًا في C++."
type: docs
weight: 1700
url: /ar/cpp/system.xml/xmlelement/
---
## XmlElement class


يمثل عنصرًا.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| virtual [get_HasAttributes](./get_hasattributes/)() | يرجع قيمة **bool** تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي سمات. |
| [get_InnerText](./get_innertext/)() override | يرجع القيم المدمجة للعقدة وجميع أبنائها. |
| [get_InnerXml](./get_innerxml/)() override | يرجع العلامة التي تمثل فقط أبناء هذه العقدة. |
| [get_IsEmpty](./get_isempty/)() | يرجع تنسيق الوسم للعنصر. |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة الحالية. |
| [get_Name](./get_name/)() override | يرجع الاسم المؤهل للعقدة. |
| [get_NamespaceURI](./get_namespaceuri/)() override | يرجع URI مساحة الاسم لهذه العقدة. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة الحالية. |
| [get_OwnerDocument](./get_ownerdocument/)() override | يرجع [XmlDocument](../xmldocument/) التي تنتمي إليها هذه العقدة. |
| [get_Prefix](./get_prefix/)() override | يرجع بادئة مساحة الاسم لهذه العقدة. |
| [get_SchemaInfo](./get_schemainfo/)() override | يرجع مجموعة معلومات ما بعد التحقق من المخطط التي تم تعيينها لهذه العقدة نتيجة للتحقق من المخطط. |
| virtual [GetAttribute](./getattribute/)(String) | يرجع القيمة للخاصية ذات الاسم المحدد. |
| virtual [GetAttribute](./getattribute/)(String, String) | يرجع القيمة للخاصية ذات الاسم المحلي المحدد وURI مساحة الاسم. |
| virtual [GetAttributeNode](./getattributenode/)(String) | يرجع [XmlAttribute](../xmlattribute/) ذات الاسم المحدد. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | يرجع [XmlAttribute](../xmlattribute/) ذات الاسم المحلي المحدد وURI مساحة الاسم. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | يرجع [XmlNodeList](../xmlnodelist/) يحتوي على قائمة بجميع العناصر السفلية التي تطابق [XmlElement::get_Name](./get_name/) المحدد. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | يرجع [XmlNodeList](../xmlnodelist/) يحتوي على قائمة بجميع العناصر السفلية التي تطابق القيم المحددة لـ [XmlElement::get_LocalName](./get_localname/) و [XmlElement::get_NamespaceURI](./get_namespaceuri/). |
| virtual [HasAttribute](./hasattribute/)(String) | يحدد ما إذا كانت العقدة الحالية تحتوي على سمة بالاسم المحدد. |
| virtual [HasAttribute](./hasattribute/)(String, String) | يحدد ما إذا كانت العقدة الحالية تحتوي على سمة بالاسم المحلي المحدد وURI مساحة الاسم. |
| [RemoveAll](./removeall/)() override | يزيل جميع السمات المحددة وأبناء العقدة الحالية. لا يتم إزالة السمات الافتراضية. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | يزيل جميع السمات المحددة من العنصر. لا يتم إزالة السمات الافتراضية. |
| virtual [RemoveAttribute](./removeattribute/)(String) | يزيل سمةً بالاسم. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | يزيل سمة بالاسم المحلي والمسار الفريد للمساحة المحددين. (إذا كانت السمة التي أزيلت لها قيمة افتراضية، يتم استبدالها فورًا). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | يزيل عقدة السمة ذات الفهرس المحدد من العنصر. (إذا كانت السمة التي أزيلت لها قيمة افتراضية، يتم استبدالها فورًا). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | يزيل [XmlAttribute](../xmlattribute/) المحدد. |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | يزيل [XmlAttribute](../xmlattribute/) المحدد بالاسم المحلي ومسار URI للمساحة. (إذا كانت السمة التي أزيلت لها قيمة افتراضية، يتم استبدالها فورًا). |
| [set_InnerText](./set_innertext/)(String) override | يضبط القيم المتسلسلة للعقدة وجميع أبنائها. |
| [set_InnerXml](./set_innerxml/)(String) override | يضبط الترميز الذي يمثل فقط أبناء هذه العقدة. |
| [set_IsEmpty](./set_isempty/)(bool) | يضبط تنسيق الوسم للعنصر. |
| [set_Prefix](./set_prefix/)(String) override | يضبط بادئة مساحة الاسم لهذه العقدة. |
| virtual [SetAttribute](./setattribute/)(String, String) | يضبط قيمة السمة ذات الاسم المحدد. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | يضبط قيمة السمة بالاسم المحلي ومسار URI للمساحة المحددين. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | يضيف [XmlAttribute](../xmlattribute/) المحدد. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | يضيف [XmlAttribute](../xmlattribute/) المحدد. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة الحالية إلى [XmlWriter](../xmlwriter/) المحدد. |
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
