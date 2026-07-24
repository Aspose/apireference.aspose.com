---
title: "System::IO::Stream::BeginWrite yöntemi"
linktitle: "BeginWrite"
second_title: "Aspose.Page için C++"
description: "System::IO::Stream::BeginWrite yöntemi. C++'ta eşzamanlı olmayan bir yazma işlemini başlatır."
type: docs
weight: 200
url: /tr/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Asenkron bir yazma işlemi başlatır.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Yazılacak verileri içeren bir tampon |
| offset | int | **buffer** içinde 0 tabanlı bir ofset, yazılacak verilerin başladığı konumu gösterir |
| count | int | Yazılacak bayt sayısı |
| geri çağırma | System::AsyncCallback | İşlem tamamlandığında çağrılacak bir geri arama. |
| durum | System::SharedPtr\<System::Object\> | Kullanıcı tarafından sağlanan veri, her eşzamanlı olmayan yazma işlemini benzersiz şekilde tanımlamak için kullanılır |

### ReturnValue

Başlatılan eşzamanlı olmayan yazma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
