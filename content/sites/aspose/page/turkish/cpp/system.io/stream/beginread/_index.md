---
title: "System::IO::Stream::BeginRead yöntemi"
linktitle: "BeginRead"
second_title: "Aspose.Page için C++"
description: "System::IO::Stream::BeginRead yöntemi. C++'ta bir asenkron okuma işlemi başlatır."
type: docs
weight: 100
url: /tr/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


Asenkron bir okuma işlemi başlatır.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Okuma için bir tampon |
| offset | int | Okunan verinin yazılmaya başlanacağı konumu gösteren **buffer** içindeki 0 tabanlı offset. |
| count | int | Okunacak bayt sayısı |
| geri çağırma | System::AsyncCallback | İşlem tamamlandığında çağrılacak bir geri arama. |
| durum | System::SharedPtr\<System::Object\> | Her asenkron okuma işlemini benzersiz şekilde tanımlamak için kullanılan kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan eşzamansız okuma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
