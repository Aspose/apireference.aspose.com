---
title: "System::Web::Services::Protocols::HttpWebClientProtocol sınıfı"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Page için C++"
description: "System::Web::Services::Protocols::HttpWebClientProtocol sınıfı. Bu temel sınıf, HTTP kullanan tüm XML Web hizmet istemci vekillerinde kullanılır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


Bu temel sınıf, HTTP kullanan tüm XML [Web](../../system.web/) hizmet istemci vekillerinde kullanılır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | Belirtilen istekteki çerezleri dahili çerez konteynerine ekler. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | İstemcinin sunucu yönlendirmelerini takip edip etmediğini gösteren bir değer alır. |
| [get_ClientCertificates](./get_clientcertificates/)() | İstemci sertifikalarının koleksiyonunu döndürür. |
| [get_CookieContainer](./get_cookiecontainer/)() | Çerezleri depolamak için kullanılan bir konteyner alır. |
| [get_EnableDecompression](./get_enabledecompression/)() | Açmanın etkin olup olmadığını gösteren bir değer alır. |
| [get_Proxy](./get_proxy/)() | Vekil (proxy) bilgilerini alır. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | İstemci NTLM kimlik doğrulaması kullandığında bağlantı paylaşımının etkin olup olmadığını gösteren bir değer alır. |
| [get_UserAgent](./get_useragent/)() | 'User-Agent' başlığının değerini alır. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | İstemcinin sunucu yönlendirmelerini takip edip etmediğini gösteren bir değeri ayarlar. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Çerezleri depolamak için kullanılan bir konteyneri ayarlar. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | Açmanın etkin olup olmadığını gösteren bir değeri ayarlar. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | Vekil (proxy) bilgilerini ayarlar. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | İstemci NTLM kimlik doğrulaması kullandığında bağlantı paylaşımının etkin olup olmadığını gösteren bir değeri ayarlar. |
| [set_UserAgent](./set_useragent/)(String) | 'User-Agent' başlığının bir değerini ayarlar. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## Ayrıca Bakınız

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
