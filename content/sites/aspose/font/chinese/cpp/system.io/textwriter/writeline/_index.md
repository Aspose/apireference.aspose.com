---
title: "System::IO::TextWriter::WriteLine 方法"
linktitle: "WriteLine"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::TextWriter::WriteLine 方法。向流写入行终止符字符（C++）。"
type: docs
weight: 1000
url: /zh/cpp/system.io/textwriter/writeline/
---
## TextWriter::WriteLine() method


将换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine()
```

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(bool) method


将指定布尔值的字符串表示以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(bool value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | bool | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(char_t) method


将指定字符以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(char_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | char_t | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


将指定数组中的所有字符写入流，并在其后附加换行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | 包含要写入字符的数组 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


将指定字符数组中指定的 UTF-16 子范围字符写入流，并在其后附加换行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | 包含要写入字符的数组 |
| 索引 | int32_t | 在 **buffer** 中子范围写入开始位置的基于 0 的索引 |
| count | int32_t | 要写入的子范围中的字符数；-1 表示子范围在 **buffer** 数组结束处结束 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(const char_t *) method


将指定的 C 字符串写入流，并在其后附加换行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const char_t *value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const char_t * | 要写入的 C 字符串 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(const SharedPtr\<Object\>\&) method


将指定对象的字符串表示以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(const SharedPtr<Object> &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const SharedPtr\<Object\>\& | 要写入的对象 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(const String\&, const TArgs\&...) method


将指定的值按指定格式格式化后写入流，并在其后附加字符。

```cpp
template<class...> void System::IO::TextWriter::WriteLine(const String &format, const TArgs &... args)
```


| 参数 | 描述 |
| --- | --- |
| TArgs | 要写入的值的类型列表 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | const String\& | 字符串格式 |
| args | const TArgs\&... | 要写入的值 |

## 另见

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(const String\&) method


将指定的字符串以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(const String &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 要写入的字符串 |

## 另见

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(const TypeInfo\&) method


将指定的 [TypeInfo](../../../system/typeinfo/) 对象的字符串表示写入流，并在其后追加行终止符字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const TypeInfo &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const TypeInfo\& | 要写入的对象 |

## 另见

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(Decimal) method


将指定的 [Decimal](../../../system/decimal/) 对象的字符串表示写入流，并在其后添加换行符。

```cpp
virtual void System::IO::TextWriter::WriteLine(Decimal value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | Decimal | 要写入的对象 |

## 另见

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(double) method


将指定的双精度浮点值的字符串表示以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(double value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(float) method


将指定的单精度浮点值的字符串表示以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(float value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(int) method


将指定的 32 位整数值的字符串表示以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(int value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(int64_t) method


将指定的 64 位整数值的字符串表示以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(int64_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int64_t | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(uint32_t) method


将指定的无符号 32 位整数值的字符串表示以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(uint32_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | uint32_t | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextWriter::WriteLine(uint64_t) method


将指定的无符号 64 位整数值的字符串表示以及换行终止符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(uint64_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | uint64_t | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
