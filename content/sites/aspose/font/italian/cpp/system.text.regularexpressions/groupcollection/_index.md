---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::RegularExpressions::GroupCollection. Elenco dei gruppi di cattura in una singola corrispondenza. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Elenco dei gruppi di cattura in una singola corrispondenza. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Disabilita l'aggiunta di elementi alla collezione. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Aggiunge un gruppo alla collezione. |
| [Clear](./clear/)() override | Disabilita la rimozione di elementi dalla collezione. |
| [get_Item](./get_item/)(int) const | [Group](../group/) accessore. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) accessore. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Costruttore. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) accessore. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) accessore. |
| [IsReadOnly](./isreadonly/)() const | Segna la collezione come sola lettura. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) accessore. |
| [operator[]](./operator[]/)(int) | [Group](../group/) accessore. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) accessore. |
| [Remove](./remove/)(const GroupPtr\&) override | Disabilita la rimozione di un elemento dalla collezione. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Base](./base/) | [Base](./base/) classe. |
## Vedi anche

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
