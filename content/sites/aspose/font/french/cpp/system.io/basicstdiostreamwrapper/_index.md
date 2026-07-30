---
title: "Classe System::IO::BasicSTDIOStreamWrapper"
linktitle: "BasicSTDIOStreamWrapper"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::BasicSTDIOStreamWrapper. Représente un wrapper similaire à System.IO.Stream pour std::basic_iostream et ses objets dérivés. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/basicstdiostreamwrapper/
---
## BasicSTDIOStreamWrapper class


Représente un wrapper similaire à [System.IO.Stream](../stream/) pour std::basic_iostream et ses objets dérivés. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename T,typename>class BasicSTDIOStreamWrapper : public System::IO::BasicSTDIStreamWrapper<T>,
                                                             public System::IO::BasicSTDOStreamWrapper<T>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) | Construit une nouvelle instance de [BasicSTDIOStreamWrapper](./). |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(const BasicSTDIOStreamWrapper\&) | Constructeur de copie. Supprimé. |
| [Flush](./flush/)() override | Efface les tampons de ce flux et écrit toutes les données tamponnées dans le stockage sous-jacent. |
| [operator=](./operator=/)(const BasicSTDIOStreamWrapper\&) | Opérateur d'affectation par copie. Supprimé. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Si le mode d'encapsulation est binaire, lit le nombre d'octets spécifié depuis le flux, sinon lit le nombre de caractères spécifié et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [ReadByte](./readbyte/)() override | Si le mode d'encapsulation est binaire, lit un octet unique depuis le stockage du dernier caractère décodé, sinon lit un caractère unique depuis le flux et le convertit en type uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Définit la longueur du flux représentée par l'objet actuel. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Si le mode d'encapsulation est binaire, écrit dans le flux la sous-plage spécifiée d'octets du tableau d'octets spécifié, sinon convertit la sous-plage spécifiée d'octets du tableau d'octets spécifié en type [char_type](./char_type/) puis écrit le résultat dans le flux. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [WriteByte](./writebyte/)(uint8_t) override | Si le mode d'encapsulation est binaire, écrit dans le flux la valeur entière non signée de 8 bits spécifiée, sinon la convertit en type [char_type](./char_type/) puis écrit le résultat dans le flux. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../stream/null/) | Un flux sans stockage sous-jacent. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseIType](./baseitype/) |  |
| [BaseOType](./baseotype/) |  |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Informations RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Voir aussi

* Class [BasicSTDIStreamWrapper](../basicstdistreamwrapper/)
* Class [BasicSTDOStreamWrapper](../basicstdostreamwrapper/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
