---
title: "System::Threading::Semaphore::Semaphore 构造函数"
linktitle: "信号量"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Semaphore::Semaphore 构造函数。C++ 中的 RTTI 信息。"
type: docs
weight: 100
url: /zh/cpp/system.threading/semaphore/semaphore/
---
## Semaphore::Semaphore(int, int) constructor


RTTI 信息。

```cpp
System::Threading::Semaphore::Semaphore(int initialCount, int maximumCount)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| initialCount | int | 活动条目的初始计数。 |
| maximumCount | int | 允许条目的最大计数。 |
## 备注


创建未命名信号量。
## 另见

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::Semaphore(int, int, const String\&) constructor


创建命名信号量。

```cpp
System::Threading::Semaphore::Semaphore(int initialCount, int maximumCount, const String &name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| initialCount | int | 活动条目的初始计数。 |
| maximumCount | int | 允许条目的最大计数。 |
| name | const String\& | [Semaphore](../) 名称。 |

## 另见

* Class [String](../../../system/string/)
* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::Semaphore(int, int, const String\&, bool\&) constructor


创建命名信号量。

```cpp
System::Threading::Semaphore::Semaphore(int initialCount, int maximumCount, const String &name, bool &createdNew)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| initialCount | int | 活动条目的初始计数。 |
| maximumCount | int | 允许条目的最大计数。 |
| name | const String\& | [Semaphore](../) 名称。 |
| createdNew | bool\& | 对变量的引用，如果信号量被创建则设为 true，如果使用了同名的已有信号量则设为 false |

## 另见

* Class [String](../../../system/string/)
* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
