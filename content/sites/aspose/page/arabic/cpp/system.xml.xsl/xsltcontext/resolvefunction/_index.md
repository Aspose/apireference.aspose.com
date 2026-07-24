---
title: "طريقة System::Xml::Xsl::XsltContext::ResolveFunction"
linktitle: "ResolveFunction"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Xsl::XsltContext::ResolveFunction. عند تجاوزها في فئة مشتقة، تقوم بحل إشارة الدالة وتُرجع IXsltContextFunction التي تمثل الدالة. تُستخدم IXsltContextFunction أثناء وقت التنفيذ للحصول على قيمة إرجاع الدالة في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


عند تجاوزها في فئة مشتقة، تقوم بحل إشارة الدالة وتُرجع ‎[IXsltContextFunction](../../ixsltcontextfunction/) التي تمثل الدالة. تُستخدم ‎[IXsltContextFunction](../../ixsltcontextfunction/) أثناء وقت التنفيذ للحصول على قيمة إرجاع الدالة.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| prefix | String | بادئة الدالة كما تظهر في تعبير [XPath](../../../system.xml.xpath/). |
| الاسم | String | اسم الدالة. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | مصفوفة من أنواع الوسائط للدالة التي يتم حلها. يتيح لك ذلك الاختيار بين طرق لها نفس الاسم (على سبيل المثال، طرق مُحمّلة بأكثر من تعريف). |

### ReturnValue

‏[IXsltContextFunction](../../ixsltcontextfunction/) تمثل الدالة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
