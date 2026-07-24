---
title: "System::Collections::Generic::IEqualityComparer classe"
linktitle: "IEqualityComparer"
second_title: "Aspose.Page per C++"
description: "System::Collections::Generic::IEqualityComparer classe. Interfaccia che fornisce i mezzi per confrontare due oggetti per uguaglianza. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2400
url: /it/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Interfaccia che fornisce i mezzi per confrontare due oggetti per uguaglianza. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo da confrontare. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | Informazioni RTTI. |
| virtual [GetHashCode](./gethashcode/)(T) const | Ottiene il codice hash per un oggetto. |

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
