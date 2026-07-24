---
title: "System::ConstCast 메서드"
linktitle: "ConstCast"
second_title: "C++용 Aspose.Page"
description: "System::ConstCast 메서드. C++에서 더 이상 사용되지 않는 캐스트의 끝."
type: docs
weight: 16100
url: /ko/cpp/system/constcast/
---
## System::ConstCast method


더 이상 사용되지 않는 캐스트의 끝.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 포인티 타입. |
| TFrom | 소스 포인티 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되면 결과를 반환하고, 그렇지 않으면 nullptr를 반환합니다.
## 비고


[SmartPtr](../smartptr/) 객체에 const 캐스트를 수행합니다.
## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
