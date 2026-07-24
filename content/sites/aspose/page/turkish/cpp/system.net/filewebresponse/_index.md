---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Page için C++"
description: "System::Net::FileWebResponse sınıfı. Dosya sistemiyle çalışmak için WebResponse soyut sınıfının uygulanmasını sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt (stack) üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1100
url: /tr/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Dosya sistemiyle çalışmak için [WebResponse](../webresponse/) soyut sınıfının uygulanmasını sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

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
| [get_Headers](./get_headers/)() override | Mevcut yanıt ile ilişkili başlıkların koleksiyonunu döndürür. |
| [get_ResponseUri](./get_responseuri/)() override | Kaynağın URI'sini döndürür. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Mevcut yanıtın üstbilgileri destekleyip desteklemediğini gösteren bir değeri döndürür. |
| [GetResponseStream](./getresponsestream/)() override | Yanıt akışını döndürür. |
## Ayrıca Bakınız

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
