---
title: "System::Collections::Generic::IComparer classe"
linktitle: "IComparer"
second_title: "Aspose.Page per C++"
description: "System::Collections::Generic::IComparer classe. Interfaccia che confronta due oggetti in senso maggiore-uguale-minore. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2000
url: /it/cpp/system.collections.generic/icomparer/
---
## IComparer class


Interfaccia che confronta due oggetti in senso maggiore-uguale-minore. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) funzione. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [args_type](./args_type/) | Informazioni RTTI. |

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
