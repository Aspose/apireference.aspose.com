---
title: "System::IO::BinaryWriter classe"
linktitle: "BinaryWriter"
second_title: "Aspose.Page pour C++"
description: "System::IO::BinaryWriter classe. Représente un écrivain qui écrit des valeurs de types primitifs dans un flux d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 900
url: /fr/cpp/system.io/binarywriter/
---
## BinaryWriter class


Représente un écrivain qui écrit des valeurs de types primitifs dans un flux d'octets. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Définit la position du flux représenté par l'objet actuel. |
| virtual [Write](./write/)(uint8_t) | Écrit la valeur entière non signée de 8 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux de sortie. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Écrit la sous-plage spécifiée de caractères UTF-16 du tableau de caractères spécifié dans le flux de sortie. |
| virtual [Write](./write/)(bool) | Écrit un octet unique avec une valeur de 0 si **value** est 'true' et 1 si **value** est 'false' dans le flux de sortie. |
| virtual [Write](./write/)(char16_t) | Écrit la valeur de caractère large de 16 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(int16_t) | Écrit la valeur entière de 16 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(int) | Écrit la valeur entière de 32 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(int64_t) | Écrit la valeur entière de 64 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(uint16_t) | Écrit la valeur entière non signée de 16 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(uint32_t) | Écrit la valeur entière non signée de 32 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(uint64_t) | Écrit la valeur entière non signée de 64 bits spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(float) | Écrit la valeur en virgule flottante simple précision spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(double) | Écrit la valeur en virgule flottante double précision spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(const Decimal\&) | Écrit la représentation en octets de la valeur [Decimal](../../system/decimal/) spécifiée dans le flux de sortie. |
| virtual [Write](./write/)(const String\&) | Écrit une chaîne préfixée par sa longueur dans l'encodage actuel dans le flux de sortie. |
| virtual [Write](./write/)(const char_t *) | Écrit une chaîne préfixée par sa longueur dans l'encodage actuel dans le flux de sortie. |
| [~BinaryWriter](./~binarywriter/)() | Destructeur. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
