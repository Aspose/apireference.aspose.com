---
title: "System::ObjectExt::Coalesce メソッド"
linktitle: "Coalesce"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::Coalesce メソッド。C++ における nullable 型の ''??'' 演算子の翻訳実装です。"
type: docs
weight: 500
url: /ja/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


nullable 型向けの '??' 演算子変換の実装です。

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| パラメーター | 説明 |
| --- | --- |
| T0 | 左辺の値型。 |
| T1 | 右辺式をカプセル化するラムダの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | System::Nullable\<T0\> | LHS 値。 |
| func | T1 | RHS 式。 |

### ReturnValue

LHS 値が null でない場合は LHS を返し、そうでない場合は RHS 式を計算して結果を返します。

## 参照

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


非 nullable 型向けの '??' 演算子変換の実装です。

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| パラメーター | 説明 |
| --- | --- |
| T0 | 左辺の値型。 |
| T1 | 右辺式をカプセル化するラムダの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | T0 | LHS 値。 |
| func | T1 | RHS 式。 |

### ReturnValue

LHS 値が null でない場合は LHS を返し、そうでない場合は RHS 式を計算して結果を返します。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
