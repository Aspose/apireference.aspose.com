---
title: "System::IDisposable class"
linktitle: "IDisposable"
second_title: "Aspose.Font per C++"
description: "System::IDisposable class. Definisce un metodo che rilascia le risorse possedute dall'oggetto corrente. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3600
url: /it/cpp/system/idisposable/
---
## IDisposable class


Definisce un metodo che rilascia le risorse possedute dall'oggetto corrente. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IDisposable : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Dispose](./dispose/)() | Non fa nulla. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
