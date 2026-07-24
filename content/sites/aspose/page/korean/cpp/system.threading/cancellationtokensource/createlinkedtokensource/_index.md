---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource 메서드"
linktitle: "CreateLinkedTokenSource"
second_title: "C++용 Aspose.Page"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource 메서드. 제공된 토큰 중 하나가 취소될 때 취소되는 연결된 토큰 소스를 C++에서 생성합니다."
type: docs
weight: 600
url: /ko/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


제공된 토큰 중 하나가 취소될 때 취소되는 연결된 토큰 소스를 생성합니다.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| token1 | const CancellationToken\& | 모니터링할 첫 번째 취소 토큰입니다. |
| token2 | const CancellationToken\& | 모니터링할 두 번째 취소 토큰입니다. |

### ReturnValue

입력 토큰 중 하나가 취소될 때 취소되는 새로운 토큰 소스입니다.
## 비고



반환된 소스는 입력 토큰 중 하나가 이미 취소된 경우 즉시 취소됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
