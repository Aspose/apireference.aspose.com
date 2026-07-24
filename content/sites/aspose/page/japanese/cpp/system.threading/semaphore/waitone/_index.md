---
title: "System::Threading::Semaphore::WaitOne メソッド"
linktitle: "WaitOne"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Semaphore::WaitOne メソッド。セマフォをロックします。必要に応じて C++ で無制限の待機を行います。"
type: docs
weight: 500
url: /ja/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


セマフォをロックします。必要に応じて無制限に待機します。

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

セマフォがロックされるまで戻らないため、常に true を返します。

## 参照

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::WaitOne(int) method


セマフォをロックします。必要に応じて待機します。

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| millisecondsTimeout | int | ミリ秒単位の待機タイムアウト。 |

### ReturnValue

セマフォがロックされた場合は true を、タイムアウトが超過した場合は false を返します。

## 参照

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
