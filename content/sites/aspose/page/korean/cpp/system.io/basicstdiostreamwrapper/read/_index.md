---
title: "System::IO::BasicSTDIOStreamWrapper::Read 메서드"
linktitle: "읽기"
second_title: "C++용 Aspose.Page"
description: "System::IO::BasicSTDIOStreamWrapper::Read 메서드. 래핑 모드가 바이너리인 경우 스트림에서 지정된 바이트 수를 읽고, 그렇지 않으면 지정된 문자 수를 읽어 uint8_t 형식으로 변환합니다. 읽은 결과를 C++에서 지정된 바이트 배열에 기록합니다."
type: docs
weight: 400
url: /ko/cpp/system.io/basicstdiostreamwrapper/read/
---
## BasicSTDIOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


래핑 모드가 바이너리인 경우 스트림에서 지정된 바이트 수를 읽고, 그렇지 않으면 지정된 문자 수를 읽어 uint8_t 타입으로 변환합니다. 읽은 결과를 지정된 바이트 배열에 씁니다.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 읽은 바이트를 쓸 바이트 배열 |
| offset | int32_t | **buffer** 내에서 쓰기를 시작하는 0 기반 위치 |
| count | int32_t | 읽을 바이트 수 |

### ReturnValue

읽은 바이트 또는 문자 수

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 읽은 바이트를 쓸 바이트 배열 뷰 |
| offset | int32_t | **buffer** 내에서 쓰기를 시작하는 0 기반 위치 |
| count | int32_t | 읽을 바이트 수 |

### ReturnValue

읽은 바이트 수

## 또 보기

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
