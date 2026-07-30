---
title: "Classe System::IO::StreamWriter"
linktitle: "StreamWriter"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::StreamWriter. Représente un écrivain qui écrit des caractères dans un flux d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2300
url: /fr/cpp/system.io/streamwriter/
---
## StreamWriter class


Représente un écrivain qui écrit des caractères dans un flux d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme le flux et libère les ressources acquises. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'objet actuel et ferme le flux sous-jacent. |
| [Flush](./flush/)() override | Vide le contenu du tampon vers le flux sous-jacent, puis vide le flux sous-jacent. |
| [get_AutoFlush](./get_autoflush/)() const | Renvoie une valeur indiquant si le [StreamWriter](./) videra les données vers le flux sous-jacent chaque fois que la méthode [StreamWriter::Write](./write/) est appelée. |
| [get_BaseStream](./get_basestream/)() const | Renvoie un pointeur partagé vers un objet qui représente le flux sous-jacent. |
| [get_Encoding](./get_encoding/)() override | Renvoie l'encodage actuellement utilisé. |
| [set_AutoFlush](./set_autoflush/)(bool) | Renvoie une valeur qui indique si le [StreamWriter](./) doit vider les données vers le flux sous-jacent chaque fois que la méthode [StreamWriter::Write](./write/) est appelée. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | Construit une instance de l'objet [StreamWriter](./) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon d'une taille par défaut de 1024 octets. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Construit une instance de l'objet [StreamWriter](./) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage indiqué et un tampon d'une taille par défaut de 1024 octets. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | Construit une instance de l'objet [StreamWriter](./) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage indiqué et un tampon de la taille indiquée. Un paramètre indique si le flux sous-jacent doit être fermé lorsque l'objet [StreamWriter](./) est libéré. |
| [StreamWriter](./streamwriter/)(const String\&) | Construit une instance de l'objet [StreamWriter](./) qui écrit des caractères dans le fichier spécifié en utilisant l'encodage UTF-8 et un tampon d'une taille par défaut de 1024 octets. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | Construit une instance de l'objet [StreamWriter](./) qui écrit des caractères dans le fichier spécifié en utilisant l'encodage indiqué et un tampon d'une taille par défaut de 1024 octets. Un paramètre indique si les données doivent être ajoutées au fichier ou si le fichier doit être écrasé. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | Construit une instance de l'objet [StreamWriter](./) qui écrit des caractères dans le fichier spécifié en utilisant l'encodage indiqué et la taille du tampon. Un paramètre indique si les données doivent être ajoutées au fichier ou si le fichier doit être écrasé. |
| [Write](./write/)(char_t) override | Écrit le caractère spécifié dans le flux. |
| [Write](./write/)(const String\&) override | Écrit la chaîne spécifiée dans le flux. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Écrit la représentation sous forme de chaîne de l'objet spécifié dans le flux. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Écrit tous les caractères du tableau spécifié dans le flux. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée de caractères UTF-16 du tableau de caractères spécifié dans le flux. |
| [Write](./write/)(const char_t *) override | Écrit la chaîne C spécifiée dans le flux. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | Écrit la représentation sous forme de chaîne de l'objet spécifié dans le flux. |
| [WriteLine](./writeline/)() override | Écrit les caractères de terminaison de ligne dans le flux. |
| [WriteLine](./writeline/)(const String\&) override | Écrit la chaîne spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Écrit la représentation sous forme de chaîne de l'objet spécifié suivie des caractères de terminaison de ligne dans le flux. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Écrit tous les caractères du tableau spécifié suivis des caractères de terminaison de ligne dans le flux. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée de caractères UTF-16 du tableau de caractères spécifié suivie des caractères de terminaison de ligne dans le flux. |
| [WriteLine](./writeline/)(const char_t *) override | Écrit la chaîne C spécifiée suivie des caractères de terminaison de ligne dans le flux. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | Écrit la représentation sous forme de chaîne de l'objet spécifié suivie des caractères de terminaison de ligne dans le flux. |
| [~StreamWriter](./~streamwriter/)() | Destructeur. |
## Voir aussi

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
