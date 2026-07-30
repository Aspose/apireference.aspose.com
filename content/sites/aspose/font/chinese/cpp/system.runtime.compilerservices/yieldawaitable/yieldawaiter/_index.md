---
title: "System::Runtime::CompilerServices::YieldAwaitable::YieldAwaiter 类"
linktitle: "YieldAwaiter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Runtime::CompilerServices::YieldAwaitable::YieldAwaiter 类。YieldAwaitable 在 C++ 中的 awaiter 类型。"
type: docs
weight: 200
url: /zh/cpp/system.runtime.compilerservices/yieldawaitable/yieldawaiter/
---
## YieldAwaiter class


用于 [YieldAwaitable](../) 的 awaiter 类型。

```cpp
class YieldAwaiter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_IsCompleted](./get_iscompleted/)() const | 获取 yield 操作是否已完成。 |
| [GetResult](./getresult/)() const | 结束 await 操作。 |
| [OnCompleted](./oncompleted/)(const Action<>\&) | 安排在 yield 操作完成时的 continuation 动作。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [continueOnCapturedContext](./continueoncapturedcontext/) | 指定是否在捕获的同步上下文中继续。 |
## 另见

* Class [YieldAwaitable](../)
* Namespace [System::Runtime::CompilerServices](../../)
* Library [Aspose.Font for C++](../../../)
