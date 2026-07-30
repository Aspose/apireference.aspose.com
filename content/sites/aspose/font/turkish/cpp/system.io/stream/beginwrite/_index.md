---
title: "System::IO::Stream::BeginWrite yöntemi"
linktitle: "BeginWrite"
second_title: "Aspose.Font için C++"
description: "System::IO::Stream::BeginWrite yöntemi. C++'ta bir asenkron yazma işlemini başlatır."
type: docs
weight: 200
url: /tr/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Asenkron bir yazma işlemi başlatır.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Yazılacak verileri içeren bir tampon |
| offset | int | Yazılacak verinin başladığı konumu gösteren **buffer** içinde 0 tabanlı bir offset |
| count | int | Yazılacak bayt sayısı |
| geri arama | System::AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma |
| durum | System::SharedPtr\<System::Object\> | Her asenkron yazma işlemini benzersiz şekilde tanımlamak için kullanıcı tarafından sağlanan veri |

### ReturnValue

Başlatılan asenkron yazma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
