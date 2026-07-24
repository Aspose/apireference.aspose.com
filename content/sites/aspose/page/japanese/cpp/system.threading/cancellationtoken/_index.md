---
title: "System::Threading::CancellationToken クラス"
linktitle: "CancellationToken"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::CancellationToken クラス。操作がキャンセルされるべきであることを通知します。このクラスはスレッド間の協調的なキャンセルのためのメカニズムを提供し、あるスレッドが他のスレッドに対して操作をキャンセルすべきであることを通知できるようにします（C++）。"
type: docs
weight: 200
url: /ja/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


操作をキャンセルすべきであるという通知を伝搬します。このクラスはスレッド間で協調的なキャンセルを行うメカニズムを提供し、あるスレッドが他のスレッドに対して操作をキャンセルすべきであることを通知できるようにします。

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | デフォルトコンストラクタ。 |
| [get_CanBeCanceled](./get_canbecanceled/)() const | このトークンがキャンセル状態になる可能性があるかどうかを取得します。 |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | このトークンに対してキャンセルが要求されたかどうかを取得します。 |
| static [get_None](./get_none/)() | 空の [System::Threading::CancellationToken](./) 値を返します。 |
| [Register](./register/)(const Action<>\&) const | キャンセルが要求されたときに呼び出されるコールバックを登録します。 |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | キャンセルが要求された場合、OperationCanceledException をスローします。 |
## 備考



[CancellationToken](./) は、関連付けられた [CancellationTokenSource](../cancellationtokensource/) を通じてのみキャンセルできます。

## 参照

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
