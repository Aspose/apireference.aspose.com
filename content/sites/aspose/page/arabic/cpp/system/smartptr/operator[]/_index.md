---
title: "طريقة System::SmartPtr::operator[]"
linktitle: "operator[]"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::SmartPtr::operator[]. مُدخل لعناصر المصفوفة. يتم التجميع فقط إذا كان SmartPtr_ نوعًا متخصصًا من System::Array في C++."
type: docs
weight: 3000
url: /ar/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


مُدخل لعناصر المصفوفة. يتم التجميع فقط إذا كان [SmartPtr_](../smartptr_/) نوعًا متخصصًا من [System::Array](../../array/).

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Parameter | الوصف |
| --- | --- |
| IdxType | نوع الفهرس (مفترضًا أنه عدد صحيح). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| idx | IdxType | فهرس في المصفوفة. |

### ReturnValue

[Array](../../array/) value at idx position.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
