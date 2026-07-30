---
title: "Classe System::Xml::NameTable"
linktitle: "NameTable"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::NameTable. Implémente un XmlNameTable monothread en C++."
type: docs
weight: 500
url: /fr/cpp/system.xml/nametable/
---
## NameTable class


Implémente un [XmlNameTable](../xmlnametable/) monothread.

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const String\&) override | Atomise la chaîne spécifiée et l'ajoute au [NameTable](./). |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Atomise la chaîne spécifiée et l'ajoute au [NameTable](./). |
| [Get](./get/)(const String\&) override | Retourne la chaîne atomisée avec la valeur spécifiée. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Retourne la chaîne atomisée contenant les mêmes caractères que la plage spécifiée de caractères dans le tableau fourni. |
| [NameTable](./nametable/)() | Initialise une nouvelle instance de la classe [NameTable](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
