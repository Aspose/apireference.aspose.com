---
title: "System::ForceStaticCast 메서드"
linktitle: "강제정적변환"
second_title: "C++용 Aspose.Page"
description: "System::ForceStaticCast 메서드. C++에서 SmartPtr 객체에 대해 실제 정적 캐스트를 수행합니다."
type: docs
weight: 20400
url: /ko/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


[SmartPtr](../smartptr/) 객체에 대해 실제 정적 캐스트를 수행합니다.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 포인티 타입. |
| TFrom | 소스 포인티 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되는 경우 결과를 반환하고, 그렇지 않으면 동작은 정의되지 않습니다.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
