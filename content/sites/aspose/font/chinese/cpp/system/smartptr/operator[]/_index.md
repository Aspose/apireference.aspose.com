---
title: "System::SmartPtr::operator[] 方法"
linktitle: "operator[]"
second_title: "Aspose.Font 适用于 C++"
description: "System::SmartPtr::operator[] 方法。用于数组元素的访问器。仅在 SmartPtr_ 为 C++ 中 System::Array 的特化时编译。"
type: docs
weight: 3000
url: /zh/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


用于数组元素的访问器。仅在 [SmartPtr_](../smartptr_/) 为 [System::Array](../../array/) 的特化时编译。

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| 参数 | 描述 |
| --- | --- |
| IdxType | 索引的类型（假定为整数）。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| idx | IdxType | 数组中的索引。 |

### ReturnValue

[Array](../../array/) value at idx position.

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
