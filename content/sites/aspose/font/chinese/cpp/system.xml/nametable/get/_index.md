---
title: "System::Xml::NameTable::Get 方法"
linktitle: "获取"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::NameTable::Get 方法。 返回包含给定数组中指定字符范围的相同字符的原子化字符串（C++）。"
type: docs
weight: 300
url: /zh/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


返回包含给定数组中指定字符范围相同字符的原子化字符串。

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | const ArrayPtr\<char16_t\>\& | 包含要查找的名称的字符数组。 |
| start | int32_t | 指定名称第一个字符的数组的零基索引。 |
| len | int32_t | 名称中的字符数。 |

### ReturnValue

如果字符串尚未原子化，则返回原子化的字符串或 **nullptr**。如果 **len** 为零，则返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Get(const String\&) method


返回具有指定值的原子化字符串。

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 要查找的名称。 |

### ReturnValue

如果字符串尚未原子化，则返回原子化的字符串对象或 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
