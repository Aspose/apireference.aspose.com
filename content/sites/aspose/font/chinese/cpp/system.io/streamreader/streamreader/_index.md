---
title: "System::IO::StreamReader::StreamReader 构造函数"
linktitle: "StreamReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::StreamReader::StreamReader 构造函数。构造一个 StreamReader 对象实例，该对象使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<Stream\>\& | 要读取字符的底层流 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符。一个参数指定是否应启用字节顺序标记检测。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<Stream\>\& | 要读取字符的底层流 |
| detectEncodingFromByteOrderMarks | bool | 若为 True，则在流的开头查找字节顺序标记；否则为 false |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用指定的编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<Stream\>\& | 要读取字符的底层流 |
| encoding | const EncodingPtr\& | 要使用的编码 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用指定的编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符。一个参数指定是否应启用字节顺序标记检测。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<Stream\>\& | 要读取字符的底层流 |
| encoding | const EncodingPtr\& | 要使用的编码 |
| detectEncodingFromByteOrderMarks | bool | 若为 True，则在流的开头查找字节顺序标记；否则为 false |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用指定的编码并使用指定大小的缓冲区，从指定的底层流读取字符。一个参数指定是否应启用字节顺序标记检测。

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<Stream\>\& | 要读取字符的底层流 |
| encoding | const EncodingPtr\& | 要使用的编码 |
| detectEncodingFromByteOrderMarks | bool | 若为 True，则在流的开头查找字节顺序标记；否则为 false |
| bufferSize | int | 缓冲区的最小大小（字节） |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用 UTF-8 编码并使用默认大小为 4096 字节的缓冲区，从指定的文件读取字符。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const System::String\& | 要读取字符的文件路径 |

## 另见

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用 UTF-8 编码并使用默认大小为 4096 字节的缓冲区，从指定的文件读取字符。一个参数指定是否应启用字节顺序标记检测。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const System::String\& | 要读取字符的文件路径 |
| detectEncodingFromByteOrderMarks | bool | 若为 True，则在文件的开头查找字节顺序标记；否则为 false |

## 另见

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用指定的编码并使用默认大小为 4096 字节的缓冲区，从指定的文件读取字符。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const System::String\& | 要读取字符的文件路径 |
| encoding | const EncodingPtr\& | 要使用的编码 |

## 另见

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用指定的编码并使用默认大小为 4096 字节的缓冲区，从指定的底层流读取字符。一个参数指定是否应启用字节顺序标记检测。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const System::String\& | 要读取字符的文件路径 |
| encoding | const EncodingPtr\& | 要使用的编码 |
| detectEncodingFromByteOrderMarks | bool | 若为 True，则在文件的开头查找字节顺序标记；否则为 false |

## 另见

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


构造一个 [StreamReader](../) 对象实例，该对象使用指定的编码并使用指定大小的缓冲区，从指定的文件读取字符。一个参数指定是否应启用字节顺序标记检测。

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const System::String\& | 要读取字符的文件路径 |
| encoding | const EncodingPtr\& | 要使用的编码 |
| detectEncodingFromByteOrderMarks | bool | 若为 True，则在文件的开头查找字节顺序标记；否则为 false |
| bufferSize | int | 缓冲区的最小大小（字节） |

## 另见

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
