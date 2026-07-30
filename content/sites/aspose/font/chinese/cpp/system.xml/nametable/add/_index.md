---
title: "System::Xml::NameTable::Add 方法"
linktitle: "Add"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::NameTable::Add 方法。 将指定的字符串原子化并将其添加到 NameTable（C++）。"
type: docs
weight: 200
url: /zh/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


将指定的字符串原子化并将其添加到 [NameTable](../)。

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | const ArrayPtr\<char16_t\>\& | 包含要添加的字符串的字符数组。 |
| start | int32_t | 数组中指定字符串第一个字符的零基索引。 |
| len | int32_t | 字符串中的字符数。 |

### ReturnValue

如果 [NameTable](../) 中已存在，则返回原子化的字符串或已有的字符串。如果 **len** 为零，则返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Add(const String\&) method


将指定的字符串原子化并将其添加到 [NameTable](../)。

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | const String\& | 要添加的字符串。 |

### ReturnValue

如果已存在于 [NameTable](../) 中，则返回原子化的字符串或已有的字符串。

## 另见

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
