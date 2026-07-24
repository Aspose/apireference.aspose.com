---
title: "System::Threading::ManualResetEvent kelas"
linktitle: "ManualResetEvent"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::ManualResetEvent kelas. Peristiwa untuk memberi tahu thread yang menunggu yang tidak mereset secara otomatis. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | Informasi RTTI. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Nilai khusus yang akan dikembalikan oleh fungsi, selain mengembalikan indeks objek yang tersinyal dalam array, jika batas waktu terlampaui dan tidak ada yang menyinyal. |
## Lihat Juga

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
