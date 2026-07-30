---
title: "System::IO::WrapSTDIOStream 方法"
linktitle: "WrapSTDIOStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::WrapSTDIOStream 方法。用于 C++ 中类似 std::basic_iostream 流的包装函数。"
type: docs
weight: 5400
url: /zh/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


用于类似 std::basic_iostream 流的包装函数。

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | std::basic_iostream\<char_type, traits_type\>\& | 类似 std::basic_iostream 的流 |
| mode | STDIOStreamWrappingMode | 包装模式 |
| pref_pos | STDIOStreamPositionPreference | 如果读取位置和写入位置不同，则首选的读取和写入位置。 |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## 另见

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


用于类似 std::basic_istream 流的包装函数。

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | std::basic_istream\<char_type, traits_type\>\& | 类似 std::basic_istream 的流 |
| mode | STDIOStreamWrappingMode | 包装模式 |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## 另见

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


用于类似 std::basic_ostream 流的包装函数。

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | std::basic_ostream\<char_type, traits_type\>\& | 类似 std::basic_ostream 的流 |
| mode | STDIOStreamWrappingMode | 包装模式 |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## 另见

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
