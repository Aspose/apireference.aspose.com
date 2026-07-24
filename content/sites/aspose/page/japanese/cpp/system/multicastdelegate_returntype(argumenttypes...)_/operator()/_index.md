---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() メソッド"
linktitle: "operator()"
second_title: "C++ 用 Aspose.Page"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() メソッド。現在デリゲートコレクションに存在するすべてのデリゲートを呼び出します。デリゲートはコレクションに追加された順序と同じ順序で呼び出されます。オペレータは C++ でデリゲートが実行されている間ブロックします。"
type: docs
weight: 1400
url: /ja/cpp/system/multicastdelegate_returntype(argumenttypes...)_/operator()/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method


デリゲートコレクションに現在存在するすべてのデリゲートを呼び出します。デリゲートはコレクションに追加された順序と同じ順序で呼び出されます。デリゲートが実行されている間、演算子はブロックされます。

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::operator()(ArgumentTypes... args) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| args | ArgumentTypes... | 呼び出されるデリゲートに渡す引数 |

### ReturnValue

最後に呼び出されたデリゲートの戻り値

## 参照

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
