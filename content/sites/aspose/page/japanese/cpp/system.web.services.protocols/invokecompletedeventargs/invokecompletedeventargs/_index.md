---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs コンストラクタ"
linktitle: "InvokeCompletedEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs コンストラクタ。C++ で新しいインスタンスを構築します。"
type: docs
weight: 100
url: /ja/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


新しいインスタンスを構築します。

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| エラー | Exception | 非同期操作中に発生したエラーです。 |
| キャンセル済み | bool | 非同期操作がキャンセルされたかどうかを示す値です。 |
| userState | System::SharedPtr\<Object\> | オプションのユーザー提供状態オブジェクトで、[System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) メソッドに渡されます。 |
| 結果 | System::ArrayPtr\<System::SharedPtr\<Object\>\> | 非同期操作の結果のコレクションです。 |

## 参照

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
