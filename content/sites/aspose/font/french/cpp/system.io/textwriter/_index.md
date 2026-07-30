---
title: "classe System::IO::TextWriter"
linktitle: "TextWriter"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::TextWriter. Une classe de base pour les classes qui représentent des écrivains qui écrivent des séquences de caractères vers différentes destinations. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2700
url: /fr/cpp/system.io/textwriter/
---
## TextWriter class


Une classe de base pour les classes qui représentent des écrivains qui écrivent des séquences de caractères vers différentes destinations. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class TextWriter : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Close](./close/)() | Ferme le flux et libère les ressources acquises. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'objet actuel et ferme le flux sous-jacent. |
| virtual [Flush](./flush/)() | Vide le contenu du tampon dans le flux sous-jacent. |
| virtual [get_Encoding](./get_encoding/)() | Renvoie l'encodage actuellement utilisé. |
| virtual [get_FormatProvider](./get_formatprovider/)() const | Renvoie l'objet [IFormatProvider](../../system/iformatprovider/) actuellement utilisé. |
| [get_FormatProvider](./get_formatprovider/)() | Renvoie l'objet [IFormatProvider](../../system/iformatprovider/) actuellement utilisé. |
| virtual [get_NewLine](./get_newline/)() const | Renvoie une chaîne de terminaison de ligne. |
| [get_NewLine](./get_newline/)() | Renvoie une chaîne de terminaison de ligne. |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | Définit une chaîne de terminaison de ligne. |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | Écrit la représentation sous forme de chaîne de l'objet spécifié dans le flux. |
| virtual [Write](./write/)(bool) | Écrit la représentation sous forme de chaîne de la valeur booléenne spécifiée dans le flux. |
| virtual [Write](./write/)(char_t) | Écrit le caractère spécifié dans le flux. |
| virtual [Write](./write/)(Decimal) | Écrit la représentation sous forme de chaîne de l'objet [Decimal](../../system/decimal/) spécifié dans le flux. |
| virtual [Write](./write/)(double) | Écrit la représentation sous forme de chaîne de la valeur à virgule flottante double précision spécifiée dans le flux. |
| virtual [Write](./write/)(int) | Écrit la représentation sous forme de chaîne de la valeur entière 32 bits spécifiée dans le flux. |
| virtual [Write](./write/)(int64_t) | Écrit la représentation sous forme de chaîne de la valeur entière 64 bits spécifiée dans le flux. |
| virtual [Write](./write/)(float) | Écrit la représentation sous forme de chaîne de la valeur à virgule flottante simple précision spécifiée dans le flux. |
| virtual [Write](./write/)(const String\&) | Écrit la chaîne spécifiée dans le flux. |
| virtual [Write](./write/)(uint32_t) | Écrit la représentation sous forme de chaîne de la valeur entière non signée 32 bits spécifiée dans le flux. |
| virtual [Write](./write/)(uint64_t) | Écrit la représentation sous forme de chaîne de la valeur entière non signée 64 bits spécifiée dans le flux. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | Écrit tous les caractères du tableau spécifié dans le flux. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Écrit la sous-plage spécifiée de caractères UTF-16 du tableau de caractères spécifié dans le flux. |
| virtual [Write](./write/)(const char_t *) | Écrit la chaîne C spécifiée dans le flux. |
| virtual [Write](./write/)(const TypeInfo\&) | Écrit la représentation sous forme de chaîne de l'objet [TypeInfo](../../system/typeinfo/) spécifié dans le flux. |
| [Write](./write/)(const String\&, const TArgs\&...) | Écrit les valeurs spécifiées formatées selon le format spécifié dans le flux. |
| virtual [WriteLine](./writeline/)() | Écrit les caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | Écrit la représentation sous forme de chaîne de l'objet spécifié suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(bool) | Écrit la représentation sous forme de chaîne de la valeur booléenne spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(char_t) | Écrit le caractère spécifié suivi des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(Decimal) | Écrit la représentation sous forme de chaîne de l'objet [Decimal](../../system/decimal/) spécifié suivi des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(double) | Écrit la représentation sous forme de chaîne de la valeur à virgule flottante double précision spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(int) | Écrit la représentation sous forme de chaîne de la valeur entière 32 bits spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(int64_t) | Écrit la représentation sous forme de chaîne de la valeur entière 64 bits spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(float) | Écrit la représentation sous forme de chaîne de la valeur à virgule flottante simple précision spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(const String\&) | Écrit la chaîne spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(uint32_t) | Écrit la représentation sous forme de chaîne de la valeur entière non signée 32 bits spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(uint64_t) | Écrit la représentation sous forme de chaîne de la valeur entière non signée 64 bits spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Écrit tous les caractères du tableau spécifié suivis des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Écrit la sous-plage spécifiée de caractères UTF-16 du tableau de caractères spécifié suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(const char_t *) | Écrit la chaîne C spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | Écrit la représentation sous forme de chaîne de l'objet [TypeInfo](../../system/typeinfo/) spécifié suivi des caractères de terminaison de ligne dans le flux. |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | Écrit les valeurs spécifiées formatées selon le format spécifié suivies des caractères de terminaison de ligne dans le flux. |
| virtual [~TextWriter](./~textwriter/)() | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers cette classe. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
