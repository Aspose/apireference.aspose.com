---
title: "System::Threading::Tasks::ValueTask クラス"
linktitle: "ValueTask"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ValueTask クラス。C++ における非同期操作の待機可能な結果を提供します。"
type: docs
weight: 500
url: /ja/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


非同期操作の await 可能な結果を提供します。

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AsTask](./astask/)() const | この [ValueTask](./) を [Task](../task/) への共有ポインタに変換します。 |
| [ConfigureAwait](./configureawait/)(bool) const | このタスクの awaiter を構成します。 |
| [Equals](./equals/)(ValueTask) override | このインスタンスが別の [ValueTask](./) インスタンスと等しいかどうかを判断します。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | このインスタンスが別のオブジェクトと等しいかどうかを判断します。 |
| [get_IsCanceled](./get_iscanceled/)() const | タスクがキャンセルされたために完了したかどうかを示す値を取得します。 |
| [get_IsCompleted](./get_iscompleted/)() const | タスクが完了したかどうかを示す値を取得します。 |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | タスクが正常に完了したかどうかを示す値を取得します。 |
| [get_IsFaulted](./get_isfaulted/)() const | タスクが未処理例外のために完了したかどうかを示す値を取得します。 |
| [GetAwaiter](./getawaiter/)() const | await 式をサポートするためにこのタスクの awaiter を取得します。 |
| [operator!=](./operator!=/)(const ValueTask\&) const | [ValueTask](./) の不等価演算子です。 |
| [operator==](./operator==/)(const ValueTask\&) const | [ValueTask](./) の等価演算子です。 |
| [ValueTask](./valuetask/)() | 空の、初期化されていない [ValueTask](./) を構築します。 |
| [ValueTask](./valuetask/)(const TaskPtr\&) | 共有ポインタから [Task](../task/) を使用して [ValueTask](./) を構築します。 |
## 参照

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
