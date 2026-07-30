---
title: "System::Xml::XmlWriter::WriteRaw 方法"
linktitle: "WriteRaw"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriter::WriteRaw 方法。当在派生类中重写时，在 C++ 中从字符缓冲区手动写入原始标记。"
type: docs
weight: 2900
url: /zh/cpp/system.xml/xmlwriter/writeraw/
---
## XmlWriter::WriteRaw(ArrayPtr\<char16_t\>, int32_t, int32_t) method


在派生类中重写时，从字符缓冲区手动写入原始标记。

```cpp
virtual void System::Xml::XmlWriter::WriteRaw(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArrayPtr\<char16_t\> | 包含要写入文本的字符数组。 |
| 索引 | int32_t | 缓冲区中指示要写入文本起始位置的索引。 |
| count | int32_t | 要写入的字符数。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteRaw(const String\&) method


在派生类中重写时，从字符串手动写入原始标记。

```cpp
virtual void System::Xml::XmlWriter::WriteRaw(const String &data)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| data | const String\& | [String](../../../system/string/) 包含要写入的文本。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
