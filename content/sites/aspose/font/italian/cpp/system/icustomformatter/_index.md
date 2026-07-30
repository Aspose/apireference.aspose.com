---
title: "Classe System::ICustomFormatter"
linktitle: "ICustomFormatter"
second_title: "Aspose.Font per C++"
description: "Classe System::ICustomFormatter. Definisce un metodo che esegue la formattazione personalizzata di una rappresentazione stringa di un valore rappresentato dall'oggetto specificato. Gli oggetti di questa classe dovrebbero essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3500
url: /it/cpp/system/icustomformatter/
---
## ICustomFormatter class


Definisce un metodo che esegue la formattazione personalizzata di una rappresentazione stringa di un valore rappresentato dall'oggetto specificato. Gli oggetti di questa classe dovrebbero essere allocati solo tramite la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ICustomFormatter : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | Restituisce una rappresentazione stringa di un valore rappresentato dall'oggetto corrente usando il formato specificato. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
