---
title: "System::Xml::Xsl::IXsltContextVariable 类"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::IXsltContextVariable 类。提供对在样式表中定义的变量的接口，该变量在 C++ 的运行时执行期间可用。"
type: docs
weight: 200
url: /zh/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


在运行时执行期间，提供对在样式表中定义的特定变量的接口。

```cpp
class IXsltContextVariable : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | 在运行时求值该变量，并返回表示该变量值的对象。 |
| virtual [get_IsLocal](./get_islocal/)() | 返回一个值，指示该变量是否为本地变量。 |
| virtual [get_IsParam](./get_isparam/)() | 返回一个值，指示该变量是否为可扩展样式表语言转换 (XSLT) 参数。这可以是样式表或模板的参数。 |
| virtual [get_VariableType](./get_variabletype/)() | 返回表示该变量的 XML 路径语言（[XPath](../../system.xml.xpath/)）类型的 XPathResultType。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
