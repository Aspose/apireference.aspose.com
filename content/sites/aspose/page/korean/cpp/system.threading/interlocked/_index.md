---
title: "System::Threading::Interlocked 클래스"
linktitle: "Interlocked"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Interlocked 클래스. 스레드 안전 작업을 위한 API를 제공합니다. 이는 인스턴스 서비스를 갖지 않는 정적 타입입니다. C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 600
url: /ko/cpp/system.threading/interlocked/
---
## Interlocked class


스레드 안전 연산을 위한 API를 제공합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입입니다. 어떠한 방법으로도 이 타입의 인스턴스를 생성해서는 안 됩니다.

```cpp
class Interlocked
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | 값을 원자적으로 증가시킵니다. |
| static [Add](./add/)(int64_t\&, int64_t) | 값을 원자적으로 증가시킵니다. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Compare-exchanges 변수의 값: 변수가 특정 값과 같은지 확인하고, 저장된 값이 예상값과 일치할 경우에만 새 값을 저장합니다. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Compare-exchanges 변수의 값: 변수가 특정 값과 같은지 확인하고, 저장된 값이 예상값과 일치할 경우에만 새 값을 저장합니다. 구현되지 않음. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Compare-exchanges 변수의 값: 변수가 특정 값과 같은지 확인하고, 저장된 값이 예상값과 일치할 경우에만 새 값을 저장합니다. |
| static [Decrement](./decrement/)(int32_t\&) | 값을 원자적으로 감소시킵니다. |
| static [Decrement](./decrement/)(int64_t\&) | 값을 원자적으로 감소시킵니다. |
| static [Exchange](./exchange/)(T\&, T) | Exchanges 변수의 값: 새 값을 저장하고 저장하기 직전 변수에 있던 값을 반환합니다. |
| static [Exchange](./exchange/)(T\&, T) | Exchanges 변수의 값: 새 값을 저장하고 저장하기 직전 변수에 있던 값을 반환합니다. 구현되지 않음. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | 교환-추가 절차를 통해 값을 원자적으로 증가시킵니다. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | 교환-추가 절차를 통해 값을 원자적으로 증가시킵니다. |
| static [Increment](./increment/)(int32_t\&) | 값을 원자적으로 증가시킵니다. |
| static [Increment](./increment/)(int64_t\&) | 값을 원자적으로 증가시킵니다. |
| static [Read](./read/)(int64_t\&) | 64비트 값을 반환하며, 원자적 연산으로 로드됩니다. |
## 또 보기

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
