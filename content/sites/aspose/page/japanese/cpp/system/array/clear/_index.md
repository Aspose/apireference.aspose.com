---
title: "System::Array::Clear method"
linktitle: "クリア"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::Clear メソッド。現在のオブジェクトが表す配列が C++ で読み取り専用のため、サポートされていません。"
type: docs
weight: 600
url: /ja/cpp/system/array/clear/
---
## Array::Clear() method


現在のオブジェクトが表す配列は読み取り専用のため、サポートされていません。

```cpp
virtual void System::Array<T>::Clear() override
```


## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Clear(const ArrayPtr\<Type\>\&, int, int) method


指定された配列の **startIndex** インデックスから始まる **count** 個の値を既定値に置き換えます。

```cpp
template<typename Type> static void System::Array<T>::Clear(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| パラメーター | 説明 |
| --- | --- |
| 型 | 対象配列の要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 対象配列 |
| startIndex | int | アイテムの置換を開始するインデックス |
| count | int | 置換するアイテム数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
