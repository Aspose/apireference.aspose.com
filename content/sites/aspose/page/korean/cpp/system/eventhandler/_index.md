---
title: "System::EventHandler typedef"
linktitle: "EventHandler"
second_title: "C++용 Aspose.Page"
description: "System::EventHandler typedef. 이벤트에 반응하고 처리하는 메서드를 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 유형의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마십시오."
type: docs
weight: 11400
url: /ko/cpp/system/eventhandler/
---
## EventHandler typedef


이벤트에 반응하고 처리하는 메서드를 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 유형의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 절대 사용하지 마십시오.

```cpp
using System::EventHandler =  MulticastDelegate<void(System::SharedPtr<Object>, TEventArgs)>
```


## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
