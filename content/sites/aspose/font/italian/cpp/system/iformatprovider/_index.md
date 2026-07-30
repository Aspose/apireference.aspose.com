---
title: "System::IFormatProvider classe"
linktitle: "IFormatProvider"
second_title: "Aspose.Font per C++"
description: "classe System::IFormatProvider. Definisce un metodo che fornisce informazioni di formattazione. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3800
url: /it/cpp/system/iformatprovider/
---
## IFormatProvider class


Definisce un metodo che fornisce informazioni di formattazione. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class IFormatProvider : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | Restituisce un oggetto che fornisce servizi di formattazione per il tipo specificato. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
