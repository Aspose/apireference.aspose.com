---
title: "System::Xml::XmlParserContext::XmlParserContext 构造函数"
linktitle: "XmlParserContext"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlParserContext::XmlParserContext 构造函数。初始化 XmlParserContext 类的一个新实例，使用指定的 XmlNameTable、XmlNamespaceManager、基础 URI、xml:lang、xml:space 和文档类型值（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


初始化 [XmlParserContext](../) 类的一个新实例，使用指定的 [XmlNameTable](../../xmlnametable/)、[XmlNamespaceManager](../../xmlnamespacemanager/)、基础 URI、**xml:lang**、**xml:space** 和文档类型值。

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 用于原子化字符串的 [XmlNameTable](../../xmlnametable/)。如果它是 **nullptr**，则使用用于构造 **nsMgr** 的名称表。有关原子化字符串的更多信息，请参阅 [XmlNameTable](../../xmlnametable/)。 |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 用于查找命名空间信息的 [XmlNamespaceManager](../../xmlnamespacemanager/)，或 **nullptr**。 |
| docTypeName | const String\& | 文档类型声明的名称。 |
| pubId | const String\& | 公共标识符。 |
| sysId | const String\& | 系统标识符。 |
| internalSubset | const String\& | 内部 DTD 子集。DTD 子集用于实体解析，而不是文档验证。 |
| baseURI | const String\& | XML 片段的基础 URI（加载该片段的位置）。 |
| xmlLang | const String\& | **xml:lang** 的作用域。 |
| xmlSpace | System::Xml::XmlSpace | 一个指示 **xml:space** 范围的 [XmlSpace](../../xmlspace/) 值。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


初始化 [XmlParserContext](../) 类的一个新实例，使用指定的 [XmlNameTable](../../xmlnametable/)、[XmlNamespaceManager](../../xmlnamespacemanager/)、基础 URI、**xml:lang**、**xml:space**、编码和文档类型值。

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 用于原子化字符串的 [XmlNameTable](../../xmlnametable/)。如果它是 **nullptr**，则使用用于构造 **nsMgr** 的名称表。有关原子化字符串的更多信息，请参阅 [XmlNameTable](../../xmlnametable/)。 |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 用于查找命名空间信息的 [XmlNamespaceManager](../../xmlnamespacemanager/)，或 **nullptr**。 |
| docTypeName | const String\& | 文档类型声明的名称。 |
| pubId | const String\& | 公共标识符。 |
| sysId | const String\& | 系统标识符。 |
| internalSubset | const String\& | 内部 DTD 子集。DTD 用于实体解析，而不是文档验证。 |
| baseURI | const String\& | XML 片段的基础 URI（加载该片段的位置）。 |
| xmlLang | const String\& | **xml:lang** 的作用域。 |
| xmlSpace | System::Xml::XmlSpace | 一个指示 **xml:space** 范围的 [XmlSpace](../../xmlspace/) 值。 |
| enc | const SharedPtr\<System::Text::Encoding\>\& | 指示编码设置的 Encoding 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


初始化 [XmlParserContext](../) 类的一个新实例，使用指定的 [XmlNameTable](../../xmlnametable/)、[XmlNamespaceManager](../../xmlnamespacemanager/)、**xml:lang** 和 **xml:space** 值。

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 用于原子化字符串的 [XmlNameTable](../../xmlnametable/)。如果它是 **nullptr**，则使用用于构造 **nsMgr** 的名称表。有关原子化字符串的更多信息，请参阅 [XmlNameTable](../../xmlnametable/)。 |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 用于查找命名空间信息的 [XmlNamespaceManager](../../xmlnamespacemanager/)，或 **nullptr**。 |
| xmlLang | const String\& | **xml:lang** 的作用域。 |
| xmlSpace | System::Xml::XmlSpace | 一个指示 **xml:space** 范围的 [XmlSpace](../../xmlspace/) 值。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


初始化 [XmlParserContext](../) 类的一个新实例，使用指定的 [XmlNameTable](../../xmlnametable/)、[XmlNamespaceManager](../../xmlnamespacemanager/)、**xml:lang**、**xml:space** 和编码。

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 用于原子化字符串的 [XmlNameTable](../../xmlnametable/)。如果它是 **nullptr**，则使用用于构造 **nsMgr** 的名称表。有关原子化字符串的更多信息，请参阅 [XmlNameTable](../../xmlnametable/)。 |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 用于查找命名空间信息的 [XmlNamespaceManager](../../xmlnamespacemanager/)，或 **nullptr**。 |
| xmlLang | const String\& | **xml:lang** 的作用域。 |
| xmlSpace | System::Xml::XmlSpace | 一个指示 **xml:space** 范围的 [XmlSpace](../../xmlspace/) 值。 |
| enc | const SharedPtr\<System::Text::Encoding\>\& | 指示编码设置的 Encoding 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
