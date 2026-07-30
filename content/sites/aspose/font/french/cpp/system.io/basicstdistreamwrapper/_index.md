---
title: "Classe System::IO::BasicSTDIStreamWrapper"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::BasicSTDIStreamWrapper. Représente un wrapper de type System.IO.Stream pour std::basic_istream et ses objets dérivés. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


Représente un wrapper de type [System.IO.Stream](../stream/)-like pour std::basic_istream et ses objets dérivés. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Construit une nouvelle instance de [BasicSTDIStreamWrapper](./). |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | Constructeur de copie. Supprimé. |
| [Flush](./flush/)() override | Vide les tampons de ce flux et écrit toutes les données tamponnées dans le stockage sous-jacent. Non pris en charge ! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | Opérateur d'affectation par copie. Supprimé. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Si le mode d'encapsulation est binaire, lit le nombre d'octets spécifié depuis le flux, sinon lit le nombre de caractères spécifié et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [ReadByte](./readbyte/)() override | Si le mode d'encapsulation est binaire, lit un octet unique depuis le stockage du dernier caractère décodé, sinon lit un caractère unique depuis le flux et le convertit en type uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Définit la longueur du flux représenté par l’objet actuel. Non pris en charge ! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Si le mode d’encapsulation est binaire, écrit dans le flux la sous-plage spécifiée d’octets du tableau d’octets indiqué, sinon convertit la sous-plage spécifiée d’octets du tableau indiqué en type [char_type](./char_type/) puis écrit le résultat dans le flux. Non pris en charge ! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [WriteByte](./writebyte/)(uint8_t) override | Si le mode d’encapsulation est binaire, écrit dans le flux la valeur entière non signée de 8 bits spécifiée, sinon la convertit en type [char_type](./char_type/) puis écrit le résultat dans le flux. Non pris en charge ! |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../stream/null/) | Un flux sans stockage sous-jacent. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Informations RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Voir aussi

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
