---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::GroupCollection sınıfı. Tek bir eşleşmedeki yakalama gruplarının listesi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 400
url: /tr/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Tek bir eşleşmedeki yakalama gruplarının listesi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Koleksiyona eleman eklemeyi devre dışı bırakır. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Grubu koleksiyona ekler. |
| [Clear](./clear/)() override | Koleksiyondan eleman bırakmayı devre dışı bırakır. |
| [get_Item](./get_item/)(int) const | [Group](../group/) erişimci. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) erişimci. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Yapıcı. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) erişimci. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) erişimci. |
| [IsReadOnly](./isreadonly/)() const | Koleksiyonu yalnızca okunur olarak işaretler. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) erişimci. |
| [operator[]](./operator[]/)(int) | [Group](../group/) erişimci. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) erişimci. |
| [Remove](./remove/)(const GroupPtr\&) override | Koleksiyondan eleman kaldırmayı devre dışı bırakır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Base](./base/) | [Base](./base/) sınıfı. |
## Ayrıca Bakınız

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
