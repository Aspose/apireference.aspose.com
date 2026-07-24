---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Page untuk C++"
description: "System::Web::Services::Protocols::SoapHeader kelas. Mewakili konten header SOAP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


Mewakili konten header SOAP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SoapHeader : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Actor](./get_actor/)() | Mendapatkan URI penerima header SOAP ketika versi SOAP 1.1 digunakan. |
| [get_DidUnderstand](./get_didunderstand/)() | Mendapatkan nilai yang menunjukkan apakah header SOAP diproses dengan benar. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | Mendapatkan nilai atribut 'mustUnderstand' ketika versi SOAP 1.1 digunakan. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | Mendapatkan nilai atribut 'mustUnderstand' ketika versi SOAP 1.2 digunakan. |
| [get_EncodedRelay](./get_encodedrelay/)() | Mendapatkan representasi string dari nilai atribut 'relay'. |
| [get_MustUnderstand](./get_mustunderstand/)() | Mendapatkan nilai yang menunjukkan apakah header SOAP harus dipahami. |
| [get_Relay](./get_relay/)() | Mendapatkan nilai atribut 'relay'. |
| [get_Role](./get_role/)() | Mendapatkan URI penerima header SOAP ketika versi SOAP 1.2 digunakan. |
| [set_Actor](./set_actor/)(String) | Mengatur URI penerima header SOAP ketika versi SOAP 1.1 digunakan. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | Mengatur nilai yang menunjukkan apakah header SOAP diproses dengan benar. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | Mengatur nilai atribut 'mustUnderstand' ketika versi SOAP 1.1 digunakan. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | Mengatur nilai atribut 'mustUnderstand' ketika versi SOAP 1.2 digunakan. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | Mengatur representasi string dari nilai atribut 'relay'. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | Mengatur nilai yang menunjukkan apakah header SOAP harus dipahami. |
| [set_Relay](./set_relay/)(bool) | Mengatur nilai atribut 'relay'. |
| [set_Role](./set_role/)(String) | Mengatur URI penerima header SOAP ketika versi SOAP 1.2 digunakan. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | Membuat instance baru. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
