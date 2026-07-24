---
title: "System::Threading::Tasks::Task::ConfigureAwait メソッド"
linktitle: "ConfigureAwait"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::Task::ConfigureAwait メソッド。C++ において、このタスクの await がコンテキストのキャプチャに関してどのように動作するかを構成します。"
type: docs
weight: 600
url: /ja/cpp/system.threading.tasks/task/configureawait/
---
## Task::ConfigureAwait method


このタスクに対する await のコンテキスト捕捉に関する動作を構成します。

```cpp
Runtime::CompilerServices::ConfiguredTaskAwaitable System::Threading::Tasks::Task::ConfigureAwait(bool continueOnCapturedContext) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| continueOnCapturedContext | bool | 捕捉されたコンテキストで継続するかどうか |

### ReturnValue

[Runtime::CompilerServices::ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/) A configured awaitable

## 参照

* Class [ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
