---
title: "System::SmartPtr sınıfı"
linktitle: "SmartPtr"
second_title: "Aspose.Page için C++"
description: "System::SmartPtr sınıfı. Yığın üzerinde tahsis edilen tipleri saran bir işaretçi sınıfı. Object sınıfını miras alan sınıfların belleğini yönetmek için kullanın. Bu işaretçi türü, içsel işaretçi semantiğini izler. Referans sayacı, ya Object içinde ya da Object örneğine sıkı bir şekilde bağlı sayaç yapısında depolanır. Her durumda, tüm SmartPtr örnekleri, nasıl oluşturulurlarsa oluştursunlar tek sahiplik grubu oluşturur; bu, std::shared_ptr sınıfının davranışının tersidir. Ham işaretçiyi SmartPtr'ye dönüştürmek, aynı nesneye ortak referanslar tutan diğer SmartPtr örnekleri olduğu sürece güvenlidir. SmartPtr sınıfı örneği iki durumdan birinde olabilir: paylaşımlı işaretçi ve zayıf işaretçi. Nesnenin yaşamını sürdürmek için, ona olan paylaşımlı referans sayısının pozitif olması gerekir. Hem zayıf hem de paylaşımlı işaretçiler, işaret edilen nesneye (metot çağırmak, alanları okumak ya da yazmak vb.) erişmek için kullanılabilir, ancak zayıf işaretçiler paylaşımlı işaretçi referans sayımına katılmaz. Object, ona olan son ''shared'' SmartPtr işaretçisi yok edildiğinde silinir. Bu yüzden, nesneye başka paylaşımlı SmartPtr işaretçisi bulunmadığı durumlarda, örneğin nesne oluşturulurken ya da yok edilirken, bunun gerçekleşmediğinden emin olun. Bu sorunu çözmek için System::Object::ThisProtector koruma nesnelerini (C++ kodunda) veya CppCTORSelfReference ya da CppSelfReference özniteliğini (çevirilen C# kodunda) kullanın. Benzer şekilde, döngü referanslarını kırmak için System::WeakPtr işaretçi sınıfını veya System::SmartPtrMode::Weak işaretçi modunu (C++ kodunda) ya da CppWeakPtr özniteliğini (çevirilen C# kodunda) kullanın. İki ya da daha fazla nesne ''shared'' işaretçileri kullanarak birbirlerine referans verirlerse, hiç silinmezler. Çalışma zamanında işaretçi türü (zayıf ya da paylaşımlı) değiştirilmesi gerekiyorsa, System::SmartPtr<T>::set_Mode() metodunu veya System::DynamicWeakPtr sınıfını kullanın. SmartPtr sınıfı herhangi bir sanal metoda sahip değildir. Bunu yalnızca kendi bellek yönetimi stratejinizi oluşturuyorsanız miras almanız gerekir. Bu tür, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. C++'da yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 5500
url: /tr/cpp/system/smartptr/
---
## SmartPtr class


