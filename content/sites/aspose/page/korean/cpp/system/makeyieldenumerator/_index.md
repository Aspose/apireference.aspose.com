---
title: "System::MakeYieldEnumerator 메서드"
linktitle: "MakeYieldEnumerator"
second_title: "C++용 Aspose.Page"
description: "System::MakeYieldEnumerator 메서드. C++에서 yield 함수로부터 IEnumerator를 생성합니다."
type: docs
weight: 25400
url: /ko/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


yield 함수로부터 IEnumerator를 생성합니다.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 시퀀스 내 요소들의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | The yield function to execute |

### ReturnValue

IEnumerator에 대한 공유 포인터

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
