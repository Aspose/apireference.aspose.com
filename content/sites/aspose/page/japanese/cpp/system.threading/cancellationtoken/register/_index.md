---
title: "System::Threading::CancellationToken::Register メソッド"
linktitle: "Register"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::CancellationToken::Register メソッド。C++ でキャンセルが要求されたときに呼び出されるコールバックを登録します。"
type: docs
weight: 400
url: /ja/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


キャンセルが要求されたときに呼び出されるコールバックを登録します。

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| callback | const Action<>\& | キャンセルが要求されたときに実行される [Action<>](../../../system/action/)。 |

### ReturnValue

コールバックの登録解除に使用できる [CancellationTokenRegistration](../../cancellationtokenregistration/) オブジェクトです。
## 備考



すでにキャンセルが要求されている場合、コールバックは直ちに呼び出されます。

## 参照

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
