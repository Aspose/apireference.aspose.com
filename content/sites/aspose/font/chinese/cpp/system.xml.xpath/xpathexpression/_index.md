---
title: "System::Xml::XPath::XPathExpression 类"
linktitle: "XPathExpression"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathExpression 类。提供一个强类型类，用于表示 C++ 中编译的 XPath 表达式。"
type: docs
weight: 300
url: /zh/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


提供一个强类型类，用于表示已编译的 [XPath](../) 表达式。

```cpp
class XPathExpression : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | 在派生类中重写时，根据指定的 IComparer 对象对 [XPath](../) 表达式选取的节点进行排序。 |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | 在派生类中重写时，根据提供的参数对 [XPath](../) 表达式选取的节点进行排序。 |
| virtual [Clone](./clone/)() | 在派生类中重写时，返回此 [XPathExpression](./) 的克隆。 |
| static [Compile](./compile/)(const String\&) | 编译指定的 [XPath](../) 表达式，并返回表示该 [XPath](../) 表达式的 [XPathExpression](./) 对象。 |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | 编译指定的 [XPath](../) 表达式，使用为命名空间解析指定的 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 对象，并返回表示该 [XPath](../) 表达式的 [XPathExpression](./) 对象。 |
| virtual [get_Expression](./get_expression/)() | 在派生类中重写时，获取 [XPathExpression](./) 的 **string** 表示形式。 |
| virtual [get_ReturnType](./get_returntype/)() | 在派生类中重写时，获取 [XPath](../) 表达式的结果类型。 |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | 在派生类中重写时，指定用于命名空间解析的 [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) 对象。 |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | 在派生类中重写时，指定用于命名空间解析的 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 对象。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
