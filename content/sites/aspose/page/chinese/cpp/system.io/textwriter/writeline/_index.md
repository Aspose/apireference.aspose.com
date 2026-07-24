---
title: "System::IO::TextWriter::WriteLine 方法"
linktitle: "WriteLine"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::TextWriter::WriteLine 方法。向流写入行终止符字符，在 C++ 中。"
type: docs
weight: 1000
url: /zh/cpp/system.io/textwriter/writeline/
---
## TextWriter::WriteLine() method


将行终止符字符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine()
```

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(bool) method


将指定布尔值的字符串表示及其后随的行终止符字符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(bool value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | bool | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(char_t) method


将指定字符及其后随的行终止符字符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(char_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | char_t | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


将指定数组中的所有字符写入流，并在其后附加行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<char_t\>\& | 包含要写入字符的数组 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


将指定字符数组中指定的 UTF-16 字符子范围写入流，并在其后附加行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<char_t\>\& | 包含要写入字符的数组 |
| 索引 | int32_t | 在 **buffer** 中子范围写入开始的基于 0 的索引 |
| count | int32_t | 要写入的子范围中的字符数；-1 表示子范围在 **buffer** 数组结束处结束 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const char_t *) method


将指定的 C 字符串写入流，并在其后附加行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const char_t *value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const char_t * | 要写入的 C 字符串 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const SharedPtr\<Object\>\&) method


将指定对象的字符串表示及其后随的行终止符字符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(const SharedPtr<Object> &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const SharedPtr\<Object\>\& | 要写入的对象 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const String\&, const TArgs\&...) method


将指定的值按指定格式格式化后写入流，并在其后附加行终止字符。

```cpp
template<class...> void System::IO::TextWriter::WriteLine(const String &format, const TArgs &... args)
```


| Parameter | 描述 |
| --- | --- |
| TArgs | 要写入的值的类型列表 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 格式 | const String\& | 字符串格式 |
| args | const TArgs\&... | 要写入的值 |

## 另见

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const String\&) method


将指定的字符串写入流，并在其后附加行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const String &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 要写入的字符串 |

## 另见

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const TypeInfo\&) method


将指定的 [TypeInfo](../../../system/typeinfo/) 对象的字符串表示写入流，并在其后追加换行符。

```cpp
virtual void System::IO::TextWriter::WriteLine(const TypeInfo &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const TypeInfo\& | 要写入的对象 |

## 另见

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(Decimal) method


将指定的 [Decimal](../../../system/decimal/) 对象的字符串表示写入流，并在其后追加换行符。

```cpp
virtual void System::IO::TextWriter::WriteLine(Decimal value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | 十进制 | 要写入的对象 |

## 另见

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(double) method


将指定的双精度浮点值的字符串表示及其后随的行终止符字符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(double value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | double | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(float) method


将指定单精度浮点值的字符串表示写入流，并在其后附加行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(float value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | 单精度浮点数 | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int) method


将指定的 32 位整数值的字符串表示及其后随的行终止符字符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(int value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int64_t) method


将指定的 64 位整数值的字符串表示及其后随的行终止符字符写入流。

```cpp
virtual void System::IO::TextWriter::WriteLine(int64_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int64_t | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint32_t) method


将指定无符号 32 位整数值的字符串表示写入流，并在其后附加行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(uint32_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint32_t | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint64_t) method


将指定无符号 64 位整数值的字符串表示写入流，并在其后附加行终止字符。

```cpp
virtual void System::IO::TextWriter::WriteLine(uint64_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint64_t | 要写入的值 |

## 另见

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
