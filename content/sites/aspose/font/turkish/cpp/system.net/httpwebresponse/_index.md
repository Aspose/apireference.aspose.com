---
title: "System::Net::HttpWebResponse sınıfı"
linktitle: "HttpWebResponse"
second_title: "Aspose.Font için C++"
description: "System::Net::HttpWebResponse sınıfı. HTTP web yanıtını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2100
url: /tr/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


HTTP web yanıtını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Yanıt akışını kapatır. |
| [get_CharacterSet](./get_characterset/)() | Henüz uygulanmadı. |
| [get_ContentLength](./get_contentlength/)() override | RTTI bilgisi. |
| [get_ContentType](./get_contenttype/)() override | Kaynağın MIME tipini döndürür. |
| virtual [get_Cookies](./get_cookies/)() | Web yanıtıyla ilişkili çerezleri döndürür. |
| [get_Headers](./get_headers/)() override | Mevcut yanıtla ilişkili başlıkların koleksiyonunu döndürür. |
| virtual [get_Method](./get_method/)() | HTTP yöntemini döndürür. |
| [get_ResponseUri](./get_responseuri/)() override | Kaynağın URI'sını döndürür. |
| virtual [get_StatusCode](./get_statuscode/)() | Web yanıtıyla ilişkili HTTP durum kodunu döndürür. |
| virtual [get_StatusDescription](./get_statusdescription/)() | Durum kodunun dize temsilini döndürür. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Mevcut yanıtın başlıkları destekleyip desteklemediğini gösteren bir değeri döndürür. |
| [GetResponseHeader](./getresponseheader/)(String) | Belirtilen başlık adı için karşılık gelen değeri döndürür. |
| [GetResponseStream](./getresponsestream/)() override | Yanıt akışını döndürür. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
