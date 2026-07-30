---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue sınıfı"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue sınıfı. ''Content-Disposition'' başlığının değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak C++ içinde geçirin."
type: docs
weight: 300
url: /tr/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


''Content-Disposition'' başlığının değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | Yeni bir örnek oluşturur. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_CreationDate](./get_creationdate/)() | Dosyanın oluşturulma tarihini alır. |
| [get_DispositionType](./get_dispositiontype/)() | RTTI bilgisi. |
| [get_FileName](./get_filename/)() | Mesaj yükünü depolamak için bir dosya adı oluşturmayı belirleyen bir değeri alır. Varlık ayrıldığında ve ayrı bir dosyada depolandığında kullanılır. |
| [get_FileNameStar](./get_filenamestar/)() | Mesaj yükünü depolamak için dosya adları oluşturmayı belirleyen bir değeri alır. Varlıklar ayrıldığında ve ayrı dosyalarda depolandığında kullanılır. |
| [get_ModificationDate](./get_modificationdate/)() | Dosyanın değiştirilme tarihini alır. |
| [get_Name](./get_name/)() | İçerik gövdesinin bir bölümü için bir ad alır. |
| [get_Parameters](./get_parameters/)() | 'Content-Disposition' başlığının parametre koleksiyonunu döndürür. |
| [get_ReadDate](./get_readdate/)() | Dosyanın en son okunduğu tarihi alır. |
| [get_Size](./get_size/)() | Tahmini dosya boyutunu alır. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Geçilen dizeyi belirtilen indeksten [ContentDispositionHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [Parse](./parse/)(String) | Geçilen dizeyi [ContentDispositionHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | Dosyanın oluşturulma tarihini ayarlar. |
| [set_DispositionType](./set_dispositiontype/)(String) | Bir disposition tipini ayarlar. |
| [set_FileName](./set_filename/)(String) | Mesaj yükünü depolamak için bir dosya adı oluşturmayı belirleyen bir değeri ayarlar. Varlık ayrıldığında ve ayrı bir dosyada depolandığında kullanılır. |
| [set_FileNameStar](./set_filenamestar/)(String) | Mesaj yükünü depolamak için dosya adları oluşturmayı belirleyen bir değeri ayarlar. Varlıklar ayrıldığında ve ayrı dosyalarda depolandığında kullanılır. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | Dosyanın değiştirilme tarihini ayarlar. |
| [set_Name](./set_name/)(String) | İçerik gövdesinin bir bölümü için bir ad ayarlar. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | Dosyanın en son okunduğu tarihi ayarlar. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | Tahmini dosya boyutunu ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | Geçilen dizeyi [ContentDispositionHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
