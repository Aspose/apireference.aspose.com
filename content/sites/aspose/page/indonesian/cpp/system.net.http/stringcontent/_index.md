---
title: "System::Net::Http::StringContent kelas"
linktitle: "StringContent"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::Http::StringContent. Mewakili konten HTTP sebagai string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.net.http/stringcontent/
---
## StringContent class


Mewakili konten HTTP sebagai string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [StringContent](./stringcontent/)(String) | Informasi RTTI. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | Membuat instance baru. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | Membuat instance baru. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | Pengkodean default. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Jumlah byte maksimum. |
## Lihat Juga

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
