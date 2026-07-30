---
title: "System::Text::RegularExpressions::CaptureCollection classe"
linktitle: "CaptureCollection"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::RegularExpressions::CaptureCollection. Elenco delle catture effettuate da un singolo gruppo di cattura. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Elenco delle catture effettuate da un singolo gruppo di cattura. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Disabilita la modifica della collezione. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Metodo di servizio per aggiungere una cattura alla collezione. |
| [Clear](./clear/)() override | Disabilita la pulizia della collezione. |
| [get_Count](./get_count/)() const override | Restituisce il numero di catture. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Segna la collezione come sola lettura. |
| [get_IsSynchronized](./get_issynchronized/)() const | Segna la collezione come non sincronizzata. |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) accessore. |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) accessore. |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) accessore. |
| [Remove](./remove/)(const CapturePtr\&) override | Disabilita la modifica della collezione. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Base](./base/) | [Base](./base/) tipo. |
## Vedi anche

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
