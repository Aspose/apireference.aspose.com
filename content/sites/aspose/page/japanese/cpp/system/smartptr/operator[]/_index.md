---
title: "System::SmartPtr::operator[] メソッド"
linktitle: "operator[]"
second_title: "C++ 用 Aspose.Page"
description: "System::SmartPtr::operator[] メソッド。配列要素へのアクセサ。C++ で SmartPtr_ が System::Array の特殊化である場合のみコンパイルされます。"
type: docs
weight: 3000
url: /ja/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


配列要素へのアクセサ。[SmartPtr_](../smartptr_/) が [System::Array](../../array/) の特殊化である場合のみコンパイルされます。

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| パラメーター | 説明 |
| --- | --- |
| IdxType | インデックスの型（整数と想定）。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| idx | IdxType | 配列内のインデックス。 |

### ReturnValue

[Array](../../array/) value at idx position.

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
