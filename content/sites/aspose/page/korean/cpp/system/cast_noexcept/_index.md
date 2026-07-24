---
title: "System::Cast_noexcept 메서드"
linktitle: "Cast_noexcept"
second_title: "C++용 Aspose.Page"
description: "System::Cast_noexcept 메서드. C++에서 SmartPtr 객체에 대한 캐스트를 수행합니다."
type: docs
weight: 15400
url: /ko/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


[SmartPtr](../smartptr/) 객체에 대한 캐스트를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 포인티 타입. |
| TFrom | 소스 포인티 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되면 결과를 반환하고, 그렇지 않으면 nullptr를 반환합니다.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
