---
title: "classe System::IEquatable"
linktitle: "IEquatable"
second_title: "Aspose.Page per C++"
description: "Classe System::IEquatable. Definisce un metodo che determina l'uguaglianza di due oggetti. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3700
url: /it/cpp/system/iequatable/
---
## IEquatable class


Definisce un metodo che determina l'uguaglianza di due oggetti. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli oggetti confrontati |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Equals](./equals/)(T) | Determina se gli oggetti corrente e specificato sono uguali. |

## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
