---
title: "System::IO::StreamWriter::Write 方法"
linktitle: "Write"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::StreamWriter::Write 方法。在 C++ 中将指定字符写入流。"
type: docs
weight: 1000
url: /zh/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


将指定字符写入流。

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | char_t | 要写入的字符 |

## 另见

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


将指定数组中的所有字符写入流。

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | 包含要写入字符的数组 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


将指定字符数组中指定的 UTF-16 子范围字符写入流。

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | 包含要写入字符的数组 |
| 索引 | int32_t | 在 **buffer** 中子范围写入开始位置的基于 0 的索引 |
| count | int32_t | 要写入的子范围中的字符数；-1 表示子范围在 **buffer** 数组结束处结束 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const char_t *) method


将指定的 C 字符串写入流。

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const char_t * | 要写入的 C 字符串 |

## 另见

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


将指定对象的字符串表示写入流。

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | 要写入的对象 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const String\&) method


将指定的字符串写入流。

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 要写入的字符串 |

## 另见

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


将指定对象的字符串表示写入流。

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | 要写入的对象 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
