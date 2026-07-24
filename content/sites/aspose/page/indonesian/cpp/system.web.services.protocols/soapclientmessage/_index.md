---
title: "System::Web::Services::Protocols::SoapClientMessage kelas"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page untuk C++"
description: "System::Web::Services::Protocols::SoapClientMessage kelas. Mewakili data dalam permintaan SOAP yang dikirim atau respons SOAP yang diterima. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen di C++."
type: docs
weight: 300
url: /id/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Mewakili data dalam permintaan SOAP yang dikirim atau respons SOAP yang diterima. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Action](./get_action/)() override | Mengembalikan nilai atribut 'SOAPAction'. |
| [get_Client](./get_client/)() | Mengembalikan sebuah instance dari kelas proxy klien. |
| virtual [get_OneWay](./get_oneway/)() | Mengembalikan nilai yang menunjukkan apakah klien tidak menunggu server menyelesaikan pemrosesan suatu metode. |
| [get_SoapVersion](./get_soapversion/)() override | Mengembalikan versi SOAP yang digunakan. |
| [get_Url](./get_url/)() override | Mengembalikan URL layanan XML [Web](../../system.web/). |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Membuat instance baru. |
## Lihat Juga

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
