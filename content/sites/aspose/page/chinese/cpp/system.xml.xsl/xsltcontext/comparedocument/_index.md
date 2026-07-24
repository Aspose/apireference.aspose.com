---
title: "System::Xml::Xsl::XsltContext::CompareDocument 方法"
linktitle: "CompareDocument"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument 方法。当在派生类中被重写时，比较两个文档的基础统一资源标识符（URI），依据文档被 XSLT 处理器（即 XslTransform 类）加载的顺序，在 C++ 中。"
type: docs
weight: 100
url: /zh/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


当在派生类中被重写时，比较两个文档的基础统一资源标识符（URI），依据文档被 XSLT 处理器（即 [XslTransform](../../xsltransform/) 类）加载的顺序。

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| baseUri | 字符串 | 要比较的第一个文档的基础 URI。 |
| nextbaseUri | 字符串 | 要比较的第二个文档的基础 URI。 |

### ReturnValue

一个整数值，描述两个基础 URI 的相对顺序：如果 **baseUri** 在 **nextbaseUri** 之前则为 -1；如果两个基础 URI 相同则为 0；如果 **baseUri** 在 **nextbaseUri** 之后则为 1。

## 另见

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
