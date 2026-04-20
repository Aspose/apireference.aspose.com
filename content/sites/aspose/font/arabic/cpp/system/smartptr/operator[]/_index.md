---
title: "System::SmartPtr::operator[] طريقة"
linktitle: "operator[]"
second_title: "Aspose.Font لـ C++"
description: "System::SmartPtr::operator[] طريقة. موصل لعناصر المصفوفة. يتم التجميع فقط إذا كان SmartPtr_ نوعًا متخصصًا من System::Array في C++."
type: docs
weight: 3000
url: /ar/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


موصل لعناصر المصفوفة. يتم التجميع فقط إذا كان [SmartPtr_](../smartptr_/) نوعًا متخصصًا من [System::Array](../../array/).

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| معامل | الوصف |
| --- | --- |
| IdxType | نوع الفهرس (يفترض أنه عدد صحيح). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| idx | IdxType | فهرس في المصفوفة. |

### ReturnValue

[Array](../../array/) value at idx position.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
