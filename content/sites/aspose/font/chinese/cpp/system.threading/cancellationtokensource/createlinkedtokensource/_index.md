---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource 方法"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource 方法。创建一个关联的令牌源，当任意提供的令牌在 C++ 中被取消时，该源也会取消。"
type: docs
weight: 600
url: /zh/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


创建一个 linked token source，当任何提供的令牌被取消时即取消。

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| token1 | const CancellationToken\& | 要监视的第一个取消令牌。 |
| token2 | const CancellationToken\& | 要监视的第二个取消令牌。 |

### ReturnValue

新的令牌源，当任一输入令牌取消时将被取消。
## 备注



如果任一输入令牌已被取消，返回的源将立即取消。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
