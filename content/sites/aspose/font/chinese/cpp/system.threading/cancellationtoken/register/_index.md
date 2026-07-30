---
title: "System::Threading::CancellationToken::Register 方法"
linktitle: "注册"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::CancellationToken::Register 方法。注册一个回调，当在 C++ 中请求取消时将被调用。"
type: docs
weight: 400
url: /zh/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


注册一个回调，当请求取消时将被调用。

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| callback | const Action<>\& | 当请求取消时要执行的 [Action<>](../../../system/action/)。 |

### ReturnValue

一个可用于注销回调的 [CancellationTokenRegistration](../../cancellationtokenregistration/) 对象。
## 备注



如果已请求取消，回调将立即被调用。

## 另见

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
