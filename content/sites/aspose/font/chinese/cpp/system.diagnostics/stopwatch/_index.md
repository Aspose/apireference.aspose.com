---
title: "System::Diagnostics::Stopwatch 类"
linktitle: "Stopwatch"
second_title: "Aspose.Font 适用于 C++"
description: "System::Diagnostics::Stopwatch 类。允许时间测量。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给函数（C++）。"
type: docs
weight: 700
url: /zh/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


允许时间测量。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Stopwatch : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | 获取当前实例测量的总耗时。 |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | 获取当前实例测量的总耗时（毫秒）。 |
| [get_ElapsedTicks](./get_elapsedticks/)() const | 获取当前实例测量的总耗时（计时器刻度）。 |
| [get_IsRunning](./get_isrunning/)() const | 检查秒表是否正在运行。 |
| [Reset](./reset/)() | 停止时间测量，并将测量间隔设为零。 |
| [Restart](./restart/)() | 将测量间隔设为零，然后开始时间测量。 |
| [Start](./start/)() | 开始时间测量。 |
| static [StartNew](./startnew/)() | 创建新的 [Stopwatch](./) 对象并开始测量。 |
| [Stop](./stop/)() | 停止时间测量。 |
| [Stopwatch](./stopwatch/)() | RTTI 信息。 |
| virtual [~Stopwatch](./~stopwatch/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
