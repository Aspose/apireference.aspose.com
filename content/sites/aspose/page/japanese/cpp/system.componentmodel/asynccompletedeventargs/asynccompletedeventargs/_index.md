---
title: "System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs コンストラクタ"
linktitle: "AsyncCompletedEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs コンストラクタ。C++ のコンストラクタです。"
type: docs
weight: 100
url: /ja/cpp/system.componentmodel/asynccompletedeventargs/asynccompletedeventargs/
---
## AsyncCompletedEventArgs::AsyncCompletedEventArgs() constructor


コンストラクタ。

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs()
```

## 参照

* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) constructor


新しい [System.ComponentModel.AsyncCompletedEventArgs](../) クラスのインスタンスを初期化します。

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception &error, bool canceled, const System::SharedPtr<System::Object> &userState)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| エラー | const System::Exception\& | 非同期操作中に発生したエラーです。 |
| キャンセル | bool | 非同期操作がキャンセルされたかどうかを示す値です。 |
| userState | const System::SharedPtr\<System::Object\>\& | オプションのユーザー提供の状態オブジェクトで、[System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) メソッドに渡されます。 |

## 参照

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
