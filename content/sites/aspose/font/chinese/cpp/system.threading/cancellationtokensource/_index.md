---
title: "System::Threading::CancellationTokenSource 类"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::CancellationTokenSource 类。可用于在 C++ 中触发取消通知的取消令牌源。"
type: docs
weight: 400
url: /zh/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


可用于触发取消通知的取消令牌源。

```cpp
class CancellationTokenSource : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Cancel](./cancel/)() | 传达取消请求。 |
| [CancellationTokenSource](./cancellationtokensource/)() | 构造一个新的 [CancellationTokenSource](./)。 |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | 创建一个 linked token source，当任何提供的令牌被取消时即取消。 |
| [Dispose](./dispose/)() override | 释放由 [CancellationTokenSource](./) 使用的所有资源。 |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | 获取是否已请求取消。 |
| [get_Token](./get_token/)() const | 获取与此源关联的取消令牌。 |
## 备注


提供创建和控制取消令牌的机制，以实现操作的协作取消。
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
