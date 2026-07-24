---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::CancellationTokenRegistration class。C++ におけるキャンセルトークンコールバックの登録を表します。"
type: docs
weight: 300
url: /ja/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


キャンセル トークン コールバックの登録を表します。

```cpp
class CancellationTokenRegistration
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() | 登録を破棄し、関連付けられた [CancellationTokenSource](../cancellationtokensource/) からコールバックを削除します。このメソッドを呼び出した後、関連する [CancellationTokenSource](../cancellationtokensource/) がキャンセルされたときに、登録されたコールバックは呼び出されなくなります。 |
## 備考


このクラスはキャンセルトークンからコールバックの登録解除を可能にします。破棄されると、関連付けられた [CancellationTokenSource](../cancellationtokensource/) からコールバックが削除されます。
このクラスは直接作成すべきではありません - [CancellationToken](../cancellationtoken/) の登録メソッドによって返されます。

## 参照

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
