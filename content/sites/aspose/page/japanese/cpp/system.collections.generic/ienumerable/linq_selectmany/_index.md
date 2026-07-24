---
title: "System::Collections::Generic::IEnumerable::LINQ_SelectMany メソッド"
linktitle: "LINQ_SelectMany"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Collections::Generic::IEnumerable クラスの LINQ_SelectMany メソッドを使用する方法。"
type: docs
weight: 2700
url: /ja/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


シーケンスの各要素を投影し、結果として得られるシーケンスを1つのシーケンスに結合します。

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| パラメーター | 説明 |
| --- | --- |
| ResultType | **selector** が返す値の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | 変換関数。 |

### ReturnValue

入力シーケンスの各要素に対して 1 対多の射影関数を呼び出した結果を含む [IEnumerable](../)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
