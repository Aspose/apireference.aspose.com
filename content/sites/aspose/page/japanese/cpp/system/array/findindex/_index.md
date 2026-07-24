---
title: "System::Array::FindIndex メソッド"
linktitle: "FindIndex"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::FindIndex メソッド。C++ で、指定された配列の中で指定された述語の条件を満たす最初の要素を検索します。"
type: docs
weight: 5300
url: /ja/cpp/system/array/findindex/
---
## Array::FindIndex method


指定された配列内で、指定された述語の条件を満たす最初の要素を検索します。

```cpp
static int System::Array<T>::FindIndex(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) で要素を検索する |
| 一致 | System::Predicate\<T\> | 配列要素に対して一致させる条件を定義する述語 |

### ReturnValue

述語で定義された条件を満たす配列内の最初の要素のインデックス、条件を満たさない場合は -1

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
