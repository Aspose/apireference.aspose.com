---
title: "System::Xml::XmlWriter::Create 方法"
linktitle: "Create"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriter::Create 方法。使用指定的流在 C++ 中创建一个新的 XmlWriter 实例。"
type: docs
weight: 3700
url: /zh/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


使用指定的流创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | 您想写入的流。 [XmlWriter](../) 使用 XML 1.0 文本语法写入并追加到指定的流。 |

### ReturnValue

一个 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


使用流和 [XmlWriterSettings](../../xmlwritersettings/) 对象创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | 您想写入的流。 [XmlWriter](../) 使用 XML 1.0 文本语法写入并追加到指定的流。 |
| settings | SharedPtr\<XmlWriterSettings\> | 用于配置新 [XmlWriter](../) 实例的 [XmlWriterSettings](../../xmlwritersettings/) 对象。如果它是 **nullptr**，则使用具有默认设置的 [XmlWriterSettings](../../xmlwritersettings/) 。如果 [XmlWriter](../) 与 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 方法一起使用，您应该使用 XslCompiledTransform::get_OutputSettings 值来获取具有正确设置的 [XmlWriterSettings](../../xmlwritersettings/) 对象。这确保创建的 [XmlWriter](../) 对象具有正确的输出设置。 |

### ReturnValue

一个 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


使用指定的 TextWriter 创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | 您想写入的 TextWriter。 [XmlWriter](../) 使用 XML 1.0 文本语法写入并追加到指定的 TextWriter。 |

### ReturnValue

一个 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


使用 TextWriter 和 [XmlWriterSettings](../../xmlwritersettings/) 对象创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | 您想写入的 TextWriter。 [XmlWriter](../) 使用 XML 1.0 文本语法写入并追加到指定的 TextWriter。 |
| settings | SharedPtr\<XmlWriterSettings\> | 用于配置新 [XmlWriter](../) 实例的 [XmlWriterSettings](../../xmlwritersettings/) 对象。如果它是 **nullptr**，则使用具有默认设置的 [XmlWriterSettings](../../xmlwritersettings/) 。如果 [XmlWriter](../) 与 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 方法一起使用，您应该使用 XslCompiledTransform::get_OutputSettings 值来获取具有正确设置的 [XmlWriterSettings](../../xmlwritersettings/) 对象。这确保创建的 [XmlWriter](../) 对象具有正确的输出设置。 |

### ReturnValue

一个 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


使用指定的 [Text::StringBuilder](../../../system.text/stringbuilder/) 创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | 要写入的 [Text::StringBuilder](../../../system.text/stringbuilder/)。由 [XmlWriter](../) 写入的内容会追加到 [Text::StringBuilder](../../../system.text/stringbuilder/)。 |

### ReturnValue

一个 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


使用 [Text::StringBuilder](../../../system.text/stringbuilder/) 和 [XmlWriterSettings](../../xmlwritersettings/) 对象创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | 要写入的 [Text::StringBuilder](../../../system.text/stringbuilder/)。由 [XmlWriter](../) 写入的内容会追加到 [Text::StringBuilder](../../../system.text/stringbuilder/)。 |
| settings | SharedPtr\<XmlWriterSettings\> | 用于配置新 [XmlWriter](../) 实例的 [XmlWriterSettings](../../xmlwritersettings/) 对象。如果它是 **nullptr**，则使用具有默认设置的 [XmlWriterSettings](../../xmlwritersettings/) 。如果 [XmlWriter](../) 与 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 方法一起使用，您应该使用 XslCompiledTransform::get_OutputSettings 值来获取具有正确设置的 [XmlWriterSettings](../../xmlwritersettings/) 对象。这确保创建的 [XmlWriter](../) 对象具有正确的输出设置。 |

### ReturnValue

一个 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


使用指定的 [XmlWriter](../) 对象创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | 您想用作底层写入器的 [XmlWriter](../) 对象。 |

### ReturnValue

一个包装在指定的 [XmlWriter](../) 对象周围的 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


使用指定的 [XmlWriter](../) 和 [XmlWriterSettings](../../xmlwritersettings/) 对象创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | 您想用作底层写入器的 [XmlWriter](../) 对象。 |
| settings | SharedPtr\<XmlWriterSettings\> | 用于配置新 [XmlWriter](../) 实例的 [XmlWriterSettings](../../xmlwritersettings/) 对象。如果它是 **nullptr**，则使用具有默认设置的 [XmlWriterSettings](../../xmlwritersettings/) 。如果 [XmlWriter](../) 与 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 方法一起使用，您应该使用 XslCompiledTransform::get_OutputSettings 值来获取具有正确设置的 [XmlWriterSettings](../../xmlwritersettings/) 对象。这确保创建的 [XmlWriter](../) 对象具有正确的输出设置。 |

### ReturnValue

一个包装在指定的 [XmlWriter](../) 对象周围的 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&) method


使用指定的文件名创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outputFileName | const String\& | 您想写入的文件。 [XmlWriter](../) 在指定路径创建文件并以 XML 1.0 文本语法写入。 **outputFileName** 必须是文件系统路径。 |

### ReturnValue

一个 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


使用文件名和 [XmlWriterSettings](../../xmlwritersettings/) 对象创建一个新的 [XmlWriter](../) 实例。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outputFileName | const String\& | 您想写入的文件。 [XmlWriter](../) 在指定路径创建文件并以 XML 1.0 文本语法写入。 **outputFileName** 必须是文件系统路径。 |
| settings | SharedPtr\<XmlWriterSettings\> | 用于配置新 [XmlWriter](../) 实例的 [XmlWriterSettings](../../xmlwritersettings/) 对象。如果它是 **nullptr**，则使用具有默认设置的 [XmlWriterSettings](../../xmlwritersettings/) 。如果 [XmlWriter](../) 与 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 方法一起使用，您应该使用 XslCompiledTransform::get_OutputSettings 值来获取具有正确设置的 [XmlWriterSettings](../../xmlwritersettings/) 对象。这确保创建的 [XmlWriter](../) 对象具有正确的输出设置。 |

### ReturnValue

一个 [XmlWriter](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
