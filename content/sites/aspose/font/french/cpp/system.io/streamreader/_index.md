---
title: "System::IO::StreamReader class"
linktitle: "StreamReader"
second_title: "Aspose.Font pour C++"
description: "System::IO::StreamReader class. Représente un lecteur qui lit des caractères à partir d'un flux d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2200
url: /fr/cpp/system.io/streamreader/
---
## StreamReader class


Représente un lecteur qui lit des caractères à partir d'un flux d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class StreamReader : public System::IO::TextReader
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme les flux actuels et sous-jacents. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'objet actuel et ferme le flux sous-jacent. |
| [get_BaseStream](./get_basestream/)() const | Renvoie un pointeur partagé vers un objet qui représente le flux sous-jacent. |
| [get_CurrentEncoding](./get_currentencoding/)() | Renvoie l'encodage actuellement utilisé. |
| [get_EndOfStream](./get_endofstream/)() | Renvoie une valeur indiquant si la fin du flux a été atteinte. |
| [Peek](./peek/)() override | Lit un caractère unique du flux sans modifier le curseur de lecture du flux. |
| [Read](./read/)() override | Lit un caractère unique du flux. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Lit le nombre spécifié de caractères du flux, les convertit en encodage UTF-16 et écrit les caractères UTF-16 résultants dans le tableau de caractères spécifié en commençant à la position indiquée. |
| [ReadLine](./readline/)() override | Lit les caractères du flux jusqu'à la fin de la ligne actuelle. |
| [ReadToEnd](./readtoend/)() override | Lit les caractères du flux jusqu'à la fin du flux. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 1024 octets. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 1024 octets. Un paramètre indique si la détection du marqueur d'ordre des octets doit être activée. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de taille par défaut de 1024 octets. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de taille par défaut de 1024 octets. Un paramètre indique si la détection du marqueur d'ordre des octets doit être activée. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de la taille spécifiée. Un paramètre indique si la détection du marqueur d'ordre des octets doit être activée. |
| [StreamReader](./streamreader/)(const System::String\&) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du fichier spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 4096 octets. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du fichier spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 4096 octets. Un paramètre indique si la détection du marqueur d'ordre des octets doit être activée. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du fichier spécifié en utilisant l'encodage spécifié et un tampon de taille par défaut de 4096 octets. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de taille par défaut de 4096 octets. Un paramètre indique si la détection du marqueur d'ordre des octets doit être activée. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | Construit une instance de l'objet [StreamReader](./) qui lit les caractères du fichier spécifié en utilisant l'encodage spécifié et un tampon de la taille spécifiée. Un paramètre indique si la détection du marqueur d'ordre des octets doit être activée. |
| [~StreamReader](./~streamreader/)() | Destructeur. |
## Voir aussi

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
