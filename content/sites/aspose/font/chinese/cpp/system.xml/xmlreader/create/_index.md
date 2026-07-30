---
title: "System::Xml::XmlReader::Create 方法"
linktitle: "Create"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::Create 方法。使用指定的流并采用默认设置在 C++ 中创建一个新的 XmlReader 实例。"
type: docs
weight: 7700
url: /zh/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


使用指定的流并采用默认设置创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | 包含 XML 数据的流。[XmlReader](../) 会扫描流的前几个字节以查找字节顺序标记或其他编码标识。确定编码后，使用该编码继续读取流，并将处理继续解析为 (Unicode) 字符流。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


使用指定的流和设置创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | 包含 XML 数据的流。[XmlReader](../) 会扫描流的前几个字节以查找字节顺序标记或其他编码标识。确定编码后，使用该编码继续读取流，并将处理继续解析为 (Unicode) 字符流。 |
| settings | const SharedPtr\<XmlReaderSettings\>\& | 新 [XmlReader](../) 实例的设置。该值可以为 **nullptr**。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


使用指定的流、设置和用于解析的上下文信息创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | 包含 XML 数据的流。[XmlReader](../) 会扫描流的前几个字节以查找字节顺序标记或其他编码标识。确定编码后，使用该编码继续读取流，并将处理继续解析为 (Unicode) 字符流。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新 [XmlReader](../) 实例的设置。该值可以为 **nullptr**。 |
| inputContext | const SharedPtr\<XmlParserContext\>\& | 解析 XML 片段所需的上下文信息。上下文信息可以包括要使用的 [XmlNameTable](../../xmlnametable/)、编码、命名空间范围、当前的 **xml:lang** 和 **xml:space** 范围、基 URI 和文档类型定义。该值可以为 **nullptr**。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


使用指定的流、基 URI 和设置创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | 包含 XML 数据的流。[XmlReader](../) 会扫描流的前几个字节以查找字节顺序标记或其他编码标识。确定编码后，使用该编码继续读取流，并将处理继续解析为 (Unicode) 字符流。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新 [XmlReader](../) 实例的设置。该值可以为 **nullptr**。 |
| baseUri | const String\& | 正在读取的实体或文档的基 URI。该值可以为 **nullptr**。**[Security](../../../system.security/) Note** 基 URI 用于解析 XML 文档的相对 URI。请勿使用来自不受信任来源的基 URI。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


使用指定的文本读取器创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<IO::TextReader\>\& | 用于读取 XML 数据的文本读取器。文本读取器返回 Unicode 字符流，因此 XML 声明中指定的编码不会被 XML 读取器用于解码数据流。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


使用指定的文本读取器和设置创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<IO::TextReader\>\& | 用于读取 XML 数据的文本读取器。文本读取器返回 Unicode 字符流，因此 XML 声明中指定的编码不会被 XML 读取器用于解码数据流。 |
| settings | const SharedPtr\<XmlReaderSettings\>\& | 新 [XmlReader](../) 的设置。该值可以为 **nullptr**。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


使用指定的文本读取器、设置和用于解析的上下文信息创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<IO::TextReader\>\& | 用于读取 XML 数据的文本读取器。文本读取器返回 Unicode 字符流，因此 XML 声明中指定的编码不会被 XML 读取器用于解码数据流。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新 [XmlReader](../) 实例的设置。该值可以为 **nullptr**。 |
| inputContext | const SharedPtr\<XmlParserContext\>\& | 解析 XML 片段所需的上下文信息。上下文信息可以包括要使用的 [XmlNameTable](../../xmlnametable/)、编码、命名空间范围、当前的 **xml:lang** 和 **xml:space** 范围、基 URI 和文档类型定义。该值可以为 **nullptr**。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


使用指定的文本读取器、设置和基 URI 创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | 用于读取 XML 数据的文本读取器。文本读取器返回 Unicode 字符流，因此 XML 声明中指定的编码不会被 [XmlReader](../) 用于解码数据流。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新 [XmlReader](../) 实例的设置。该值可以为 **nullptr**。 |
| baseUri | const String\& | 正在读取的实体或文档的基 URI。该值可以为 **nullptr**。**[Security](../../../system.security/) Note** 基 URI 用于解析 XML 文档的相对 URI。请勿使用来自不受信任来源的基 URI。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


使用指定的 XML 读取器和设置创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 读取器 | const SharedPtr\<XmlReader\>\& | 您想用作底层 XML 读取器的对象。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新 [XmlReader](../) 实例的设置。[XmlReaderSettings](../../xmlreadersettings/) 对象的符合级别必须与底层读取器的符合级别匹配，或者必须设置为 [ConformanceLevel::Auto](../../conformancelevel/)。 |

### ReturnValue

包装在指定的 [XmlReader](../) 对象周围的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&) method


使用指定的 URI 创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputUri | const String\& | 包含 XML 数据的文件的 URI。[XmlUrlResolver](../../xmlurlresolver/) 类用于将路径转换为规范的数据表示。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


使用指定的 URI 和设置创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputUri | const String\& | 包含 XML 数据的文件的 URI。[XmlReaderSettings](../../xmlreadersettings/) 对象上的 [XmlResolver](../../xmlresolver/) 用于将路径转换为规范的数据表示。如果 XmlReaderSettings::get_XmlResolver 的值为 **nullptr**，则使用新的 [XmlUrlResolver](../../xmlurlresolver/) 对象。 |
| settings | const SharedPtr\<XmlReaderSettings\>\& | 新 [XmlReader](../) 实例的设置。该值可以为 **nullptr**。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


使用指定的 URI、设置和用于解析的上下文信息创建一个新的 [XmlReader](../) 实例。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputUri | const String\& | 包含 XML 数据的文件的 URI。[XmlReaderSettings](../../xmlreadersettings/) 对象上的 [XmlResolver](../../xmlresolver/) 用于将路径转换为规范的数据表示。如果 XmlReaderSettings::get_XmlResolver 的值为 **nullptr**，则使用新的 [XmlUrlResolver](../../xmlurlresolver/) 对象。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新 [XmlReader](../) 实例的设置。该值可以为 **nullptr**。 |
| inputContext | const SharedPtr\<XmlParserContext\>\& | 解析 XML 片段所需的上下文信息。上下文信息可以包括要使用的 [XmlNameTable](../../xmlnametable/)、编码、命名空间范围、当前的 **xml:lang** 和 **xml:space** 范围、基 URI 和文档类型定义。该值可以为 **nullptr**。 |

### ReturnValue

用于读取流中 XML 数据的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
