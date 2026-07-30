---
title: "System::IO::StreamWriter::StreamWriter 构造函数"
linktitle: "StreamWriter"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::StreamWriter::StreamWriter 构造函数。构造一个 StreamWriter 对象实例，该对象使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，将字符写入指定的底层流（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


构造一个 [StreamWriter](../) 对象实例，该对象使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，将字符写入指定的底层流。

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<Stream\>\& | 用于写入字符的底层流 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


构造一个 [StreamWriter](../) 对象实例，该对象使用指定的编码并使用默认大小为 1024 字节的缓冲区，将字符写入指定的底层流。

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<Stream\>\& | 用于写入字符的底层流 |
| encoding | const EncodingPtr\& | 要使用的编码 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


构造一个 [StreamWriter](../) 对象实例，该对象使用指定的编码和指定大小的缓冲区，将字符写入指定的底层流。一个参数指定在处置 [StreamWriter](../) 对象时是否应关闭底层流。

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<Stream\>\& | 用于写入字符的底层流 |
| encoding | const EncodingPtr\& | 要使用的编码 |
| buffer_size | int | 缓冲区的最小大小（字节） |
| leave_open | bool | 指定在当前 [StreamWriter](../) 对象被释放后，底层流是否应保持打开 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


构造一个 [StreamWriter](../) 对象实例，该对象使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区将字符写入指定文件。

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要写入字符的文件路径 |

## 另见

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


构造一个 [StreamWriter](../) 对象实例，该对象使用指定的编码和缓冲区大小将字符写入指定文件。一个参数指定是将数据追加到文件还是覆盖文件。

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要写入字符的文件路径 |
| 追加 | bool | 指定是将数据追加到指定文件（true）还是覆盖文件（false） |
| encoding | const EncodingPtr\& | 要使用的编码 |
| buffer_size | int | 要使用的缓冲区大小 |

## 另见

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


构造一个 [StreamWriter](../) 对象实例，该对象使用指定的编码和默认大小为 1024 字节的缓冲区将字符写入指定文件。一个参数指定是将数据追加到文件还是覆盖文件。

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要写入字符的文件路径 |
| 追加 | bool | 指定是将数据追加到指定文件（true）还是覆盖文件（false） |
| encoding | const EncodingPtr\& | 要使用的编码 |

## 另见

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
