---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs yapıcı"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Page için C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs yapıcı. C++'ta yeni bir örnek oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


Yeni bir örnek oluşturur.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| hata | Exception | Asenkron bir işlem sırasında oluşan herhangi bir hata. |
| iptal edildi | bool | Asenkron bir işlemin iptal edilip edilmediğini gösteren bir değer. |
| userState | System::SharedPtr\<Object\> | İsteğe bağlı, kullanıcı tarafından sağlanan durum nesnesi, [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) yöntemine geçirilir. |
| sonuçlar | System::ArrayPtr\<System::SharedPtr\<Object\>\> | Asenkron işlem sonuçlarının bir koleksiyonu. |

## Ayrıca Bakınız

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
