---
title: "System::Threading::Monitor::Enter 方法"
linktitle: "Enter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Monitor::Enter 方法。获取对指定对象的独占锁（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system.threading/monitor/enter/
---
## Monitor::Enter(const SharedPtr\<Object\>\&) method


获取对指定对象的独占锁。

```cpp
static void System::Threading::Monitor::Enter(const SharedPtr<Object> &obj)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | 要获取监视器锁的对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Monitor::Enter(const System::SharedPtr\<Object\>\&, bool\&) method


获取对指定对象的独占锁，并原子性地设置一个指示锁是否已获取的值。

```cpp
static void System::Threading::Monitor::Enter(const System::SharedPtr<Object> &obj, bool &lockTaken)
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
