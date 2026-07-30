---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace method"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace method. عند تجاوزها في فئة مشتقة، تقيم ما إذا كان يجب الحفاظ على عقد المسافات البيضاء أو إزالتها للسياق المعطى في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


عند تجاوزها في فئة مشتقة، تقيم ما إذا كان يجب الحفاظ على عقد المسافات البيضاء أو إزالتها للسياق المعطى.

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| العقدة | SharedPtr\<System::Xml::XPath::XPathNavigator\> | عقدة المسافة البيضاء التي يجب الحفاظ عليها أو إزالتها في السياق الحالي. |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
