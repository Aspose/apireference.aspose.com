---
title: "System::Net::Http::Headers::TransferCodingHeaderValue classe"
linktitle: "TransferCodingHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue classe. Représente une valeur de l'en-tête ''Accept-Encoding''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2400
url: /fr/cpp/system.net.http.headers/transfercodingheadervalue/
---
## TransferCodingHeaderValue class


Représente une valeur de l'en-tête 'Accept-Encoding'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class TransferCodingHeaderValue : public virtual System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Parameters](./get_parameters/)() | Renvoie les paramètres. |
| [get_Value](./get_value/)() | Informations RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetTransferCodingLength](./gettransfercodinglength/)(String, int32_t, const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\&, System::SharedPtr\<TransferCodingHeaderValue\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [TransferCodingHeaderValue](./). |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [TransferCodingHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)() | Construit une nouvelle instance. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)(String) | Construit une nouvelle instance. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingHeaderValue\>\&) | Tente de convertir une chaîne passée en une instance de la classe [TransferCodingHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
