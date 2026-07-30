---
title: "System::Xml::Xsl::XslTransform 类"
linktitle: "XslTransform"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XslTransform 类。使用 C++ 中的可扩展样式表语言转换（XSLT）样式表转换 XML 数据。"
type: docs
weight: 700
url: /zh/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


使用可扩展样式表语言转换 (XSLT) 样式表转换 XML 数据。

```cpp
class XslTransform : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | 加载包含在 [XmlReader](../../system.xml/xmlreader/) 中的 XSLT 样式表。 |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 加载包含在 [XmlReader](../../system.xml/xmlreader/) 中的 XSLT 样式表。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | 加载包含在 IXPathNavigable 中的 XSLT 样式表。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 加载包含在 IXPathNavigable 中的 XSLT 样式表。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | 加载包含在 XPathNavigator 中的 XSLT 样式表。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 加载包含在 XPathNavigator 中的 XSLT 样式表。 |
| [Load](./load/)(const String\&) | 加载由 URL 指定的 XSLT 样式表。 |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 加载由 URL 指定的 XSLT 样式表。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 设置在调用 [XslTransform::Transform](./transform/) 方法时用于解析外部资源的 [XmlResolver](../../system.xml/xmlresolver/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到 [XmlReader](../../system.xml/xmlreader/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | 使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到 [XmlReader](../../system.xml/xmlreader/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 使用指定的 args 转换 XPathNavigator 中的 XML 数据，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 使用指定的 args 转换 XPathNavigator 中的 XML 数据，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到流。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到流。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到 TextWriter。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到 TextWriter。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 [XmlReader](../../system.xml/xmlreader/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | 使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 [XmlReader](../../system.xml/xmlreader/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 TextWriter。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 TextWriter。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到流。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到流。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 转换输入文件中的 XML 数据，并将结果输出到输出文件。 |
| [Transform](./transform/)(const String\&, const String\&) | 转换输入文件中的 XML 数据，并将结果输出到输出文件。 |
| [XslTransform](./xsltransform/)() | 初始化一个新的 [XslTransform](./) 类实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
