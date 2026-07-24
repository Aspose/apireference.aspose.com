---
title: "System::Build 메서드"
linktitle: "Build"
second_title: "C++용 Aspose.Page"
description: "System::Build 메서드. C++에서 직접 소유권을 갖는 객체를 생성합니다."
type: docs
weight: 15000
url: /ko/cpp/system/build/
---
## System::Build method


직접 소유권을 갖는 객체를 생성합니다.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 생성할 객체의 유형 |
| 인수 | 객체 생성에 대한 인수 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| args | Args\&&... | 객체 생성자에 전달할 인수 |

### ReturnValue

직접 객체 생성을 위해 구성된 ObjectBuilder
## 비고



[Object](../object/) construction must be finished with [Get()](../get/) call 

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
