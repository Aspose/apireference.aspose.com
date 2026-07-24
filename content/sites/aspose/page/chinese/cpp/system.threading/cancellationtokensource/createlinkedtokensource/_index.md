---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource 方法"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource 方法。创建一个链接的令牌源，当任意提供的令牌在 C++ 中被取消时，该源也会取消。"
type: docs
weight: 600
url: /zh/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


创建一个链接的令牌源，当任意提供的令牌被取消时即取消。

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| token1 | const CancellationToken\& | 第一个要监视的取消令牌。 |
| token2 | const CancellationToken\& | 第二个要监视的取消令牌。 |

### ReturnValue

当任一输入令牌取消时，将取消的新令牌源。
## 备注



如果任一输入令牌已被取消，返回的源将立即取消。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
