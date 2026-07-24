---
title: "System::Xml::XPath::XPathExpression فئة"
linktitle: "XPathExpression"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XPath::XPathExpression فئة. توفر فئةً ذات نوع تمثل تعبير XPath مُجمع في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


توفر فئةً ذات نوع تمثل تعبير [XPath](../) مُجمع.

```cpp
class XPathExpression : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | عند تجاوزها في فئة مشتقة، تقوم بفرز العقد المختارة بواسطة تعبير [XPath](../) وفقًا لكائن IComparer المحدد. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | عند تجاوزها في فئة مشتقة، تقوم بفرز العقد المختارة بواسطة تعبير [XPath](../) وفقًا للمعلمات المقدمة. |
| virtual [Clone](./clone/)() | عند تجاوزها في فئة مشتقة، تُعيد نسخة مستنسخة من هذا [XPathExpression](./). |
| static [Compile](./compile/)(const String\&) | يقوم بتجميع تعبير [XPath](../) المحدد ويعيد كائن [XPathExpression](./) يمثل تعبير [XPath](../). |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | يقوم بتجميع تعبير [XPath](../) المحدد، مع كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل الأسماء، ويعيد كائن [XPathExpression](./) يمثل تعبير [XPath](../). |
| virtual [get_Expression](./get_expression/)() | عند تجاوزها في فئة مشتقة، يحصل على تمثيل **string** لـ [XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | عند تجاوزها في فئة مشتقة، يحصل على نوع النتيجة لتعبير [XPath](../). |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | عند تجاوزها في فئة مشتقة، يحدد كائن [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) لاستخدامه في حل الأسماء. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | عند تجاوزها في فئة مشتقة، يحدد كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) لاستخدامه في حل الأسماء. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
