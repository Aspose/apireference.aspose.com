---
title: "System::ComponentModel::BackgroundWorker クラス"
linktitle: "BackgroundWorker"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::BackgroundWorker クラス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | RTTI 情報。 |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | [System::ComponentModel::BackgroundWorker](./) が進捗の更新を報告できるかどうかを示す値を取得します。 |
| [ReportProgress](./reportprogress/)(int) | **System::ComponentModel::BackgroundWorker::ProgressChanged** イベントを発生させます。 |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | userState オブジェクトを使用して **System::ComponentModel::BackgroundWorker::ProgressChanged** イベントを発生させます。 |
| [RunWorkerAsync](./runworkerasync/)() | バックグラウンド操作の実行を開始します。 |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | バックグラウンド操作の実行を開始します。 |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | [System::ComponentModel::BackgroundWorker](./) が進捗の更新を報告できるかどうかを示す値を設定します。 |
| [~BackgroundWorker](./~backgroundworker/)() | デストラクタ。 |
## 参照

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
