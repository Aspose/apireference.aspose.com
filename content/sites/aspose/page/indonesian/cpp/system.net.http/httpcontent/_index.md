---
title: "System::Net::Http::HttpContent class"
linktitle: "HttpContent"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::HttpContent class. Mewakili konten dari entitas HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net.http/httpcontent/
---
## HttpContent class


Mewakili konten dari entitas HTTP. [Object](../../system/object/) dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class HttpContent : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Dispose](./dispose/)() override | Membuang instance saat ini. Metode ini juga membuang aliran yang dikembalikan oleh 'ReadAsStream' dan buffer memori jika dibuat. |
| [get_Headers](./get_headers/)() | Mengembalikan header konten HTTP. |
| [LoadIntoBuffer](./loadintobuffer/)() | Menyerialkan konten ke buffer memori. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | Menyerialkan konten ke buffer memori. |
| [ReadAsByteArray](./readasbytearray/)() | Menyerialkan konten dan mengembalikan array byte. |
| [ReadAsStream](./readasstream/)() | Menyerialkan konten dan mengembalikan aliran. |
| [ReadAsString](./readasstring/)() | Menyerialkan konten dan mengembalikan string. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | Mencoba menghitung ukuran konten. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | Pengkodean default. |
| static [MaxBufferSize](./maxbuffersize/) | Jumlah byte maksimum. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
