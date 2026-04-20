---
title: "System::Xml::XPath::XPathExpression class"
linktitle: "XPathExpression"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathExpression class. يوفر فئةً مكتوبة تمثل تعبير XPath مُجمع في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


يوفر فئةً مكتوبة تمثل تعبير [XPath](../) مُجمع.

```cpp
class XPathExpression : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | عند تجاوزها في فئة مشتقة، تقوم بفرز العقد المحددة بواسطة تعبير [XPath](../) وفقًا لكائن IComparer المحدد. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | عند تجاوزها في فئة مشتقة، تقوم بفرز العقد المحددة بواسطة تعبير [XPath](../) وفقًا للمعلمات المقدمة. |
| virtual [Clone](./clone/)() | عند تجاوزها في فئة مشتقة، تُعيد نسخةً مستنسخة من هذا [XPathExpression](./). |
| static [Compile](./compile/)(const String\&) | يقوم بتجميع تعبير [XPath](../) المحدد ويعيد كائنًا من نوع [XPathExpression](./) يمثل تعبير [XPath](../). |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | يقوم بتجميع تعبير [XPath](../) المحدد، مع كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل المساحات الاسمية، ويعيد كائنًا من نوع [XPathExpression](./) يمثل تعبير [XPath](../). |
| virtual [get_Expression](./get_expression/)() | عند تجاوزها في فئة مشتقة، تحصل على تمثيل **string** لـ [XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | عند تجاوزها في فئة مشتقة، تحصل على نوع النتيجة لتعبير [XPath](../). |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | عند تجاوزها في فئة مشتقة، تحدد كائن [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) لاستخدامه في حل المساحات الاسمية. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | عند تجاوزها في فئة مشتقة، تحدد كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) لاستخدامه في حل المساحات الاسمية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
