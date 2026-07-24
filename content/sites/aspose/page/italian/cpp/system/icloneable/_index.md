---
title: "Classe System::ICloneable"
linktitle: "ICloneable"
second_title: "Aspose.Page per C++"
description: "Classe System::ICloneable. Definisce un metodo che consente la clonazione degli oggetti - creare una copia di un oggetto. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3200
url: /it/cpp/system/icloneable/
---
## ICloneable class


Definisce un metodo che consente la clonazione degli oggetti - creare una copia di un oggetto. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class ICloneable : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Clone](./clone/)() | Informazioni RTTI. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
