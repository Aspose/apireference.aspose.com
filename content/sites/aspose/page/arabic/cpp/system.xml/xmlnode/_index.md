---
title: "فئة System::Xml::XmlNode"
linktitle: "XmlNode"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlNode. تمثل عقدة واحدة في مستند XML في C++."
type: docs
weight: 2500
url: /ar/cpp/system.xml/xmlnode/
---
## XmlNode class


يمثل عقدة واحدة في مستند XML.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | يضيف العقدة المحددة إلى نهاية قائمة العقد الفرعية لهذه العقدة. |
| virtual [Clone](./clone/)() | ينشئ نسخة مكررة من هذه العقدة. |
| virtual [CloneNode](./clonenode/)(bool) | ينشئ نسخة مكررة من العقدة عند تجاوزها في فئة مشتقة. |
| [CreateNavigator](./createnavigator/)() override | ينشئ كائن XPathNavigator للتنقل في هذا الكائن. |
| virtual [get_Attributes](./get_attributes/)() | يعيد [XmlAttributeCollection](../xmlattributecollection/) يحتوي على سمات هذه العقدة. |
| virtual [get_BaseURI](./get_baseuri/)() | يعيد عنوان URI الأساسي للعقدة الحالية. |
| virtual [get_ChildNodes](./get_childnodes/)() | يعيد جميع العقد الفرعية للعقدة. |
| virtual [get_FirstChild](./get_firstchild/)() | يعيد أول عقدة فرعية للعقدة. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | يعيد قيمة تشير إلى ما إذا كانت هذه العقدة تحتوي على أي عقد فرعية. |
| virtual [get_InnerText](./get_innertext/)() | يعيد القيم المدمجة للعقدة وجميع عقدها الفرعية. |
| virtual [get_InnerXml](./get_innerxml/)() | يعيد الترميز الذي يمثل فقط العقد الفرعية لهذه العقدة. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | يرجع قيمة تشير إلى ما إذا كانت العقدة للقراءة فقط. |
| virtual [get_LastChild](./get_lastchild/)() | يعيد آخر عقدة فرعية للعقدة. |
| virtual [get_LocalName](./get_localname/)() | يعيد الاسم المحلي للعقدة، عندما يتم تجاوزه في فئة مشتقة. |
| virtual [get_Name](./get_name/)() | يعيد الاسم المؤهل للعقدة، عندما يتم تجاوزه في فئة مشتقة. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | يرجع URI مساحة الاسم لهذه العقدة. |
| virtual [get_NextSibling](./get_nextsibling/)() | يعيد العقدة التي تلي هذه العقدة مباشرةً. |
| virtual [get_NodeType](./get_nodetype/)() | يعيد نوع العقدة الحالية، عندما يتم تجاوزه في فئة مشتقة. |
| virtual [get_OuterXml](./get_outerxml/)() | يعيد الترميز الذي يحتوي على هذه العقدة وجميع عقدها الفرعية. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | يرجع [XmlDocument](../xmldocument/) التي تنتمي إليها هذه العقدة. |
| virtual [get_ParentNode](./get_parentnode/)() | يعيد الأب لهذه العقدة (للعقد التي يمكن أن يكون لها أب). |
| virtual [get_Prefix](./get_prefix/)() | يرجع بادئة مساحة الاسم لهذه العقدة. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | يعيد العقدة التي تسبق هذه العقدة مباشرةً. |
| virtual [get_PreviousText](./get_previoustext/)() | يرجع عقدة النص التي تسبق هذه العقدة مباشرةً. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | يرجع مجموعة معلومات ما بعد التحقق من المخطط التي تم تعيينها لهذه العقدة نتيجة للتحقق من المخطط. |
| virtual [get_Value](./get_value/)() | يرجع قيمة العقدة. |
| [GetEnumerator](./getenumerator/)() override | يعيد عدادًا يتنقل عبر العقد الفرعية في العقدة الحالية. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | يبحث عن أقرب تعريف **xmlns** للبادئة المعطاة الموجود في نطاق العقدة الحالية ويعيد URI مساحة الاسم في التعريف. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | يبحث عن أقرب تعريف **xmlns** لـ URI مساحة الاسم المعطى الموجود في نطاق العقدة الحالية ويعيد البادئة المعرفة في ذلك التعريف. |
| virtual [idx_get](./idx_get/)(String) | يعيد أول عنصر فرعي بالاسم المحدد [XmlNode::get_Name](./get_name/). |
| virtual [idx_get](./idx_get/)(String, String) | يعيد أول عنصر فرعي بالقيم المحددة [XmlNode::get_LocalName](./get_localname/) و [XmlNode::get_NamespaceURI](./get_namespaceuri/). |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | يدرج العقدة المحددة مباشرةً بعد عقدة المرجع المحددة. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | يدرج العقدة المحددة مباشرةً قبل عقدة المرجع المحددة. |
| virtual [Normalize](./normalize/)() | يضع جميع عقد [XmlText](../xmltext/) في العمق الكامل للشجرة الفرعية تحت هذا [XmlNode](./) في شكل "عادي" حيث يفصل الترميز فقط (أي العلامات، التعليقات، تعليمات المعالجة، أقسام CDATA، وإشارات الكيان) بين عقد [XmlText](../xmltext/)، أي لا توجد عقد [XmlText](../xmltext/) متجاورة. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | يضيف العقدة المحددة إلى بداية قائمة العقد الفرعية لهذه العقدة. |
| virtual [RemoveAll](./removeall/)() | يزيل جميع العقد الفرعية و/أو السمات للعقدة الحالية. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | يزيل العقدة الفرعية المحددة. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | يستبدل العقدة الفرعية **oldChild** بـ عقدة **newChild**. |
| [SelectNodes](./selectnodes/)(const String\&) | يختار قائمة من العقد التي تطابق تعبير [XPath](../../system.xml.xpath/). |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | يختار قائمة من العقد التي تطابق تعبير [XPath](../../system.xml.xpath/). أي بادئات تم العثور عليها في تعبير [XPath](../../system.xml.xpath/) يتم حلها باستخدام [XmlNamespaceManager](../xmlnamespacemanager/) المقدم. |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | يختار أول [XmlNode](./) يطابق تعبير [XPath](../../system.xml.xpath/). |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | يختار أول [XmlNode](./) يطابق تعبير [XPath](../../system.xml.xpath/). أي بادئات تم العثور عليها في تعبير [XPath](../../system.xml.xpath/) يتم حلها باستخدام [XmlNamespaceManager](../xmlnamespacemanager/) المقدم. |
| virtual [set_InnerText](./set_innertext/)(String) | يضبط القيم المدمجة للعقدة وجميع عقدها الفرعية. |
| virtual [set_InnerXml](./set_innerxml/)(String) | يضبط الترميز الذي يمثل فقط العقد الفرعية لهذه العقدة. |
| virtual [set_Prefix](./set_prefix/)(String) | يضبط بادئة مساحة الاسم لهذه العقدة. |
| virtual [set_Value](./set_value/)(String) | يضبط قيمة العقدة. |
| virtual [Supports](./supports/)(String, String) | يفحص ما إذا كان تنفيذ DOM يدعم ميزة محددة. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | يحفظ جميع العقد الفرعية للعقدة إلى [XmlWriter](../xmlwriter/) المحدد، عند تجاوزها في فئة مشتقة. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | يحفظ العقدة الحالية إلى [XmlWriter](../xmlwriter/) المحدد، عند تجاوزها في فئة مشتقة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
