---
title: "System::Nullable::operator- メソッド"
linktitle: "operator-"
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable::operator- メソッド。C++ で nullable 値を減算します。"
type: docs
weight: 1400
url: /ja/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


nullable値を減算します。

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 右オペランドの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | const Nullable\<T1\>\& | 減算する値。 |

### ReturnValue

減算結果。

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


nullable値と非nullable値を減算します。

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 右オペランドの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| その他 | const T1\& | 減算する値。 |

### ReturnValue

減算結果。

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


nullable値とnull参照の値を減算します。

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 右オペランドの型、nullptr_t である必要があります。 |

### ReturnValue

空の [Nullable](../) オブジェクト。

## 参照

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
