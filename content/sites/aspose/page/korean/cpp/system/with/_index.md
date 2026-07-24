---
title: "System::With 메서드"
linktitle: "와"
second_title: "C++용 Aspose.Page"
description: "System::With 메서드. C++에서 레코드 참조를 복제하고 초기화 함수자를 적용합니다."
type: docs
weight: 40100
url: /ko/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


레코드 참조를 복제하고 초기화 함수자를 적용합니다.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 복제할 레코드 유형. |
| A | 초기화 함수자 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | 복제 및 초기화할 객체에 대한 공유 포인터. |
| 초기화자 | const A\& | 레코드 복제본에 적용되는 초기화 함수자. |

### ReturnValue

복제된 레코드에 대한 공유 포인터.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


구조체 레코드를 복사하고 초기화 함수자를 적용합니다.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 복사할 레코드 유형. |
| A | 초기화 함수자 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| record | const T\& | 복사하고 초기화할 레코드. |
| 초기화자 | const A\& | 레코드 복사본에 적용되는 초기화 함수자. |

### ReturnValue

복사된 레코드.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
