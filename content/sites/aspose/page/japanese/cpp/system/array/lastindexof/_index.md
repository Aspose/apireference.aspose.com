---
title: "System::Array::LastIndexOf メソッド"
linktitle: "LastIndexOf"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::LastIndexOf メソッド。C++ で、開始インデックスと範囲内の要素数で指定された配列の項目範囲における指定項目の最後の出現位置のインデックスを決定します。"
type: docs
weight: 5500
url: /ja/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


開始インデックスと範囲内の要素数で指定された配列の項目範囲内で、指定された項目が最後に出現するインデックスを決定します。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
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

項目が見つかった場合は指定された項目の最後の出現インデックスを、見つからなかった場合は -1 を返します。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


配列内で指定された項目が最後に出現するインデックスを決定します。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| パラメーター | 説明 |
| --- | --- |
| ArrayType | 対象配列の要素型 |
| ValueType | 配列内で検索する項目の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | 指定された項目を検索するための [Array](../) |
| value | const ValueType\& | 決定すべき項目のインデックス |

### ReturnValue

項目が見つかった場合は指定された項目の最後の出現インデックスを、見つからなかった場合は -1 を返します。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


指定されたインデックスから開始して、配列内で指定された項目が最後に出現するインデックスを決定します。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| パラメーター | 説明 |
| --- | --- |
| ArrayType | 対象配列の要素型 |
| ValueType | 配列内で検索する項目の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | 指定された項目を検索するための [Array](../) |
| value | const ValueType\& | 決定すべき項目のインデックス |
| startIndex | int | 検索が開始されるインデックス |

### ReturnValue

項目が見つかった場合は指定された項目の最後の出現インデックスを、見つからなかった場合は -1 を返します。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
