---
title: "System::Threading::CancellationToken class"
linktitle: "CancellationToken"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::CancellationToken 类。传播操作应被取消的通知。此类提供在线程之间协作取消的机制，允许一个线程通知其他线程在 C++ 中取消某个操作。"
type: docs
weight: 200
url: /zh/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


传播应取消操作的通知。此类提供在线程之间进行协作取消的机制，允许一个线程通知其他线程某个操作应被取消。

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | 默认构造函数。 |
| [get_CanBeCanceled](./get_canbecanceled/)() const | 获取此令牌是否能够处于已取消状态。 |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | 获取此令牌是否已请求取消。 |
| static [get_None](./get_none/)() | 返回一个空的 [System::Threading::CancellationToken](./) 值。 |
| [Register](./register/)(const Action<>\&) const | 注册一个回调，当请求取消时将被调用。 |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | 如果已请求取消，则抛出 OperationCanceledException。 |
## 备注



只能通过其关联的 [CancellationTokenSource](../cancellationtokensource/) 来取消 [CancellationToken](./)。

## 另见

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
