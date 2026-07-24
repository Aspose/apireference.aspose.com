---
title: "System::IO::FileStream::FlushAsync 메서드"
linktitle: "FlushAsync"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileStream::FlushAsync 메서드. 이 스트림의 모든 버퍼를 비동기적으로 비우고, 버퍼링된 데이터를 기본 장치에 기록하도록 하며, C++에서 취소 요청을 모니터링합니다."
type: docs
weight: 500
url: /ko/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


이 스트림에 대한 모든 버퍼를 비동기적으로 비우고, 버퍼링된 데이터를 기본 장치에 기록하며, 취소 요청을 모니터링합니다.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | 취소 요청을 모니터링하기 위한 토큰. |

### ReturnValue

비동기 플러시 작업을 나타내는 작업.

## 또 보기

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
