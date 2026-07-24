---
title: "System::SmartPtr::operator[] 메서드"
linktitle: "operator[]"
second_title: "C++용 Aspose.Page"
description: "System::SmartPtr::operator[] 메서드. 배열 요소에 대한 접근자입니다. C++에서 SmartPtr_이 System::Array의 특수화인 경우에만 컴파일됩니다."
type: docs
weight: 3000
url: /ko/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


배열 요소에 대한 접근자입니다. [SmartPtr_](../smartptr_/)이 [System::Array](../../array/)의 특수화인 경우에만 컴파일됩니다.

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| 매개변수 | 설명 |
| --- | --- |
| IdxType | 인덱스 유형(정수형이라고 가정). |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| idx | IdxType | 배열 내 인덱스. |

### ReturnValue

[Array](../../array/) value at idx position.

## 또 보기

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
