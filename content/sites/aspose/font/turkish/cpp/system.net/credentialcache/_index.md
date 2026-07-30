---
title: "System::Net::CredentialCache sınıfı"
linktitle: "CredentialCache"
second_title: "Aspose.Font için C++"
description: "System::Net::CredentialCache sınıfı. Kimlik bilgileri depolamasını sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.net/credentialcache/
---
## CredentialCache class


Kimlik bilgileri depolamasını sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | Belirtilen ağ kimlik bilgilerini önbelleğe ekler. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | Belirtilen ağ kimlik bilgilerini önbelleğe ekler. |
| [CredentialCache](./credentialcache/)() | Yeni bir örnek oluşturur. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | RTTI bilgisi. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | Mevcut kullanıcı veya uygulamanın ağ kimlik bilgilerini döndürür. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Belirtilen URI öneki ve kimlik doğrulama türü için kimlik bilgilerini döndürür. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Belirtilen ana bilgisayar adı, bağlantı noktası ve kimlik doğrulama türü için kimlik bilgilerini döndürür. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | Belirtilen URI öneki ve kimlik doğrulama türü için ağ kimlik bilgilerini kaldırır. |
| [Remove](./remove/)(String, int32_t, String) | Belirtilen ana bilgisayar adı, bağlantı noktası ve kimlik doğrulama türü için ağ kimlik bilgilerini kaldırır. |
## Ayrıca Bakınız

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
