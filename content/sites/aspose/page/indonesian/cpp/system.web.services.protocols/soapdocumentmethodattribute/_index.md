---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute kelas"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Page untuk C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute kelas. Menentukan bahwa semua pesan SOAP yang dikirim atau dikembalikan dari metode menggunakan format Document. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


Menentukan bahwa semua pesan SOAP yang dikirim atau dikembalikan dari metode menggunakan format Document. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Action](./get_action/)() | Informasi RTTI. |
| [get_Binding](./get_binding/)() | Mendapatkan binding untuk mana metode layanan web XML mengimplementasikan operasi. |
| [get_OneWay](./get_oneway/)() | Mendapatkan nilai yang menunjukkan apakah klien tidak menunggu server menyelesaikan pemrosesan metode. |
| [get_ParameterStyle](./get_parameterstyle/)() | Mendapatkan nilai yang menunjukkan apakah parameter dibungkus dalam satu elemen XML di bawah elemen 'Body'. |
| [get_RequestElementName](./get_requestelementname/)() | Mendapatkan nama elemen XML yang terkait dengan permintaan SOAP, yang didefinisikan dalam deskripsi layanan sebagai operasi. |
| [get_RequestNamespace](./get_requestnamespace/)() | Mendapatkan namespace yang terkait dengan permintaan SOAP. |
| [get_ResponseElementName](./get_responseelementname/)() | Mendapatkan nama elemen XML yang terkait dengan respons SOAP. |
| [get_ResponseNamespace](./get_responsenamespace/)() | Mendapatkan namespace yang terkait dengan respons SOAP. |
| [get_Use](./get_use/)() | Mendapatkan nilai yang menentukan metode pengkodean pesan. |
| [set_Action](./set_action/)(String) | Mengatur nilai atribut 'SOAPAction'. |
| [set_Binding](./set_binding/)(String) | Mengatur binding untuk mana metode layanan web XML mengimplementasikan sebuah operasi. |
| [set_OneWay](./set_oneway/)(bool) | Mengatur nilai yang menunjukkan apakah klien tidak menunggu server menyelesaikan pemrosesan metode. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Mengatur nilai yang menunjukkan apakah parameter dibungkus dalam satu elemen XML di bawah elemen 'Body'. |
| [set_RequestElementName](./set_requestelementname/)(String) | Mengatur nama elemen XML yang terkait dengan permintaan SOAP, yang didefinisikan dalam deskripsi layanan sebagai operasi. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | Mengatur namespace yang terkait dengan permintaan SOAP. |
| [set_ResponseElementName](./set_responseelementname/)(String) | Mengatur nama elemen XML yang terkait dengan respons SOAP. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | Mengatur namespace yang terkait dengan respons SOAP. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Mengatur nilai yang menentukan metode pengkodean pesan. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | Membuat instance baru. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | Membuat instance baru. |
## Lihat Juga

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
