---
title: "System::Char::IsSurrogate 方法"
linktitle: "IsSurrogate"
second_title: "Aspose.Font 适用于 C++"
description: "System::Char::IsSurrogate 方法。确定指定字符是否在 C++ 中是 UTF-16 代理代码单元。"
type: docs
weight: 1600
url: /zh/cpp/system/char/issurrogate/
---
## Char::IsSurrogate(char_t) method


确定指定字符是否为 UTF-16 代理代码单元。

```cpp
static bool System::Char::IsSurrogate(char_t c)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| c | char_t | 一个字符 |

### ReturnValue

如果指定字符是 UTF-16 代理代码单元，则为 True；否则为 False

## 另见

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsSurrogate(const String\&, int) method


确定指定字符串中指定索引处的字符是否为 UTF-16 代理代码单元。

```cpp
static bool System::Char::IsSurrogate(const String &s, int index)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 字符串 |
| 索引 | int | 指定字符串中字符的索引 |

### ReturnValue

如果指定索引处的字符是 UTF-16 代理代码单元，则为 True；否则为 False

## 另见

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
