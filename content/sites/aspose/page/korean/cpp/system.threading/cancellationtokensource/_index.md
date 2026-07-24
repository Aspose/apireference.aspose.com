---
title: "System::Threading::CancellationTokenSource 클래스"
linktitle: "CancellationTokenSource"
second_title: "C++용 Aspose.Page"
description: "System::Threading::CancellationTokenSource 클래스. C++에서 취소 알림을 트리거하는 데 사용할 수 있는 취소 토큰 소스."
type: docs
weight: 400
url: /ko/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


취소 알림을 트리거하는 데 사용할 수 있는 취소 토큰 소스입니다.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Cancel](./cancel/)() | 취소 요청을 전달합니다. |
| [CancellationTokenSource](./cancellationtokensource/)() | 새로운 [CancellationTokenSource](./)를 생성합니다. |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | 제공된 토큰 중 하나가 취소될 때 취소되는 연결된 토큰 소스를 생성합니다. |
| [Dispose](./dispose/)() override | [CancellationTokenSource](./)가 사용한 모든 리소스를 해제합니다. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | 취소가 요청되었는지 여부를 가져옵니다. |
| [get_Token](./get_token/)() const | 이 소스와 연결된 취소 토큰을 가져옵니다. |
## 비고


작업의 협력적 취소를 위해 취소 토큰을 생성하고 제어하는 메커니즘을 제공합니다.
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
