---
title: "System::Nullable sınıfı"
linktitle: "Nullable"
second_title: "Aspose.Page için C++"
description: "System::Nullable sınıfı. C++'da ileri bildirim."
type: docs
weight: 4600
url: /tr/cpp/system/nullable/
---
## Nullable class


İleri bildirim.

```cpp
template<typename T>class Nullable
```


| Parameter | Açıklama |
| --- | --- |
| T | Alt sınıfı [Nullable](./) sınıfı tarafından genişletilen temel değer türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](./) nesne tarafından temsil edilen değere eşit olup olmadığını belirler. |
| [get_HasValue](./get_hasvalue/)() const | Geçerli nesnenin herhangi bir değeri temsil edip etmediğini belirler. |
| [get_Value](./get_value/)() const | Geçerli nesne tarafından temsil edilen değerin bir kopyasını döndürür. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir hash kodu döndürür. |
| [GetValueOrDefault](./getvalueordefault/)(T) | Geçerli nesne tarafından temsil edilen değeri döndürür; eğer bu değer null ise belirtilen değeri döndürür. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | Geçerli nesnenin null değerini temsil edip etmediğini belirler. |
| [Nullable](./nullable/)() | Null değerini temsil eden bir örnek oluşturur. |
| [Nullable](./nullable/)(std::nullptr_t) | Null değerini temsil eden bir örnek oluşturur. |
| [Nullable](./nullable/)(const T1\&) | Belirtilen değeri, gerekirse temel T tipine dönüştürülmüş olarak temsil eden [Nullable](./) sınıfının bir örneğini oluşturur. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | Belirtilen [Nullable](./) nesnesi tarafından temsil edilen bir değeri temsil eden bir örnek oluşturur. Belirtilen nullable nesne, oluşturulan örneğin temel tipinden farklı bir tipte değer temsil edebilir; bu durumda temsil edilen değer, T tipinde bir değere dönüştürülür. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | Bu ve **other** öğelerinin ikisinin de null olmadığını kontrol eden yardımcı işlev ve eğer öyleyse bir lambda çağırır. Uygulamalarda kullanılır. |
| [operator const T &](./operatorconstt&/)() const | Geçerli nesne tarafından temsil edilen değere sabit bir referans döndürür. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Geçerli nesne tarafından temsil edilen değerin null olmamasını belirler. |
| [operator!=](./operator!=/)(const T1\&) const | Geçerli nesne tarafından temsil edilen değerin belirtilen değerle eşit olmamasını belirler. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | Geçerli nesne tarafından temsil edilen değerin belirtilen [Nullable](./) nesnesi tarafından temsil edilen değerle eşit olmamasını belirler. |
| [operator&=](./operator&=/)(bool) | Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator&=()](./operator&=/) uygular. |
| [operator+](./operator+/)(std::nullptr_t) const | Nullable<T> sınıfının varsayılan olarak oluşturulmuş bir örneğini döndürür. |
| [operator+](./operator+/)(const T1\&) const | Nullable ve non-nullable değerleri toplar. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | Nullable değerleri toplar. |
| [operator+=](./operator+=/)(std::nullptr_t) | Geçerli nesneyi, null değeri temsil edecek şekilde sıfırlar. |
| [operator+=](./operator+=/)(const T1\&) | Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator+=()](./operator+=/) uygular. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | Belirtilen [Nullable](./) nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator+=()](./operator+=/) uygular. |
| [operator-](./operator-/)(T1) const | Nullable ve null işaretli değerleri çıkarır. |
| [operator-](./operator-/)(const T1\&) const | Nullable ve non-nullable değerleri çıkarır. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | Nullable değerleri çıkarır. |
| [operator-=](./operator-=/)(T1) | Null değeri temsil eden bir [Nullable](./) sınıf örneği döndürür. |
| [operator-=](./operator-=/)(const T1\&) | Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator-=()](./operator-=/) uygular. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | Belirtilen [Nullable](./) nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator-=()](./operator-=/) uygular. |
| [operator<](./operator_/)(std::nullptr_t) const | Her zaman false döndürür. |
| [operator<](./operator_/)(const T1\&) const | Bu değerleri [operator<()](./operator_/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen değerden küçük olup olmadığını belirler. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | Bu değerleri [operator<()](./operator_/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen [Nullable](./) nesnesi tarafından temsil edilen değerden küçük olup olmadığını belirler. |
| [operator<=](./operator_=/)(std::nullptr_t) const | Her zaman false döndürür. |
| [operator<=](./operator_=/)(const T1\&) const | Bu değerleri [operator<=()](./operator_=/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen değere küçük veya eşit olup olmadığını belirler. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | Bu değerleri [operator<=()](./operator_=/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen [Nullable](./) nesnesi tarafından temsil edilen değere küçük veya eşit olup olmadığını belirler. |
| [operator=](./operator=/)(std::nullptr_t) | Geçerli nesneye null atar. |
| [operator=](./operator=/)(const T1\&) | Nesnenin şu anda temsil ettiği değeri belirtilen değerle değiştirir. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | Nesnenin şu anda temsil ettiği değeri belirtilen değerle değiştirir. |
| [operator==](./operator==/)(std::nullptr_t) const | Geçerli nesne tarafından temsil edilen değerin null olup olmadığını belirler. |
| [operator==](./operator==/)(const T1\&) const | Geçerli nesne tarafından temsil edilen değerin belirtilen değerle eşit olup olmadığını belirler. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](./) nesne tarafından temsil edilen değere eşit olup olmadığını belirler. |
| [operator>](./operator_/)(std::nullptr_t) const | Her zaman false döndürür. |
| [operator>](./operator_/)(const T1\&) const | Geçerli nesne tarafından temsil edilen değerin, bu değerlere [operator>()](./operator_/) uygulanarak belirtilen değerden büyük olup olmadığını belirler. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](./) nesne tarafından temsil edilen değerden, bu değerlere [operator>()](./operator_/) uygulanarak büyük olup olmadığını belirler. |
| [operator>=](./operator_=/)(std::nullptr_t) const | Her zaman false döndürür. |
| [operator>=](./operator_=/)(const T1\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen nesne tarafından temsil edilen değere [operator>=()](./operator_=/) uygulanarak büyük veya eşit olup olmadığını belirler. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](./) nesne tarafından temsil edilen değere [operator>=()](./operator_=/) uygulanarak büyük veya eşit olup olmadığını belirler. |
| [operator | =](./operator_=/)(bool) | Uygular [operator | =()](./operator_=/) geçerli nesne tarafından temsil edilen değere, belirtilen değeri sağ taraf argümanı olarak kullanarak uygular. |
| [reset](./reset/)() | Geçerli temsil edilen değeri null olarak ayarlar. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen değeri string'e dönüştürür. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ValueType](./valuetype/) | Bu sınıf tarafından temsil edilen değerin bir türü için bir takma addır. |
## Açıklamalar


Null atanabilen belirtilen türde bir değeri temsil eder. Bu tür yığıt (stack) üzerinde tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tür nesneleri yönetmek için asla [System::SmartPtr](../smartptr/) sınıfını kullanmayın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
