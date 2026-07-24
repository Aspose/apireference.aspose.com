---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::GroupCollection class. Lijst van capture-groepen in één overeenkomst. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Lijst van capture-groepen in één overeenkomst. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Schakelt het toevoegen van een element aan de collectie uit. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Voegt een groep toe aan de collectie. |
| [Clear](./clear/)() override | Schakelt het verwijderen van elementen uit de collectie uit. |
| [get_Item](./get_item/)(int) const | [Group](../group/) toegangsmethode. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) toegangsmethode. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Constructor. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) toegangsmethode. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) toegangsmethode. |
| [IsReadOnly](./isreadonly/)() const | Markeert de collectie als alleen‑lezen. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) toegangsmethode. |
| [operator[]](./operator[]/)(int) | [Group](../group/) toegangsmethode. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) toegangsmethode. |
| [Remove](./remove/)(const GroupPtr\&) override | Schakelt het verwijderen van een element uit de collectie uit. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Base](./base/) | [Base](./base/) klasse. |
## Zie ook

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
