---
title: "System::Threading::SynchronizationContext::SetSynchronizationContext 메서드"
linktitle: "SetSynchronizationContext"
second_title: "C++용 Aspose.Page"
description: "System::Threading::SynchronizationContext::SetSynchronizationContext 메서드. 현재 스레드의 동기화 컨텍스트를 C++에서 설정합니다."
type: docs
weight: 300
url: /ko/cpp/system.threading/synchronizationcontext/setsynchronizationcontext/
---
## SynchronizationContext::SetSynchronizationContext method


현재 스레드의 동기화 컨텍스트를 설정합니다.

```cpp
static void System::Threading::SynchronizationContext::SetSynchronizationContext(const SharedPtr<SynchronizationContext> &syncContext)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| syncContext | const SharedPtr\<SynchronizationContext\>\& | 현재 스레드에 설정할 동기화 컨텍스트입니다. |
## 비고



nullptr를 전달하면 현재 스레드의 동기화 컨텍스트가 해제됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SynchronizationContext](../)
* Class [SynchronizationContext](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
