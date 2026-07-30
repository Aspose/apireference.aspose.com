---
title: "System::Xml::Xsl::XsltContext::ResolveFunction طريقة"
linktitle: "ResolveFunction"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction طريقة. عندما يتم تجاوزها في فئة مشتقة، تحل إشارة الدالة وتعيد IXsltContextFunction يمثل الدالة. يُستخدم IXsltContextFunction في وقت التنفيذ للحصول على قيمة الإرجاع للدالة في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


عند تجاوزها في فئة مشتقة، تحل إشارة الدالة وتعيد [IXsltContextFunction](../../ixsltcontextfunction/) يمثل الدالة. يُستخدم [IXsltContextFunction](../../ixsltcontextfunction/) في وقت التنفيذ للحصول على قيمة الإرجاع للدالة.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| prefix | String | البادئة الخاصة بالدالة كما تظهر في تعبير [XPath](../../../system.xml.xpath/). |
| name | String | اسم الدالة. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | مصفوفة من أنواع الوسائط للدالة التي يتم حلها. يتيح لك ذلك اختيار بين الأساليب التي لها نفس الاسم (على سبيل المثال، الأساليب المحملة بأكثر من تعريف). |

### ReturnValue

كائن [IXsltContextFunction](../../ixsltcontextfunction/) يمثل الدالة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
