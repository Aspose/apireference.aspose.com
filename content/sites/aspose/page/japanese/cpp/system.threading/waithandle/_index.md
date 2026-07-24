---
title: "System::Threading::WaitHandle クラス"
linktitle: "WaitHandle"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::WaitHandle クラス。待機プリミティブの基底クラス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1700
url: /ja/cpp/system.threading/waithandle/
---
## WaitHandle class


待機プリミティブの基底クラス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class WaitHandle : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Close](./close/)() | ハンドルに関連付けられたすべてのリソースを解放します。 |
| [get_Handle](./get_handle/)() | ハンドルを取得します。 |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | RTTI 情報。 |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | すべてのハンドルがシグナルになるまで待機します。 |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | すべてのハンドルがシグナルになるまで待機します。 |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | いずれかのハンドルがシグナルになるまで待機します。 |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | いずれかのハンドルがシグナルになるまで待機します。 |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | いずれかのハンドルがシグナルになるまで待機します。 |
| virtual [WaitOne](./waitone/)() | ハンドルが発火するのを無制限の期間待ちます。 |
| virtual [WaitOne](./waitone/)(int) | ハンドルが発火するのを待ちます。 |
| virtual [WaitOne](./waitone/)(TimeSpan) | ハンドルが発火するのを待ちます。 |
| virtual [WaitOne](./waitone/)(int, bool) | ハンドルが発火するのを待ちます。 |
| virtual [~WaitHandle](./~waithandle/)() | デストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | タイムアウトが超過し何もシグナルが来なかった場合、配列中のシグナルオブジェクトのインデックスを返す代わりに関数が返す特別な値。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
