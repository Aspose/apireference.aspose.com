---
title: "System::Threading::WaitHandle kelas"
linktitle: "WaitHandle"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::WaitHandle kelas. Kelas dasar primitif penunggu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.threading/waithandle/
---
## WaitHandle class


kelas dasar primitif penunggu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class WaitHandle : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Close](./close/)() | Melepaskan semua sumber daya yang terkait dengan handle. |
| [get_Handle](./get_handle/)() | Mendapatkan handle. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Informasi RTTI. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Menunggu semua handle untuk aktif. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Menunggu semua handle untuk aktif. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Menunggu salah satu handle untuk aktif. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Menunggu salah satu handle untuk aktif. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Menunggu salah satu handle untuk aktif. |
| virtual [WaitOne](./waitone/)() | Menunggu pegangan untuk dipicu selama periode tak terbatas. |
| virtual [WaitOne](./waitone/)(int) | Menunggu pegangan untuk dipicu. |
| virtual [WaitOne](./waitone/)(TimeSpan) | Menunggu pegangan untuk dipicu. |
| virtual [WaitOne](./waitone/)(int, bool) | Menunggu pegangan untuk dipicu. |
| virtual [~WaitHandle](./~waithandle/)() | Destruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | Nilai khusus yang akan dikembalikan oleh fungsi, selain mengembalikan indeks objek yang tersinyal dalam array, jika batas waktu terlampaui dan tidak ada yang menyinyal. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
