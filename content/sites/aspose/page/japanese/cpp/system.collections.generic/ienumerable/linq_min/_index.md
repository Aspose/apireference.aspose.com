---
title: "System::Collections::Generic::IEnumerable::LINQ_Min メソッド"
linktitle: "LINQ_Min"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Collections::Generic::IEnumerable クラスの LINQ_Min メソッドを使用する方法。"
type: docs
weight: 2100
url: /ja/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## 参照

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


ジェネリックシーケンスの各要素に変換関数を適用し、結果として得られる最小値を返します。

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| パラメーター | 説明 |
| --- | --- |
| ResultType | セレクタが返す値の型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | 各要素に適用する変換関数です。 |

### ReturnValue

シーケンス内の最小値です。

## 参照

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
