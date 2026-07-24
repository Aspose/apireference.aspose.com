---
title: "طريقة System::Xml::Xsl::IXsltContextFunction::Invoke"
linktitle: "Invoke"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Xsl::IXsltContextFunction::Invoke. تُوفر الطريقة لاستدعاء الدالة بالمعاملات المعطاة في السياق المعطى في C++."
type: docs
weight: 500
url: /ar/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


يوفر الطريقة لاستدعاء الدالة بالمعطيات المعطاة في السياق المعطى.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | سياق XSLT لاستدعاء الدالة. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | معاملات استدعاء الدالة. كل معامل هو عنصر في المصفوفة. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | عقدة السياق لاستدعاء الدالة. |

### ReturnValue

كائن [Object](../../../system/object/) يمثل قيمة الإرجاع للدالة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
