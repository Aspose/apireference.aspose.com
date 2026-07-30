---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace 方法"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace 方法。当在派生类中被重写时，评估在给定上下文中是否保留空白节点或将其剥离，此实现位于 C++ 中。"
type: docs
weight: 300
url: /zh/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


在派生类中重写时，评估在给定上下文中是保留空白节点还是剥除它们。

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 节点 | SharedPtr\<System::Xml::XPath::XPathNavigator\> | 当前上下文中需要保留或剥离的空白节点。 |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
