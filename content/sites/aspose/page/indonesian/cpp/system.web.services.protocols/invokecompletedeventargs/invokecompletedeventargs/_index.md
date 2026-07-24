---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Page untuk C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor. Membuat sebuah instance baru dalam C++."
type: docs
weight: 100
url: /id/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


Membuat instance baru.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kesalahan | Exception | Setiap kesalahan yang terjadi selama operasi asinkron. |
| dibatalkan | bool | Nilai yang menunjukkan apakah operasi asinkron dibatalkan. |
| userState | System::SharedPtr\<Object\> | Objek status opsional yang disediakan pengguna yang diteruskan ke metode [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)). |
| results | System::ArrayPtr\<System::SharedPtr\<Object\>\> | Koleksi hasil operasi asinkron. |

## Lihat Juga

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
