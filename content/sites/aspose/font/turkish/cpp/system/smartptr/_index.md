---
title: "System::SmartPtr sınıfı"
linktitle: "SmartPtr"
second_title: "Aspose.Font için C++"
description: "System::SmartPtr sınıfı. Yığın üzerinde tahsis edilen tipleri saran gösterici sınıfı. Object sınıfından türeten sınıfların belleğini yönetmek için kullanın. Bu gösterici türü, iç içe gösterici (intrusive pointer) semantiğini izler. Referans sayacı, Object'in içinde ya da Object örneğine sıkı bağlı bir sayaç yapısında depolanır. Her durumda, tüm SmartPtr örnekleri, nasıl oluşturulurlarsa oluşturulsunlar tek sahiplik grubu oluşturur; bu, std::shared_ptr sınıfının davranışından farklıdır. Ham göstericiyi SmartPtr'e dönüştürmek, aynı nesneye ortak referanslar tutan diğer SmartPtr örnekleri olduğu sürece güvenlidir. SmartPtr sınıfı örneği iki durumdan birinde olabilir: paylaşımlı gösterici ve zayıf gösterici. Nesneyi canlı tutmak için paylaşımlı referans sayısının pozitif olması gerekir. Hem zayıf hem de paylaşımlı göstericiler, işaret edilen nesneye (yöntem çağırmak, alanları okumak ya da yazmak vb.) erişmek için kullanılabilir, ancak zayıf göstericiler paylaşımlı gösterici referans sayımına katılmaz. Nesne, ona ait son ''shared'' SmartPtr göstericisi yok edildiğinde silinir. Bu yüzden, nesnenin başka paylaşımlı SmartPtr göstericisi bulunmadığında, örneğin nesne oluşturulurken ya da yok edilirken, bunun gerçekleşmemesini sağlayın. Bu sorunu düzeltmek için System::Object::ThisProtector koruma nesnelerini (C++ kodunda) veya CppCTORSelfReference ya da CppSelfReference özniteliğini (çevirisi yapılan C# kodunda) kullanın. Benzer şekilde, döngüsel referansları kırmak için System::WeakPtr gösterici sınıfını veya System::SmartPtrMode::Weak gösterici modunu (C++ kodunda) ya da CppWeakPtr özniteliğini (C# kodunda) kullanın. İki ya da daha fazla nesne ''shared'' göstericilerle birbirine referans verirse, hiç silinmezler. Gösterici türü (zayıf ya da paylaşımlı) çalışma zamanında değiştirilecekse, System::SmartPtr<T>::set_Mode() yöntemini veya System::DynamicWeakPtr sınıfını kullanın. SmartPtr sınıfı hiçbir sanal yöntem içermez. Kendi bellek yönetim stratejinizi oluşturuyorsanız yalnızca onu miras almanız gerekir. Bu tür, diğer nesnelerin silinmesini yönetmek için bir göstericidir. C++'ta yığıt üzerinde (stack) ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 5500
url: /tr/cpp/system/smartptr/
---
## SmartPtr class


