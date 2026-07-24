---
title: "System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs منشئ"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page لـ C++"
description: "System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs منشئ. المنشئ في C++."
type: docs
weight: 100
url: /ar/cpp/system.componentmodel/asynccompletedeventargs/asynccompletedeventargs/
---
## AsyncCompletedEventArgs::AsyncCompletedEventArgs() constructor


منشئ.

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs()
```

## انظر أيضًا

* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) constructor


يُنشئ مثيلاً جديدًا للفئة [System.ComponentModel.AsyncCompletedEventArgs](../).

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception &error, bool canceled, const System::SharedPtr<System::Object> &userState)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| خطأ | const System::Exception\& | أي خطأ حدث أثناء العملية غير المتزامنة. |
| ملغى | bool | قيمة تشير إلى ما إذا كانت العملية غير المتزامنة قد أُلغيت. |
| userState | const System::SharedPtr\<System::Object\>\& | الكائن الاختياري لحالة المستخدم الممرَّة إلى طريقة [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../backgroundworker/runworkerasync/)([System.Object](../../../system/object/)). |

## انظر أيضًا

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
