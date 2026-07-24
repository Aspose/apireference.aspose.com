---
title: "System::Collections::Generic::BaseDictionary sınıfı"
linktitle: "BaseDictionary"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::BaseDictionary sınıfı. Çeşitli sözlük benzeri veri yapıları (ör. Dictionary, SortedDictionary) için ortak kodu uygular. Doğrudan kullanılmamalıdır, yalnızca kapsayıcı tanımlarken kalıtım için kullanılabilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığında veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 500
url: /tr/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


Çeşitli sözlük benzeri veri yapıları (ör. [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)) için ortak kodu uygular. Doğrudan kullanılmamalıdır, yalnızca kapsayıcı tanımlarken kalıtım için kullanılabilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığında veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| Parameter | Açıklama |
| --- | --- |
| Map | Temel harita türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | C++'a özgü. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | Sözlüğe anahtar-değer çifti ekler. |
| [BaseDictionary](./basedictionary/)() | Boş veri yapısı oluşturur. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | Temel harita yapıcısına argümanları iletmek için yönlendirme yapıcısı. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | Kopyalama yapıcısı. |
| [BaseDictionary](./basedictionary/)(BaseType *) | Kopyalama yapıcısı. |
| [begin](./begin/)() const | Konteynerin anahtar-değer öğesi için KVPair sarmalayıcısına bir yineleyici döndürür. C# tarzında uygulanmıştır - yineleyici KVPair nesnesini get_Key() ve get_Value() arayüzüyle döndürmelidir. Eğer konteyner boşsa, döndürülen yineleyici [end()](../ienumerable/end/) ile eşit olacaktır. |
| [cbegin](./cbegin/)() const | Konteynerin ilk öğesine bir yineleyici döndürür. STL tarzında uygulanmıştır. Eğer konteyner boşsa, döndürülen yineleyici [end()](../ienumerable/end/) ile eşit olacaktır. |
| [cend](./cend/)() const | Konteynerin son öğesini izleyen öğeye bir yineleyici döndürür. STL tarzında uygulanmıştır. Bu öğe bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [ContainsKey](./containskey/)(const key_t\&) const override | Anahtarın sözlükte bulunup bulunmadığını kontrol eder. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | Değerin sözlükte bulunup bulunmadığını kontrol eder. Değerleri karşılaştırmak için == operatörünü kullanır. |
| [data](./data/)() | Temel veri depolama erişicisi. |
| [data](./data/)() const | Temel veri depolama erişicisi. |
| [end](./end/)() const | Konteynerin son elemanını izleyen key-value öğesi için KVPair sarmalayıcısına bir yineleyici döndürür. C# tarzında uygulanmıştır - yineleyici, get_Key() ve get_Value() arayüzüne sahip KVPair nesnesini döndürmelidir. Bu öğe bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa neden olur. |
| [get_Count](./get_count/)() const override | Eleman sayısını alır. |
| virtual [GetEnumerator](./getenumerator/)() | Enumerator örneği oluşturur, alt sınıf tarafından uygulanmalıdır. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | Bulunursa değeri döndürür; aksi takdirde **Value()** döndürür. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | Bulunursa değeri döndürür; aksi takdirde **defaultValue** döndürür. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | Bulunursa değeri döndürür; aksi takdirde **null** döner. Yalnızca referans tipleri için anlamlıdır. |
| [idx_get](./idx_get/)(const key_t\&) const override | Anahtarlı alıcı işlevi. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | Anahtarlı ayarlayıcı işlevi. Öğeyi değiştirir veya oluşturur. |
| virtual [operator[]](./operator[]/)(const key_t\&) | Erişimci işlev. |
| [Remove](./remove/)(const key_t\&) override | Sözlükten belirli anahtarı kaldırır. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | Anahtarlı değeri arar ve bulunursa getirir. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Uygulanan arayüz. |
| [const_iterator](./const_iterator/) | Sabit yineleyici türü. |
| [iterator](./iterator/) | Yineleyici türü. |
| [KeyCollection](./keycollection/) | Temel depolama türüyle doğru ayırıcıyı kullandığımızdan emin olun. |
| [KVPair](./kvpair/) | Anahtar-değer çifti tipi. |
| [map_t](./map_t/) | Dahili harita türü. |
| [ValueCollection](./valuecollection/) | Değerlerin koleksiyonu. |

## Ayrıca Bakınız

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
