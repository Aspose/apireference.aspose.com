---
title: "System::Security::SecureString classe"
linktitle: "SecureString"
second_title: "Aspose.Font pour C++"
description: "System::Security::SecureString classe. Chaîne sécurisée, représente du texte qui doit rester confidentiel. Cette classe NE CHIFFRE PAS les données internes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.security/securestring/
---
## SecureString class


Chaîne sécurisée, représente du texte qui doit rester confidentiel. Cette classe NE CHIFFRE PAS les données internes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SecureString : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | Ajoute un caractère à la fin de la chaîne. |
| [Clear](./clear/)() | Supprime tous les caractères de la chaîne sécurisée actuelle. |
| [Copy](./copy/)() const | Crée un duplicata de cette chaîne sécurisée. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'objet actuel. |
| [get_Length](./get_length/)() const | Obtient le nombre de caractères dans cette chaîne sécurisée. |
| [InsertAt](./insertat/)(int32_t, char16_t) | Insère un caractère à l'index spécifié. |
| [IsReadOnly](./isreadonly/)() const | Obtient le drapeau indiquant si cet objet est marqué en lecture seule. |
| [MakeReadOnly](./makereadonly/)() | Rend cette chaîne sécurisée en lecture seule. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | Supprime le caractère à la position spécifiée. |
| [SecureString](./securestring/)() | Informations RTTI. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | Constructeur. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | Remplace le caractère existant à la position spécifiée. |
| [ToUnsecureString](./tounsecurestring/)() const | Copie le contenu de cette chaîne sécurisée dans un objet [String](../../system/string/) non sécurisé. À utiliser avec prudence. |
| [~SecureString](./~securestring/)() | Destructeur. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Font for C++](../../)
