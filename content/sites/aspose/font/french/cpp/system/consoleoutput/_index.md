---
title: "Classe System::ConsoleOutput"
linktitle: "ConsoleOutput"
second_title: "Aspose.Font pour C++"
description: "Classe System::ConsoleOutput. Représente le flux de sortie standard. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1500
url: /fr/cpp/system/consoleoutput/
---
## ConsoleOutput class


Représente le flux de sortie standard. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Retourne toujours l'encodage ASCII. |
| [Write](./write/)(bool) override | Écrit la représentation sous forme de chaîne de la valeur booléenne spécifiée dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Écrit la représentation sous forme de chaîne de l'objet spécifié dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(char_t) override | Écrit la valeur de caractère spécifiée dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(Decimal) override | Écrit la représentation sous forme de chaîne de la valeur [Decimal](../decimal/) dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(double) override | Écrit la représentation sous forme de chaîne de la valeur à virgule flottante double précision dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(int32_t) override | Écrit la représentation sous forme de chaîne de la valeur entière 32 bits dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(int64_t) override | Écrit la représentation sous forme de chaîne de la valeur entière 64 bits dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(float) override | Écrit la représentation sous forme de chaîne de la valeur à virgule flottante simple précision dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(const String\&) override | Écrit l'objet chaîne spécifié dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(uint32_t) override | Écrit la représentation sous forme de chaîne de la valeur entière non signée 32 bits dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(uint64_t) override | Écrit la représentation sous forme de chaîne de la valeur entière non signée 64 bits dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Écrit la représentation sous forme de chaîne du tableau de caractères spécifié dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Écrit la représentation sous forme de chaîne d'une plage de valeurs du tableau de caractères spécifié dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(const char_t *) override | Écrit la chaîne C spécifiée dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(const TypeInfo\&) override | Écrit la représentation sous forme de chaîne de l'objet [TypeInfo](../typeinfo/) spécifié dans le flux de sortie représenté par l'objet actuel. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | Écrit le séparateur de ligne actuel dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Écrit la représentation sous forme de chaîne de l'objet spécifié suivie du séparateur de ligne actuel dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(bool) override | Écrit la représentation sous forme de chaîne de la valeur bool spécifiée, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(char_t) override | Écrit la valeur de caractère spécifiée, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(Decimal) override | Écrit la représentation sous forme de chaîne de la valeur [Decimal](../decimal/), suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(double) override | Écrit la représentation sous forme de chaîne d'une valeur à virgule flottante double précision, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(int) override | Écrit la représentation sous forme de chaîne d'une valeur entière 32 bits, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(int64_t) override | Écrit la représentation sous forme de chaîne d'une valeur entière 64 bits, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(float) override | Écrit la représentation sous forme de chaîne d'une valeur à virgule flottante simple précision, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(const String\&) override | Écrit l'objet chaîne spécifié, suivi du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(uint32_t) override | Écrit la représentation sous forme de chaîne d'une valeur entière non signée 32 bits, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(uint64_t) override | Écrit la représentation sous forme de chaîne d'une valeur entière non signée 64 bits, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Écrit la représentation sous forme de chaîne du tableau de caractères spécifié, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Écrit la représentation sous forme de chaîne d'une plage de valeurs du tableau de caractères spécifié, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(const char_t *) override | Écrit la chaîne C spécifiée, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | Écrit la représentation sous forme de chaîne de l'objet [TypeInfo](../typeinfo/) spécifié, suivie du séparateur de ligne actuel, dans le flux de sortie représenté par l'objet actuel. |
| [WriteLine](./writeline/)(const char *) |  |
## Voir aussi

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
