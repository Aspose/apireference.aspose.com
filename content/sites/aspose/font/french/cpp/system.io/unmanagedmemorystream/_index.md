---
title: "System::IO::UnmanagedMemoryStream classe"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Font pour C++"
description: "System::IO::UnmanagedMemoryStream classe. Fournit un accès à la mémoire non gérée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2800
url: /fr/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


Fournit un accès à la mémoire non gérée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Flush](./flush/)() override | Ne fait rien. |
| [get_CanRead](./get_canread/)() const override | Détermine si le flux est lisible. |
| [get_CanSeek](./get_canseek/)() const override | Détermine si le flux prend en charge le repositionnement. |
| [get_CanWrite](./get_canwrite/)() const override | Détermine si le flux est accessible en écriture. |
| virtual [get_Capacity](./get_capacity/)() const | Renvoie la capacité actuelle du tampon mémoire sous-jacent. |
| [get_Length](./get_length/)() const override | Renvoie la longueur du flux en octets. |
| [get_Position](./get_position/)() const override | Renvoie la position actuelle du flux. |
| [get_PositionPointer](./get_positionpointer/)() | NON IMPLEMENTÉ. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Définit la position du flux représentée par l'objet actuel. |
| [set_Position](./set_position/)(int64_t) override | Définit la position du flux. |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | NON IMPLEMENTÉ. |
| [SetLength](./setlength/)(int64_t) override | NON IMPLEMENTÉ. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | Construit une nouvelle instance de [UnmanagedMemoryStream](./). |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | Construit une nouvelle instance de [UnmanagedMemoryStream](./). |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | NON IMPLEMENTÉ. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | NON IMPLEMENTÉ. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../stream/null/) | Un flux sans stockage sous-jacent. |
## Voir aussi

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
