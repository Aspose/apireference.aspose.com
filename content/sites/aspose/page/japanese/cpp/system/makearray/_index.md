---
title: "System::MakeArray メソッド"
linktitle: "配列作成"
second_title: "C++ 用 Aspose.Page"
description: "System::MakeArray メソッド。指定された引数をコンストラクタに渡して新しい Array オブジェクトを構築するファクトリ関数です（C++）。"
type: docs
weight: 24000
url: /ja/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


指定された引数をコンストラクタに渡して新しい [Array](../array/) オブジェクトを構築するファクトリ関数です。

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| パラメーター | 説明 |
| --- | --- |
| T | 関数が構築する [Array](../array/) オブジェクトの要素型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| args | Args\&&... | 構築中の [Array](../array/) オブジェクトのコンストラクタに渡される引数です。 |

### ReturnValue

構築された [Array](../array/) オブジェクトを指すスマートポインタです。

## 参照

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


指定された引数をコンストラクタに渡して新しい [Array](../array/) オブジェクトを構築するファクトリ関数です。

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| パラメーター | 説明 |
| --- | --- |
| T | 関数が構築する [Array](../array/) オブジェクトの要素型です。 |
| Integral | 配列サイズの型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| size | Integral | 作成中の配列のサイズです。 |
| args | Args\&&... | 構築中の [Array](../array/) オブジェクトのコンストラクタに渡される引数です。 |

### ReturnValue

構築された [Array](../array/) オブジェクトを指すスマートポインタです。

## 参照

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


指定された初期化リストの要素で満たし、[Array](../array/) オブジェクトを構築し、その [Array](../array/) オブジェクトを指すスマートポインタを返すファクトリ関数です。

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| パラメーター | 説明 |
| --- | --- |
| T | 関数が構築する [Array](../array/) オブジェクトの要素型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| init | std::initializer_list\<T\> | 配列を埋める要素を含む初期化リスト |

### ReturnValue

構築された [Array](../array/) オブジェクトを指すスマートポインタです。

## 参照

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
