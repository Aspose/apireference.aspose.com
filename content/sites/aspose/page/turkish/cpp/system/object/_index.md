---
title: "System::Object sınıfı"
linktitle: "Object"
second_title: "Aspose.Page için C++"
description: "System::Object sınıfı. C#'ta System.Object sınıfı için mevcut olan yöntemlerin kullanılmasını sağlayan temel sınıf. Çevrilmiş ortamda kullanılan tüm önemsiz olmayan sınıflar C++'ta bundan türemelidir."
type: docs
weight: 4800
url: /tr/cpp/system/object/
---
## Object class


Temel sınıf, C#'ta [System.Object](./) sınıfı için mevcut olan yöntemlerin kullanılmasını sağlar. Çevrilmiş ortamda kullanılan tüm önemsiz olmayan sınıflar bundan türemelidir.

```cpp
class Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | C# [Object.Equals](./equals/) semantiğini kullanarak nesneleri karşılaştırır. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | C# tarzında referans türü nesnelerini karşılaştırır. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | C# tarzında değer türü nesnelerini karşılaştırır. |
| static [Equals](./equals/)(float const\&, float const\&) | IEC 60559:1989'a göre NaN'in herhangi bir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder. |
| static [Equals](./equals/)(double const\&, double const\&) | IEC 60559:1989'a göre NaN'in herhangi bir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | Yalnızca dahili amaçlar için. |
| [GetCounter](./getcounter/)() | Nesneyle ilişkili referans sayacı veri yapısını alır. |
| virtual [GetHashCode](./gethashcode/)() const | C# [Object.GetHashCode()](./gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| virtual [GetType](./gettype/)() const | Nesnenin gerçek türünü alır. C# [System.Object.GetType()](./gettype/) çağrısının benzeri. |
| virtual [Is](./is/)(const TypeInfo\&) const | Nesnenin targetType tarafından tanımlanan türün bir örneği olup olmadığını kontrol eder. C# 'is' operatörünün benzeri. |
| [Lock](./lock/)() | C# lock() ifadesinin kilitlemesini uygular. Doğrudan çağırın veya [LockContext](../lockcontext/) gözetleme nesnesini kullanın. |
| virtual [MemberwiseClone](./memberwiseclone/)() const | C# [Object.MemberwiseClone()](./memberwiseclone/) yönteminin benzeri. Özel türlerin klonlanmasını sağlar. |
| [Object](./object/)() | Nesneyi oluşturur. Tüm dahili veri yapılarını başlatır. |
| [Object](./object/)(Object const\&) | Kopya yapıcı. Gerçekte hiçbir şeyi kopyalamaz, sadece yeni nesneyi başlatır ve alt sınıfların kopya yapımını sağlar. |
| [operator=](./operator=/)(Object const\&) | Atama operatörü. Gerçekte hiçbir şeyi kopyalamaz, sadece yeni nesneyi başlatır ve alt sınıfların kopya yapımını sağlar. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | Nesneleri referansla karşılaştırır. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | Nesneleri referansla karşılaştırır. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Referans, değer türü nesneyi nullptr ile karşılaştırır. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | String ve nullptr durumları için [Object::ReferenceEquals](./referenceequals/) özel uygulaması. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | Stringler durumu için [Object::ReferenceEquals](./referenceequals/) özel uygulaması. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | Paylaşılan referans sayacını belirtilen değer kadar azaltır. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |
| [SharedCount](./sharedcount/)() const | Paylaşılan referans sayacının mevcut değerini alır. |
| [SharedRefAdded](./sharedrefadded/)() | Paylaşılan referans sayacını artırır. Doğrudan çağrılmamalıdır; bunun yerine akıllı işaretçiler veya ThisProtector kullanılmalıdır. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | Paylaşılan referans sayacını azaltır ve döndürür. Doğrudan çağrılmamalıdır; bunun yerine akıllı işaretçiler veya ThisProtector kullanılmalıdır. |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](./tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [Type](./type/)() | C# typeof([System.Object](./)) yapısını uygular. |
| [Unlock](./unlock/)() | C# lock() ifadesinin kilit açma işlevini uygular. Doğrudan çağırın veya [LockContext](../lockcontext/) gözcü nesnesini kullanın. |
| [WeakRefAdded](./weakrefadded/)() | Zayıf referans sayacını artırır. Doğrudan çağrılmamalıdır; bunun yerine akıllı işaretçiler veya ThisProtector kullanılmalıdır. |
| [WeakRefRemoved](./weakrefremoved/)() | Zayıf referans sayacını azaltır. Doğrudan çağrılmamalıdır; bunun yerine akıllı işaretçiler veya ThisProtector kullanılmalıdır. |
| virtual [~Object](./~object/)() | Nesneyi yok eder. Tüm iç veri yapılarını serbest bırakır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ptr](./ptr/) | Akıllı işaretçi türü için takma ad. |
## Açıklamalar


C# [System.Object](./) sınıfında bulunan yöntemlerin yanı sıra, çevrilen kod ortamına özgü bazı kavramların da desteklenmesini sağlar. Buna akıllı işaretçi sınıfları ([System::SmartPtr](../smartptr/), [System::WeakPtr](../weakptr/), [System::DynamicWeakPtr](../dynamicweakptr/)) tarafından kullanılan referans sayımı ve bellek yönetimi, hata ayıklama vb. ile ilgili diğer hizmetler dahildir.

Her [Object](./) iki referans sayacına sahiptir: paylaşılan referans sayacı ve zayıf referans sayacı. Zayıf referans sayacı, referans verilen nesnenin üzerine çıkabilen zayıf işaretçilere izin vermek için, her zaman [Object](./) içinde değil, ayrılmış bir veri yapısında depolanır. Akıllı referans sayacı, ENABLE_EXTERNAL_REFCOUNT makrosunun durumuna bağlı olarak, nesnenin içinde ya da aynı ayrılmış yapıda depolanır. Varsayılan olarak, hata ayıklama derlemelerinde etkindir ve yayın derlemelerinde devredışıdır. Akıllı işaretçi sayacı nesnenin içinde depolanıyorsa, ayrılmış veri yapısı yalnızca nesneye zayıf işaretçiler mevcut olduğunda oluşturulur. Aksi takdirde, nesnenin yanında oluşturulur.

Tüm akıllı işaretçiler bu iki referans sayacını kullanır ve aynı tek sahiplik grubuna katkıda bulunur.

[Object](./) alt sınıfı yığında (stack) oluşturulursa, ona yönelik akıllı işaretçi oluşturulamaz, aksi takdirde yığın silme sorunu ortaya çıkar.

Bu tip, değer türü olarak yığında (stack) ya da [System::MakeObject()](../makeobject/) işleviyle yığında (heap) tahsis edilebilir. Nesne tahsis edildikten sonra, bu iki kullanım durumunu asla karıştırmayın: yığında tahsis edilen nesnelere yönelik [SmartPtr](../smartptr/) işaretçileri kullanmak kesinlikle yasaktır.
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
