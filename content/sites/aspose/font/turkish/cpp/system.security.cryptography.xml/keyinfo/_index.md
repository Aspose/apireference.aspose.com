---
title: "System::Security::Cryptography::Xml::KeyInfo sınıfı"
linktitle: "KeyInfo"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::Xml::KeyInfo sınıfı. XML dijital imzasının veya XML şifrelemesinin KeyInfo öğesini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tip bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++ içinde işlevlere argüman olarak geçirin."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography.xml/keyinfo/
---
## KeyInfo class


[KeyInfo](./) öğesini bir XML dijital imzasının veya bir XML şifrelemesinin öğesi olarak temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tip bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class KeyInfo : public System::Collections::Generic::IEnumerable<SharedPtr<Xml::KeyInfoClause>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddClause](./addclause/)(SharedPtr\<KeyInfoClause\>) |  |
| [get_Count](./get_count/)() |  |
| [GetEnumerator](./getenumerator/)() override | Yineleyiciyi alır. |
| [KeyInfo](./keyinfo/)() |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
