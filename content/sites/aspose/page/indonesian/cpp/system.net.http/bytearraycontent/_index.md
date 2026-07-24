---
title: "System::Net::Http::ByteArrayContent class"
linktitle: "ByteArrayContent"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::ByteArrayContent class. Mewakili konten HTTP sebagai array byte. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


Mewakili konten HTTP sebagai array byte. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | Informasi RTTI. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Membuat instance baru. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | Mencoba menghitung panjang array byte. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | Pengkodean default. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Jumlah byte maksimum. |
## Lihat Juga

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
