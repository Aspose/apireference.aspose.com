---
title: "System::Collections::Specialized::StringDictionary classe"
linktitle: "StringDictionary"
second_title: "Aspose.Font per C++"
description: "System::Collections::Specialized::StringDictionary classe. Dizionario da stringa a stringa. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.collections.specialized/stringdictionary/
---
## StringDictionary class


[String](../../system/string/) to string dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class StringDictionary : public System::Collections::Generic::Dictionary<String, String>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const override | Ottiene il valore per una chiave specifica. |
## Vedi anche

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
