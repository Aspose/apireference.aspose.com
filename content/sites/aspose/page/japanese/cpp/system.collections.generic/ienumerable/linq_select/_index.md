---
title: "System::Collections::Generic::IEnumerable::LINQ_Select メソッド"
linktitle: "LINQ_Select"
second_title: "C++ 用 Aspose.Page"
description: "C++で System::Collections::Generic::IEnumerable クラスの LINQ_Select メソッドを使用する方法。"
type: docs
weight: 2600
url: /ja/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


要素のインデックスを組み込んで、シーケンスの各要素を新しい形に変換します。

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| パラメーター | 説明 |
| --- | --- |
| ResultType | **selector** が返す値の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | 変換関数。 |

### ReturnValue

**selector** 関数によって返される要素を含む [IEnumerable](../) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


シーケンスの要素を変換します。

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| パラメーター | 説明 |
| --- | --- |
| ResultType | **selector** が返す値の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | 変換関数。 |

### ReturnValue

**selector** 関数によって返される要素を含む [IEnumerable](../) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
