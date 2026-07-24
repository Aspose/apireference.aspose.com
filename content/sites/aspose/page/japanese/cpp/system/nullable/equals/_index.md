---
title: "System::Nullable::Equals メソッド"
linktitle: "等しい"
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::Equals メソッド。現在のオブジェクトが表す値が、指定された Nullable オブジェクトが表す値と C++ で等しいかどうかを判定します。"
type: docs
weight: 200
url: /ja/cpp/system/nullable/equals/
---
## Nullable::Equals method


現在のオブジェクトが表す値が、指定された [Nullable](../) オブジェクトが表す値と等しいかどうかを判断します。

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 比較対象となる[Nullable](../)オブジェクトの基になる型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | const T1\& | 比較対象となる[Nullable](../)オブジェクトへの定数参照 |

### ReturnValue

現在のオブジェクトが表す値が、指定された [Nullable](../) オブジェクトが表す値と等しい場合は True、そうでなければ - false

## 参照

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
