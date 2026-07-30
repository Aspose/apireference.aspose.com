---
title: "System::Net::WebHeaderCollection sınıfı"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Font için C++"
description: "System::Net::WebHeaderCollection sınıfı. Protokol başlıklarının koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3600
url: /tr/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


Protokol başlıklarının koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class WebHeaderCollection : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(String, String) | Belirtilen başlık adı ve başlık değerinin çiftini koleksiyona ekler. |
| [Add](./add/)(HttpResponseHeader, String) | Belirtilen başlık ve başlık değerinin çiftini koleksiyona ekler. |
| [Add](./add/)(HttpRequestHeader, String) | Belirtilen başlık ve başlık değerinin çiftini koleksiyona ekler. |
| [AllKeys](./allkeys/)() | Koleksiyonda depolanan başlık adlarının bir koleksiyonunu döndürür. |
| [get_Count](./get_count/)() const | Koleksiyondaki öğe sayısını döndürür. |
| [get_Keys](./get_keys/)() | Koleksiyonda depolanan başlık adlarının bir koleksiyonunu döndürür. |
| [GetKey](./getkey/)(int) | Belirtilen indeksteki anahtarı döndürür. |
| [GetValues](./getvalues/)(String) | Başlık değerlerinin koleksiyonunu döndürür. |
| [idx_get](./idx_get/)(HttpRequestHeader) | Belirtilen isteğin başlığını kullanarak başlık değerini alır. |
| [idx_get](./idx_get/)(HttpResponseHeader) | Belirtilen yanıtın başlığını kullanarak başlık değerini alır. |
| [idx_get](./idx_get/)(String) | Belirtilen başlık adını kullanarak başlık değerini alır. |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | Belirtilen üstbilginin değerini ayarlar. |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | Belirtilen yanıtın üstbilgisini kullanarak üstbilgi değerini ayarlar. |
| [idx_set](./idx_set/)(String, String) | Belirtilen üstbilgi adını kullanarak üstbilgi değerini ayarlar. |
| static [IsRestricted](./isrestricted/)(const String\&) | Belirtilen HTTP üstbilgisinin istek için ayarlanıp ayarlanamayacağını test eder. |
| [Remove](./remove/)(String) | Belirtilen üstbilgi adıyla üstbilgiyi kaldırır. |
| [Remove](./remove/)(HttpResponseHeader) | Belirtilen yanıtın üstbilgisini kaldırır. |
| [Remove](./remove/)(HttpRequestHeader) | Belirtilen isteğin üstbilgisini kaldırır. |
| [Set](./set/)(String, String) | Belirtilen üstbilginin değerini ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| [WebHeaderCollection](./webheadercollection/)() | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
