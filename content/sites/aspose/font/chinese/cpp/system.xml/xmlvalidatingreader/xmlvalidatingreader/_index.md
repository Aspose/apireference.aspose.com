---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader 构造函数"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader 构造函数。使用指定的值在 C++ 中初始化 XmlValidatingReader 类的新实例。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


使用指定的值初始化 [XmlValidatingReader](../) 类的新实例。

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | 包含要解析的 XML 片段的流。 |
| fragType | XmlNodeType | XML 片段的 [XmlNodeType](../../xmlnodetype/)。这决定了片段可以包含的内容（见下表）。 |
| context | const SharedPtr\<XmlParserContext\>\& | 用于解析 XML 片段的 [XmlParserContext](../../xmlparsercontext/)。其中包括要使用的 [XmlNameTable](../../xmlnametable/)、编码、命名空间范围、当前 **xml:lang** 和 **xml:space** 范围。 |
## 备注



下表列出了 **fragType** 的有效值以及读取器如何解析不同节点类型。 |||
|-|-|
| XmlNodeType | 片段可能包含 |
| Element | 任何有效的元素内容（例如，元素、注释、处理指令、CDATA、文本和实体引用的任意组合）。 |
| Attribute | 属性的值（引号内的部分）。 |
| Document | 整个 XML 文档的内容；这会强制执行文档级别的规则。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


初始化一个新的 [XmlValidatingReader](../) 类实例，该实例验证来自给定 [XmlReader](../../xmlreader/) 的返回内容。

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | 在验证期间用于读取的 [XmlReader](../../xmlreader/)。当前实现仅支持 [XmlTextReader](../../xmltextreader/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


使用指定的值初始化 [XmlValidatingReader](../) 类的新实例。

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xmlFragment | const String\& | 包含要解析的 XML 片段的字符串。 |
| fragType | XmlNodeType | XML 片段的 [XmlNodeType](../../xmlnodetype/)。这也决定了片段字符串可以包含的内容（见下表）。 |
| context | const SharedPtr\<XmlParserContext\>\& | 用于解析 XML 片段的 [XmlParserContext](../../xmlparsercontext/)。这包括要使用的 [NameTable](../../nametable/)、编码、命名空间范围、当前 **xml:lang** 和 **xml:space** 范围。 |
## 备注



下表列出了 **fragType** 的有效值以及读取器如何解析不同节点类型。 |||
|-|-|
| XmlNodeType | 片段可能包含 |
| Element | 任何有效的元素内容（例如，元素、注释、处理指令、CDATA、文本和实体引用的任意组合）。 |
| Attribute | 属性的值（引号内的部分）。 |
| Document | 整个 XML 文档的内容；这会强制执行文档级别的规则。 |

## 另见

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
