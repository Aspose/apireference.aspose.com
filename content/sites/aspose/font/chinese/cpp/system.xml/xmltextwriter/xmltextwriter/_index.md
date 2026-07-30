---
title: "System::Xml::XmlTextWriter::XmlTextWriter 构造函数"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextWriter::XmlTextWriter 构造函数。 在 C++ 中使用指定的流和编码创建 XmlTextWriter 类的实例。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


使用指定的流和编码创建 [XmlTextWriter](../) 类的实例。

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | 要写入的流。 |
| encoding | const SharedPtr\<Text::Encoding\>\& | 要生成的编码。如果编码为 **nullptr**，则以 UTF-8 写出流，并且在 **ProcessingInstruction** 中省略 encoding 属性。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


使用指定的 TextWriter 创建 [XmlTextWriter](../) 类的实例。

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | 要写入的 TextWriter。假设该 TextWriter 已经设置为正确的编码。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


使用指定的文件创建 [XmlTextWriter](../) 类的实例。

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filename | const String\& | 要写入的文件名。如果文件已存在，则截断并用新内容覆盖。 |
| encoding | const SharedPtr\<Text::Encoding\>\& | 要生成的编码。如果编码为 **nullptr**，则以 UTF-8 写出文件，并且在 **ProcessingInstruction** 中省略 encoding 属性。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
