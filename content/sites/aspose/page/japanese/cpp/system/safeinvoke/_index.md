---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "C++ 用 Aspose.Page"
description: "System::SafeInvoke メソッド。C++ における ''?.'' 演算子の翻訳実装です。"
type: docs
weight: 36900
url: /ja/cpp/system/safeinvoke/
---
## System::SafeInvoke method


'?.' 演算子の翻訳実装。

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| パラメーター | 説明 |
| --- | --- |
| T0 | 式の型。 |
| T1 | 'WhenTrue'式をカプセル化するラムダの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| expr | T0 | 式の値。 |
| func | T1 | 'WhenTrue'式がファンクタにバインドされます。 |

### ReturnValue

expr の値が null でない場合、その値を最初の引数として func を呼び出した結果を返し、そうでない場合は null を返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
