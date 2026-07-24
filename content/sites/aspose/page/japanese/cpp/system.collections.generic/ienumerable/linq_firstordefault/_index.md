---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault メソッド"
linktitle: "LINQ_FirstOrDefault"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault メソッド。C++ で、シーケンスの最初の要素を返し、シーケンスが空の場合はデフォルト値を返します。"
type: docs
weight: 1600
url: /ja/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


シーケンスの最初の要素を返します。シーケンスが空の場合はデフォルト値を返します。

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

シーケンスの最初の要素、またはシーケンスが空の場合はデフォルト構築された値。

## 参照

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


条件を満たすシーケンスの最初の要素を返します。該当する要素が見つからない場合はデフォルト値を返します。

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 述語 | std::function\<bool(T)> | 条件をテストするための各要素に対する関数。 |

### ReturnValue

ソースが空、または述語で指定されたテストを通過する要素がない場合は default(T) を返し、そうでなければ述語で指定されたテストを通過する最初の要素を返します。

## 参照

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
