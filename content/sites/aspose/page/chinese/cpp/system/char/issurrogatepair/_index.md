---
title: "System::Char::IsSurrogatePair 方法"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page 适用于 C++"
description: "System::Char::IsSurrogatePair 方法。确定在 C++ 中的两个指定字符是否构成 UTF-16 代理对。"
type: docs
weight: 1700
url: /zh/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


确定两个指定字符是否构成 UTF-16 代理对。

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| highSurrogate | char_t | 用于测试是否为高位代理的字符 |
| lowSurrogate | char_t | 用于测试是否为低位代理的字符 |

### ReturnValue

如果指定字符构成代理对则返回 true；否则返回 false。

## 另见

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


确定指定字符缓冲区中连续的两个字符是否为代理对。

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 一个字符串 |
| 索引 | int | 指定缓冲区中字符序列开始测试的零基索引。 |

### ReturnValue

如果指定的字符是代理对，则为 True，否则 - false

## 另见

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
