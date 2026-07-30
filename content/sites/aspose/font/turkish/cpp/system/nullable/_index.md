---
title: "System::Nullable class"
linktitle: "Nullable"
second_title: "Aspose.Font için C++"
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


| Parametre | Açıklama |
| --- | --- |
| T | Temel değer tipi, [Nullable](./) sınıfı tarafından genişletilir. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | Mevcut nesne tarafından temsil edilen değerin, belirtilen [Nullable](./) nesne tarafından temsil edilen değerle eşit olup olmadığını belirler. |
| [get_HasValue](./get_hasvalue/)() const | Mevcut nesnenin herhangi bir değeri temsil edip etmediğini belirler. |
| [get_Value](./get_value/)() const | Mevcut nesne tarafından temsil edilen değerin bir kopyasını döndürür. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir karma kodu döndürür. |
| [GetValueOrDefault](./getvalueordefault/)(T) | Mevcut nesne tarafından temsil edilen değeri döndürür; eğer bu değer null ise belirtilen değeri döndürür. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | Mevcut nesnenin null değeri temsil edip etmediğini belirler. |
| [Nullable](./nullable/)() | Null değeri temsil eden bir örnek oluşturur. |
| [Nullable](./nullable/)(std::nullptr_t) | Null değerini temsil eden bir örnek oluşturur. |
| [Nullable](./nullable/)(const T1\&) | Belirtilen değeri (gerekirse) temel tip T'nin değerine dönüştürülmüş olarak temsil eden [Nullable](./) sınıfının bir örneğini oluşturur. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | Belirtilen [Nullable](./) nesnesi tarafından temsil edilen bir değeri temsil eden bir örnek oluşturur. Belirtilen nullable nesne, oluşturulan örneğin temel tipinden farklı bir tipte değer temsil edebilir; bu durumda temsil edilen değer, T tipinde bir değere dönüştürülür. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | **other** ile bunun her ikisinin de null olmamasını kontrol eden ve bu durumda bir lambda çağıran yardımcı işlev. Uygulamalarda kullanılır. |
| [operator const T &](./operatorconstt&/)() const | Geçerli nesne tarafından temsil edilen değere sabit bir referans döndürür. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Geçerli nesne tarafından temsil edilen değerin null olmadığını belirler. |
| [operator!=](./operator!=/)(const T1\&) const | Geçerli nesne tarafından temsil edilen değerin belirtilen değere eşit olmadığını belirler. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](./) nesnesi tarafından temsil edilen değere eşit olmadığını belirler. |
| [operator&=](./operator&=/)(bool) | Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator&=()](./operator&=/) uygular. |
| [operator+](./operator+/)(std::nullptr_t) const | Nullable<T> sınıfının varsayılan olarak oluşturulmuş bir örneğini döndürür. |
| [operator+](./operator+/)(const T1\&) const | Nullable ve non-nullable değerleri toplar. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | Nullable değerleri toplar. |
| [operator+=](./operator+=/)(std::nullptr_t) | Geçerli nesneyi, null bir değeri temsil edecek şekilde sıfırlar. |
| [operator+=](./operator+=/)(const T1\&) | Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator+=()](./operator+=/) uygular. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | Belirtilen [Nullable](./) nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator+=()](./operator+=/) uygular. |
| [operator-](./operator-/)(T1) const | Nullable ve null işaretli değerleri çıkarır. |
| [operator-](./operator-/)(const T1\&) const | Nullable ve non-nullable değerleri çıkarır. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | Nullable değerleri çıkarır. |
| [operator-=](./operator-=/)(T1) | Null bir değeri temsil eden [Nullable](./) sınıfının bir örneğini döndürür. |
| [operator-=](./operator-=/)(const T1\&) | Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator-=()](./operator-=/) uygular. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | Belirtilen [Nullable](./) nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator-=()](./operator-=/) uygular. |
| [operator<](./operator_/)(std::nullptr_t) const | Her zaman false döndürür. |
| [operator<](./operator_/)(const T1\&) const | Bu değerler üzerine [operator<()](./operator_/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen değerden küçük olup olmadığını belirler. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | Bu değerler üzerine [operator<()](./operator_/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen [Nullable](./) nesnesi tarafından temsil edilen değerden küçük olup olmadığını belirler. |
| [operator<=](./operator_=/)(std::nullptr_t) const | Her zaman false döndürür. |
| [operator<=](./operator_=/)(const T1\&) const | Bu değerler üzerine [operator<=()](./operator_=/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen değere küçük veya eşit olup olmadığını belirler. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | Bu değerler üzerine [operator<=()](./operator_=/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen [Nullable](./) nesnesi tarafından temsil edilen değere küçük veya eşit olup olmadığını belirler. |
| [operator=](./operator=/)(std::nullptr_t) | Geçerli nesneye null atar. |
| [operator=](./operator=/)(const T1\&) | Nesnenin şu anda temsil edilen değerini belirtilen değerle değiştirir. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | Nesnenin şu anda temsil edilen değerini belirtilen değerle değiştirir. |
| [operator==](./operator==/)(std::nullptr_t) const | Geçerli nesne tarafından temsil edilen değerin null olup olmadığını belirler. |
| [operator==](./operator==/)(const T1\&) const | Geçerli nesne tarafından temsil edilen değerin belirtilen değerle eşit olup olmadığını belirler. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | Mevcut nesne tarafından temsil edilen değerin, belirtilen [Nullable](./) nesne tarafından temsil edilen değerle eşit olup olmadığını belirler. |
| [operator>](./operator_/)(std::nullptr_t) const | Her zaman false döndürür. |
| [operator>](./operator_/)(const T1\&) const | Bu değerler üzerine [operator>()](./operator_/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen değerden büyük olup olmadığını belirler. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | Bu değerler üzerine [operator>()](./operator_/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen [Nullable](./) nesne tarafından temsil edilen değerden büyük olup olmadığını belirler. |
| [operator>=](./operator_=/)(std::nullptr_t) const | Her zaman false döndürür. |
| [operator>=](./operator_=/)(const T1\&) const | Bu değerler üzerine [operator>=()](./operator_=/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen nesne tarafından temsil edilen değere büyük veya eşit olup olmadığını belirler. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | Bu değerler üzerine [operator>=()](./operator_=/) uygulayarak, geçerli nesne tarafından temsil edilen değerin belirtilen [Nullable](./) nesne tarafından temsil edilen değere büyük veya eşit olup olmadığını belirler. |
| [operator | =](./operator_=/)(bool) | Uygular [operator | =()](./operator_=/) geçerli nesne tarafından temsil edilen değere, belirtilen değeri sağ taraf argümanı olarak kullanarak uygular. |
| [reset](./reset/)() | Şu anda temsil edilen değeri null olarak ayarlar. |
| [set_Value](./set_value/)(const T\&) | Nullable nesneye yeni bir değer atar. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen değeri stringe dönüştürür. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ValueType](./valuetype/) | Bu sınıf tarafından temsil edilen değerin bir türü için bir takma addır. |
## Açıklamalar


Null atanabilen belirtilen türde bir değeri temsil eder. Bu tür yığına (stack) tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tür nesneleri yönetmek için asla [System::SmartPtr](../smartptr/) sınıfını kullanmayın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
