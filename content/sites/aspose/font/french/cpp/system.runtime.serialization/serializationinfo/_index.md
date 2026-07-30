---
title: "System::Runtime::Serialization::SerializationInfo classe"
linktitle: "SerializationInfo"
second_title: "Aspose.Font pour C++"
description: "System::Runtime::Serialization::SerializationInfo classe. Contient un ensemble de champs nommés représentant l'objet sérialisé. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() fonction. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Contient un ensemble de champs nommés représentant l'objet sérialisé. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) fonction. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class SerializationInfo : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Insère une valeur float. Non implémenté. |
| [AddValue](./addvalue/)(const System::String\&, short) | Insère une valeur short. Non implémenté. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Insère une valeur booléenne. Non implémenté. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Insère une valeur d'objet. Non implémenté. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Insère une valeur d'objet avec le type spécifié. Non implémenté. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Récupère une valeur du magasin [SerializationInfo](./). Non implémenté. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | Informations RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
