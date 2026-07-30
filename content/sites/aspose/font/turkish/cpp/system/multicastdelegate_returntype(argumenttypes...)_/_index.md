---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> sınıfı"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font için C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> sınıfı. Delegeler koleksiyonunu temsil eder. Bu tip yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 4500
url: /tr/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


Delegeler koleksiyonunu temsil eder. Bu tip yığıt üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parametre | Açıklama |
| --- | --- |
| ReturnType | Koleksiyondaki her delegenin işaret ettiği çağrılabilir varlıkların dönüş tipi |
| ArgumentTypes | Koleksiyondaki her delegenin işaret ettiği çağrılabilir varlıkların argüman listesi |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | UYGULANMADI. |
| [connect](./connect/)(Callback) | Belirtilen delegeyi koleksiyona ekler. |
| [connect](./connect/)(std::function\<R(Args...)>) | Belirtilen fonksiyon nesnesini delegeler koleksiyonuna ekler. Fonksiyon nesnesi, koleksiyona eklenmeden önce [Callback](./callback/) delegesi tipine dönüştürülür. |
| [connect](./connect/)(MulticastDelegate\&) | Belirtilen MulticastDelegate nesnesini delegeler koleksiyonuna ekler. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | Belirtilen nesnenin belirtilen statik olmayan metodunu delegeler koleksiyonuna ekler. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Belirtilen nesnenin belirtilen statik olmayan metodunu delegeler koleksiyonuna ekler. |
| [disconnect](./disconnect/)(Callback) | Belirtilen delegeyi delegeler koleksiyonundan kaldırır. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | Belirtilen nesnenin belirtilen statik olmayan metodunu delegeler koleksiyonundan kaldırır. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Belirtilen nesnenin belirtilen statik olmayan metodunu delegeler koleksiyonundan kaldırır. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | Belirtilen MulticastDelegate nesnesini delegeler koleksiyonundan kaldırır. |
| [disconnect_all_slots](./disconnect_all_slots/)() | Tüm delegeleri delegeler koleksiyonundan kaldırır. |
| [empty](./empty/)() const | Delegeler koleksiyonunun boş olup olmadığını belirler. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | UYGULANMADI. |
| [Equals](./equals/)(const MulticastDelegate\&) |  |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | Şu anda delegeler koleksiyonunda bulunan tüm delegeleri çağırır. Delegeler, koleksiyona eklendikleri sırayla çağrılır. Delegeler yürütülürken yöntem engellenir. |
| [IsNull](./isnull/)() const | Delegeler koleksiyonunun boş olup olmadığını belirler. |
| [MulticastDelegate](./multicastdelegate/)() | Boş bir koleksiyon oluşturur. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | Varsayılan yapıcıya eşdeğerdir. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | Temsilci koleksiyonunun sığ bir kopyasını oluşturur. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | Taşıma yapıcı. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | Bir örnek oluşturur ve belirtilen temsilciyi temsilciler koleksiyonuna ekler. |
| [MulticastDelegate](./multicastdelegate/)(T) | Bir örnek oluşturur ve belirtilen değeri temsilciler koleksiyonuna ekler. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | Bir örnek oluşturur ve belirtilen değeri temsilciler koleksiyonuna ekler. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Temsilci koleksiyonunun boş olmadığını belirler. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | İki MulticastDelegate örneğinin (geçerli nesne ve belirtilen nesne) eşit olmadığını belirler. |
| [operator()](./operator()/)(ArgumentTypes...) const | Temsilciler koleksiyonunda şu anda bulunan tüm temsilcileri çağırır. Temsilciler, koleksiyona eklendikleri sırayla çağırılır. Operatör, temsilciler yürütülürken bloklanır. |
| [operator+=](./operator+=/)(Callback) | Belirtilen delegeyi koleksiyona ekler. |
| [operator-=](./operator-=/)(Callback) | Belirtilen delegeyi delegeler koleksiyonundan kaldırır. |
| [operator=](./operator=/)(const MulticastDelegate\&) | Belirtilen nesne tarafından temsil edilen temsilci koleksiyonunu geçerli nesneye atar. Sonuç olarak her iki nesne de aynı temsilci koleksiyonuna işaret eder. |
| [operator=](./operator=/)(MulticastDelegate\&&) | Taşıma atama operatörü. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Delegeler koleksiyonunun boş olup olmadığını belirler. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | İki MulticastDelegate örneğinin (geçerli nesne ve belirtilen nesne) eşit olup olmadığını belirler. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | Boş (aslında bir şey çağırmayan) içerilen geri aramaları temizler. |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | MulticastDelegate sınıfı tip bilgilerini temsil eden [TypeInfo](../typeinfo/) nesnesine bir referans döndürür. |
| [~MulticastDelegate](./~multicastdelegate/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Callback](./callback/) | MulticastDelegate sınıfı tarafından temsil edilen temsilcilerin türü. |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
