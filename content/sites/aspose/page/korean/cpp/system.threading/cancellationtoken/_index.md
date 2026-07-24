---
title: "System::Threading::CancellationToken 클래스"
linktitle: "CancellationToken"
second_title: "C++용 Aspose.Page"
description: "System::Threading::CancellationToken 클래스. 작업이 취소되어야 함을 알리는 알림을 전파합니다. 이 클래스는 C++에서 스레드 간 협력적 취소 메커니즘을 제공하여, 한 스레드가 다른 스레드에 작업 취소를 알릴 수 있게 합니다."
type: docs
weight: 200
url: /ko/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


작업이 취소되어야 함을 알리는 알림을 전파합니다. 이 클래스는 스레드 간 협력적 취소를 위한 메커니즘을 제공하여, 한 스레드가 작업 취소를 다른 스레드에 알릴 수 있게 합니다.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | 기본 생성자. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | 이 토큰이 취소된 상태가 될 수 있는지 여부를 가져옵니다. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | 이 토큰에 대해 취소가 요청되었는지 여부를 가져옵니다. |
| static [get_None](./get_none/)() | 빈 [System::Threading::CancellationToken](./) 값을 반환합니다. |
| [Register](./register/)(const Action<>\&) const | 취소가 요청될 때 호출될 콜백을 등록합니다. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | 취소가 요청된 경우 OperationCanceledException을 발생시킵니다. |
## 비고



[CancellationToken](./)은 연결된 [CancellationTokenSource](../cancellationtokensource/)를 통해서만 취소될 수 있습니다.

## 또 보기

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
