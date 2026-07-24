---
title: "System::Xml::NameTable::Add method"
linktitle: "Add"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::NameTable::Add method. 在 C++ 中，将指定的字符串原子化并将其添加到 NameTable。"
type: docs
weight: 200
url: /zh/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


将指定的字符串原子化并将其添加到 [NameTable](../)。

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 键 | const ArrayPtr\<char16_t\>\& | 包含要添加的字符串的字符数组。 |
| 开始 | int32_t | 数组中指定字符串第一个字符的零基索引。 |
| len | int32_t | 字符串中的字符数。 |

### ReturnValue

如果在 [NameTable](../) 中已经存在，则返回原子化字符串或已有的字符串。如果 **len** 为零，则返回 [String::Empty](../../../system/string/empty/)。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Add(const String\&) method


将指定的字符串原子化并将其添加到 [NameTable](../)。

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 键 | const String\& | 要添加的字符串。 |

### ReturnValue

如果它已经存在于 [NameTable](../) 中，则返回原子化字符串或已有的字符串。

## 另见

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
