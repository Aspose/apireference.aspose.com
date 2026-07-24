---
title: "System::Nullable::NullableBoolHelper メソッド"
linktitle: "NullableBoolHelper"
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::NullableBoolHelper メソッド. this と other が両方とも null でないかをチェックし、そうであればラムダを呼び出すヘルパー関数です。C++ の実装で使用されます。"
type: docs
weight: 800
url: /ja/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


このオブジェクトと**other**が両方ともnullでないかをチェックし、そうであればラムダを呼び出すヘルパー関数です。実装で使用されます。

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | その他の nullable 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | const T1\& | 比較対象となるその他の nullable 値。 |
| f | const std::function\\<bool()>\\& | 両方の **this** と **other** が null でない場合に呼び出すラムダ。 |
| default_if_both_are_null | bool | 両方の値が null の場合の戻り値。 |

### ReturnValue

**this** または **other** のいずれかが null の場合は false; 両方が null の場合は **default_if_both_are_null**; 両方が null でない場合は **f** の呼び出し結果。

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
