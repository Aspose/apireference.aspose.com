---
title: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode 메서드"
linktitle: "해시코드_가져오기"
second_title: "C++용 Aspose.Page"
description: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode 메서드. 임의 유형에 대한 해시 코드를 가져옵니다. C++에서 이를 수행하기 위해 Object::GetHashCode()를 호출합니다."
type: docs
weight: 100
url: /ko/cpp/system.runtime.compilerservices/runtimehelpers/gethashcode/
---
## RuntimeHelpers::GetHashCode method


임의 유형에 대한 해시 코드를 가져옵니다. 이를 위해 [Object::GetHashCode()](../../../system/object/gethashcode/)를 호출합니다.

```cpp
template<typename T> static int System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode(SmartPtr<T> const &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 해시 코드를 얻을 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<T\> const\& | [Object](../../../system/object/)에서 정보를 가져옵니다. |

### ReturnValue

대상 구현에 의해 계산된 해시 코드 값.

## 또 보기

* Class [SmartPtr](../../../system/smartptr/)
* Class [RuntimeHelpers](../)
* Namespace [System::Runtime::CompilerServices](../../)
* Library [Aspose.Page for C++](../../../)
