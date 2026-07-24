---
title: "System::Diagnostics::TraceListener クラス"
linktitle: "TraceListener"
second_title: "C++ 用 Aspose.Page"
description: "System::Diagnostics::TraceListener クラス。デバッグおよびトレース情報に応答するインターフェイスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 800
url: /ja/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


デバッグおよびトレース情報に応答するインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class TraceListener : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | デバッガに失敗メッセージを書き込みます。 |
| virtual [Fail](./fail/)(System::String, System::String) | デバッガに失敗メッセージを書き込みます。 |
| virtual [Write](./write/)(System::String) | RTTI 情報。 |
| virtual [WriteLine](./writeline/)(System::String) | デバッガに行を書き込みます。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
