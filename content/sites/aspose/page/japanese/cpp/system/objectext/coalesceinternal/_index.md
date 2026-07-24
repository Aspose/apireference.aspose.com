---
title: "System::ObjectExt::CoalesceInternal メソッド"
linktitle: "CoalesceInternal"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::CoalesceInternal メソッド。非 nullable 型に対する ''??'' 演算子の翻訳の実装。RT2 が C++ で RT1 に変換可能な場合のオーバーロード。"
type: docs
weight: 600
url: /ja/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


非 nullable 型向けの '??' 演算子変換の実装です。RT2 が RT1 に変換可能な場合のオーバーロードです。

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| パラメーター | 説明 |
| --- | --- |
| T0 | 左辺の値型。 |
| T1 | 右辺式をカプセル化するラムダの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | RT1 | LHS 値。 |
| func | F | RHS 式。 |

### ReturnValue

LHS 値が null でない場合は LHS を返し、そうでない場合は RHS 式を計算して結果を返します。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
