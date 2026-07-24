---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace 方法"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace 方法。当在派生类中被重写时，评估是否在给定上下文中保留空白节点或将其剥离，在 C++ 中。"
type: docs
weight: 300
url: /zh/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


在派生类中重写时，评估在给定上下文中是保留空白节点还是剥离它们。

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 节点 | SharedPtr\<System::Xml::XPath::XPathNavigator\> | 在当前上下文中需要保留或剥离的空白节点。 |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
