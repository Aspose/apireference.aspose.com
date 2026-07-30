---
title: "System::IO::StringWriter classe"
linktitle: "StringWriter"
second_title: "Aspose.Font pour C++"
description: "System::IO::StringWriter classe. Implémente un TextWriter qui écrit des informations dans une chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des défauts d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2500
url: /fr/cpp/system.io/stringwriter/
---
## StringWriter class


Implémente un [TextWriter](../textwriter/) qui écrit des informations dans une chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des défauts d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class StringWriter : public System::IO::TextWriter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Renvoie l'encodage actuellement utilisé. |
| virtual [GetStringBuilder](./getstringbuilder/)() | Renvoie le StringBuilder actuellement utilisé. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | Construit une nouvelle instance de [StringWriter](./) en utilisant le StringBuilder spécifié et le [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | Construit une nouvelle instance de [StringWriter](./) en utilisant le StringBuilder spécifié et le [IFormatProvider](../../system/iformatprovider/) de la culture actuelle. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | Construit une nouvelle instance de [StringWriter](./) en utilisant le [IFormatProvider](../../system/iformatprovider/) spécifié. |
| [StringWriter](./stringwriter/)() | Construit une nouvelle instance de [StringWriter](./) en utilisant [IFormatProvider](../../system/iformatprovider/) de la culture actuelle. |
| [ToString](./tostring/)() const override | Renvoie la chaîne sous-jacente. |
| [Write](./write/)(char_t) override | Écrit le caractère spécifié dans le flux. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée de caractères du tableau de caractères spécifié dans le flux. |
| [Write](./write/)(const String\&) override | Écrit la chaîne spécifiée dans le flux. |
## Voir aussi

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
