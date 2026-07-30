---
title: "System::DynamicWeakPtr sınıfı"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Font için C++"
description: "System::DynamicWeakPtr sınıfı. Saklanan nesnenin şablon argümanlarının gösterici modlarını izleyen ve her atamadan sonra güncelleyen akıllı gösterici sınıfı. Bu tip, diğer nesnenin silinmesini yönetmek için bir göstericidir. C++'ta yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara ya değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 2200
url: /tr/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Depolanan nesnenin şablon argümanlarının işaretçi modlarını izleyen ve her atamadan sonra güncelleyen akıllı işaretçi sınıfı. Bu tip, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. Yığına ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Parametre | Açıklama |
| --- | --- |
| Pointee | tip. |
| trunkMode | Akıllı göstericinin kendisinin modu, paylaşımlı ya da zayıf. |
| weakLeafs | Saklanan tipin şablon argümanlarının, zayıf gösterici moduna ayarlanması gereken indeksleri. |
## Nested classes

* Class [Reference](./reference/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Null akıllı gösterici oluşturur. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Verilen nesneyi işaret eden akıllı gösterici oluşturur. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Akıllı göstericiyi kopya yapıcı ile oluşturur. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Akıllı göstericiyi kopya yapıcı ile oluşturur. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Akıllı göstericiyi kopya yapıcı ile oluşturur. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Akıllı göstericiyi taşıma yapıcı ile oluşturur. |
| [operator=](./operator=/)(SmartPtr_\&&) | Akıllı göstericiyi taşıma ataması yapar. |
| [operator=](./operator=/)(const SmartPtr_\&) | Akıllı göstericiyi kopya ataması yapar. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Akıllı göstericiyi kopya ataması yapar. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Akıllı göstericiyi atar. |
| [operator=](./operator=/)(std::nullptr_t) | Akıllı göstericiyi null olarak ayarlar. |
| [operator==](./operator==/)(std::nullptr_t) const | Akıllı işaretçinin null olup olmadığını denetler. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Kendi tip takma adı. |
| [Pointee_](./pointee_/) | İşaret edilen tip. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) temel sınıf takma adı. |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
