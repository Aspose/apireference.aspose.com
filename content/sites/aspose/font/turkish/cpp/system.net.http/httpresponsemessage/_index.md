---
title: "System::Net::Http::HttpResponseMessage sınıfı"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::HttpResponseMessage sınıfı. Bir HTTP yanıt mesajını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


Bir HTTP yanıt mesajını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Dispose](./dispose/)() override | Mevcut örneği serbest bırakır. Bu yöntem ayrıca HTTP yanıtının içeriğini serbest bırakır. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | Durum kodunu kontrol eder. Durum kodu 2xx aralığında olmadığında [HttpRequestException](../httprequestexception/) fırlatılacaktır. |
| [get_Content](./get_content/)() const | HTTP yanıtının içeriğini alır. |
| [get_Headers](./get_headers/)() const | HTTP içerik başlıklarını döndürür. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | Durum kodunun, istemci tarafından istenen eylemin alındığını, anlaşıldığını ve kabul edildiğini gösterip göstermediğini kontrol eder. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | Durum kodu ile birlikte sunucular tarafından gönderilen Reason-Phrase (neden ifadesi) alır. |
| [get_RequestMessage](./get_requestmessage/)() const | HTTP istek mesajını alır. |
| [get_StatusCode](./get_statuscode/)() const | HTTP durum kodunu alır. |
| [get_Version](./get_version/)() const | RTTI bilgisi. |
| [HttpResponseMessage](./httpresponsemessage/)() | Yeni bir örnek oluşturur. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | Yeni bir örnek oluşturur. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | HTTP yanıtının içeriğini ayarlar. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | Durum kodu ile birlikte sunucular tarafından gönderilen Reason-Phrase (neden ifadesi) ayarlar. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | HTTP istek mesajını ayarlar. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | HTTP durum kodunu ayarlar. |
| [set_Version](./set_version/)(System::Version) | HTTP sürümünü ayarlar. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
