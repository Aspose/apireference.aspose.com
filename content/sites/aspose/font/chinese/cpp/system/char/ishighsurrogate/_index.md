---
title: "System::Char::IsHighSurrogate 方法"
linktitle: "IsHighSurrogate"
second_title: "Aspose.Font 适用于 C++"
description: "System::Char::IsHighSurrogate 方法。确定指定字符是否为 C++ 中的高位代理项。"
type: docs
weight: 800
url: /zh/cpp/system/char/ishighsurrogate/
---
## Char::IsHighSurrogate(char_t) method


确定指定字符是否为高代理。

```cpp
static bool System::Char::IsHighSurrogate(char_t c)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| c | char_t | 要测试的字符 |

### ReturnValue

如果指定字符是高位代理项，则为 true；否则为 false

## 另见

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsHighSurrogate(const char_t *, int) method


确定指定字符缓冲区中指定索引处的字符是否为高代理。

```cpp
static bool System::Char::IsHighSurrogate(const char_t *str, int idx)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const char_t * | 指向字符缓冲区起始位置的指针 |
| idx | int | 指定缓冲区中要测试的字符的零基索引 |

### ReturnValue

如果指定索引处的字符是高位代理项，则为 true；否则为 false

## 另见

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsHighSurrogate(const String\&, int) method


确定指定字符串中指定索引处的字符是否为 UTF-16 高代理代码单元。

```cpp
static bool System::Char::IsHighSurrogate(const String &s, int index)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 字符串 |
| 索引 | int | 要测试的字符在指定字符串中的索引 |

### ReturnValue

如果指定索引处的字符是 UTF-16 高代理项代码单元，则为 true，否则为 false

## 另见

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
