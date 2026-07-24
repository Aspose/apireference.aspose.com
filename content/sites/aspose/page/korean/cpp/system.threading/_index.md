---
title: "System::Threading 네임스페이스"
linktitle: "System::Threading"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Threading 네임스페이스를 사용하는 방법."
type: docs
weight: 6500
url: /ko/cpp/system.threading/
---



## 클래스

| 클래스 | 설명 |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/)는 자동으로 재설정되는 대기 중인 스레드에 알리기 위한 이벤트입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오. |
| [CancellationToken](./cancellationtoken/) | 작업이 취소되어야 함을 알리는 알림을 전파합니다. 이 클래스는 스레드 간 협력적 취소를 위한 메커니즘을 제공하여, 한 스레드가 작업 취소를 다른 스레드에 알릴 수 있게 합니다. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | 취소 토큰 콜백에 대한 등록을 나타냅니다. |
| [CancellationTokenSource](./cancellationtokensource/) | 취소 알림을 트리거하는 데 사용할 수 있는 취소 토큰 소스입니다. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/)은 대기 중인 스레드에 보낼 수 있는 이벤트입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오. |
| [Interlocked](./interlocked/) | 스레드 안전 연산을 위한 API를 제공합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입입니다. 어떠한 방법으로도 이 타입의 인스턴스를 생성해서는 안 됩니다. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) 자동으로 재설정되지 않는 대기 중인 스레드에 알리기 위해. 이 클래스의 객체는 반드시 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [Monitor](./monitor/) | [Monitor](./monitor/) 클래스는 객체에 대한 접근을 동기화하는 메커니즘을 제공합니다. |
| [Mutex](./mutex/) | [Mutex](./mutex/) 구현. 이 클래스의 객체는 반드시 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) 구현. 이 클래스의 객체는 반드시 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [SynchronizationContext](./synchronizationcontext/) | 다양한 동기화 작업 전반에 걸쳐 동기화 컨텍스트를 전파하기 위한 기본 기능을 제공합니다. |
| [Thread](./thread/) | [Thread](./thread/) 구현. 이 클래스의 객체는 반드시 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) 풀 API는 작업을 큐에 푸시하여 워커 스레드 풀에서 읽을 수 있게 합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입이며, 어떠한 방법으로도 이 타입의 인스턴스를 생성해서는 안 됩니다. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) 풀 내부 데이터. 이는 접근 함수에 의해 메모리가 관리되는 싱글톤 타입이며, 직접 인스턴스를 생성해서는 안 됩니다. |
| [Timer](./timer/) | [Timer](./timer/) 클래스는 지연 후 별도의 스레드에서 작업 항목을 실행합니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [TimerQueue](./timerqueue/) | [Timer](./timer/) 객체를 처리하는 큐입니다. 이는 단순 구현이며, [Timer](./timer/) 객체는 스스로 등록하므로 사용하기 위해 별도로 등록할 필요가 없습니다 - 대신 [Timer](./timer/) 클래스 API를 사용하십시오. 이는 접근 함수에 의해 메모리가 관리되는 싱글톤 타입이며, 직접 인스턴스를 생성해서는 안 됩니다. |
| [WaitHandle](./waithandle/) | 대기 원시 기본 클래스입니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
## Enums

| 열거형 | 설명 |
| --- | --- |
| [ApartmentState](./apartmentstate/) | 스레드의 아파트먼트 상태를 설정합니다. |
| [EventResetMode](./eventresetmode/) | 이벤트 상태가 어떻게 재설정되는지 나타냅니다. |
| [ThreadState](./threadstate/) | 스레드의 상태. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | 단일 매개변수를 갖는 [Thread](./thread/) 함수. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | 매개변수가 없는 [Thread](./thread/) 함수. |
| [TimerCallback](./timercallback/) | 타이머에 의해 호출되는 콜백 함수. |
| [wait_handle_t](./wait_handle_t/) | 핸들 타입. |
| [WaitCallback](./waitcallback/) | 자리가 확보되면 실행되는 콜백 항목. |
