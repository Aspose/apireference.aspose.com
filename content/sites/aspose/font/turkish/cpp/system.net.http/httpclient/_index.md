---
title: "System::Net::Http::HttpClient sınıfı"
linktitle: "HttpClient"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::HttpClient sınıfı. HTTP istekleri göndermek ve yanıtları almak için bir HTTP istemcisinin temel sınıfını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmaktan kaçının; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Her zaman bu sınıfı System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.net.http/httpclient/
---
## HttpClient class


HTTP istekleri göndermek ve yanıtları almak için bir HTTP istemcisinin temel sınıfını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmaktan kaçının; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Her zaman bu sınıfı [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | Bekleyen tüm istekleri iptal eder. |
| [get_BaseAddress](./get_baseaddress/)() | İstek göndermek için kullanılan kaynağın temel adresini alır. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | RTTI bilgisi. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | Yanıt içeriğinin maksimum bayt sayısını alır. |
| [get_Timeout](./get_timeout/)() | İsteğin zaman aşımına uğramadan önce beklemesi gereken süreyi alır. |
| [HttpClient](./httpclient/)() | Yeni bir örnek oluşturur. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | Yeni bir örnek oluşturur. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Yeni bir örnek oluşturur. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | Belirtilen HTTP isteğini gönderir. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | İstek göndermek için kullanılan kaynağın temel adresini ayarlar. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | Yanıt içeriğinin maksimum bayt sayısını ayarlar. |
| [set_Timeout](./set_timeout/)(TimeSpan) | İsteğin zaman aşımına uğramadan önce beklemesi gereken süreyi ayarlar. |
## Ayrıca Bakınız

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
