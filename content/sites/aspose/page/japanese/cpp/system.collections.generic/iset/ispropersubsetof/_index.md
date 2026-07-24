---
title: "System::Collections::Generic::ISet::IsProperSubsetOf メソッド"
linktitle: "IsProperSubsetOf"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::ISet::IsProperSubsetOf メソッド。C++ で、現在のセットが他のコンテナの真の部分集合であるかどうかをチェックします。"
type: docs
weight: 400
url: /ja/cpp/system.collections.generic/iset/ispropersubsetof/
---
## ISet::IsProperSubsetOf method


現在のセットが他のコンテナの真の部分集合であるかどうかを確認します。

```cpp
virtual bool System::Collections::Generic::ISet<T>::IsProperSubsetOf(IEnumerablePtr other)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | IEnumerablePtr | チェック対象となる上位集合。 |

### ReturnValue

現在のセットのすべての要素が **other** に存在し、かつ **other** が現在のセットよりも多くの要素を持つ場合は true、そうでない場合は false です。

## 参照

* Typedef [IEnumerablePtr](../ienumerableptr/)
* Class [ISet](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
