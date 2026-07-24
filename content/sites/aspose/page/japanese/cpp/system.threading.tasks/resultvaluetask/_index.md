---
title: "System::Threading::Tasks::ResultValueTask クラス"
linktitle: "ResultValueTask"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask クラス。直接の結果値または ResultTask<T> をラップできるハイブリッドなタスク型を表します（C++）。"
type: docs
weight: 200
url: /ja/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


直接の結果値または [ResultTask<T>](../resulttask/) をラップできるハイブリッドなタスク型を表します。

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| パラメーター | 説明 |
| --- | --- |
| T | タスクによって生成される結果の型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [AsTask](./astask/)() const | この [ResultValueTask](./) を [ResultTask<T>](../resulttask/) への共有ポインタに変換します。 |
| [ConfigureAwait](./configureawait/)(bool) const | このタスクの awaiter を構成します。 |
| [Equals](./equals/)(ResultValueTask) override | このインスタンスが別の [ResultValueTask](./) インスタンスと等しいかどうかを判断します。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | このインスタンスが別のオブジェクトと等しいかどうかを判断します。 |
| [get_IsCanceled](./get_iscanceled/)() const | タスクがキャンセルされたために完了したかどうかを示す値を取得します。 |
| [get_IsCompleted](./get_iscompleted/)() const | タスクが完了したかどうかを示す値を取得します。 |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | タスクが正常に完了したかどうかを示す値を取得します。 |
| [get_IsFaulted](./get_isfaulted/)() const | タスクが未処理例外のために完了したかどうかを示す値を取得します。 |
| [get_Result](./get_result/)() const | 完了したタスクの結果を取得します。 |
| [GetAwaiter](./getawaiter/)() const | await 式をサポートするためにこのタスクの awaiter を取得します。 |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | [ResultValueTask](./) の不等価演算子です。 |
| [operator==](./operator==/)(const ResultValueTask\&) const | [ResultValueTask](./) の等価演算子です。 |
| [ResultValueTask](./resultvaluetask/)() | 空の、初期化されていない [ResultValueTask](./) を構築します。 |
| [ResultValueTask](./resultvaluetask/)(const T\&) | 指定された結果で完了した [ResultValueTask](./) を構築します。 |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | 共有ポインタから [ResultTask<T>](../resulttask/) を使用して [ResultValueTask](./) を構築します。 |
## 備考


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## 参照

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
