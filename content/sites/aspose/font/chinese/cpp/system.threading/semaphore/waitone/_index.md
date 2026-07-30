---
title: "System::Threading::Semaphore::WaitOne 方法"
linktitle: "WaitOne"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Semaphore::WaitOne 方法。锁定信号量。如果在 C++ 中有必要，执行无限等待。"
type: docs
weight: 500
url: /zh/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


锁定信号量。如果必要，执行无限等待。

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

始终返回 true，因为在信号量被锁定之前不会返回。

## 另见

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Semaphore::WaitOne(int) method


锁定信号量。如果必要，执行等待。

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| millisecondsTimeout | int | 以毫秒为单位的等待超时。 |

### ReturnValue

如果信号量已被锁定则返回 true；如果超时则返回 false。

## 另见

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
