---
title: "System::Threading::CancellationTokenSource クラス"
linktitle: "CancellationTokenSource"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::CancellationTokenSource クラス。C++ でキャンセル通知をトリガーするために使用できるキャンセルトークン ソース。"
type: docs
weight: 400
url: /ja/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


キャンセル通知をトリガーするために使用できるキャンセル トークン ソースです。

```cpp
class CancellationTokenSource : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Cancel](./cancel/)() | キャンセル要求を伝達します。 |
| [CancellationTokenSource](./cancellationtokensource/)() | 新しい [CancellationTokenSource](./) を構築します。 |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | 提供されたトークンのいずれかがキャンセルされるとキャンセルされるリンクトークン ソースを作成します。 |
| [Dispose](./dispose/)() override | [CancellationTokenSource](./) が使用するすべてのリソースを解放します。 |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | キャンセルが要求されたかどうかを取得します。 |
| [get_Token](./get_token/)() const | このソースに関連付けられたキャンセルトークンを取得します。 |
## 備考


操作の協調的キャンセルのためにキャンセルトークンを作成および制御するメカニズムを提供します。
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
