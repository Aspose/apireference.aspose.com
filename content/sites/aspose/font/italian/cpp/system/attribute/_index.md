---
title: "System::Attribute class"
linktitle: "Attribute"
second_title: "Aspose.Font per C++"
description: "System::Attribute class. Una classe base per attributi personalizzati. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system/attribute/
---
## Attribute class


Una classe base per attributi personalizzati. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Attribute : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | Restituisce un attributo personalizzato di un tipo specificato applicato al tipo specificato. |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | Restituisce tutti gli attributi personalizzati applicati al tipo specificato. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
