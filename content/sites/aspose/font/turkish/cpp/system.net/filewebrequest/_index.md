---
title: "System::Net::FileWebRequest class"
linktitle: "FileWebRequest"
second_title: "Aspose.Font için C++"
description: "System::Net::FileWebRequest sınıfı. Dosya sistemiyle çalışmak için WebRequest soyut sınıfının uygulanmasını sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1000
url: /tr/cpp/system.net/filewebrequest/
---
## FileWebRequest class


Dosya sistemiyle çalışmak için [WebRequest](../webrequest/) soyut sınıfının uygulanmasını sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Abort](./abort/)() override | Mevcut isteği iptal eder. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Kaynağa veri yazmak için bir akış elde etmeye yönelik eşzamansız bir işlemi başlatır. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Kaynak için eşzamansız bir isteği başlatır. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Belirtilen akış elde etme eşzamansız işlemi tamamlanana kadar bekler. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Kaynak için belirtilen eşzamansız isteğin tamamlanmasını bekler. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | Yeni bir örnek oluşturur. |
| [get_ContentType](./get_contenttype/)() override | İsteğin MIME tipini alır. |
| [get_Headers](./get_headers/)() override | HTTP başlıklarının koleksiyonunu alır. |
| [get_Method](./get_method/)() override | HTTP yöntemini alır. |
| [get_RequestUri](./get_requesturi/)() override | İstek URI'sını döndürür. |
| [GetResponse](./getresponse/)() override | Mevcut web isteğiyle ilişkili web yanıtını döndürür. |
| [set_ContentType](./set_contenttype/)(String) override | İsteğin MIME tipini ayarlar. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP başlıklarının koleksiyonunu ayarlar. |
| [set_Method](./set_method/)(String) override | HTTP yöntemini ayarlar. |
| [set_Timeout](./set_timeout/)(int) override | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
