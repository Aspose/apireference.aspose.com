---
title: "System::Net::HttpWebRequest sınıfı"
linktitle: "HttpWebRequest"
second_title: "Aspose.Font için C++"
description: "System::Net::HttpWebRequest sınıfı. HTTP web isteğini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaya çalışmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için C++'ta kullanın."
type: docs
weight: 2000
url: /tr/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


HTTP web isteğini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaya çalışmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Abort](./abort/)() override | Mevcut isteği iptal eder. |
| virtual [AddRange](./addrange/)(int32_t) | Mevcut isteğe 'Range' başlığını ekler. |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | Mevcut isteğe 'Range' başlığını ekler. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Kaynağa veri yazmak için bir akış elde etmeye yönelik eşzamansız bir işlemi başlatır. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Kaynak için eşzamansız bir isteği başlatır. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Belirtilen akış elde etme eşzamansız işlemi tamamlanana kadar bekler. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Kaynak için belirtilen eşzamansız isteğin tamamlanmasını bekler. |
| [get_Accept](./get_accept/)() | 'Accept' HTTP başlık değerini alır. |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | İsteğin yönlendirmeleri takip edip etmeyeceğini gösteren bir değeri alır. |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | Kaynağın gönderdiği verinin tamponlanması gerekip gerekmediğini gösteren bir değeri alır. |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | Veri gönderimi için tamponlamanın etkin olup olmadığını gösteren bir değeri alır. |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | Mevcut istek ile ilişkili sertifikalar koleksiyonunu alır. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | Bağlantı grubunun adını alır. |
| [get_ContentLength](./get_contentlength/)() override | Gönderilecek istek verisinin bayt sayısını alır. |
| [get_ContentType](./get_contenttype/)() override | İsteğin MIME tipini alır. |
| [get_ContinueTimeout](./get_continuetimeout/)() | 100-Continue durum kodu alınana kadar beklemek için bir zaman aşımını alır. |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | Mevcut web isteğiyle ilişkili bir çerez konteynerini alır. |
| [get_Credentials](./get_credentials/)() override | Mevcut istek ile ilişkili kimlik doğrulama bilgilerini alır. |
| virtual [get_HaveResponse](./get_haveresponse/)() | Bir yanıt alınıp alınmadığını gösteren bir değeri döndürür. |
| [get_Headers](./get_headers/)() override | HTTP başlıklarının koleksiyonunu alır. |
| virtual [get_KeepAlive](./get_keepalive/)() | Mevcut isteğin 'Keep-Alive' başlığını içermesi gerekip gerekmediğini gösteren bir değeri alır. |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | İzin verilen maksimum yönlendirme sayısını alır. |
| [get_Method](./get_method/)() override | HTTP yöntemini alır. |
| [get_PreAuthenticate](./get_preauthenticate/)() override | İsteğin önceden kimlik doğrulaması yapılması gerekip gerekmediğini gösteren bir değeri alır. |
| [get_Proxy](./get_proxy/)() override | HTTP proxy'sini alır. |
| virtual [get_Referer](./get_referer/)() | 'Referer' başlığının değerini alır. |
| [get_RequestUri](./get_requesturi/)() override | İstek URI'sını döndürür. |
| virtual [get_SendChunked](./get_sendchunked/)() | Verinin segmentler halinde gönderilip gönderilmemesi gerektiğini gösteren bir değeri alır. |
| [get_ServicePoint](./get_servicepoint/)() | Kaynağa olan ağ bağlantısını temsil eden bir servis noktasını döndürür. |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | Mevcut isteğin bir çerez kapsayıcısı kullanıp kullanamayacağını gösteren bir değeri döndürür. |
| [get_Timeout](./get_timeout/)() override | İsteğin zaman aşımına uğrayacağı milisaniye cinsinden süreyi alır. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | 'Credential' özelliğinin 'DefaultCredentials' özelliğine eşit olup olmadığını gösteren bir değeri alır. |
| virtual [get_UserAgent](./get_useragent/)() | 'User-Agent' başlığının değerini alır. |
| [GetRequestStream](./getrequeststream/)() override | Kaynağa veri yazmak için akışı döndürür. |
| [GetResponse](./getresponse/)() override | Mevcut web isteğiyle ilişkili web yanıtını döndürür. |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | Yeni bir örnek oluşturur. |
| [set_Accept](./set_accept/)(String) | 'Accept' HTTP başlık değerini ayarlar. |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | İsteğin yönlendirmeleri takip edip etmeyeceğini gösteren bir değeri ayarlar. |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | Kaynağın gönderdiği verinin önbelleğe alınıp alınmayacağını gösteren bir değeri ayarlar. |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | Veri gönderimi için önbelleklemenin etkin olup olmadığını gösteren bir değeri ayarlar. |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | Mevcut istekle ilişkili sertifikaların koleksiyonunu ayarlar. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | Bağlantı grubunun adını ayarlar. |
| [set_ContentLength](./set_contentlength/)(int64_t) override | Gönderilecek istek verisinin bayt sayısını ayarlar. |
| [set_ContentType](./set_contenttype/)(String) override | İsteğin MIME tipini ayarlar. |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | 100-Continue durum kodu alınana kadar beklemek için bir zaman aşımı ayarlar. |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Mevcut web isteğiyle ilişkili bir çerez kapsayıcısı ayarlar. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | Mevcut istekle ilişkili kimlik doğrulama bilgilerini ayarlar. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP başlıklarının koleksiyonunu ayarlar. |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | Mevcut isteğin 'Keep-Alive' başlığını içermesi gerekip gerekmediğini gösteren bir değeri ayarlar. |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | İzin verilen maksimum yönlendirme sayısını ayarlar. |
| [set_Method](./set_method/)(String) override | HTTP yöntemini ayarlar. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | İsteğin önceden kimlik doğrulaması gerekip gerekmediğini gösteren bir değeri ayarlar. |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | RTTI bilgisi. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | HTTP proxy'sini ayarlar. |
| virtual [set_Referer](./set_referer/)(System::String) | 'Referer' başlığının değerini ayarlar. |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | Verinin segmentler halinde gönderilip gönderilmemesi gerektiğini gösteren bir değeri ayarlar. |
| [set_Timeout](./set_timeout/)(int) override | İsteğin zaman aşımına uğrayacağı milisaniye cinsinden süreyi ayarlar. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | 'Credential' özelliğinin 'DefaultCredentials' özelliğine eşit olup olmadığını gösteren bir değeri ayarlar. |
| virtual [set_UserAgent](./set_useragent/)(System::String) | 'User-Agent' başlığının değerini ayarlar. |
## Ayrıca Bakınız

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
