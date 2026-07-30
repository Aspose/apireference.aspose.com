---
title: "System::Threading::TimerQueue 类"
linktitle: "TimerQueue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::TimerQueue 类。处理 Timer 对象的队列。这只是一个实现。Timer 对象会自行注册到此处，您无需自行注册即可使用它们——请改用 Timer 类 API。它是一个通过访问函数进行内存管理的单例类型。绝不应在 C++ 中直接创建其实例。"
type: docs
weight: 1600
url: /zh/cpp/system.threading/timerqueue/
---
## TimerQueue class


处理 [Timer](../timer/) 对象的队列。这只是一个实现。[Timer](../timer/) 对象会自行注册到此处，您无需自行注册即可使用它们——请改用 [Timer](../timer/) 类 API。它是一个通过访问函数进行内存管理的单例类型。绝不应直接创建其实例。

```cpp
class TimerQueue
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(Timer *) | 在队列中注册计时器。 |
| [Delete](./delete/)(Timer *) | 从队列中删除计时器。 |
| static [GetInstance](./getinstance/)() | 实现单例。 |
| static [JoinWorkerThread](./joinworkerthread/)() | 加入工作线程。如有需要，将无限期等待。 |
| [operator=](./operator=/)(const TimerQueue\&) | 不支持复制。 |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | 不支持复制。 |
## 另见

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
