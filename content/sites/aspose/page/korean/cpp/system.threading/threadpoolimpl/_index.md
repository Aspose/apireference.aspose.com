---
title: "System::Threading::ThreadPoolImpl 클래스"
linktitle: "ThreadPoolImpl"
second_title: "C++용 Aspose.Page"
description: "System::Threading::ThreadPoolImpl 클래스. 스레드 풀 내부 데이터입니다. 이는 접근 함수에 의해 메모리 관리가 이루어지는 싱글톤 타입입니다. C++에서 직접 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1400
url: /ko/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | 사용 가능한 스레드 수를 가져옵니다. |
| static [GetInitialized](./getinitialized/)() | 초기화 상태 싱글톤을 가져옵니다. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | 동시 실행 가능한 최대 스레드 수를 가져옵니다. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | 풀에 의해 생성되는 최소 스레드 수를 가져옵니다. |
| [JoinAll](./joinall/)() | 소유한 모든 스레드를 조인합니다. 무한히 기다립니다. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | 작업 항목을 큐에 추가합니다. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | 풀에 소유된 스레드 수를 설정합니다. |
| [SetMinThreads](./setminthreads/)(int, int) | 풀에 소유된 최소 스레드 수를 설정합니다. |
| [ThreadPoolImpl](./threadpoolimpl/)() | 생성자. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | 소멸자. 아직 종료되지 않은 경우 모든 스레드를 결합합니다. |
## 또 보기

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
