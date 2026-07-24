---
title: "System::IO::BinaryWriter::Write 方法"
linktitle: "Write"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::BinaryWriter::Write 方法。 如果值为 ''true'' 则写入值为 0 的单字节，如果值为 ''false'' 则写入值为 1 的单字节到输出流（C++）。"
type: docs
weight: 800
url: /zh/cpp/system.io/binarywriter/write/
---
## BinaryWriter::Write(bool) method


如果 **value** 为 'true'，则写入值为 0 的单字节；如果 **value** 为 'false'，则写入值为 1 的单字节到输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(bool value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | bool | 指定写入输出流的字节值的布尔值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(char16_t) method


将指定的 16 位宽字符值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(char16_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | char16_t | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<char_t\>\&, int, int) method


将指定字符数组中指定的 UTF-16 字符子范围写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<char_t> &buffer, int index=0, int count=-1)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<char_t\>\& | 包含要写入字符的数组 |
| 索引 | int | 在 **buffer** 中子范围写入开始的基于 0 的索引 |
| count | int | 要写入的子范围中的字符数；-1 表示子范围在 **buffer** 数组结束处结束 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<uint8_t\>\&, int, int) method


将指定字节数组中指定的字节子范围写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<uint8_t> &buffer, int index=0, int count=-1)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组 |
| 索引 | int | 在 **buffer** 中子范围写入开始的基于 0 的索引 |
| count | int | 要写入的子范围中的元素数量；-1 表示子范围在 **buffer** 数组结束的位置结束 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const char_t *) method


将当前编码下的长度前缀字符串写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(const char_t *value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const char_t * | 要写入的 C 字符串 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const Decimal\&) method


将指定的 [Decimal](../../../system/decimal/) 值的字节表示写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(const Decimal &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Decimal\& | 要写入的值 |

## 另见

* Class [Decimal](../../../system/decimal/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const String\&) method


将当前编码下的长度前缀字符串写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(const String &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 要写入的字符串 |

## 另见

* Class [String](../../../system/string/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(double) method


将指定的双精度浮点值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(double value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | double | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(float) method


将指定的单精度浮点值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(float value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | 单精度浮点数 | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int) method


将指定的 32 位整数值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(int value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int16_t) method


将指定的 16 位整数值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(int16_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int16_t | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int64_t) method


将指定的 64 位整数值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(int64_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int64_t | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint16_t) method


将指定的无符号 16 位整数值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(uint16_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint16_t | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint32_t) method


将指定的无符号 32 位整数值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(uint32_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint32_t | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint64_t) method


将指定的无符号 64 位整数值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(uint64_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint64_t | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint8_t) method


将指定的无符号 8 位整数值写入输出流。

```cpp
virtual void System::IO::BinaryWriter::Write(uint8_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint8_t | 要写入的值 |

## 另见

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
