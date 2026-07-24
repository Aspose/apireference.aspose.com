---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "C++용 Aspose.Page"
description: "System::Threading::CancellationTokenRegistration class. C++에서 취소 토큰 콜백에 대한 등록을 나타냅니다."
type: docs
weight: 300
url: /ko/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


취소 토큰 콜백에 대한 등록을 나타냅니다.

```cpp
class CancellationTokenRegistration
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Dispose](./dispose/)() | 등록을 해제하고 연관된 [CancellationTokenSource](../cancellationtokensource/)에서 콜백을 제거합니다. 이 메서드를 호출한 후에는 연관된 [CancellationTokenSource](../cancellationtokensource/)가 취소될 때 등록된 콜백이 더 이상 호출되지 않습니다. |
## 비고


이 클래스는 취소 토큰에서 콜백을 등록 해제할 수 있게 합니다. 해제될 때 연관된 [CancellationTokenSource](../cancellationtokensource/)에서 콜백을 제거합니다.
이 클래스는 직접 생성해서는 안 됩니다 - [CancellationToken](../cancellationtoken/) 등록 메서드가 반환합니다.

## 또 보기

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
