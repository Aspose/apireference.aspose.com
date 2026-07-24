---
title: "System::Diagnostics::Stopwatch クラス"
linktitle: "Stopwatch"
second_title: "C++ 用 Aspose.Page"
description: "System::Diagnostics::Stopwatch クラス。時間測定を可能にします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 700
url: /ja/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


時間測定を可能にします。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class Stopwatch : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | 現在のインスタンスで測定された合計経過時間を取得します。 |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | 現在のインスタンスで測定された合計経過時間をミリ秒で取得します。 |
| [get_ElapsedTicks](./get_elapsedticks/)() const | 現在のインスタンスで測定された合計経過時間をタイマティック単位で取得します。 |
| [get_IsRunning](./get_isrunning/)() const | ストップウォッチが動作中かどうかを確認します。 |
| [Reset](./reset/)() | 時間測定を停止し、測定された間隔をゼロに設定します。 |
| [Restart](./restart/)() | 測定された間隔をゼロに設定し、次に時間測定を開始します。 |
| [Start](./start/)() | 時間測定を開始します。 |
| static [StartNew](./startnew/)() | 新しい [Stopwatch](./) オブジェクトを作成し、測定を開始します。 |
| [Stop](./stop/)() | 時間測定を停止します。 |
| [Stopwatch](./stopwatch/)() | RTTI 情報。 |
| virtual [~Stopwatch](./~stopwatch/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
