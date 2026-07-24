---
title: "System::Threading::Monitor::Enter メソッド"
linktitle: "Enter"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Monitor::Enter メソッド。指定されたオブジェクトに対して排他的ロックを取得します（C++）。"
type: docs
weight: 100
url: /ja/cpp/system.threading/monitor/enter/
---
## Monitor::Enter(const SharedPtr\<Object\>\&) method


指定されたオブジェクトに対して排他ロックを取得します。

```cpp
static void System::Threading::Monitor::Enter(const SharedPtr<Object> &obj)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | モニターロックを取得する対象オブジェクト。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Monitor::Enter(const System::SharedPtr\<Object\>\&, bool\&) method


指定されたオブジェクトに対して排他ロックを取得し、ロックが取得されたかを示す値を原子的に設定します。

```cpp
static void System::Threading::Monitor::Enter(const System::SharedPtr<Object> &obj, bool &lockTaken)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
