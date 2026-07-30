---
title: "System::IO::MemoryStream::MemoryStream 构造函数"
linktitle: "MemoryStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::MemoryStream::MemoryStream 构造函数。构造一个 MemoryStream 类的新实例，初始容量为 0（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


构造一个 [MemoryStream](../) 类的新实例，初始容量为 0。

```cpp
System::IO::MemoryStream::MemoryStream()
```

## 另见

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


构造一个 [MemoryStream](../) 类的新实例，该实例表示一个连接到指定内存缓冲区的内存流。一个参数指定流是否可写。

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 内容 | const ArrayPtr\<uint8_t\>\& | 用于作为内存缓冲区的字节数组，创建的对象所表示的流将基于该缓冲区 |
| 可写 | bool | 指定流是否应可写 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


构造一个 [MemoryStream](../) 类的新实例，该实例表示一个连接到指定内存缓冲区片段的内存流，片段从指定索引开始并包含指定数量的元素。参数指定流是否可写以及是否可以调用 GetBytes() 方法。

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 内容 | const ArrayPtr\<uint8_t\>\& | 一个字节数组，其片段将用作内存缓冲区，创建的对象所表示的流将基于该缓冲区 |
| 索引 | int | 在 **content** 中段开始的元素的 0 基索引 |
| count | int | 段中包含的 **content** 元素数量 |
| 可写 | bool | 指定流是否应可写 |
| publiclyVisible | bool | 指定底层内存缓冲区是否应对 GetByte() 方法的调用者可用 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


构造一个 [MemoryStream](../) 类的新实例，该实例表示一个基于指定大小内存缓冲区的流。

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| capacity_ | int | 与创建的对象所表示的流关联的内存缓冲区的字节大小 |

## 另见

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
