---
title: "kelas System::Net::IWebProxy"
linktitle: "IWebProxy"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Net::IWebProxy. Antarmuka ini digunakan untuk mengimplementasikan akses proxy ke kelas WebRequest. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2700
url: /id/cpp/system.net/iwebproxy/
---
## IWebProxy class


Antarmuka ini digunakan untuk mengimplementasikan akses proxy ke kelas [WebRequest](../webrequest/). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class IWebProxy : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | Informasi RTTI. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Mengembalikan URI proxy. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Mengembalikan nilai yang menunjukkan apakah proxy tidak boleh digunakan untuk host yang ditentukan. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Mengatur kredensial untuk otentikasi pada server proxy. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
