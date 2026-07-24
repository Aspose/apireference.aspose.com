---
title: "System::ObjectExt::ArrayInitializerCast 메서드"
linktitle: "ArrayInitializerCast"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::ArrayInitializerCast 메서드. C++에서 배열 기본값을 변환합니다( C#에서는 암시적으로 수행되지만 C++에서는 그렇지 않은 것으로 보입니다)."
type: docs
weight: 100
url: /ko/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


배열 기본값을 변환합니다(이는 C#에서는 암시적으로 수행되지만 C++에서는 수행되지 않는 것으로 보입니다).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| 매개변수 | 설명 |
| --- | --- |
| 대상 | 대상 타입. |
| From | 소스 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| args | From ... | 변환하여 대상 배열에 푸시할 값들. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
