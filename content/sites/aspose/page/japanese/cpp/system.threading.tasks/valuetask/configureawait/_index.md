---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait メソッド"
linktitle: "ConfigureAwait"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait メソッド。C++ でこのタスクの awaiter を構成します。"
type: docs
weight: 300
url: /ja/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


このタスクの awaiter を構成します。

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| continueOnCapturedContext | bool | true は、取得した元のコンテキストに継続処理を戻すことを試みます。そうでない場合は false。 |

### ReturnValue

ConfiguredValueTaskAwaitable このタスクの awaiter の動作方法を構成するオブジェクト。

## 参照

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
