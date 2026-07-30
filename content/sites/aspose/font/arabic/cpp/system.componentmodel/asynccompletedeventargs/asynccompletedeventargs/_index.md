---
title: "منشئ System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs. منشئ في C++."
type: docs
weight: 100
url: /ar/cpp/system.componentmodel/asynccompletedeventargs/asynccompletedeventargs/
---
## AsyncCompletedEventArgs::AsyncCompletedEventArgs() constructor


المُنشئ.

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs()
```

## انظر أيضًا

* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) constructor


يُهيئ مثيلاً جديداً من الفئة [System.ComponentModel.AsyncCompletedEventArgs](../).

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception &error, bool canceled, const System::SharedPtr<System::Object> &userState)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| خطأ | const System::Exception\& | أي خطأ حدث أثناء العملية غير المتزامنة. |
| ملغاة | bool | قيمة تشير إلى ما إذا كانت العملية غير المتزامنة قد أُلغيت. |
| userState | const System::SharedPtr\<System::Object\>\& | كائن الحالة الاختياري المقدم من المستخدم والذي يُمرّر إلى طريقة [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) |

## انظر أيضًا

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
