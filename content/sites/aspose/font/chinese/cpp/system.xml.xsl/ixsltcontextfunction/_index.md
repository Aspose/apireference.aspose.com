---
title: "System::Xml::Xsl::IXsltContextFunction 类"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::IXsltContextFunction 类。提供对在可扩展样式表语言转换 (XSLT) 样式表中定义的函数的接口，该函数在 C++ 的运行时执行期间可用。"
type: docs
weight: 100
url: /zh/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


在运行时执行期间，提供对在可扩展样式表语言转换 (XSLT) 样式表中定义的特定函数的接口。

```cpp
class IXsltContextFunction : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | 返回函数参数列表中提供的 XML 路径语言（[XPath](../../system.xml.xpath/)）类型。此信息可用于发现函数的签名，从而区分重载函数。 |
| virtual [get_Maxargs](./get_maxargs/)() | 返回函数的最大参数数量。这使用户能够区分重载函数。 |
| virtual [get_Minargs](./get_minargs/)() | 返回函数所需的最小参数数量。这使用户能够区分重载函数。 |
| virtual [get_ReturnType](./get_returntype/)() | 返回表示函数返回的 [XPath](../../system.xml.xpath/) 类型的 XPathResultType。 |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | 提供在给定上下文中使用给定参数调用函数的方法。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
