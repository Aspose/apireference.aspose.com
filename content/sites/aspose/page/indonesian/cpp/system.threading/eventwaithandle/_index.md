---
title: "System::Threading::EventWaitHandle class"
linktitle: "EventWaitHandle"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::EventWaitHandle class. Event yang dapat dikirim ke thread yang menunggu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 500
url: /id/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | Informasi RTTI. |
| virtual [Reset](./reset/)() | Mengatur event ke keadaan non-sinyal. |
| virtual [Set](./set/)() | Mengatur event ke keadaan sinyal. |
| [~EventWaitHandle](./~eventwaithandle/)() | Destruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Nilai khusus yang akan dikembalikan oleh fungsi, selain mengembalikan indeks objek yang tersinyal dalam array, jika batas waktu terlampaui dan tidak ada yang menyinyal. |
## Lihat Juga

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
