---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Font için C++"
description: "System::Net::FileWebResponse sınıfı. Dosya sistemiyle çalışmak için WebResponse soyut sınıfının uygulanmasını sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1100
url: /tr/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Dosya sistemiyle çalışmak için [WebResponse](../webresponse/) soyut sınıfının uygulanmasını sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Yanıt akışını kapatır. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Yeni bir örnek oluşturur. |
| [get_ContentLength](./get_contentlength/)() override | RTTI bilgisi. |
| [get_ContentType](./get_contenttype/)() override | Kaynağın MIME tipini döndürür. |
| [get_Headers](./get_headers/)() override | Mevcut yanıtla ilişkili başlıkların koleksiyonunu döndürür. |
| [get_ResponseUri](./get_responseuri/)() override | Kaynağın URI'sını döndürür. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Mevcut yanıtın başlıkları destekleyip desteklemediğini gösteren bir değeri döndürür. |
| [GetResponseStream](./getresponsestream/)() override | Yanıt akışını döndürür. |
## Ayrıca Bakınız

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
