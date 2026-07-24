---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait メソッド"
linktitle: "ConfigureAwait"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait メソッド。 C++ でこのタスクの awaiter を構成します。"
type: docs
weight: 300
url: /ja/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


このタスクの awaiter を構成します。

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| continueOnCapturedContext | bool | true は、取得した元のコンテキストに継続処理を戻すことを試みます。そうでない場合は false。 |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> このタスクの awaiter の動作を構成するオブジェクトです。

## 参照

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
