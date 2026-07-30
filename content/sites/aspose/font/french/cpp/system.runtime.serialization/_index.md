---
title: "Espace de noms System::Runtime::Serialization"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser l'espace de noms System::Runtime::Serialization en C++."
type: docs
weight: 5700
url: /fr/cpp/system.runtime.serialization/
---



## Classes

| Classe | Description |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Représente une implémentation de base de l'interface [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/). |
| [IFormatterConverter](./iformatterconverter/) | Fournit la connexion entre une instance de [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) et la classe fournie par le formatteur la mieux adaptée pour analyser les données à l'intérieur de [System::Runtime::Serialization::SerializationInfo](./serializationinfo/). |
| [ISerializable](./iserializable/) | Interface d'un objet qui peut être sérialisé. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument. |
| [SerializationInfo](./serializationinfo/) | Contient un ensemble de champs nommés représentant l'objet sérialisé. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument. |
| [StreamingContext](./streamingcontext/) | Classe factice pour permettre la compilation des classes traduites utilisant StreamingContext. Ne gérez pas les instances de cette classe avec [SmartPtr](../system/smartptr/), elles doivent être allouées uniquement sur la pile. |
