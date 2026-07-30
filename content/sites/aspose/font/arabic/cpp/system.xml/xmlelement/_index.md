---
title: "System::Xml::XmlElement فئة"
linktitle: "XmlElement"
second_title: "Aspose.Font لـ C++"
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
| virtual [get_HasAttributes](./get_hasattributes/)() | يعيد قيمة **bool** تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي سمات. |
| [get_InnerText](./get_innertext/)() override | يعيد القيم المدمجة للعقدة وجميع أبنائها. |
| [get_InnerXml](./get_innerxml/)() override | يعيد العلامة التي تمثل فقط أبناء هذه العقدة. |
| [get_IsEmpty](./get_isempty/)() | يعيد تنسيق الوسم للعنصر. |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة الحالية. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة. |
| [get_NamespaceURI](./get_namespaceuri/)() override | يعيد URI مساحة الاسم لهذه العقدة. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_OwnerDocument](./get_ownerdocument/)() override | يعيد [XmlDocument](../xmldocument/) الذي تنتمي إليه هذه العقدة. |
| [get_Prefix](./get_prefix/)() override | يعيد بادئة مساحة الاسم لهذه العقدة. |
| [get_SchemaInfo](./get_schemainfo/)() override | يعيد مجموعة معلومات ما بعد التحقق من صحة المخطط التي تم تعيينها لهذه العقدة نتيجة للتحقق من صحة المخطط. |
| virtual [GetAttribute](./getattribute/)(String) | يعيد القيمة للخاصية ذات الاسم المحدد. |
| virtual [GetAttribute](./getattribute/)(String, String) | يعيد القيمة للخاصية ذات الاسم المحلي المحدد ومسار مساحة الاسم. |
| virtual [GetAttributeNode](./getattributenode/)(String) | يعيد الـ[XmlAttribute](../xmlattribute/) بالاسم المحدد. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | يعيد الـ[XmlAttribute](../xmlattribute/) بالاسم المحلي ومسار مساحة الاسم المحددين. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | يعيد [XmlNodeList](../xmlnodelist/) يحتوي على قائمة بجميع العناصر السفلية التي تطابق الـ[XmlElement::get_Name](./get_name/) المحدد. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | يعيد [XmlNodeList](../xmlnodelist/) يحتوي على قائمة بجميع العناصر السفلية التي تطابق القيم المحددة للـ[XmlElement::get_LocalName](./get_localname/) و[XmlElement::get_NamespaceURI](./get_namespaceuri/). |
| virtual [HasAttribute](./hasattribute/)(String) | يحدد ما إذا كان العقدة الحالية تحتوي على خاصية بالاسم المحدد. |
| virtual [HasAttribute](./hasattribute/)(String, String) | يحدد ما إذا كان العقدة الحالية تحتوي على خاصية بالاسم المحلي ومسار مساحة الاسم المحددين. |
| [RemoveAll](./removeall/)() override | يزيل جميع الخصائص المحددة والأبناء للعقدة الحالية. لا يتم إزالة الخصائص الافتراضية. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | يزيل جميع الخصائص المحددة من العنصر. لا يتم إزالة الخصائص الافتراضية. |
| virtual [RemoveAttribute](./removeattribute/)(String) | يزيل خاصية بالاسم. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | يزيل خاصية بالاسم المحلي ومسار مساحة الاسم المحددين. (إذا كان للخاصية التي أزيلت قيمة افتراضية، يتم استبدالها فوراً). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | يزيل عقدة الخاصية ذات الفهرس المحدد من العنصر. (إذا كان للخاصية التي أزيلت قيمة افتراضية، يتم استبدالها فوراً). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | يزيل الـ[XmlAttribute](../xmlattribute/) المحدد. |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | يزيل الـ[XmlAttribute](../xmlattribute/) المحدد بالاسم المحلي ومسار مساحة الاسم. (إذا كان للخاصية التي أزيلت قيمة افتراضية، يتم استبدالها فوراً). |
| [set_InnerText](./set_innertext/)(String) override | يضبط القيم المدمجة للعقدة وجميع أبنائها. |
| [set_InnerXml](./set_innerxml/)(String) override | يضبط العلامة التي تمثل فقط أبناء هذه العقدة. |
| [set_IsEmpty](./set_isempty/)(bool) | يضبط تنسيق الوسم للعنصر. |
| [set_Prefix](./set_prefix/)(String) override | يضبط بادئة مساحة الاسم لهذه العقدة. |
| virtual [SetAttribute](./setattribute/)(String, String) | يضبط قيمة الخاصية بالاسم المحدد. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | يضبط قيمة الخاصية بالاسم المحلي ومسار مساحة الاسم المحددين. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | يضيف الـ[XmlAttribute](../xmlattribute/) المحدد. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | يضيف الـ[XmlAttribute](../xmlattribute/) المحدد. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة الحالية إلى الـ[XmlWriter](../xmlwriter/) المحدد. |
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
