---
title: "System::Net::Http::Headers::MediaTypeHeaderValue sınıfı"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue sınıfı. ''Content-Type'' başlığının değerinde bir MIME tipini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya operator new kullanarak bu tipin örneğini oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


''Content-Type'' başlığının değerinde bir MIME tipini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya operator new kullanarak bu tipin örneğini oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_CharSet](./get_charset/)() | RTTI bilgisi. |
| [get_MediaType](./get_mediatype/)() | Medya türü başlığının değerini alır. |
| [get_Parameters](./get_parameters/)() | Medya türü başlığının değer parametrelerini döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Belirtilen indeksden başlayan bir dizeyi [MediaTypeHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Yeni bir örnek oluşturur. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Yeni bir örnek oluşturur. |
| static [Parse](./parse/)(String) | Geçilen bir dizeyi [MediaTypeHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [set_CharSet](./set_charset/)(String) | Bir karakter kümesi ayarlar. |
| [set_MediaType](./set_mediatype/)(String) | Medya türü başlığının değerini ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Geçilen bir dizeyi [MediaTypeHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
