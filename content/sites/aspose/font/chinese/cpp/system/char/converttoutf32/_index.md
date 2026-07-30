---
title: "System::Char::ConvertToUtf32 方法"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Font 适用于 C++"
description: "System::Char::ConvertToUtf32 方法。将指定的 UTF-16 代理对转换为 C++ 中的 UTF-32 代码单元。"
type: docs
weight: 200
url: /zh/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


将指定的 UTF-16 代理对转换为 UTF-32 代码单元。

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| highSurrogate | char_t | 要转换的 UTF-16 代理对的高位代理 |
| lowSurrogate | char_t | 要转换的 UTF-16 代理对的低位代理 |

### ReturnValue

转换后得到的 UTF-32 代码单元

## 另见

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


将字符串中指定位置的 UTF-16 编码字符或代理对的值转换为 UTF-32 代码单元。

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 包含字符或代理对的字符串 |
| 索引 | int | 指定字符串中字符或代理对的索引位置 |

### ReturnValue

转换后得到的 UTF-32 代码单元

## 另见

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
