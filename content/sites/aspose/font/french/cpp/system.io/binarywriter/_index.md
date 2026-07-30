---
title: "Classe System::IO::BinaryWriter"
linktitle: "BinaryWriter"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::BinaryWriter. Représente un écrivain qui écrit des valeurs de types primitifs dans un flux d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours encapsuler cette classe dans un pointeur System::SmartPtr et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.io/binarywriter/
---
## BinaryWriter class


Représente un écrivain qui écrit des valeurs de types primitifs dans un flux d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours encapsuler cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class BinaryWriter : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | Construit une instance de la classe [BinaryWriter](./) qui écrit des données dans le flux spécifié en utilisant le codage spécifié. |
| [Close](./close/)() | Ferme l'objet [BinaryWriter](./) actuel ainsi que le flux de sortie sous-jacent. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'objet actuel et ferme le flux sous-jacent. |
| [Flush](./flush/)() | Vide le flux de sortie. |
| [get_BaseStream](./get_basestream/)() | Renvoie le flux de sortie. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Définit la position du flux représentée par l'objet actuel. |
| virtual [Write](./write/)(uint8_t) | Écrit la valeur entière non signée de 8 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux de sortie. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Écrit la sous-plage spécifiée de caractères UTF-16 du tableau de caractères spécifié dans le flux de sortie. |
| virtual [Write](./write/)(bool) | Écrit un octet avec la valeur 0 si **value** est 'true' et 1 si **value** est 'false' dans le flux de sortie. |
| virtual [Write](./write/)(char16_t) | Écrit la valeur de caractère large de 16 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(int16_t) | Écrit la valeur entière de 16 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(int) | Écrit la valeur entière de 32 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(int64_t) | Écrit la valeur entière de 64 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(uint16_t) | Écrit la valeur entière non signée de 16 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(uint32_t) | Écrit la valeur entière non signée de 32 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(uint64_t) | Écrit la valeur entière non signée de 64 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(float) | Écrit la valeur à virgule flottante simple précision spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(double) | Écrit la valeur à virgule flottante double précision spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(const Decimal\&) | Écrit la représentation octet de la valeur [Decimal](../../system/decimal/) spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(const String\&) | Écrit une chaîne préfixée par sa longueur dans le codage actuel dans le flux de sortie. |
| virtual [Write](./write/)(const char_t *) | Écrit une chaîne préfixée par sa longueur dans le codage actuel dans le flux de sortie. |
| [~BinaryWriter](./~binarywriter/)() | Destructeur. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
