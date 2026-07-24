---
title: "System::Web::Services::Protocols::SoapMessage class"
linktitle: "SoapMessage"
second_title: "Aspose.Page untuk C++"
description: "System::Web::Services::Protocols::SoapMessage class. Mewakili pesan SOAP. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


Mewakili pesan SOAP. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SoapMessage : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | Mengatur koleksi internal header-header SOAP. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | Temukan pemetaan header berdasarkan tipe header yang ditentukan. |
| virtual [get_Action](./get_action/)() | Mengembalikan nilai atribut 'SOAPAction'. |
| [get_ContentEncoding](./get_contentencoding/)() | Mendapatkan nilai dari header 'Content-Encoding'. |
| [get_ContentType](./get_contenttype/)() | Mendapatkan nilai dari header 'Content-Type'. |
| [get_Exception](./get_exception/)() | Mendapatkan pengecualian yang dilemparkan oleh metode layanan XML [Web](../../system.web/). |
| [get_Headers](./get_headers/)() | Mengembalikan koleksi header SOAP. |
| [get_InParameters](./get_inparameters/)() | Mendapatkan parameter yang diteruskan ke metode layanan XML [Web](../../system.web/). |
| [get_IsSoap12](./get_issoap12/)() | Mengembalikan nilai yang menunjukkan apakah versi SOAP 1.2 digunakan. |
| [get_OutParameters](./get_outparameters/)() | Mendapatkan parameter keluaran yang diteruskan ke metode layanan XML [Web](../../system.web/). |
| virtual [get_SoapVersion](./get_soapversion/)() | Mengembalikan versi SOAP yang digunakan. |
| [get_Stage](./get_stage/)() | Mendapatkan tahap pemrosesan pesan SOAP. |
| [get_Stream](./get_stream/)() | Mendapatkan aliran yang berisi data pesan SOAP. |
| virtual [get_Url](./get_url/)() | Mengembalikan URL layanan XML [Web](../../system.web/). |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | Mendapatkan nilai parameter input pada indeks yang ditentukan. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | Mendapatkan nilai parameter output pada indeks yang ditentukan. |
| [GetReturnValue](./getreturnvalue/)() | Mendapatkan nilai kembali dari metode layanan XML [Web](../../system.web/). |
| [set_ContentEncoding](./set_contentencoding/)(String) | Mengatur nilai header 'Content-Encoding'. |
| [set_ContentType](./set_contenttype/)(String) | Menetapkan nilai pada header 'Content-Type'. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Mengatur parameter yang diteruskan ke metode layanan XML [Web](../../system.web/). |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | Mengatur aliran yang berisi data pesan SOAP. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Mengatur parameter keluaran yang diteruskan ke metode layanan XML [Web](../../system.web/). |
| [SetException](./setexception/)(SoapException) | Mengatur pengecualian yang dilemparkan oleh metode layanan XML [Web](../../system.web/). |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | Mengatur koleksi header SOAP. |
| [SetStage](./setstage/)(SoapMessageStage) | Mengatur tahap pemrosesan pesan SOAP. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | Mengatur aliran yang berisi data pesan SOAP. |
| [SoapMessage](./soapmessage/)() | Membuat instance baru. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | Memperbarui koleksi internal header SOAP. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