Yığın üzerinde tahsis edilen tipleri saran bir işaretçi sınıfı. [Object](../object/) sınıfını miras alan sınıfların belleğini yönetmek için kullanın. Bu işaretçi türü, içsel işaretçi semantiğini izler. Referans sayacı, ya [Object](../object/) içinde ya da [Object](../object/) örneğine sıkı bir şekilde bağlı sayaç yapısında depolanır. Her durumda, tüm [SmartPtr](./) örnekleri, nasıl oluşturulurlarsa oluştursunlar tek sahiplik grubu oluşturur; bu, std::shared_ptr sınıfının davranışının tersidir. Ham işaretçiyi [SmartPtr](./)’ye dönüştürmek, aynı nesneye ortak referanslar tutan diğer [SmartPtr](./) örnekleri olduğu sürece güvenlidir. [SmartPtr](./) sınıfı örneği iki durumdan birinde olabilir: paylaşımlı işaretçi ve zayıf işaretçi. Nesnenin yaşamını sürdürmek için, ona olan paylaşımlı referans sayısının pozitif olması gerekir. Hem zayıf hem de paylaşımlı işaretçiler, işaret edilen nesneye (metot çağırmak, alanları okumak ya da yazmak vb.) erişmek için kullanılabilir, ancak zayıf işaretçiler paylaşımlı işaretçi referans sayımına katılmaz. [Object](../object/) nesnesi, ona olan son 'shared' [SmartPtr](./) işaretçisi yok edildiğinde silinir. Bu yüzden, nesneye başka paylaşımlı [SmartPtr](./) işaretçisi bulunmadığı durumlarda, örneğin nesne oluşturulurken ya da yok edilirken, bunun gerçekleşmediğinden emin olun. Bu sorunu çözmek için System::Object::ThisProtector koruma nesnelerini (C++ kodunda) veya CppCTORSelfReference ya da CppSelfReference özniteliğini (çevirilen C# kodunda) kullanın. Benzer şekilde, döngü referanslarını kırmak için [System::WeakPtr](../weakptr/) işaretçi sınıfını veya [System::SmartPtrMode::Weak](../smartptrmode/) işaretçi modunu (C++ kodunda) ya da CppWeakPtr özniteliğini (çevirilen C# kodunda) kullanın. İki ya da daha fazla nesne 'shared' işaretçileri kullanarak birbirlerine referans verirlerse, hiç silinmezler. Çalışma zamanında işaretçi türü (zayıf ya da paylaşımlı) değiştirilmesi gerekiyorsa, [System::SmartPtr<T>::set_Mode()](./set_mode/) metodunu veya [System::DynamicWeakPtr](../dynamicweakptr/) sınıfını kullanın. [SmartPtr](./) sınıfı herhangi bir sanal metoda sahip değildir. Bunu yalnızca kendi bellek yönetimi stratejinizi oluşturuyorsanız miras almanız gerekir. Bu tür, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. Yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir.

```cpp
template<class T>class SmartPtr
```


| Parameter | Açıklama |
| --- | --- |
| T | İşaret edilen nesnenin tipi. Ya [System::Object](../object/) ya da onun bir alt sınıfı olmalıdır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [begin](./begin/)() | [begin()](./begin/) metoduna erişim sağlayan alt koleksiyon. Yalnızca [SmartPtr_](./smartptr_/) [begin()](./begin/) metoduna sahip bir özelleştirme türü olduğunda derlenir. |
| [begin](./begin/)() const | [begin()](./begin/) metoduna erişim sağlayan alt koleksiyon. Yalnızca [SmartPtr_](./smartptr_/) [begin()](./begin/) metoduna sahip bir özelleştirme türü olduğunda derlenir. |
| [Cast](./cast/)() const | İşaretçiyi kendi tipine dönüştürür. |
| [Cast](./cast/)() const | İşaretçiyi static_cast kullanarak temel tipe dönüştürür. |
| [Cast](./cast/)() const | İşaretçiyi dynamic_cast kullanarak türetilmiş tipe dönüştürür. |
| [Cast](./cast/)() const | İşaretçiyi dynamic_cast kullanarak türetilmiş tipe dönüştürür. |
| [cbegin](./cbegin/)() const | [cbegin()](./cbegin/) metoduna erişim sağlayan alt koleksiyon. Yalnızca [SmartPtr_](./smartptr_/) [cbegin()](./cbegin/) metoduna sahip bir özelleştirme türü olduğunda derlenir. |
| [cend](./cend/)() const | [cend()](./cend/) metoduna erişim sağlayan alt koleksiyon. Yalnızca [SmartPtr_](./smartptr_/) [cend()](./cend/) metoduna sahip bir özelleştirme türü olduğunda derlenir. |
| [const_pointer_cast](./const_pointer_cast/)() const | İşaret edilen nesne üzerinde const_cast kullanarak işaretçiyi farklı bir tipe dönüştürür. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | İşaret edilen nesne üzerinde dynamic_cast kullanarak işaretçiyi farklı bir tipe dönüştürür. |
| [end](./end/)() | [end()](./end/) metoduna erişim sağlayan alt koleksiyon. Yalnızca [SmartPtr_](./smartptr_/) [end()](./end/) metoduna sahip bir özelleştirme türü olduğunda derlenir. |
| [end](./end/)() const | [end()](./end/) metoduna erişim sağlayan alt koleksiyon. Yalnızca [SmartPtr_](./smartptr_/) [end()](./end/) metoduna sahip bir özelleştirme türü olduğunda derlenir. |
| [get](./get/)() const | İşaret edilen nesneyi alır. |
| [get_Mode](./get_mode/)() const | İşaretçi modunu alır. |
| [get_shared](./get_shared/)() const | İşaret edilen nesneyi alır, ancak işaretçinin paylaşımlı modda olduğunu doğrular. |
| [get_shared_count](./get_shared_count/)() const | Referans verilen nesneye mevcut olan paylaşımlı işaretçilerin sayısını, mevcut işaretçi dahil, alır. Mevcut işaretçinin paylaşımlı modda olduğunu doğrular. |
| [GetHashCode](./gethashcode/)() const | İşaret edilen nesne üzerinde [GetHashCode()](./gethashcode/) çağırır. |
| [GetObjectNotNull](./getobjectnotnull/)() const | Şu anda referans verilen nesneyi (varsa) alır veya bir istisna fırlatır. |
| [GetObjectOrNull](./getobjectornull/)() const | İşaret edilen nesneyi (varsa) alır veya nullptr döndürür. [get()](./get/) ile aynı. |
| [GetObjectOwner](./getobjectowner/)() const | Referans verilen nesneyi alır. |
| [GetPointer](./getpointer/)() const | İşaret edilen nesneyi (varsa) alır veya nullptr döndürür. [get()](./get/) ile aynı. |
| [Is](./is/)(const System::TypeInfo\&) const | İşaret edilen nesnenin belirli bir tipte veya onun alt tipinde olup olmadığını kontrol eder. C# 'is' semantiğini izler. |
| [IsAliasingPtr](./isaliasingptr/)() const | İşaretçinin, sahip olduğu nesne yerine başka bir nesneye işaret edip etmediğini (aliasing yapıcıyla oluşturulan) kontrol eder. |
| [IsShared](./isshared/)() const | İşaretçinin paylaşımlı modda olup olmadığını kontrol eder. |
| [IsWeak](./isweak/)() const | İşaretçinin zayıf (weak) modda olup olmadığını kontrol eder. |
| explicit [operator bool](./operatorbool/)() const | İşaretçinin null olmadığını kontrol eder. |
| [operator!](./operator!/)() const | İşaretçinin null olup olmadığını kontrol eder. |
| [operator*](./operator_/)() const | İşaret edilen nesneye referansı alır. İşaretçinin null olmadığını doğrular. |
| [operator->](./operator-_/)() const | Referans verilen nesnenin üyelerine erişime izin verir. |
| [operator<](./operator_/)(Y *) const | [SmartPtr](./) sınıfı için daha az karşılaştırma (less) semantiği sağlar. |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | [SmartPtr](./) sınıfı için daha az karşılaştırma (less) semantiği sağlar. |
| [operator=](./operator=/)(SmartPtr_\&&) | [SmartPtr](./) nesnesine taşıma ataması yapar. x kullanılamaz hâle gelir. |
| [operator=](./operator=/)(const SmartPtr_\&) | [SmartPtr](./) nesnesine kopya ataması yapar. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | [SmartPtr](./) nesnesine kopya ataması yapar. Gerekli tip dönüşümlerini gerçekleştirir. |
| [operator=](./operator=/)(Pointee_ *) | Ham işaretçiyi [SmartPtr](./) nesnesine atar. |
| [operator=](./operator=/)(std::nullptr_t) | İşaretçi değerini nullptr olarak ayarlar. |
| [operator==](./operator==/)(std::nullptr_t) const | İşaretçinin nullptr'ye işaret edip etmediğini kontrol eder. |
| [operator[]](./operator[]/)(IdxType) const | Dizi elemanları için erişimci. Yalnızca [SmartPtr_](./smartptr_/) [System::Array](../array/) özelleştirmesi ise derlenir. |
| [RemoveAliasing](./removealiasing/)() const | İşaretçiden aliasing'i (aliasing yapıcıyla oluşturulan) kaldırır, işaret ettiği aynı nesneyi (paylaşımlıysa yönetir, zayıfsa izler) sağladığından emin olur. |
| [reset](./reset/)(Pointee_ *) | İşaret edilen nesneyi ayarlar. |
| [reset](./reset/)() | İşaretçiyi nullptr'ye işaret edecek şekilde ayarlar. |
| [set_Mode](./set_mode/)(SmartPtrMode) | İşaretçi kipini ayarlar. Referans verilen nesnenin referans sayısını değiştirebilir. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | İşaret edilen nesnede (varsa) SetTemplateWeakPtr() metodunu çağırır. |
| [SmartPtr](./smartptr/)(SmartPtrMode) | Gerekli kipte bir [SmartPtr](./) nesnesi oluşturur. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | Gerekli kipte bir null işaretçi [SmartPtr](./) nesnesi oluşturur. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | Belirtilen nesneyi işaret eden bir [SmartPtr](./) oluşturur veya ham işaretçiyi [SmartPtr](./) tipine dönüştürür. |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | Bir [SmartPtr](./) nesnesini kopya olarak oluşturur. Her iki işaretçi de sonrasında aynı nesneyi gösterir. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | Bir [SmartPtr](./) nesnesini kopya olarak oluşturur. Her iki işaretçi de sonrasında aynı nesneyi gösterir. İzin verildiğinde tip dönüşümü gerçekleştirir. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | Bir [SmartPtr](./) nesnesini taşıma yoluyla oluşturur. Etkili olarak, iki işaretçi aynı kipteyse yer değiştirir. Çağrıdan sonra x kullanılmaz hale gelebilir. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | Referans verilen dizinin tipini, farklı tipte yeni bir dizi oluşturarak dönüştürür. C#'ta desteklenmeyen bir dizi tip dönüşümü C++'ta mevcutsa faydalıdır. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | Boş bir dizi başlatır. Bazı C# kod yapılarının çevrilmesinde kullanılır. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | ptr'nin ilk değeriyle sahiplik bilgisini paylaşan, ancak alakasız ve yönetilmeyen bir p işaretçisi tutan bir [SmartPtr](./) oluşturur. |
| [static_pointer_cast](./static_pointer_cast/)() const | İşaret edilen nesne üzerinde static_cast kullanarak işaretçiyi farklı bir tipe dönüştürür. |
| [ToObjectPtr](./toobjectptr/)() const | Herhangi bir işaretçi tipini [Object](../object/) tipine işaretçiye dönüştürür. [Pointee_](./pointee_/) tipinin tam olmasını gerektirmez. |
| static [Type](./type/)() | [Pointee_](./pointee_/) tipi için [System::TypeInfo](../typeinfo/) nesnesini almanın kısayolu. |
| [~SmartPtr](./~smartptr/)() | [SmartPtr](./) nesnesini yok eder. Gerekirse, işaret edilen nesnenin referans sayacını azaltır ve nesneyi siler. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ArrayType](./arraytype/) | [System::Array](../array/) özelleştirmesi ise [Pointee_](./pointee_/)'ye eşittir, aksi takdirde void döner. |
| [Pointee_](./pointee_/) | İşaret edilen tip. |
| [SmartPtr_](./smartptr_/) | Özelleştirilmiş akıllı işaretçi tipi. |
| [ValueType](./valuetype/) | İşaret edilen dizinin depolama tipi. Yalnızca T, [System::Array](../array/) özelleştirmesi ise anlamlıdır. |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
