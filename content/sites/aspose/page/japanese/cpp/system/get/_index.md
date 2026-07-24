---
title: "System::Get メソッド"
linktitle: "取得"
second_title: "C++ 用 Aspose.Page"
description: "System::Get メソッド。タプルの N 番目の要素を取得する関数です。C++ におけるベースオブジェクト用のオーバーロードです。"
type: docs
weight: 20700
url: /ja/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


タプルの N 番目の要素を取得する関数です。ベースオブジェクト用のオーバーロードです。

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| パラメーター | 説明 |
| --- | --- |
| N | 要素インデックス。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| オブジェクト | const SharedPtr\<Object\>\& | 検査対象のオブジェクト。 |

### ReturnValue

N 番目のタプル要素の値をオブジェクトにキャストしたもの。

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


タプルの N 番目の要素を取得する関数です。共有ポインタ用のオーバーロードです。

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| パラメーター | 説明 |
| --- | --- |
| N | 要素インデックス。 |
| T | 検査されたオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| オブジェクト | const SharedPtr\<T\>\& | 検査対象のオブジェクト。 |

### ReturnValue

N 番目のタプル要素の値。

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


タプルの N 番目の要素を取得する関数です。Deconstruct メソッドを持つオブジェクト用のオーバーロードです。

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| パラメーター | 説明 |
| --- | --- |
| N | 要素インデックス。 |
| T | 検査されたオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| オブジェクト | const T\& | 検査対象のオブジェクト。 |

### ReturnValue

N 番目のタプル要素の値。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


値タプルの N 番目の要素を取得します。

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| パラメーター | 説明 |
| --- | --- |
| N | 要素インデックス。 |
| 引数 | タプル要素。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| タプル | const ValueTuple\<Args...\>\& | 要素を取得するためのタプル。 |

### ReturnValue

N 番目のタプル要素の値。

## 参照

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
