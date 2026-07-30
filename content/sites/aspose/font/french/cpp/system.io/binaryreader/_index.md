---
title: "System::IO::BinaryReader class"
linktitle: "BinaryReader"
second_title: "Aspose.Font pour C++"
description: "System::IO::BinaryReader class. Représente un lecteur qui lit les types de données primitives en tant que données binaires dans un encodage particulier. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.io/binaryreader/
---
## BinaryReader class


Représente un lecteur qui lit les types de données primitives en tant que données binaires dans un encodage particulier. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class BinaryReader : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | Construit une instance de la classe [BinaryReader](./) qui lit les données du flux spécifié en utilisant l'encodage UTF-8. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Construit une instance de la classe [BinaryReader](./) qui lit les données du flux spécifié en utilisant l'encodage spécifié. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | Construit une instance de la classe [BinaryReader](./) qui lit les données du flux spécifié en utilisant l'encodage spécifié. |
| virtual [Close](./close/)() | Ferme l'objet [BinaryReader](./) actuel ainsi que le flux d'entrée sous-jacent. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'objet actuel et ferme le flux sous-jacent. |
| virtual [get_BaseStream](./get_basestream/)() | Renvoie le flux d'entrée. |
| virtual [PeekChar](./peekchar/)() | Lit un seul caractère du flux d'entrée sans modifier le curseur de lecture du flux. |
| virtual [Read](./read/)() | Lit un seul caractère du flux d'entrée. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | Lit le nombre spécifié d'octets du flux d'entrée et les écrit dans le tableau d'octets spécifié. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Lit le nombre spécifié de caractères du flux d'entrée, les convertit en encodage UTF-16 et écrit les caractères UTF-16 résultants dans le tableau de caractères spécifié à partir de la position spécifiée. |
| virtual [ReadBoolean](./readboolean/)() | Lit un seul octet du flux d'entrée et renvoie sa représentation booléenne. |
| virtual [ReadByte](./readbyte/)() | Lit un seul octet du flux d'entrée. |
| virtual [ReadBytes](./readbytes/)(int) | Lit le nombre spécifié d'octets du flux d'entrée. |
| virtual [ReadChar](./readchar/)() | Lit un seul caractère du flux d'entrée. |
| virtual [ReadChars](./readchars/)(int) | Lit le nombre spécifié de caractères du flux d'entrée et les renvoie en encodage UTF-16. |
| virtual [ReadDecimal](./readdecimal/)() | NON IMPLEMENTÉ. |
| virtual [ReadDouble](./readdouble/)() | Lit 8 octets du flux d'entrée et les renvoie sous forme de valeur à virgule flottante double précision. |
| virtual [ReadInt16](./readint16/)() | Lit 2 octets du flux d'entrée et les renvoie sous forme de valeur entière 16 bits. |
| virtual [ReadInt32](./readint32/)() | Lit 4 octets du flux d'entrée et les renvoie sous forme de valeur entière 32 bits. |
| virtual [ReadInt64](./readint64/)() | Lit 8 octets du flux d'entrée et les renvoie sous forme de valeur entière 64 bits. |
| virtual [ReadSByte](./readsbyte/)() | Lit un seul octet du flux d'entrée et le renvoie sous forme de valeur entière signée sur 8 bits. |
| virtual [ReadSingle](./readsingle/)() | Lit 4 octets du flux d'entrée et les renvoie sous forme de valeur à virgule flottante simple précision. |
| virtual [ReadString](./readstring/)() | Lit une chaîne du flux actuel. La chaîne est préfixée par la longueur, encodée sous forme d'entier sur sept bits à la fois. |
| virtual [ReadUInt16](./readuint16/)() | Lit 2 octets du flux d'entrée et les renvoie sous forme de valeur entière non signée 16 bits. |
| virtual [ReadUInt32](./readuint32/)() | Lit 4 octets du flux d'entrée et les renvoie sous forme de valeur entière non signée 32 bits. |
| virtual [ReadUInt64](./readuint64/)() | Lit 8 octets du flux d'entrée et les renvoie sous forme de valeur entière non signée 64 bits. |
| virtual [~BinaryReader](./~binaryreader/)() | Destructeur. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
