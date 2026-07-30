---
title: "System::Xml::XmlNameTable::Add 方法"
linktitle: "Add"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNameTable::Add 方法。当在派生类中重写时，对指定的字符串进行原子化并将其添加到 C++ 中的 XmlNameTable。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


当在派生类中重写时，对指定的字符串进行原子化并将其添加到 [XmlNameTable](../)。

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数组 | const ArrayPtr\<char16_t\>\& | 包含要添加的名称的字符数组。 |
| offset | int32_t | 数组中的零基索引，指定名称的第一个字符。 |
| 长度 | int32_t | 名称中的字符数。 |

### ReturnValue

如果已经存在，则返回新的已原子化字符串或现有的字符串。如果 length 为零，则返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNameTable::Add(const String\&) method


当在派生类中重写时，对指定的字符串进行原子化并将其添加到 [XmlNameTable](../)。

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数组 | const String\& | 要添加的名称。 |

### ReturnValue

如果已经存在，则返回新的已原子化字符串或现有的字符串。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
