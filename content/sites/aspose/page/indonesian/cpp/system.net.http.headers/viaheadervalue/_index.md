---
title: "Kelas System::Net::Http::Headers::ViaHeaderValue"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::Http::Headers::ViaHeaderValue. Mewakili nilai header ''Via''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


Mewakili nilai header 'Via'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Mengembalikan komentar dari nilai header 'Via'. |
| [get_ProtocolName](./get_protocolname/)() | Informasi RTTI. |
| [get_ProtocolVersion](./get_protocolversion/)() | Mengembalikan versi protokol dari nilai header 'Via'. |
| [get_ReceivedBy](./get_receivedby/)() | Mengembalikan host dan port yang menerima permintaan atau respons. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance kelas [ViaHeaderValue](./). |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi instance kelas [ViaHeaderValue](./). |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi instance kelas [ViaHeaderValue](./). |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | Membuat instance baru. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | Membuat instance baru. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | Membuat instance baru. |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
