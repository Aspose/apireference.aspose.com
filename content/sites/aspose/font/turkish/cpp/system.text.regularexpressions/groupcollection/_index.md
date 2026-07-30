---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "Aspose.Font için C++"
description: "System::Text::RegularExpressions::GroupCollection sınıfı. Tek bir eşleşmedeki yakalama gruplarının listesidir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle bu tipin örneği oluşturulmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Tek bir eşleşmedeki yakalama gruplarının listesi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Yığını (stack) üzerinde veya operator new kullanarak bu tipin örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Koleksiyona öğe eklemeyi devre dışı bırakır. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Grubu koleksiyona ekler. |
| [Clear](./clear/)() override | Koleksiyondan öğe bırakmayı devre dışı bırakır. |
| [get_Item](./get_item/)(int) const | [Group](../group/) erişici. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) erişici. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Yapıcı. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) erişici. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) erişici. |
| [IsReadOnly](./isreadonly/)() const | Koleksiyonu yalnızca okunur olarak işaretler. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) erişici. |
| [operator[]](./operator[]/)(int) | [Group](../group/) erişici. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) erişici. |
| [Remove](./remove/)(const GroupPtr\&) override | Koleksiyondan öğe kaldırmayı devre dışı bırakır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Base](./base/) | [Base](./base/) sınıfı. |
## Ayrıca Bakınız

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
