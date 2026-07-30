---
title: "System::Resources::ResourceManager classe"
linktitle: "ResourceManager"
second_title: "Aspose.Font per C++"
description: "System::Resources::ResourceManager classe. Fornisce un'API per gestire le risorse. Non implementata. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.resources/resourcemanager/
---
## ResourceManager class


Fornisce un'API per gestire le risorse. Non implementata. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ResourceManager : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | Ottiene l'oggetto dalla risorsa. Il nome non è GetObject() per gestire il problema della definizione GetObjectA. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Ottiene l'oggetto dalla risorsa. Il nome non è GetObject() per gestire il problema della definizione GetObjectA. |
| virtual [GetString](./getstring/)(String) | Ottiene la risorsa stringa. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Ottiene la risorsa stringa. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Informazioni RTTI. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Font for C++](../../)
