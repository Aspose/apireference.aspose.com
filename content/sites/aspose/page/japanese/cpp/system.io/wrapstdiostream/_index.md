---
title: "System::IO::WrapSTDIOStream メソッド"
linktitle: "WrapSTDIOStream"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::WrapSTDIOStream メソッド。C++ における std::basic_iostream ライクなストリームのラッパー関数です。"
type: docs
weight: 5400
url: /ja/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


std::basic_iostream-like ストリーム用のラッパー関数です。

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | std::basic_iostream\<char_type, traits_type\>\& | std::basic_iostream-like ストリーム |
| mode | STDIOStreamWrappingMode | ラッピングモード |
| pref_pos | STDIOStreamPositionPreference | 読み取り位置と書き込み位置が異なる場合に優先される位置 |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## 参照

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


std::basic_istream-like ストリーム用のラッパー関数です。

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | std::basic_istream\<char_type, traits_type\>\& | std::basic_istream-like ストリーム |
| mode | STDIOStreamWrappingMode | ラッピングモード |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## 参照

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


std::basic_ostream-like ストリーム用のラッパー関数です。

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | std::basic_ostream\<char_type, traits_type\>\& | std::basic_ostream-like ストリーム |
| mode | STDIOStreamWrappingMode | ラッピングモード |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## 参照

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
