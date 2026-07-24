---
title: "System::IO::Stream::WriteAsync 메서드"
linktitle: "WriteAsync"
second_title: "C++용 Aspose.Page"
description: "System::IO::Stream::WriteAsync 메서드. 현재 스트림에 바이트 시퀀스를 비동기적으로 쓰고, 이 스트림 내에서 쓰여진 바이트 수만큼 현재 위치를 이동시키며, C++에서 취소 요청을 모니터링합니다."
type: docs
weight: 2700
url: /ko/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


현재 스트림에 바이트 시퀀스를 비동기적으로 쓰고, 기록된 바이트 수만큼 이 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 쓰기 위한 바이트를 포함하는 배열. |
| offset | int32_t | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스. |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수. |

### ReturnValue

비동기 쓰기 작업을 나타내는 작업.

## 또 보기

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


현재 스트림에 바이트 시퀀스를 비동기적으로 쓰고, 기록된 바이트 수만큼 이 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 쓰기 위한 바이트를 포함하는 배열. |
| offset | int32_t | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스. |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수. |
| cancellationToken | const Threading::CancellationToken\& | 취소 요청을 모니터링하기 위한 토큰. |

### ReturnValue

비동기 쓰기 작업을 나타내는 작업.

## 또 보기

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
