---
title: "System::Net::Http::Headers::HttpHeaderValueCollection sınıfı"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Page için C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection sınıfı. Başlık değerlerinin koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Başlık değerlerinin koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde ve new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Parameter | Açıklama |
| --- | --- |
| Bu | Koleksiyonda temsil edilen başlık değerlerinin türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const T\&) override | Koleksiyona öğe ekler. |
| [Clear](./clear/)() override | Koleksiyondaki tüm öğeleri siler. |
| [Contains](./contains/)(const T\&) const override | Öğenin koleksiyonda bulunup bulunmadığını denetler. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Tüm koleksiyon öğelerini mevcut dizi öğelerine kopyalar. |
| [get_Count](./get_count/)() const override | RTTI bilgisi. |
| [get_IsReadOnly](./get_isreadonly/)() | Geçerli koleksiyonun yalnızca okunabilir olup olmadığını gösteren bir değer alır. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Geçerli koleksiyonun bir "special value" içerip içermediğini gösteren bir değer alır. |
| [GetEnumerator](./getenumerator/)() override | İteratörü alır. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Geçerli koleksiyonun bir "special value" olmadan string temsilini döndürür. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Yeni bir örnek oluşturur. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Yeni bir örnek oluşturur. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Yeni bir örnek oluşturur. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Yeni bir örnek oluşturur. |
| [ParseAdd](./parseadd/)(String) | Bir başlık string temsilini ayrıştırır ve geçerli koleksiyona ekler. |
| [Remove](./remove/)(const T\&) override | Koleksiyondan öğeyi siler. |
| [RemoveSpecialValue](./removespecialvalue/)() | "special value" öğesini kaldırır. |
| [SetSpecialValue](./setspecialvalue/)() | "special value" öğesini ayarlar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| [TryParseAdd](./tryparseadd/)(String) | Bir başlık string temsilini ayrıştırmayı dener ve geçerli koleksiyona ekler. |

## Ayrıca Bakınız

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
