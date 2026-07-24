---
title: "System::Nullable::operator&= メソッド"
linktitle: "operator&="
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::operator&= メソッド。C++ で、指定された値を右側引数として使用し、現在のオブジェクトが表す値に operator&=() を適用します。"
type: docs
weight: 1100
url: /ja/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


指定された値を右側引数として使用し、現在のオブジェクトが表す値に [operator&=()](./) を適用します。

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | SFINAE を機能させるためのテンプレートパラメータです。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | bool | 現在のオブジェクトが表す値に適用される [operator&=()](./) の右側値として使用されるブール値です。 |

### ReturnValue

自身への参照です。

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
