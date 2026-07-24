---
title: "System::Xml::NameTable::Get method"
linktitle: "获取"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::NameTable::Get method. 在 C++ 中，返回包含给定数组中指定字符范围的相同字符的原子化字符串。"
type: docs
weight: 300
url: /zh/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


返回原子化字符串，其中包含给定数组中指定字符范围的相同字符。

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 键 | const ArrayPtr\<char16_t\>\& | 包含要查找的名称的字符数组。 |
| 开始 | int32_t | 数组中的零基索引，指定名称的第一个字符。 |
| len | int32_t | 名称中的字符数。 |

### ReturnValue

如果字符串尚未被原子化，则返回原子化字符串或 **nullptr**。如果 **len** 为零，则返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


返回具有指定值的原子化字符串。

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 要查找的名称。 |

### ReturnValue

如果字符串尚未被原子化，则返回原子化字符串对象或 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
