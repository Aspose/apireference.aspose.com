---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol class"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Page untuk C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol class. Layanan proxy klien harus mewarisi kelas ini ketika SOAP digunakan. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


Layanan proxy klien harus mewarisi kelas ini ketika SOAP digunakan. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Discover](./discover/)() | Mengikat instance saat ini ke layanan XML [Web](../../system.web/). |
| [get_SoapVersion](./get_soapversion/)() | Mendapatkan versi SOAP. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Menginisialisasi bidang internal. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | Mengatur versi SOAP. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Membuat instance baru. |
## Lihat Juga

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
