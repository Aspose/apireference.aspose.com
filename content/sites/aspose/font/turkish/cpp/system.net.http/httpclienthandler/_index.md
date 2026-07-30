---
title: "System::Net::Http::HttpClientHandler sınıfı"
linktitle: "HttpClientHandler"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::HttpClientHandler sınıfı. HttpClient sınıfı tarafından kullanılan varsayılan ileti işleyicisini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Varsayılan ileti işleyicisini temsil eder ve [HttpClient](../httpclient/) sınıfı tarafından kullanılır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| [get_CookieContainer](./get_cookiecontainer/)() | Sunucu çerezlerini depolamak için kullanılan çerez konteynerini alır. |
| [get_Credentials](./get_credentials/)() | Kimlik doğrulama bilgilerini alır. |
| [HttpClientHandler](./httpclienthandler/)() | RTTI bilgisi. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | RTTI bilgisi. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Sunucu çerezlerini depolamak için kullanılan çerez konteynerini ayarlar. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Kimlik doğrulama bilgilerini ayarlar. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Proxy bilgisini ayarlar. |
| [set_Timeout](./set_timeout/)(int32_t) | İsteğin zaman aşımına uğrayacağı milisaniye cinsinden süreyi alır. |
| [set_UseCookies](./set_usecookies/)(bool) | Mevcut örneğin sunucu çerezlerini depolamak için çerez konteynerini kullanıp kullanmadığını ve istek gönderirken sunucu çerezlerini kullanıp kullanmadığını belirten değeri ayarlar. |
| [set_UseProxy](./set_useproxy/)(bool) | Mevcut örneğin istek gönderirken proxy kullanıp kullanmadığını belirten değeri ayarlar. |
## Ayrıca Bakınız

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