Yığın üzerinde tahsis edilen tipleri saran gösterici sınıfı. [Object](../object/) sınıfından türeten sınıfların belleğini yönetmek için kullanın. Bu gösterici türü, iç içe gösterici (intrusive pointer) semantiğini izler. Referans sayacı, [Object](../object/) içinde ya da [Object](../object/) örneğine sıkı bağlı bir sayaç yapısında depolanır. Her durumda, tüm [SmartPtr](./) örnekleri, nasıl oluşturulurlarsa oluşturulsunlar tek sahiplik grubu oluşturur; bu, std::shared_ptr sınıfının davranışından farklıdır. Ham göstericiyi [SmartPtr](./) içine dönüştürmek, aynı nesneye ortak referanslar tutan diğer [SmartPtr](./) örnekleri olduğu sürece güvenlidir. [SmartPtr](./) sınıfı örneği iki durumdan birinde olabilir: paylaşımlı gösterici ve zayıf gösterici. Nesneyi canlı tutmak için paylaşımlı referans sayısının pozitif olması gerekir. Hem zayıf hem de paylaşımlı göstericiler, işaret edilen nesneye (yöntem çağırmak, alanları okumak ya da yazmak vb.) erişmek için kullanılabilir, ancak zayıf göstericiler paylaşımlı gösterici referans sayımına katılmaz. [Object](../object/) nesnesi, ona ait son 'shared' [SmartPtr](./) göstericisi yok edildiğinde silinir. Bu yüzden, nesnenin başka paylaşımlı [SmartPtr](./) göstericisi bulunmadığında, örneğin nesne oluşturulurken ya da yok edilirken, bunun gerçekleşmemesini sağlayın. Bu sorunu düzeltmek için System::Object::ThisProtector koruma nesnelerini (C++ kodunda) veya CppCTORSelfReference ya da CppSelfReference özniteliğini (çevirisi yapılan C# kodunda) kullanın. Benzer şekilde, döngüsel referansları kırmak için [System::WeakPtr](../weakptr/) gösterici sınıfını veya [System::SmartPtrMode::Weak](../smartptrmode/) gösterici modunu (C++ kodunda) ya da CppWeakPtr özniteliğini (C# kodunda) kullanın. İki ya da daha fazla nesne 'shared' göstericilerle birbirine referans verirse, hiç silinmezler. Gösterici türü (zayıf ya da paylaşımlı) çalışma zamanında değiştirilecekse, [System::SmartPtr<T>::set_Mode()](./set_mode/) yöntemini veya [System::DynamicWeakPtr](../dynamicweakptr/) sınıfını kullanın. [SmartPtr](./) sınıfı hiçbir sanal yöntem içermez. Kendi bellek yönetim stratejinizi oluşturuyorsanız yalnızca onu miras almanız gerekir. Bu tür, diğer nesnelerin silinmesini yönetmek için bir göstericidir. Yığıt üzerinde (stack) ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir.

```cpp
template<class T>class SmartPtr
```


| Parametre | Açıklama |
| --- | --- |
| T | İşaret edilen nesnenin tipi. [System::Object](../object/) veya onun bir alt sınıfı olmalıdır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [begin](./begin/)() | [begin()](./begin/) metoduna erişim sağlayıcı, temel bir koleksiyon için. Sadece [SmartPtr_](./smartptr_/) [begin()](./begin/) metoduna sahip bir özelleştirme türü ise derlenir. |
| [begin](./begin/)() const | [begin()](./begin/) metoduna erişim sağlayıcı, temel bir koleksiyon için. Sadece [SmartPtr_](./smartptr_/) [begin()](./begin/) metoduna sahip bir özelleştirme türü ise derlenir. |
| [Cast](./cast/)() const | Göstericiyi kendi tipine dönüştürür. |
| [Cast](./cast/)() const | Göstericiyi static_cast kullanarak temel tipe dönüştürür. |
| [Cast](./cast/)() const | Göstericiyi dynamic_cast kullanarak türetilmiş tipe dönüştürür. |
| [Cast](./cast/)() const | Göstericiyi dynamic_cast kullanarak türetilmiş tipe dönüştürür. |
| [cbegin](./cbegin/)() const | [cbegin()](./cbegin/) metoduna erişim sağlayıcı, temel bir koleksiyon için. Sadece [SmartPtr_](./smartptr_/) [cbegin()](./cbegin/) metoduna sahip bir özelleştirme türü ise derlenir. |
| [cend](./cend/)() const | [cend()](./cend/) metoduna erişim sağlayıcı, temel bir koleksiyon için. Sadece [SmartPtr_](./smartptr_/) [cend()](./cend/) metoduna sahip bir özelleştirme türü ise derlenir. |
| [const_pointer_cast](./const_pointer_cast/)() const | Göstericiyi, işaret edilen nesne üzerinde const_cast kullanarak farklı bir tipe dönüştürür. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | Göstericiyi, işaret edilen nesne üzerinde dynamic_cast kullanarak farklı bir tipe dönüştürür. |
| [end](./end/)() | Alt koleksiyonun [end()](./end/) metoduna erişimci. Yalnızca [SmartPtr_](./smartptr_/) [end()](./end/) metoduna sahip bir özelleştirme türü ise derlenir. |
| [end](./end/)() const | Alt koleksiyonun [end()](./end/) metoduna erişimci. Yalnızca [SmartPtr_](./smartptr_/) [end()](./end/) metoduna sahip bir özelleştirme türü ise derlenir. |
| [get](./get/)() const | İşaret edilen nesneyi alır. |
| [get_Mode](./get_mode/)() const | İşaretçi modunu alır. |
| [get_shared](./get_shared/)() const | İşaret edilen nesneyi alır, ancak işaretçinin paylaşımlı modda olduğunu doğrular. |
| [get_shared_count](./get_shared_count/)() const | Referans verilen nesneye mevcut olan paylaşımlı işaretçi sayısını, mevcut olan dahil, alır. Mevcut işaretçinin paylaşımlı modda olduğunu doğrular. |
| [GetHashCode](./gethashcode/)() const | İşaret edilen nesne üzerinde [GetHashCode()](./gethashcode/) çağırır. |
| [GetObjectNotNull](./getobjectnotnull/)() const | Şu anda referans verilen nesneyi (varsa) alır veya bir istisna fırlatır. |
| [GetObjectOrNull](./getobjectornull/)() const | İşaret edilen nesneyi (varsa) alır veya nullptr döndürür. [get()](./get/) ile aynı. |
| [GetObjectOwner](./getobjectowner/)() const | Referans verilen nesneyi alır. |
| [GetPointer](./getpointer/)() const | İşaret edilen nesneyi (varsa) alır veya nullptr döndürür. [get()](./get/) ile aynı. |
| [Is](./is/)(const System::TypeInfo\&) const | İşaret edilen nesnenin belirli bir türde ya da onun alt türünde olup olmadığını kontrol eder. C# 'is' semantiğini izler. |
| [IsAliasingPtr](./isaliasingptr/)() const | İşaretçinin, sahip olduğu nesneden (aliasing yapıcıyla oluşturulan) başka bir nesneye işaret edip etmediğini kontrol eder. |
| [IsShared](./isshared/)() const | İşaretçinin paylaşımlı modda olup olmadığını kontrol eder. |
| [IsWeak](./isweak/)() const | İşaretçinin zayıf modda olup olmadığını kontrol eder. |
| explicit [operator bool](./operatorbool/)() const | İşaretçinin null olmadığını kontrol eder. |
| [operator!](./operator!/)() const | İşaretçinin null olup olmadığını kontrol eder. |
| [operator*](./operator_/)() const | İşaret edilen nesneye referansı alır. İşaretçinin null olmadığını doğrular. |
| [operator->](./operator-_/)() const | Referans verilen nesnenin üyelerine erişime izin verir. |
| [operator<](./operator_/)(Y *) const | [SmartPtr](./) sınıfı için daha az karşılaştırma semantiği sağlar. |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | [SmartPtr](./) sınıfı için daha az karşılaştırma semantiği sağlar. |
| [operator=](./operator=/)(SmartPtr_\&&) | [SmartPtr](./) nesnesine taşıma ataması yapar. x kullanılamaz hâle gelir. |
| [operator=](./operator=/)(const SmartPtr_\&) | [SmartPtr](./) nesnesine kopya ataması yapar. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | [SmartPtr](./) nesnesine kopya ataması yapar. Gerekli tür dönüşümlerini gerçekleştirir. |
| [operator=](./operator=/)(Pointee_ *) | Ham işaretçiyi [SmartPtr](./) nesnesine atar. |
| [operator=](./operator=/)(std::nullptr_t) | İşaretçi değerini nullptr olarak ayarlar. |
| [operator==](./operator==/)(std::nullptr_t) const | İşaretçinin nullptr'ye işaret edip etmediğini kontrol eder. |
| [operator[]](./operator[]/)(IdxType) const | Dizi elemanları için erişimci. Yalnızca [SmartPtr_](./smartptr_/) [System::Array](../array/) özelleştirmesi ise derlenir. |
| [RemoveAliasing](./removealiasing/)() const | İşaretçiden takma adlamayı (takma ad oluşturucu tarafından oluşturulan) kaldırır, işaret ettiği aynı nesneyi (paylaşıldıysa yönetir) veya (zayıfsa izler) emin olur. |
| [reset](./reset/)(Pointee_ *) | İşaret edilen nesneyi ayarlar. |
| [reset](./reset/)() | İşaretçiyi nullptr'ye işaret edecek şekilde yapar. |
| [set_Mode](./set_mode/)(SmartPtrMode) | İşaretçi modunu ayarlar. Referans verilen nesnenin referans sayılarını değiştirebilir. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | İşaret edilen nesnede (varsa) SetTemplateWeakPtr() metodunu çağırır. |
| [SmartPtr](./smartptr/)(SmartPtrMode) | Gerekli modda bir [SmartPtr](./) nesnesi oluşturur. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | Gerekli modda null işaretçi bir [SmartPtr](./) nesnesi oluşturur. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | Belirtilen nesneyi işaret eden bir [SmartPtr](./) oluşturur veya ham işaretçiyi [SmartPtr](./) tipine dönüştürür. |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | [SmartPtr](./) nesnesini kopya yapıcıyla oluşturur. Her iki işaretçi de sonrasında aynı nesneyi işaret eder. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | [SmartPtr](./) nesnesini kopya yapıcıyla oluşturur. Her iki işaretçi de sonrasında aynı nesneyi işaret eder. İzin verildiğinde tip dönüşümü yapar. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | [SmartPtr](./) nesnesini taşıma yapıcıyla oluşturur. Etkili olarak, iki işaretçi aynı moddaysa yer değiştirir. Çağrıdan sonra x kullanılmaz hale gelebilir. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | Referans verilen dizinin tipini, farklı tipte yeni bir dizi oluşturarak dönüştürür. C#'ta desteklenmeyen bir dizi tip dönüşümü C++'ta mevcut olduğunda faydalıdır. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | Boş bir dizi başlatır. Bazı C# kod yapılarının çevrilmesinde kullanılır. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | ptr'nin ilk değeriyle sahiplik bilgisini paylaşan, ancak alakasız ve yönetilmeyen bir p işaretçisi tutan bir [SmartPtr](./) oluşturur. |
| [static_pointer_cast](./static_pointer_cast/)() const | İşaret edilen nesne üzerinde static_cast kullanarak işaretçiyi farklı bir tipe dönüştürür. |
| [ToObjectPtr](./toobjectptr/)() const | Herhangi bir işaretçi tipini [Object](../object/) tipine işaretçi haline dönüştürür. [Pointee_](./pointee_/) tipinin tam olmasını gerektirmez. |
| static [Type](./type/)() | [Pointee_](./pointee_/) tipi için [System::TypeInfo](../typeinfo/) nesnesini almanın kısayolu. |
| [~SmartPtr](./~smartptr/)() | [SmartPtr](./) nesnesini yok eder. Gerekirse, işaret edilen nesnenin referans sayacını azaltır ve nesneyi siler. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ArrayType](./arraytype/) | [System::Array](../array/) özel bir türse [Pointee_](./pointee_/) ile aynı, aksi takdirde void. |
| [Pointee_](./pointee_/) | İşaret edilen tip. |
| [SmartPtr_](./smartptr_/) | Özelleştirilmiş akıllı işaretçi türü. |
| [ValueType](./valuetype/) | İşaret edilen dizinin depolama tipi. Yalnızca T, [System::Array](../array/) özel bir türse anlamlıdır. |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
