---
title: "System::Net::Http::Headers::HttpHeaderValueCollection sınıfı"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection sınıfı. Başlık değerlerinin koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Başlık değerlerinin koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Parametre | Açıklama |
| --- | --- |
| Bu | koleksiyonda temsil edilen başlık değerlerinin türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const T\&) override | Koleksiyona bir öğe ekler. |
| [Clear](./clear/)() override | Koleksiyondaki tüm öğeleri siler. |
| [Contains](./contains/)(const T\&) const override | Öğenin koleksiyonda bulunup bulunmadığını kontrol eder. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Tüm koleksiyon öğelerini mevcut dizi öğelerine kopyalar. |
| [get_Count](./get_count/)() const override | RTTI bilgisi. |
| [get_IsReadOnly](./get_isreadonly/)() | Geçerli koleksiyonun yalnızca okunabilir olup olmadığını gösteren bir değer alır. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Geçerli koleksiyonun bir "özel değer" içerip içermediğini gösteren bir değer alır. |
| [GetEnumerator](./getenumerator/)() override | Yineleyiciyi alır. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Geçerli koleksiyonun "özel değer" olmadan bir dize temsilini döndürür. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Yeni bir örnek oluşturur. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Yeni bir örnek oluşturur. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Yeni bir örnek oluşturur. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Yeni bir örnek oluşturur. |
| [ParseAdd](./parseadd/)(String) | Bir başlık dize temsilini ayrıştırır ve geçerli koleksiyona ekler. |
| [Remove](./remove/)(const T\&) override | Koleksiyondan öğeyi siler. |
| [RemoveSpecialValue](./removespecialvalue/)() | "Özel değer"i kaldırır. |
| [SetSpecialValue](./setspecialvalue/)() | "Özel değer"i ayarlar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir gösterici (paylaşılan yerine) olarak ayarlayın. Kapsayıcılardaki göstericileri zayıf moda geçiş yapmayı sağlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| [TryParseAdd](./tryparseadd/)(String) | Bir başlık dize temsilini ayrıştırmaya çalışır ve geçerli koleksiyona ekler. |

## Ayrıca Bakınız

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
