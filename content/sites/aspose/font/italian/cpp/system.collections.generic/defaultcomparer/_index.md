---
title: "classe System::Collections::Generic::DefaultComparer"
linktitle: "DefaultComparer"
second_title: "Aspose.Font per C++"
description: "Classe System::Collections::Generic::DefaultComparer. Classe comparatore predefinita. Usa gli operatori < e == per confrontare i valori. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


Classe comparatore predefinita. Usa gli operatori < e == per confrontare i valori. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo da confrontare. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | Informazioni RTTI. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Interfaccia implementata. |
| [ThisType](./thistype/) | Tipo corrente. |

## Vedi anche

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
