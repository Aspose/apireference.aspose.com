---
title: "System::Net::Http::Headers::RangeItemHeaderValue classe"
linktitle: "RangeItemHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue classe. Représente une plage d'octets dans la valeur de l'en-tête ''Range''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.net.http.headers/rangeitemheadervalue/
---
## RangeItemHeaderValue class


Représente une plage d'octets dans la valeur de l'en-tête 'Range'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class RangeItemHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_From](./get_from/)() | Informations RTTI. |
| [get_To](./get_to/)() | Renvoie une position à laquelle l'envoi de données doit s'arrêter. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetRangeItemLength](./getrangeitemlength/)(String, int32_t, System::SharedPtr\<RangeItemHeaderValue\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [RangeItemHeaderValue](./). |
| static [GetRangeItemListLength](./getrangeitemlistlength/)(String, int32_t, System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\>) | Convertit une chaîne passée à partir de la position spécifiée en la collection d'instances de la classe RangeItemHeaderValue. |
| [RangeItemHeaderValue](./rangeitemheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Construit une nouvelle instance. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
