---
title: "System::Xml::XPath::XPathNodeType 枚举"
linktitle: "XPathNodeType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNodeType 枚举。定义可以从 C++ 中的 XPathNavigator 类返回的 XPath 节点类型。"
type: docs
weight: 1100
url: /zh/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


定义可以从 [XPathNavigator](../xpathnavigator/) 类返回的 [XPath](../) 节点类型。

```cpp
enum class XPathNodeType
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 根 | 0 | XML 文档或节点树的根节点。 |
| Element | 1 | 一个元素，例如 **<element>**。 |
| Attribute | 2 | 一个属性，例如 **id='123'**。 |
| 命名空间 | 3 | 一个命名空间，例如 **xmlns=\"namespace\"**。 |
| Text | 4 | 节点的文本内容。相当于文档 [Object](../../system/object/) 模型 (DOM) [Text](../../system.text/) 和 CDATA 节点类型。至少包含一个字符。 |
| SignificantWhitespace | 5 | 一个包含空白字符且 **xml:space** 设置为 **preserve** 的节点。 |
| Whitespace | 6 | 仅包含空白字符且没有显著空白的节点。空白字符为 **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**。 |
| ProcessingInstruction | 7 | 一个处理指令，例如 **<?pi test?>**。这不包括 XML 声明，后者对 [XPathNavigator](../xpathnavigator/) 类不可见。 |
| Comment | 8 | 一个注释，例如 ****。 |
| All | 9 | 任意 [XPathNodeType](./) 节点类型。 |

## 另见

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
