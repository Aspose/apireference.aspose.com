---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke メソッド"
linktitle: "invoke"
second_title: "C++ 用 Aspose.Page"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke メソッド。デリゲートコレクションに現在存在するすべてのデリゲートを呼び出します。デリゲートはコレクションに追加された順序と同じ順序で呼び出されます。メソッドは C++ でデリゲートが実行されている間ブロックします。"
type: docs
weight: 1100
url: /ja/cpp/system/multicastdelegate_returntype(argumenttypes...)_/invoke/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke method


現在デリゲートコレクションに存在するすべてのデリゲートを呼び出します。デリゲートはコレクションに追加された順序と同じ順序で呼び出されます。デリゲートの実行中はこのメソッドはブロックされます。

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::invoke(ArgumentTypes... args) const
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
