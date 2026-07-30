---
title: "System::Collections::Generic::BaseDictionary sınıfı"
linktitle: "BaseDictionary"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::BaseDictionary sınıfı. Çeşitli sözlük benzeri veri yapılarına (ör. Dictionary, SortedDictionary) ortak kodu uygular. Doğrudan kullanılmamalıdır, yalnızca kapsayıcıları tanımlarken kalıtım için kullanılabilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörü ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 500
url: /tr/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


Çeşitli sözlük benzeri veri yapılarına (ör. [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)) ortak kodu uygular. Doğrudan kullanılmamalıdır, yalnızca kapsayıcıları tanımlarken kalıtım için kullanılabilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörü ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| Parametre | Açıklama |
| --- | --- |
| Harita | Temel harita tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | C++'a özgü. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | Sözlüğe anahtar-değer çifti ekler. |
| [BaseDictionary](./basedictionary/)() | Boş veri yapısı oluşturur. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | Temel harita yapıcısına argümanları iletmek için yönlendirme yapıcısı. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | Kopyalama yapıcısı. |
| [BaseDictionary](./basedictionary/)(BaseType *) | Kopyalama yapıcısı. |
| [begin](./begin/)() const | Konteynerin anahtar-değer öğesi için KVPair sarmalayıcısına bir yineleyici döndürür. C# stilinde uygulanmıştır - yineleyici get_Key() ve get_Value() arabirimiyle KVPair nesnesini döndürmelidir. Konteyner boşsa, döndürülen yineleyici [end()](../ienumerable/end/) ile eşit olacaktır. |
| [cbegin](./cbegin/)() const | Konteynerin ilk öğesine bir yineleyici döndürür. STL stilinde uygulanmıştır. Konteyner boşsa, döndürülen yineleyici [end()](../ienumerable/end/) ile eşit olacaktır. |
| [cend](./cend/)() const | Konteynerin son öğesini izleyen öğeye bir yineleyici döndürür. STL stilinde uygulanmıştır. Bu öğe bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa neden olur. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [ContainsKey](./containskey/)(const key_t\&) const override | Anahtarın sözlükte bulunup bulunmadığını denetler. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | Değerin sözlükte bulunup bulunmadığını denetler. Değerleri karşılaştırmak için == operatörünü kullanır. |
| [data](./data/)() | Temel veri depolama erişicisi. |
| [data](./data/)() const | Temel veri depolama erişicisi. |
| [end](./end/)() const | Konteynerin son öğesini izleyen anahtar-değer öğesi için KVPair sarmalayıcısına bir yineleyici döndürür. C# stilinde uygulanmıştır - yineleyici get_Key() ve get_Value() arabirimiyle KVPair nesnesini döndürmelidir. Bu öğe bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa neden olur. |
| [get_Count](./get_count/)() const override | Öğelerin sayısını alır. |
| virtual [GetEnumerator](./getenumerator/)() | Enumerator örneği oluşturur, alt sınıf tarafından uygulanmalıdır. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | Bulunursa değeri döndürür; aksi takdirde **Value()** döndürür. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | Bulunursa değeri döndürür; aksi takdirde **defaultValue** döndürür. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | Bulunursa değeri döndürür; aksi takdirde **null** döndürür. Yalnızca referans tipleri için anlamlıdır. |
| [idx_get](./idx_get/)(const key_t\&) const override | Anahtarlı alıcı işlevi. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | Anahtarlı ayarlayıcı işlevi. Öğeyi değiştirir veya oluşturur. |
| virtual [operator[]](./operator[]/)(const key_t\&) | Erişimci işlev. |
| [Remove](./remove/)(const key_t\&) override | Sözlükten belirli bir anahtarı kaldırır. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | Anahtarlı değeri arar ve bulunursa getirir. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Uygulanan arabirim. |
| [const_iterator](./const_iterator/) | Const iterator türü. |
| [iterator](./iterator/) | Iterator türü. |
| [KeyCollection](./keycollection/) | Temel depolama tipiyle doğru ayırıcıyı kullandığımızdan emin olun. |
| [KVPair](./kvpair/) | Anahtar-değer çifti türü. |
| [map_t](./map_t/) | Dahili harita türü. |
| [ValueCollection](./valuecollection/) | Değerler koleksiyonu. |

## Ayrıca Bakınız

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
