---
title: "System::WeakPtr sınıfı"
linktitle: "WeakPtr"
second_title: "Aspose.Font için C++"
description: "System::WeakPtr sınıfı. Oluşturulurken kendisini zayıf moda ayarlayan System::SmartPtr sınıfının alt sınıfı. Lütfen bu sınıfın, set_Mode() hâlâ erişilebilir olduğu sürece örneğinin her zaman zayıf modda kalacağını garanti etmediğini unutmayın. Bu tip, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. C++'ta yığıt (stack) üzerinde tahsis edilmeli ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 7500
url: /tr/cpp/system/weakptr/
---
## WeakPtr class


[System::SmartPtr](../smartptr/) sınıfının oluşturulurken kendisini zayıf moda ayarlayan alt sınıfı. Lütfen bu sınıfın, [set_Mode()](../smartptr/set_mode/) hâlâ erişilebilir olduğu sürece örneğinin her zaman zayıf modda kalacağını garanti etmediğini unutmayın. Bu tip, diğer nesnenin silinmesini yönetmek için bir işaretçidir. Yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | İşaret edilen tip. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [expired](./expired/)() const | Referans verilen nesnenin zaten silinip silinmediğini kontrol eder. |
| [get_weak](./get_weak/)() const | Referans verilen nesneyi alır. İşaretçinin zayıf modda olduğunu doğrular. |
| [operator=](./operator=/)(Q\&&) | Zayıf işaretçiye değer atar. [SmartPtr_](./smartptr_/)'in belirli atama operatörünü çağırır. |
| [operator==](./operator==/)(std::nullptr_t) const | Zayıf işaretçinin null olup olmadığını kontrol eder. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | Null işaretçi oluşturur. |
| [WeakPtr](./weakptr/)(Pointee_ *) | Verilen nesneye zayıf işaretçi oluşturur. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | ptr'nin işaret ettiği aynı işaretçiyi referans alan zayıf işaretçi oluşturur. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | x'in işaret ettiği aynı işaretçiyi referans alan zayıf işaretçi oluşturur. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | Zayıf işaretçiyi kopya yapıcı ile oluşturur. |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | Zayıf işaretçiyi kopya yapıcı ile oluşturur. |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | Zayıf işaretçiyi taşıma yapıcı ile oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Pointee_](./pointee_/) | İşaret edilen tip. |
| [SmartPtr_](./smartptr_/) | İlgili [SmartPtr](../smartptr/) sınıfı için takma ad. |
| [WeakPtr_](./weakptr_/) | Kendi tipi için takma ad. |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
