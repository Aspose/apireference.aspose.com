---
title: "System::Threading::SynchronizationContext 클래스"
linktitle: "SynchronizationContext"
second_title: "C++용 Aspose.Page"
description: "System::Threading::SynchronizationContext 클래스. C++의 다양한 동기화 작업에 걸쳐 동기화 컨텍스트를 전파하는 기본 기능을 제공합니다."
type: docs
weight: 1100
url: /ko/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


다양한 동기화 작업 전반에 걸쳐 동기화 컨텍스트를 전파하기 위한 기본 기능을 제공합니다.

```cpp
class SynchronizationContext : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [get_Current](./get_current/)() | 현재 스레드의 동기화 컨텍스트를 가져옵니다. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | 현재 스레드의 동기화 컨텍스트를 설정합니다. |
| [SynchronizationContext](./synchronizationcontext/)() | RTTI 정보. |
## 비고


이 클래스는 스레드 간 동기화 컨텍스트 전파를 가능하게 하며, 콜백이나 호출을 적절한 스레드 또는 동기화 컨텍스트로 마샬링하는 데 사용됩니다.
더미 구현.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
