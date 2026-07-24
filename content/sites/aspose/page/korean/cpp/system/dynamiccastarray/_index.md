---
title: "System::DynamicCastArray 메서드"
linktitle: "DynamicCastArray"
second_title: "C++용 Aspose.Page"
description: "System::DynamicCastArray 메서드. 지정된 배열의 요소들을 C++에서 다른 유형으로 캐스팅합니다."
type: docs
weight: 17900
url: /ko/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


지정된 배열의 요소들을 다른 유형으로 캐스팅합니다.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| 매개변수 | 설명 |
| --- | --- |
| 대상 | 지정된 배열의 요소들을 캐스팅할 유형 |
| From | 캐스팅할 배열 요소들의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | 캐스팅할 요소들을 포함하는 배열에 대한 공유 포인터 |

### ReturnValue

새 배열에 대한 포인터이며, 이 배열은 **To** 유형의 요소들을 포함하고 **from**의 요소와 동등합니다.

## Deprecated
하위 호환성을 위해 추가되었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
