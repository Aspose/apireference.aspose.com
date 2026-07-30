---
title: "System::Net::Http::HttpRequestMessage sınıfı"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::HttpRequestMessage sınıfı. Bir HTTP istek mesajını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt (stack) üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Bir HTTP istek mesajını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Dispose](./dispose/)() override | Mevcut örneği serbest bırakır. Bu yöntem ayrıca HTTP isteğinin içeriğini de serbest bırakır. |
| [get_Content](./get_content/)() | HTTP isteğinin içeriğini alır. |
| [get_Headers](./get_headers/)() | HTTP içerik başlıklarını döndürür. |
| [get_Method](./get_method/)() | HTTP istek yöntemini alır. |
| [get_Properties](./get_properties/)() | HTTP istek özelliklerinin koleksiyonunu döndürür. |
| [get_RequestUri](./get_requesturi/)() | İstenen kaynağın URI'sini alır. |
| [get_Version](./get_version/)() | RTTI bilgisi. |
| [HttpRequestMessage](./httprequestmessage/)() | Yeni bir örnek oluşturur. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Yeni bir örnek oluşturur. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Yeni bir örnek oluşturur. |
| [MarkAsSent](./markassent/)() | Mevcut isteği gönderildi olarak işaretler. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | HTTP isteğinin içeriğini ayarlar. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | HTTP istek yöntemini ayarlar. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | İstenen kaynağın URI'sini ayarlar. |
| [set_Version](./set_version/)(System::Version) | HTTP sürümünü ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
