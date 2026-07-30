---
title: "System::Runtime::Serialization::SerializationInfo classe"
linktitle: "SerializationInfo"
second_title: "Aspose.Font per C++"
description: "System::Runtime::Serialization::SerializationInfo classe. Contiene un insieme di campi denominati che rappresentano l'oggetto serializzato. Non implementato. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Contiene un insieme di campi denominati che rappresentano l'oggetto serializzato. Non implementato. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SerializationInfo : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Inserisce valore float. Non implementato. |
| [AddValue](./addvalue/)(const System::String\&, short) | Inserisce valore short. Non implementato. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Inserisce valore booleano. Non implementato. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Inserisce valore oggetto. Non implementato. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Inserisce valore oggetto con tipo specificato. Non implementato. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Recupera un valore dal deposito [SerializationInfo](./). Non implementato. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | Informazioni RTTI. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
