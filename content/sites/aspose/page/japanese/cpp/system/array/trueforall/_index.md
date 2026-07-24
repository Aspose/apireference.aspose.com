---
title: "System::Array::TrueForAll メソッド"
linktitle: "TrueForAll"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::TrueForAll メソッド。C++ で、指定された配列のすべての要素が指定された述語で定義された条件を満たすかどうかを判定します。"
type: docs
weight: 5900
url: /ja/cpp/system/array/trueforall/
---
## Array::TrueForAll method


指定された配列のすべての要素が、指定された述語で定義された条件を満たすかどうかを判定します。

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) の条件に照らして一致させる要素 |
| 一致 | System::Predicate\<T\> | 配列要素に対して一致させる条件を定義する述語 |

### ReturnValue

配列 arr のすべての要素が述語 match で定義された条件を満たす場合は true、そうでない場合は false

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
