---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem 메서드"
linktitle: "QueueUserWorkItem"
second_title: "C++용 Aspose.Page"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem 메서드. C++에서 작업 항목을 큐에 추가합니다."
type: docs
weight: 700
url: /ko/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


작업 항목을 큐에 추가합니다.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | WaitCallback | 실행할 콜백 함수. |
| 상태 | const System::SharedPtr\<System::Object\>\& | 콜백 함수 인수. |

### ReturnValue

항상 true를 반환합니다.

## 또 보기

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
