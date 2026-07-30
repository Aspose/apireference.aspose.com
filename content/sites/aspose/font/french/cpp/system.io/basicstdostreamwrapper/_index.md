---
title: "Classe System::IO::BasicSTDOStreamWrapper"
linktitle: "BasicSTDOStreamWrapper"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::BasicSTDOStreamWrapper. Représente un wrapper de type System.IO.Stream-like pour std::basic_ostream et ses objets dérivés. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.io/basicstdostreamwrapper/
---
## BasicSTDOStreamWrapper class


Représente un wrapper de type [System.IO.Stream](../stream/)-like pour std::basic_ostream et ses objets dérivés. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
template<typename T,typename>class BasicSTDOStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Construit une nouvelle instance de [BasicSTDOStreamWrapper](./). |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(const BasicSTDOStreamWrapper\&) | Constructeur de copie. Supprimé. |
| [Flush](./flush/)() override | Efface les tampons de ce flux et écrit toutes les données tamponnées dans le stockage sous-jacent. |
| [operator=](./operator=/)(const BasicSTDOStreamWrapper\&) | Opérateur d'affectation par copie. Supprimé. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Si le mode d'encapsulation est binaire, lit le nombre spécifié d'octets du flux, sinon lit le nombre spécifié de caractères et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié. Non pris en charge ! |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [ReadByte](./readbyte/)() override | Si le mode d'encapsulation est binaire, lit un octet unique du stockage du dernier caractère décodé, sinon lit un caractère unique du flux et le convertit en type uint8_t. Non pris en charge ! |
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
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Informations RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Voir aussi

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
