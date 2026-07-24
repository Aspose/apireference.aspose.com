---
title: "System::IO::BasicSTDOStreamWrapper::Write 메서드"
linktitle: "Write"
second_title: "C++용 Aspose.Page"
description: "System::IO::BasicSTDOStreamWrapper::Write 메서드. 래핑 모드가 바이너리인 경우 지정된 바이트 배열의 지정된 하위 범위 바이트를 스트림에 기록하고, 그렇지 않으면 지정된 바이트 배열의 지정된 하위 범위 바이트를 char_type 형식으로 변환한 다음 결과를 C++에서 스트림에 기록합니다."
type: docs
weight: 700
url: /ko/cpp/system.io/basicstdostreamwrapper/write/
---
## BasicSTDOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


래핑 모드가 바이너리인 경우 지정된 바이트 배열의 지정된 하위 범위 바이트를 스트림에 기록하고, 그렇지 않으면 지정된 바이트 배열의 지정된 하위 범위 바이트를 [char_type](../char_type/) 형식으로 변환한 다음 결과를 스트림에 기록합니다.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 쓰기를 위한 바이트를 포함하는 배열 |
| offset | int32_t | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스 |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수 |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 쓰기 위한 바이트를 포함하는 배열 뷰 |
| offset | int32_t | 쓰기 하위 범위가 시작되는 **buffer** 내 요소의 0 기반 인덱스 |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수 |

## 또 보기

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
