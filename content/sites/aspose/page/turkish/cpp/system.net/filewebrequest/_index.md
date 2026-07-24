---
title: "System::Net::FileWebRequest sınıfı"
linktitle: "FileWebRequest"
second_title: "Aspose.Page için C++"
description: "System::Net::FileWebRequest sınıfı. Dosya sistemiyle çalışmak için WebRequest soyut sınıfının bir uygulamasını sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1000
url: /tr/cpp/system.net/filewebrequest/
---
## FileWebRequest class


[WebRequest](../webrequest/) soyut sınıfının dosya sistemiyle çalışmak için bir uygulamasını sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Abort](./abort/)() override | Mevcut isteği iptal eder. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Kaynağa veri yazmak için bir akış elde etmeye yönelik asenkron bir işlemi başlatır. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Kaynak için asenkron bir isteği başlatır. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Akış elde etmeye yönelik belirtilen asenkron işlemin tamamlanmasını bekler. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Kaynak için belirtilen asenkron isteğin tamamlanmasını bekler. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | Yeni bir örnek oluşturur. |
| [get_ContentType](./get_contenttype/)() override | İsteğin MIME tipini alır. |
| [get_Headers](./get_headers/)() override | HTTP başlıklarının koleksiyonunu alır. |
| [get_Method](./get_method/)() override | HTTP metodunu alır. |
| [get_RequestUri](./get_requesturi/)() override | İstek URI'sini döndürür. |
| [GetResponse](./getresponse/)() override | Geçerli web isteğiyle ilişkili web yanıtını döndürür. |
| [set_ContentType](./set_contenttype/)(String) override | İsteğin MIME tipini ayarlar. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP başlıkları koleksiyonunu ayarlar. |
| [set_Method](./set_method/)(String) override | HTTP yöntemini ayarlar. |
| [set_Timeout](./set_timeout/)(int) override | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
