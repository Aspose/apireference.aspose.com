---
title: "System::Xml::Xsl::XsltContext::ResolveVariable method"
linktitle: "ResolveVariable"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable method. عند تجاوزها في فئة مشتقة، تحل إشارة المتغير وتعيد كائن IXsltContextVariable يمثل المتغير في C++."
type: docs
weight: 500
url: /ar/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


عند تجاوزها في فئة مشتقة، تحل إشارة المتغير وتعيد كائن [IXsltContextVariable](../../ixsltcontextvariable/) يمثل المتغير.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| prefix | String | بادئة المتغير كما تظهر في تعبير [XPath](../../../system.xml.xpath/). |
| name | String | اسم المتغيّر. |

### ReturnValue

كائن [IXsltContextVariable](../../ixsltcontextvariable/) يمثل المتغيّر أثناء وقت التشغيل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
