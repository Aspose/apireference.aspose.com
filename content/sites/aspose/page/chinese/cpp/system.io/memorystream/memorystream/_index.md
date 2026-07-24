---
title: "System::IO::MemoryStream::MemoryStream 构造函数"
linktitle: "MemoryStream"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::MemoryStream::MemoryStream 构造函数。构造一个 MemoryStream 类的新实例，初始容量为 0（C++）。"
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
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


构造一个 [MemoryStream](../) 类的新实例，该实例表示连接到指定内存缓冲区的内存流。一个参数指定流是否可写。

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | 一个字节数组，用作内存缓冲区，创建的对象所表示的流将基于该缓冲区 |
| 可写 | bool | 指定流是否应可写 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


构造一个 [MemoryStream](../) 类的新实例，该实例表示连接到指定内存缓冲区的一个段的内存流，段从指定索引开始并包含指定数量的元素。参数指定流是否可写以及是否可以调用 GetBytes() 方法。

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | 一个字节数组，其一段将用作内存缓冲区，创建的对象所表示的流将基于该缓冲区 |
| 索引 | int | 在 **content** 中段开始的元素的 0 基索引 |
| count | int | 段中包含的 **content** 元素数量 |
| 可写 | bool | 指定流是否应可写 |
| publiclyVisible | bool | 指定是否应将底层内存缓冲区提供给 GetByte() 方法的调用者 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


构造一个 [MemoryStream](../) 类的新实例，该实例表示基于指定大小的内存缓冲区的流。

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| capacity_ | int | 正在创建的对象所表示的流关联的内存缓冲区的大小（字节） |

## 另见

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
