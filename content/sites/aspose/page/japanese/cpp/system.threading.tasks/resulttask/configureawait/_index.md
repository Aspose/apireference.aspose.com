---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait メソッド"
linktitle: "ConfigureAwait"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait メソッド。この結果タスクの await がコンテキストの捕捉に関してどのように動作するかを C++ で構成します。"
type: docs
weight: 200
url: /ja/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


この結果タスクに対する await のコンテキスト捕捉に関する動作を構成します。

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| continueOnCapturedContext | bool | 捕捉されたコンテキストで継続するかどうか |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## 備考



これにより、async/await パターンのコンテキストフローを細かく制御できます

## 参照

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
