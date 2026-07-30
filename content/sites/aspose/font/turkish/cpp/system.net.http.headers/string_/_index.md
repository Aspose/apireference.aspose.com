---
title: "System::Net::Http::Headers::HttpHeaderValueCollection< System::String > sınıfı"
linktitle: "String >"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection< System::String > sınıfı. String türü için HttpHeaderValueCollection şablonunun kısmi özelleştirmesidir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.net.http.headers/string_/
---
## String > class


Bu, [String](../../system/string/) türü için [HttpHeaderValueCollection](../httpheadervaluecollection/) şablonunun kısmi özelleştirmesidir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class String > : public System::Collections::Generic::ICollection<System::String>,
                 public System::Collections::Generic::ICollection<System::String>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const String\&) override | Koleksiyona bir öğe ekler. |
| [Clear](./clear/)() override | Koleksiyondaki tüm öğeleri siler. |
| [Contains](./contains/)(const String\&) const override | Öğenin koleksiyonda bulunup bulunmadığını kontrol eder. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override |  |
| [get_Count](./get_count/)() const override | Koleksiyondaki eleman sayısını alır. |
| [get_IsReadOnly](./get_isreadonly/)() |  |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() |  |
| [GetEnumerator](./getenumerator/)() override | Yineleyiciyi alır. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<String\>\>, String\>) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, String) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, String, Action\<System::SharedPtr\<HttpHeaderValueCollection\<String\>\>, String\>) |  |
| [ParseAdd](./parseadd/)(String) |  |
| [Remove](./remove/)(const String\&) override | Koleksiyondan öğeyi siler. |
| [RemoveSpecialValue](./removespecialvalue/)() |  |
| [SetSpecialValue](./setspecialvalue/)() |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir gösterici (paylaşılan yerine) olarak ayarlayın. Kapsayıcılardaki göstericileri zayıf moda geçiş yapmayı sağlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| [TryParseAdd](./tryparseadd/)(String) |  |
## Ayrıca Bakınız

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
