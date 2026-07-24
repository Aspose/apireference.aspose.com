---
title: "System::Xml::Schema::XmlSchema::Read 方法"
linktitle: "读取"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchema::Read 方法。读取提供的流中的 XML Schema（C++）。"
type: docs
weight: 2900
url: /zh/cpp/system.xml.schema/xmlschema/read/
---
## XmlSchema::Read(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) method


从提供的流中读取 XML [Schema](../../)。

```cpp
static SharedPtr<XmlSchema> System::Xml::Schema::XmlSchema::Read(const SharedPtr<IO::Stream> &stream, ValidationEventHandler validationEventHandler)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<IO::Stream\>\& | 提供的数据流。 |
| validationEventHandler | ValidationEventHandler | 接收有关 XML [Schema](../../) 语法错误信息的验证事件处理程序。 |

### ReturnValue

表示 XML [Schema](../../) 的 [XmlSchema](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../)
* Class [Stream](../../../system.io/stream/)
* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Read(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) method


从提供的 [IO::TextReader](../../../system.io/textreader/) 读取 XML [Schema](../../)。

```cpp
static SharedPtr<XmlSchema> System::Xml::Schema::XmlSchema::Read(const SharedPtr<IO::TextReader> &reader, ValidationEventHandler validationEventHandler)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| reader | const SharedPtr\<IO::TextReader\>\& | 包含要读取的 XML [Schema](../../) 的 [IO::TextReader](../../../system.io/textreader/)。 |
| validationEventHandler | ValidationEventHandler | 接收有关 XML [Schema](../../) 语法错误信息的验证事件处理程序。 |

### ReturnValue

表示 XML [Schema](../../) 的 [XmlSchema](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../)
* Class [TextReader](../../../system.io/textreader/)
* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Read(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) method


从提供的 [XmlReader](../../../system.xml/xmlreader/) 读取 XML [Schema](../../)。

```cpp
static SharedPtr<XmlSchema> System::Xml::Schema::XmlSchema::Read(const SharedPtr<XmlReader> &reader, ValidationEventHandler validationEventHandler)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | 包含要读取的 XML [Schema](../../) 的 [XmlReader](../../../system.xml/xmlreader/)。 |
| validationEventHandler | ValidationEventHandler | 接收有关 XML [Schema](../../) 语法错误信息的验证事件处理程序。 |

### ReturnValue

表示 XML [Schema](../../) 的 [XmlSchema](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
