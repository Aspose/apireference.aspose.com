---
title: "System::Char::TryParse 方法"
linktitle: "TryParse"
second_title: "Aspose.Page 适用于 C++"
description: "System::Char::TryParse 方法。尝试将仅包含单个字符的字符串转换为 UTF-16 字符。仅当输入字符串非空且长度恰好为一个字符时，函数才会成功（在 C++ 中）。"
type: docs
weight: 2600
url: /zh/cpp/system/char/tryparse/
---
## Char::TryParse method


尝试将仅包含单个字符的字符串转换为 UTF-16 字符。仅当输入字符串非空且长度恰好为一个字符时，函数才会成功。

```cpp
static bool System::Char::TryParse(const System::String &s, char_t &result)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| s | const System::String\& | [String](../../string/) 用于转换 |
| 结果 | char_t\& | 如果转换成功，存放转换结果的输出变量。 |

### ReturnValue

如果转换成功则返回 true；否则返回 false。

## 另见

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
