---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::FindAll method。指定された述語で定義された条件に一致するすべての要素を C++ で取得します。"
type: docs
weight: 5200
url: /ja/cpp/system/array/findall/
---
## Array::FindAll method


指定された述語で定義された条件に一致するすべての要素を取得します。

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) で検索する要素 |
| 一致 | System::Predicate\<T\> | 配列要素に対して一致させる条件を定義する述語 |

### ReturnValue

指定された述語で定義された条件に一致するすべての要素を含む [Array](../)（見つかった場合）。条件に一致する要素がない場合は空の [Array](../) です。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
