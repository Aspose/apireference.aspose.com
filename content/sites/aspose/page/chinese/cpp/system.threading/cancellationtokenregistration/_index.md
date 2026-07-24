---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::CancellationTokenRegistration class。表示在 C++ 中用于取消令牌回调的注册。"
type: docs
weight: 300
url: /zh/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


表示取消令牌回调的注册。

```cpp
class CancellationTokenRegistration
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() | 释放注册并从关联的 [CancellationTokenSource](../cancellationtokensource/) 中移除回调。调用此方法后，当关联的 [CancellationTokenSource](../cancellationtokensource/) 被取消时，已注册的回调将不再被调用。 |
## 备注


此类允许从取消令牌中注销回调。释放时，它会从关联的 [CancellationTokenSource](../cancellationtokensource/) 中移除该回调。
此类不应直接创建——它由 [CancellationToken](../cancellationtoken/) 的注册方法返回。

## 另见

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
