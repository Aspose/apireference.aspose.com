---
title: "System::Runtime::Serialization spazio dei nomi"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Font per C++"
description: "Come utilizzare lo spazio dei nomi System::Runtime::Serialization in C++."
type: docs
weight: 5700
url: /it/cpp/system.runtime.serialization/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Rappresenta un'implementazione di base dell'interfaccia [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/). |
| [IFormatterConverter](./iformatterconverter/) | Fornisce la connessione tra un'istanza di [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) e la classe fornita dal formatter più adatta a analizzare i dati all'interno di [System::Runtime::Serialization::SerializationInfo](./serializationinfo/). |
| [ISerializable](./iserializable/) | Interfaccia di un oggetto che può essere serializzato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SerializationInfo](./serializationinfo/) | Contiene un insieme di campi denominati che rappresentano l'oggetto serializzato. Non implementato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [StreamingContext](./streamingcontext/) | Classe fittizia per consentire la compilazione delle classi tradotte che utilizzano StreamingContext. Non gestire le istanze di questa classe con [SmartPtr](../system/smartptr/), devono essere allocate solo sullo stack. |
