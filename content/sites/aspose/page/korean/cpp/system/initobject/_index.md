---
title: "System::InitObject 메서드"
linktitle: "객체초기화"
second_title: "C++용 Aspose.Page"
description: "System::InitObject 메서드. C++에서 공유 소유권을 가진 객체 초기화를 시작합니다."
type: docs
weight: 21800
url: /ko/cpp/system/initobject/
---
## System::InitObject method


공유 소유권을 가진 객체 초기화를 시작합니다.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 초기화할 객체의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | 초기화할 [Object](../object/) |

### ReturnValue

공유 포인터 구성을 위한 ObjectBuilder
## 비고



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
