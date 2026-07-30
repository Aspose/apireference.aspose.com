---
title: "System::Net::WebProxy sınıfı"
linktitle: "WebProxy"
second_title: "Aspose.Font için C++"
description: "System::Net::WebProxy sınıfı. Bir http web-proxy sunucusunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya operator new kullanılarak bu tipin örneği oluşturulmaz; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3700
url: /tr/cpp/system.net/webproxy/
---
## WebProxy class


Bir http web-proxy sunucusunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya operator new kullanılarak bu tipin örneği oluşturulmaz; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Address](./get_address/)() | Mevcut proxy sunucusunun adresini alır. |
| [get_BypassList](./get_bypasslist/)() | Proxy sunucusunu kullanmayan adreslerin listesini alır. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | Proxy sunucusunun yerel adresler için kullanılıp kullanılmayacağını gösteren bir değeri alır. |
| virtual [get_Credentials](./get_credentials/)() | Kimlik doğrulama için proxy sunucusuna gönderilen kimlik bilgilerini alır. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | İsteklerle birlikte varsayılan kimlik bilgilerinin gönderilip gönderilmemesi gerektiğini gösteren bir değeri alır. |
| static [GetDefaultProxy](./getdefaultproxy/)() | Internet Explorer'ın dinamik olmayan ayarlarını kullanan proxy'yi döndürür. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Bir web isteği için proxy aracılığıyla yönlendirilen URI'yi döndürür. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Belirtilen URI için proxy sunucusunun kullanılmadığını kontrol eder. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | Mevcut proxy sunucusunun adresini ayarlar. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | Proxy sunucusunu kullanmayan adreslerin listesini ayarlar. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | Yerel adresler için proxy sunucusunun kullanılıp kullanılmayacağını gösteren bir değer ayarlar. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Kimlik doğrulama için proxy sunucusuna gönderilen kimlik bilgilerini ayarlar. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | İsteklerle birlikte varsayılan kimlik bilgilerinin gönderilip gönderilmeyeceğini gösteren bir değer ayarlar. |
| [WebProxy](./webproxy/)() | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(String, int32_t) | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(String) | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(String, bool) | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | Yeni bir örnek oluşturur. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
