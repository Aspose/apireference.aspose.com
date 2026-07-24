---
title: "classe System::IDisposable"
linktitle: "IDisposable"
second_title: "Aspose.Page per C++"
description: "classe System::IDisposable. Definisce un metodo che rilascia le risorse possedute dall'oggetto corrente. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3600
url: /it/cpp/system/idisposable/
---
## IDisposable class


Definisce un metodo che rilascia le risorse possedute dall'oggetto corrente. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

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
* Library [Aspose.Page for C++](../../)
