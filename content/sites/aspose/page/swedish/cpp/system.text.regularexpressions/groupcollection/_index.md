---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "Aspose.Page för C++"
description: "System::Text::RegularExpressions::GroupCollection-klass. Lista över fångstgrupper i en enda matchning. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd den pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 400
url: /sv/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Lista över fångstgrupper i en enda matchning. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd den pekaren för att skicka den till funktioner som argument.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Inaktiverar att lägga till element i samlingen. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Lägger till grupp i samlingen. |
| [Clear](./clear/)() override | Inaktiverar att släppa element från samlingen. |
| [get_Item](./get_item/)(int) const | [Group](../group/) åtkomstfunktion. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) åtkomstfunktion. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Konstruktor. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) åtkomstfunktion. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) åtkomstfunktion. |
| [IsReadOnly](./isreadonly/)() const | Markerar samlingen som skrivskyddad. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) åtkomstfunktion. |
| [operator[]](./operator[]/)(int) | [Group](../group/) åtkomstfunktion. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) åtkomstfunktion. |
| [Remove](./remove/)(const GroupPtr\&) override | Inaktiverar att ta bort element från samlingen. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Base](./base/) | [Base](./base/) klass. |
## Se även

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
