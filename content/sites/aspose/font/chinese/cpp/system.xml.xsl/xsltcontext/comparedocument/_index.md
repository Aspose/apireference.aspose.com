---
title: "System::Xml::Xsl::XsltContext::CompareDocument 方法"
linktitle: "CompareDocument"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument 方法。当在派生类中被重写时，根据 XSLT 处理器（即 XslTransform 类）加载文档的顺序比较两个文档的基础统一资源标识符（URI），此实现位于 C++ 中。"
type: docs
weight: 100
url: /zh/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


当在派生类中被重写时，根据 XSLT 处理器（即 [XslTransform](../../xsltransform/) 类）加载文档的顺序比较两个文档的基础统一资源标识符（URI）。

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| baseUri | String | 要比较的第一个文档的基础 URI。 |
| nextbaseUri | String | 要比较的第二个文档的基础 URI。 |

### ReturnValue

一个整数值，描述两个基础 URI 的相对顺序：-1 表示 **baseUri** 在 **nextbaseUri** 之前；0 表示两个基础 URI 相同；1 表示 **baseUri** 在 **nextbaseUri** 之后。

## 另见

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
