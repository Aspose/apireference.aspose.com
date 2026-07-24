---
title: "System::MakeScopeGuard メソッド"
linktitle: "MakeScopeGuard"
second_title: "C++ 用 Aspose.Page"
description: "System::MakeScopeGuard メソッド。C++ で ScopedGuard クラスのインスタンスを作成するファクトリ関数です。"
type: docs
weight: 24700
url: /ja/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


ScopedGuard クラスのインスタンスを作成するファクトリ関数。

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| パラメーター | 説明 |
| --- | --- |
| この | 構築された ScopedGuard オブジェクトによって呼び出される関数オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| f | F | ScopedGuard クラスのコンストラクタに渡す関数オブジェクト。 |

### ReturnValue

ScopedGuard クラスの新しいインスタンス

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
