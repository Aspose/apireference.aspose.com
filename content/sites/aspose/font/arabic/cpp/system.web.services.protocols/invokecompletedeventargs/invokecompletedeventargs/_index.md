---
title: "منشئ System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs. ينشئ نسخة جديدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


ينشئ نسخة جديدة.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| خطأ | Exception | أي خطأ حدث أثناء عملية غير متزامنة. |
| ملغى | bool | قيمة تشير إلى ما إذا كانت العملية غير المتزامنة ملغاة. |
| userState | System::SharedPtr\<Object\> | الكائن الاختياري لحالة المستخدم الممرَّر إلى طريقة [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)). |
| النتائج | System::ArrayPtr\<System::SharedPtr\<Object\>\> | مجموعة من نتائج العمليات غير المتزامنة. |

## انظر أيضًا

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
