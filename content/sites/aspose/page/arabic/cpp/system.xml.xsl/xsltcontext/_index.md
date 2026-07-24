---
title: "System::Xml::Xsl::XsltContext class"
linktitle: "XsltContext"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Xsl::XsltContext class. يغلف السياق التنفيذي الحالي لمعالج Extensible Stylesheet Language for Transformations (XSLT) مما يسمح لـ XML Path Language (XPath) بحل الدوال والمعاملات والمساحات الاسمية داخل تعبيرات XPath في C++."
type: docs
weight: 500
url: /ar/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


يغلف السياق التنفيذي الحالي لمعالج Extensible Stylesheet Language for Transformations (XSLT) مما يسمح لـ XML Path Language ([XPath](../../system.xml.xpath/)) بحل الدوال والمعاملات والمساحات الاسمية داخل تعبيرات [XPath](../../system.xml.xpath/).

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | عند تجاوزها في فئة مشتقة، تقارن معرفات الموارد الموحدة (URIs) الأساسية لمستندين بناءً على ترتيب تحميل المستندات بواسطة معالج XSLT (أي فئة [XslTransform](../xsltransform/)). |
| virtual [get_Whitespace](./get_whitespace/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة تشير إلى ما إذا كان يجب تضمين عقد المسافات البيضاء في الناتج. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | عند تجاوزها في فئة مشتقة، تقيم ما إذا كان يجب الحفاظ على عقد المسافات البيضاء أو إزالتها للسياق المعطى. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | عند تجاوزها في فئة مشتقة، تحل إشارة الدالة وتعيد [IXsltContextFunction](../ixsltcontextfunction/) تمثّل الدالة. يُستخدم [IXsltContextFunction](../ixsltcontextfunction/) في وقت التنفيذ للحصول على قيمة إرجاع الدالة. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | عند تجاوزها في فئة مشتقة، تحل إشارة المتغيّر وتعيد [IXsltContextVariable](../ixsltcontextvariable/) تمثّل المتغيّر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
