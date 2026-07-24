---
title: "System::BuildObject 메서드"
linktitle: "BuildObject"
second_title: "C++용 Aspose.Page"
description: "System::BuildObject 메서드. C++에서 공유 소유권을 가진 객체를 생성합니다."
type: docs
weight: 15200
url: /ko/cpp/system/buildobject/
---
## System::BuildObject method


공유 소유권을 가진 객체를 생성합니다.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 생성할 객체의 유형 |
| 인수 | 객체 생성에 대한 인수 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| args | Args\&&... | 객체 생성자에 전달할 인수 |

### ReturnValue

공유 포인터 구성을 위한 ObjectBuilder
## 비고



[SharedPtr<T>](../sharedptr/)를 생성하고 해당 객체에 대한 빌더를 반환합니다
[Object](../object/) construction must be finished with [Get()](../get/) call 

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
