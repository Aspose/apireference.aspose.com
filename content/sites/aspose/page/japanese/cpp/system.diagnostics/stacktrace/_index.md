---
title: "System::Diagnostics::StackTrace クラス"
linktitle: "StackTrace"
second_title: "C++ 用 Aspose.Page"
description: "System::Diagnostics::StackTrace クラス。スタックフレームのコレクション。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


スタックフレームのコレクション。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class StackTrace : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | スタックトレース内のフレーム数を取得します。 |
| virtual [GetFrame](./getframe/)(uint32_t) | スタックフレームを取得します。 |
| [operator=](./operator=/)(const StackTrace\&) const | 代入はできません。 |
| [StackTrace](./stacktrace/)() | 現在のスタック状態を記述するスタックトレースを作成します。 |
| [StackTrace](./stacktrace/)(bool) | 現在のスタック状態を記述するスタックトレースを作成します。 |
| [StackTrace](./stacktrace/)(const StackTrace\&) | コピーはできません。 |
| virtual [~StackTrace](./~stacktrace/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
