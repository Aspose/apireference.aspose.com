---
title: "System::IO::STDIOStreamWrapperBase class"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Font pour C++"
description: "System::IO::STDIOStreamWrapperBase class. Représente une classe de base pour les wrappers de type System.IO.Stream. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


Représente une classe de base pour les wrappers de type [System.IO.Stream](../stream/). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | Détermine si le flux prend en charge la lecture. |
| [get_CanSeek](./get_canseek/)() const override | Détermine si le flux prend en charge le repositionnement. |
| [get_CanWrite](./get_canwrite/)() const override | Détermine si le flux prend en charge l'écriture. |
| [get_Length](./get_length/)() const override | Renvoie la longueur du flux. |
| [get_Position](./get_position/)() const override | Renvoie la position actuelle du flux. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | Opérateur d'affectation par copie. Supprimé. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Définit la position du flux représentée par l'objet actuel. |
| [set_Position](./set_position/)(int64_t) override | Définit la position du flux. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | Constructeur de copie. Supprimé. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../stream/null/) | Un flux sans stockage sous-jacent. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Informations RTTI. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Voir aussi

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
