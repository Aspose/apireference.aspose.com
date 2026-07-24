---
title: "Classe System::Attribute"
linktitle: "Attributo"
second_title: "Aspose.Page per C++"
description: "Classe System::Attribute. Una classe base per attributi personalizzati. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system/attribute/
---
## Attribute class


Una classe base per attributi personalizzati. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

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
* Library [Aspose.Page for C++](../../)
