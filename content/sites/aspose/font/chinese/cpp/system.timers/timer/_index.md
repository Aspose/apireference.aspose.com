---
title: "System::Timers::Timer 类"
linktitle: "Timer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Timers::Timer 类。C++ 中循环调用委托的计时器。"
type: docs
weight: 200
url: /zh/cpp/system.timers/timer/
---
## Timer class


[Timer](./) that calls delegate in a loop.

```cpp
class Timer : public System::ComponentModel::Component
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() | 停止计时器，释放已分配的资源。 |
| [Dispose](./dispose/)() | 停止计时器，释放已分配的资源。 |
| [get_AutoReset](./get_autoreset/)() const | 检查计时器是否处于自动重置模式。 |
| [get_Enabled](./get_enabled/)() const | 检查计时器是否处于活动状态。 |
| [get_Interval](./get_interval/)() const | 获取计时器间隔。 |
| [get_IsStopped](./get_isstopped/)() const | 检查计时器是否已停止。 |
| [set_AutoReset](./set_autoreset/)(bool) | 将计时器设置为自动重置模式或关闭该模式。 |
| [set_Enabled](./set_enabled/)(bool) | 启动或停止计时器。如果计时器已经在执行，启动计时器不会重新计时。 |
| [set_Interval](./set_interval/)(double) | 设置计时器间隔。 |
| [Start](./start/)() | 启动计时器。如果计时器已经在执行，计时不会重新开始。 |
| [Stop](./stop/)() | 停止计时器。 |
| [Timer](./timer/)() | RTTI 信息。 |
| [Timer](./timer/)(double) | 构造具有指定间隔的已停止计时器。 |
## 另见

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Timers](../)
* Library [Aspose.Font for C++](../../)
