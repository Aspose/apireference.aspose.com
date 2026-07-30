---
title: "classe System::IComparable"
linktitle: "IComparable"
second_title: "Aspose.Font per C++"
description: "classe System::IComparable. Definisce un metodo che confronta due oggetti. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3300
url: /it/cpp/system/icomparable/
---
## IComparable class


Definisce un metodo che confronta due oggetti. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli oggetti con cui l'oggetto corrente viene confrontato |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | Confronta l'oggetto corrente con l'oggetto specificato. |

## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
