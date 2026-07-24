---
title: "System::ObjectExt::UnknownIsNull 메서드"
linktitle: "UnknownIsNull"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::UnknownIsNull 메서드. 알 수 없는 타입 객체가 nullptr인지 확인합니다. C++에서 비스칼라 타입에 대한 오버로드입니다."
type: docs
weight: 1700
url: /ko/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


알 수 없는 유형 객체가 nullptr인지 확인합니다. 스칼라가 아닌 유형에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Object](../../object/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T | [Object](../../object/) 를 확인합니다. |

### ReturnValue

'obj == nullptr'가 true이면 true, 그렇지 않으면 false.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


알 수 없는 유형 객체가 nullptr인지 확인합니다. 스칼라 유형에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Object](../../object/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T | [Object](../../object/) 를 확인합니다. |

### ReturnValue

항상 false를 반환합니다.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
