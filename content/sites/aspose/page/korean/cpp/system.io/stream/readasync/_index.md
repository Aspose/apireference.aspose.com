---
title: "System::IO::Stream::ReadAsync 메서드"
linktitle: "ReadAsync"
second_title: "C++용 Aspose.Page"
description: "System::IO::Stream::ReadAsync 메서드. 현재 스트림에서 바이트 시퀀스를 비동기적으로 읽고, 읽은 바이트 수만큼 스트림 내 위치를 이동하며, C++에서 취소 요청을 모니터링합니다."
type: docs
weight: 1900
url: /ko/cpp/system.io/stream/readasync/
---
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


현재 스트림에서 바이트 시퀀스를 비동기적으로 읽고, 읽은 바이트 수만큼 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다.

```cpp
RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 읽은 바이트를 기록할 바이트 배열. |
| offset | int32_t | **buffer**에서 쓰기를 시작할 0 기반 위치. |
| count | int32_t | 읽을 바이트 수입니다. |

### ReturnValue

비동기 읽기 작업을 나타내는 작업입니다. TResult 매개변수의 값에는 버퍼에 읽힌 총 바이트 수가 포함됩니다. 현재 사용 가능한 바이트 수가 요청된 수보다 적으면 결과 값은 요청된 바이트 수보다 작을 수 있으며, 스트림 끝에 도달한 경우 0(영)이 될 수 있습니다.

## 또 보기

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


현재 스트림에서 바이트 시퀀스를 비동기적으로 읽고, 읽은 바이트 수만큼 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다.

```cpp
virtual RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 읽은 바이트를 기록할 바이트 배열. |
| offset | int32_t | **buffer**에서 쓰기를 시작할 0 기반 위치. |
| count | int32_t | 읽을 바이트 수입니다. |
| cancellationToken | const Threading::CancellationToken\& | 취소 요청을 모니터링하기 위한 토큰. |

### ReturnValue

비동기 읽기 작업을 나타내는 작업입니다. TResult 매개변수의 값에는 버퍼에 읽힌 총 바이트 수가 포함됩니다. 현재 사용 가능한 바이트 수가 요청된 수보다 적으면 결과 값은 요청된 바이트 수보다 작을 수 있으며, 스트림 끝에 도달한 경우 0(영)이 될 수 있습니다.

## 또 보기

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
