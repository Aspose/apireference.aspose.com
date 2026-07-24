---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource メソッド"
linktitle: "CreateLinkedTokenSource"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource メソッド。C++ で、提供されたトークンのいずれかがキャンセルされるとキャンセルされるリンクされたトークン ソースを作成します。"
type: docs
weight: 600
url: /ja/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


提供されたトークンのいずれかがキャンセルされるとキャンセルされるリンクトークン ソースを作成します。

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| token1 | const CancellationToken\& | 監視対象の最初のキャンセル トークンです。 |
| token2 | const CancellationToken\& | 監視対象の2番目のキャンセル トークンです。 |

### ReturnValue

いずれかの入力トークンがキャンセルされるとキャンセルされる新しいトークン ソースです。
## 備考



返されたソースは、いずれかの入力トークンがすでにキャンセルされている場合、直ちにキャンセルされます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
