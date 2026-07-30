---
title: "System::Net::WebRequest class"
linktitle: "WebRequest"
second_title: "Aspose.Font için C++"
description: "System::Net::WebRequest class. Bir web isteğini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3800
url: /tr/cpp/system.net/webrequest/
---
## WebRequest class


Bir web isteğini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Abort](./abort/)() | Mevcut isteği iptal eder. |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | Kaynağa veri yazmak için bir akış elde etmeye yönelik eşzamansız bir işlemi başlatır. |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | Kaynak için eşzamansız bir isteği başlatır. |
| static [Create](./create/)(String) | Belirtilen URI'yi kullanarak [WebRequest](./) sınıfının yeni bir örneğini oluşturur. |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | Belirtilen URI'yi kullanarak [WebRequest](./) sınıfının yeni bir örneğini oluşturur. |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | Belirtilen URI şeması için bir [WebRequest](./) türevi oluşturur. |
| static [CreateHttp](./createhttp/)(String) | Belirtilen URI'yi kullanarak [WebRequest](./) sınıfının yeni bir örneğini oluşturur. |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | Belirtilen URI'yi kullanarak [WebRequest](./) sınıfının yeni bir örneğini oluşturur. |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen akış elde etme eşzamansız işlemi tamamlanana kadar bekler. |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | Kaynak için belirtilen eşzamansız isteğin tamamlanmasını bekler. |
| virtual [get_CachePolicy](./get_cachepolicy/)() | Önbellek politikasını alır. |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | Bağlantı grubunun adını alır. |
| virtual [get_ContentLength](./get_contentlength/)() | Gönderilecek istek verisinin bayt sayısını alır. |
| virtual [get_ContentType](./get_contenttype/)() | İsteğin MIME tipini alır. |
| virtual [get_Credentials](./get_credentials/)() | Mevcut istek ile ilişkili kimlik doğrulama bilgilerini alır. |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | Genel HTTP proxy'sini alır. |
| virtual [get_Headers](./get_headers/)() | HTTP başlıklarının koleksiyonunu alır. |
| virtual [get_Method](./get_method/)() | HTTP yöntemini alır. |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | İsteğin önceden kimlik doğrulaması yapılması gerekip gerekmediğini gösteren bir değeri alır. |
| static [get_PrefixList](./get_prefixlist/)() | Önek listesini alır. |
| virtual [get_Proxy](./get_proxy/)() | HTTP proxy'sini alır. |
| virtual [get_RequestUri](./get_requesturi/)() | İstek URI'sını döndürür. |
| virtual [get_Timeout](./get_timeout/)() | İsteğin zaman aşımına uğrayacağı milisaniye cinsinden süreyi alır. |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | 'Credential' özelliğinin 'DefaultCredentials' özelliğine eşit olup olmadığını gösteren bir değeri alır. |
| virtual [GetRequestStream](./getrequeststream/)() | Kaynağa veri yazmak için akışı döndürür. |
| virtual [GetResponse](./getresponse/)() | Mevcut web isteğiyle ilişkili web yanıtını döndürür. |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | Belirtilen URI için [WebRequest](./) türevini kaydeder. |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | Önbellek politikasını ayarlar. |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | Bağlantı grubunun adını ayarlar. |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | Gönderilecek istek verisinin bayt sayısını ayarlar. |
| virtual [set_ContentType](./set_contenttype/)(String) | İsteğin MIME tipini ayarlar. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Mevcut istekle ilişkili kimlik doğrulama bilgilerini ayarlar. |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | Genel HTTP proxy'sini ayarlar. |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | HTTP başlıklarının koleksiyonunu ayarlar. |
| virtual [set_Method](./set_method/)(String) | HTTP yöntemini ayarlar. |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | İsteğin önceden kimlik doğrulaması gerekip gerekmediğini gösteren bir değeri ayarlar. |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | Önek listesini ayarlar. |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | HTTP proxy'sini ayarlar. |
| virtual [set_Timeout](./set_timeout/)(int32_t) | İsteğin zaman aşımına uğrayacağı milisaniye cinsinden süreyi ayarlar. |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 'Credential' özelliğinin 'DefaultCredentials' özelliğine eşit olup olmadığını gösteren bir değeri ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
