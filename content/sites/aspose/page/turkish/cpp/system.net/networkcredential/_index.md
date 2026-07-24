---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Page için C++"
description: "System::Net::NetworkCredential class. Şifre tabanlı kimlik doğrulama şemaları için kimlik bilgileri sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıf her zaman System::SmartPtr işaretçisiyle sarılmalı ve bu işaretçi C++'de fonksiyonlara argüman olarak geçirilmelidir."
type: docs
weight: 2900
url: /tr/cpp/system.net/networkcredential/
---
## NetworkCredential class


Şifre tabanlı kimlik doğrulama şemaları için kimlik bilgileri sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıf her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarılmalı ve bu işaretçi fonksiyonlara argüman olarak geçirilmelidir.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Domain](./get_domain/)() | Kimlik bilgilerini doğrulayan alan adını alır. |
| [get_Password](./get_password/)() | Şifreyi alır. |
| [get_UserName](./get_username/)() | RTTI bilgisi. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Belirtilen URI ve kimlik doğrulama türü için kimlik bilgilerini döndürür. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Belirtilen ana bilgisayar adı, port ve kimlik doğrulama türü için kimlik bilgilerini döndürür. |
| [NetworkCredential](./networkcredential/)() | Yeni bir örnek oluşturur. |
| [NetworkCredential](./networkcredential/)(String, String) | Yeni bir örnek oluşturur. |
| [NetworkCredential](./networkcredential/)(String, String, String) | Yeni bir örnek oluşturur. |
| [set_Domain](./set_domain/)(String) | Kimlik bilgilerini doğrulayan alan adını ayarlar. |
| [set_Password](./set_password/)(String) | Şifreyi ayarlar. |
| [set_UserName](./set_username/)(String) | Kullanıcı adını ayarlar. |
## Ayrıca Bakınız

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
