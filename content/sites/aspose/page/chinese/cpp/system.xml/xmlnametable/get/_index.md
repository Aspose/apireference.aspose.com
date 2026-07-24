---
title: "System::Xml::XmlNameTable::Get 方法"
linktitle: "获取"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNameTable::Get 方法。当在派生类中重写时，获取包含给定数组中指定字符范围的相同字符的原子化字符串（C++）。"
type: docs
weight: 200
url: /zh/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


在派生类中重写时，获取包含给定数组中指定字符范围的相同字符的原子化字符串。

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | 包含要查找的名称的字符数组。 |
| offset | int32_t | 数组中的零基索引，指定名称的第一个字符。 |
| length | int32_t | 名称中的字符数。 |

### ReturnValue

原子化字符串，若字符串尚未被原子化则返回 **nullptr**。如果 **length** 为零，则返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


在派生类中重写时，获取与指定字符串具有相同值的原子化字符串。

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const String\& | 要查找的名称。 |

### ReturnValue

已原子化的字符串，或者如果字符串尚未被原子化则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
