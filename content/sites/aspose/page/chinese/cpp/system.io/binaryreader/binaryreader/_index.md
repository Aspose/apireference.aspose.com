---
title: "System::IO::BinaryReader::BinaryReader 构造函数"
linktitle: "BinaryReader"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::BinaryReader::BinaryReader 构造函数。构造一个 BinaryReader 类的实例，该实例使用 UTF-8 编码从指定流中读取数据（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.io/binaryreader/binaryreader/
---
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&) constructor


构造一个使用 UTF-8 编码从指定流中读取数据的 [BinaryReader](../) 类实例。

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<Stream\>\& | 输入流 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


构造一个使用指定编码从指定流中读取数据的 [BinaryReader](../) 类实例。

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<Stream\>\& | 输入流 |
| encoding | const SharedPtr\<Text::Encoding\>\& | 要使用的编码 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) constructor


构造一个使用指定编码从指定流中读取数据的 [BinaryReader](../) 类实例。

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input, const SharedPtr<Text::Encoding> &encoding, bool leaveOpen)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<Stream\>\& | 输入流 |
| encoding | const SharedPtr\<Text::Encoding\>\& | 要使用的编码 |
| leaveOpen | bool | 指定在当前对象被释放后，流 **input** 是否应保持打开状态（true）或关闭（false） |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
