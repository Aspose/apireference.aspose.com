---
title: "System::Threading::Tasks::ResultValueTask::get_Result メソッド"
linktitle: "get_Result"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::get_Result メソッド。 完了したタスクの結果を C++ で取得します。"
type: docs
weight: 900
url: /ja/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


完了したタスクの結果を取得します。

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T 結果の値です。
## 備考



タスクが [ResultTask<T>](../../resulttask/) に裏付けられている場合、このメソッドは結果を await し、キャッシュします。その後の呼び出しは await せずにキャッシュされた値を返します。

## 参照

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
