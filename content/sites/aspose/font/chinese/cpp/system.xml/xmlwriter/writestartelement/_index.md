---
title: "System::Xml::XmlWriter::WriteStartElement 方法"
linktitle: "WriteStartElement"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriter::WriteStartElement 方法。若在派生类中被重写，则使用指定的本地名称写出起始标签（在 C++ 中）。"
type: docs
weight: 3200
url: /zh/cpp/system.xml/xmlwriter/writestartelement/
---
## XmlWriter::WriteStartElement(const String\&) method


在派生类中重写时，写出具有指定本地名称的起始标签。

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | const String\& | 元素的本地名称。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&) method


在派生类中重写时，写入指定的起始标签并将其关联到给定的命名空间。

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName, const String &ns)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | const String\& | 元素的本地名称。 |
| ns | const String\& | 要与元素关联的命名空间 URI。如果此命名空间已经在作用域中并且已有关联的前缀，写入器会自动写出该前缀。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&, const String\&) method


在派生类中重写时，写入指定的起始标签并将其关联到给定的命名空间和前缀。

```cpp
virtual void System::Xml::XmlWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 前缀 | const String\& | 元素的命名空间前缀。 |
| localName | const String\& | 元素的本地名称。 |
| ns | const String\& | 要与元素关联的命名空间 URI。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
