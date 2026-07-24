---
title: "System::Array::IndexOf メソッド"
linktitle: "IndexOf"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::IndexOf メソッド。C++ で配列内の指定された項目の最初の出現位置のインデックスを決定します。"
type: docs
weight: 2900
url: /ja/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


配列内で指定された項目が最初に出現するインデックスを決定します。

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 項目 | const T\& | 決定すべき項目のインデックス |

### ReturnValue

指定された項目が見つかった場合の最初の出現位置のインデックス、見つからない場合は -1

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


配列内で指定された項目が最初に出現するインデックスを決定します。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| パラメーター | 説明 |
| --- | --- |
| ArrayType | 対象配列の要素型 |
| ValueType | 配列内で検索する項目の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | 指定された項目を検索するための [Array](../) |
| value | const ValueType\& | 決定すべき項目のインデックス |

### ReturnValue

項目が見つかった場合の最初の出現インデックス、見つからない場合は -1

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


指定されたインデックスから開始して、配列内で指定された項目が最初に出現するインデックスを決定します。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
```


| パラメーター | 説明 |
| --- | --- |
| ArrayType | 対象配列の要素型 |
| ValueType | 配列内で検索する項目の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | 指定された項目を検索するための [Array](../) |
| value | const ValueType\& | 決定すべき項目のインデックス |
| startIndex | int | 検索が開始されるインデックス |

### ReturnValue

指定された項目が見つかった場合の最初の出現位置のインデックス、見つからない場合は -1

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


開始インデックスと範囲内の要素数で指定された配列の項目範囲内で、指定された項目が最初に出現するインデックスを決定します。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| パラメーター | 説明 |
| --- | --- |
| ArrayType | 対象配列の要素型 |
| ValueType | 配列内で検索する項目の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | 指定された項目を検索するための [Array](../) |
| value | const ValueType\& | 決定すべき項目のインデックス |
| startIndex | int | 検索が開始されるインデックス |
| count | int | 検索対象範囲の要素数 |

### ReturnValue

指定された項目が見つかった場合の最初の出現位置のインデックス、見つからない場合は -1

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
