---
title: "System::MakeYieldEnumerable 메서드"
linktitle: "MakeYieldEnumerable"
second_title: "C++용 Aspose.Page"
description: "System::MakeYieldEnumerable 메서드. C++에서 yield 함수로부터 IEnumerable를 생성합니다."
type: docs
weight: 25300
url: /ko/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


yield 함수로부터 IEnumerable를 생성합니다.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 시퀀스 내 요소들의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | The yield function to execute |

### ReturnValue

IEnumerable에 대한 공유 포인터

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
