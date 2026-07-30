---
title: "System::Xml::XPath::XPathDocument 类"
linktitle: "XPathDocument"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathDocument 类。通过使用 C++ 中的 XPath 数据模型，提供 XML 文档的快速、只读、内存中的表示。"
type: docs
weight: 200
url: /zh/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


通过使用 [XPath](../) 数据模型，提供 XML 文档的快速、只读、内存中的表示。

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | 初始化一个只读的 [XPathNavigator](../xpathnavigator/) 对象，用于在此 [XPathDocument](./) 中遍历节点。 |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | 从指定的 [XmlReader](../../system.xml/xmlreader/) 对象中包含的 XML 数据初始化 [XPathDocument](./) 类的新实例。 |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | 使用指定的空白处理方式，从指定的 [XmlReader](../../system.xml/xmlreader/) 对象中包含的 XML 数据初始化 [XPathDocument](./) 类的新实例。 |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | 从指定的 TextReader 对象中包含的 XML 数据初始化一个新的 [XPathDocument](./) 类实例。 |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | 从指定的 Stream 对象中的 XML 数据初始化一个新的 [XPathDocument](./) 类实例。 |
| [XPathDocument](./xpathdocument/)(const String\&) | 从指定文件中的 XML 数据初始化一个新的 [XPathDocument](./) 类实例。 |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | 从已指定空白处理方式的文件中的 XML 数据初始化一个新的 [XPathDocument](./) 类实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
