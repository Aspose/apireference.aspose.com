---
title: "System::Threading::Tasks::ResultValueTask::operator== メソッド"
linktitle: "operator=="
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::operator== メソッド。 C++ における ResultValueTask の等価演算子です。"
type: docs
weight: 1200
url: /ja/cpp/system.threading.tasks/resultvaluetask/operator==/
---
## ResultValueTask::operator== method


[ResultValueTask](../) の等価演算子です。

```cpp
bool System::Threading::Tasks::ResultValueTask<T>::operator==(const ResultValueTask &other) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | const ResultValueTask\& | このインスタンスと比較する他の [ResultValueTask](../)です。 |

### ReturnValue

bool 両方のタスクが同じ結果値を持つか、同じ基底タスクを参照している場合は true。それ以外の場合は false。
## 備考



いずれかのインスタンスが直接結果値を持つ場合、結果を直接比較します。それ以外の場合は、基底タスクのポインタを比較します。
## 参照

* Class [ResultValueTask](../)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
