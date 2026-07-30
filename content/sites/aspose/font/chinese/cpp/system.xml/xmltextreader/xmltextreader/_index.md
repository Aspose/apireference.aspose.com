---
title: "System::Xml::XmlTextReader::XmlTextReader 构造函数"
linktitle: "XmlTextReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextReader::XmlTextReader 构造函数。使用指定的流在 C++ 中初始化 XmlTextReader 类的新实例。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


使用指定的流初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<IO::Stream\>\& | 包含要读取的 XML 数据的流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


使用指定的流和 [XmlNameTable](../../xmlnametable/) 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<IO::Stream\>\& | 包含要读取的 XML 数据的流。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 要使用的 [XmlNameTable](../../xmlnametable/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


使用指定的流、[XmlNodeType](../../xmlnodetype/) 和 [XmlParserContext](../../xmlparsercontext/) 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | 包含要解析的 XML 片段的流。 |
| fragType | XmlNodeType | XML 片段的 [XmlNodeType](../../xmlnodetype/)。这也决定了片段可以包含的内容。 |
| context | const SharedPtr\<XmlParserContext\>\& | 用于解析 **xmlFragment** 的 [XmlParserContext](../../xmlparsercontext/)。其中包括要使用的 [XmlNameTable](../../xmlnametable/)、编码、命名空间范围、当前的 **xml:lang** 和 **xml:space** 范围。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


使用指定的 TextReader 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<IO::TextReader\>\& | 用于读取 XML 数据的 TextReader。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


使用指定的 TextReader 和 [XmlNameTable](../../xmlnametable/) 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<IO::TextReader\>\& | 用于读取 XML 数据的 TextReader。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 要使用的 [XmlNameTable](../../xmlnametable/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


使用指定的文件初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| url | const String\& | 包含 XML 数据的文件的 URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) 将设置为此值。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


使用指定的 URL 和流初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| url | const String\& | 用于解析外部资源的 URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) 将设置为此值。 |
| 输入 | const SharedPtr\<IO::Stream\>\& | 包含要读取的 XML 数据的流。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


使用指定的 URL、流和 [XmlNameTable](../../xmlnametable/) 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| url | const String\& | 用于解析外部资源的 URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) 将设置为此值。如果 **url** 为 **nullptr**，则 **BaseURI** 设置为 [String::Empty](../../../system/string/empty/)。 |
| 输入 | const SharedPtr\<IO::Stream\>\& | 包含要读取的 XML 数据的流。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 要使用的 [XmlNameTable](../../xmlnametable/)。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


使用指定的 URL 和 TextReader 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| url | const String\& | 用于解析外部资源的 URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) 将设置为此值。 |
| 输入 | const SharedPtr\<IO::TextReader\>\& | 用于读取 XML 数据的 TextReader。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


使用指定的 URL、TextReader 和 [XmlNameTable](../../xmlnametable/) 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| url | const String\& | 用于解析外部资源的 URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) 将设置为此值。如果 **url** 为 **nullptr**，则 **BaseURI** 设置为 [String::Empty](../../../system/string/empty/)。 |
| 输入 | const SharedPtr\<IO::TextReader\>\& | 用于读取 XML 数据的 TextReader。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 要使用的 [XmlNameTable](../../xmlnametable/)。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


使用指定的文件和 [XmlNameTable](../../xmlnametable/) 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| url | const String\& | 包含要读取的 XML 数据的文件的 URL。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 要使用的 [XmlNameTable](../../xmlnametable/)。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


使用指定的字符串、[XmlNodeType](../../xmlnodetype/) 和 [XmlParserContext](../../xmlparsercontext/) 初始化 [XmlTextReader](../) 类的新实例。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xmlFragment | const String\& | 包含要解析的 XML 片段的字符串。 |
| fragType | XmlNodeType | XML 片段的 [XmlNodeType](../../xmlnodetype/)。这也决定了片段字符串可以包含的内容。 |
| context | const SharedPtr\<XmlParserContext\>\& | 用于解析 **xmlFragment** 的 [XmlParserContext](../../xmlparsercontext/)。其中包括要使用的 [XmlNameTable](../../xmlnametable/)、编码、命名空间范围、当前的 **xml:lang** 和 **xml:space** 范围。 |

## 另见

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
