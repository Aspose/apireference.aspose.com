---
title: "System::Net::Http::Headers::ViaHeaderValue classe"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::ViaHeaderValue. Représente une valeur de l’en-tête ''Via''. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() function. Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 2600
url: /fr/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


Représente une valeur de l’en-tête 'Via'. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en argument.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Renvoie le commentaire de la valeur de l’en-tête 'Via'. |
| [get_ProtocolName](./get_protocolname/)() | Informations RTTI. |
| [get_ProtocolVersion](./get_protocolversion/)() | Renvoie la version du protocole de la valeur de l’en-tête 'Via'. |
| [get_ReceivedBy](./get_receivedby/)() | Renvoie l’hôte et le port auxquels la requête ou la réponse a été reçue. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Convertit une chaîne passée à partir de l’index spécifié en une instance de la classe [ViaHeaderValue](./). |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [ViaHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [ViaHeaderValue](./). |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | Construit une nouvelle instance. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | Construit une nouvelle instance. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | Construit une nouvelle instance. |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
