---
title: "System::IO::WrapSTDIOStream 메서드"
linktitle: "WrapSTDIOStream"
second_title: "C++용 Aspose.Page"
description: "System::IO::WrapSTDIOStream 메서드. C++에서 std::basic_iostream과 유사한 스트림을 위한 래퍼 함수입니다."
type: docs
weight: 5400
url: /ko/cpp/system.io/wrapstdiostream/
---
## System::IO::WrapSTDIOStream(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) method


std::basic_iostream와 같은 스트림에 대한 래퍼 함수.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_iostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary, STDIOStreamPositionPreference pref_pos=STDIOStreamPositionPreference::Zero)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::basic_iostream\<char_type, traits_type\>\& | std::basic_iostream와 같은 스트림 |
| mode | STDIOStreamWrappingMode | 래핑 모드 |
| pref_pos | STDIOStreamPositionPreference | 읽기 및 쓰기 위치가 다를 경우 선호되는 위치 |

### ReturnValue

[BasicSTDIOStreamWrapper](../basicstdiostreamwrapper/) wrapper

## 또 보기

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Enum [STDIOStreamPositionPreference](../stdiostreampositionpreference/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


std::basic_istream와 같은 스트림에 대한 래퍼 함수.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_istream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::basic_istream\<char_type, traits_type\>\& | std::basic_istream와 같은 스트림 |
| mode | STDIOStreamWrappingMode | 래핑 모드 |

### ReturnValue

[BasicSTDIStreamWrapper](../basicstdistreamwrapper/) wrapper

## 또 보기

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
## System::IO::WrapSTDIOStream(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) method


std::basic_ostream와 같은 스트림에 대한 래퍼 함수.

```cpp
template<typename char_type,typename traits_type> SharedPtr<Stream> System::IO::WrapSTDIOStream(std::basic_ostream<char_type, traits_type> &stream, STDIOStreamWrappingMode mode=STDIOStreamWrappingMode::Binary)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::basic_ostream\<char_type, traits_type\>\& | std::basic_ostream와 같은 스트림 |
| mode | STDIOStreamWrappingMode | 래핑 모드 |

### ReturnValue

[BasicSTDOStreamWrapper](../basicstdostreamwrapper/) wrapper

## 또 보기

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [Stream](../stream/)
* Enum [STDIOStreamWrappingMode](../stdiostreamwrappingmode/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
