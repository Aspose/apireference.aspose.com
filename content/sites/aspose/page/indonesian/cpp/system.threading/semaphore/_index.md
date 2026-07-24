---
title: "System::Threading::Semaphore kelas"
linktitle: "Semaphore"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Semaphore kelas. Implementasi semaphore. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Release](./release/)() | Melepaskan kunci pada semaphore. |
| [Release](./release/)(int) | Melepaskan beberapa kunci pada semaphore. |
| virtual [Reset](./reset/)() | Mengatur semaphore ke keadaan tidak tersinyal. Tidak didukung. |
| [Semaphore](./semaphore/)(int, int) | Informasi RTTI. |
| [Semaphore](./semaphore/)(int, int, const String\&) | Membuat semaphore bernama. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | Membuat semaphore bernama. |
| virtual [Set](./set/)() | Mengatur semaphore ke keadaan tersinyal. Tidak didukung. |
| [WaitOne](./waitone/)() override | Mengunci semaphore. Melakukan penunggu tak terbatas jika diperlukan. |
| [WaitOne](./waitone/)(int) override | Mengunci semaphore. Melakukan penunggu jika diperlukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Nilai khusus yang akan dikembalikan oleh fungsi, selain mengembalikan indeks objek yang tersinyal dalam array, jika batas waktu terlampaui dan tidak ada yang menyinyal. |
## Lihat Juga

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
