---
title: "طريقة System::Xml::Xsl::XsltContext::ResolveVariable"
linktitle: "ResolveVariable"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Xsl::XsltContext::ResolveVariable. عند تجاوزها في فئة مشتقة، تحل إشارة المتغير وتعيد كائن IXsltContextVariable يمثل المتغير في C++."
type: docs
weight: 500
url: /ar/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


عند تجاوزها في فئة مشتقة، تحل إشارة المتغير وتعيد [IXsltContextVariable](../../ixsltcontextvariable/) يمثل المتغير.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| prefix | String | بادئة المتغير كما تظهر في تعبير [XPath](../../../system.xml.xpath/). |
| الاسم | String | اسم المتغير. |

### ReturnValue

[IXsltContextVariable](../../ixsltcontextvariable/) يمثل المتغير أثناء التشغيل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
