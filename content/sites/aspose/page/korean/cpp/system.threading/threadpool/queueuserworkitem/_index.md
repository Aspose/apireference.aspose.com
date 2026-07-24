---
title: "System::Threading::ThreadPool::QueueUserWorkItem 메서드"
linktitle: "QueueUserWorkItem"
second_title: "C++용 Aspose.Page"
description: "System::Threading::ThreadPool::QueueUserWorkItem 메서드. C++에서 매개변수가 없는 콜백과 함께 작업 항목을 큐에 넣습니다."
type: docs
weight: 600
url: /ko/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


매개변수가 없는 콜백과 함께 작업 항목을 큐에 넣습니다.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | WaitCallback | 작업으로 사용할 콜백 함수. |

### ReturnValue

항상 true를 반환합니다.

## 또 보기

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


매개변수가 없는 콜백과 함께 작업 항목을 큐에 넣습니다.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | WaitCallback | 작업으로 사용할 콜백 함수. |
| 상태 | const System::SharedPtr\<System::Object\>\& | 작업 함수 매개변수. |

### ReturnValue

항상 true를 반환합니다.

## 또 보기

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
