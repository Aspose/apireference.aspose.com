---
title: "System::IO::MemoryStream classe"
linktitle: "MemoryStream"
second_title: "Aspose.Font pour C++"
description: "System::IO::MemoryStream class. Représente un flux qui lit et écrit en mémoire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1800
url: /fr/cpp/system.io/memorystream/
---
## MemoryStream class


Représente un flux qui lit et écrit en mémoire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class MemoryStream : public System::IO::Stream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme le flux. |
| [Flush](./flush/)() override | Ne fait rien. |
| [get_CanRead](./get_canread/)() const override | Détermine si le flux est lisible. |
| [get_CanSeek](./get_canseek/)() const override | Détermine si le flux prend en charge le repositionnement. |
| [get_CanWrite](./get_canwrite/)() const override | Détermine si le flux est accessible en écriture. |
| [get_Capacity](./get_capacity/)() | Renvoie la capacité actuelle du tampon mémoire sous-jacent. |
| [get_Length](./get_length/)() const override | Renvoie la longueur du flux en octets. |
| [get_Position](./get_position/)() const override | Renvoie la position actuelle du flux. |
| virtual [GetBuffer](./getbuffer/)() | Renvoie un pointeur vers le tampon sous-jacent. |
| [MemoryStream](./memorystream/)() | Construit une nouvelle instance de la classe [MemoryStream](./) avec une capacité initiale égale à 0. |
| [MemoryStream](./memorystream/)(int) | Construit une nouvelle instance de la classe [MemoryStream](./) qui représente un flux basé sur un tampon mémoire de la taille spécifiée. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Construit une nouvelle instance de la classe [MemoryStream](./) qui représente un flux mémoire connecté au tampon mémoire spécifié. Un paramètre indique si le flux est accessible en écriture. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Construit une nouvelle instance de la classe [MemoryStream](./) qui représente un flux mémoire connecté à un segment du tampon mémoire spécifié, commençant à l'index indiqué et incluant le nombre d'éléments spécifié. Les paramètres indiquent si le flux est accessible en écriture et si la méthode GetBytes() peut être appelée. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [ReadByte](./readbyte/)() override | Lit un octet unique du flux et renvoie une valeur entière de 32 bits équivalente à la valeur de l'octet lu. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Définit la position du flux représentée par l'objet actuel. |
| [set_Capacity](./set_capacity/)(int) | Définit la capacité du tampon mémoire sous-jacent. |
| [set_Position](./set_position/)(int64_t) override | Définit la position du flux. |
| [SetLength](./setlength/)(int64_t) override | Définit la longueur du flux représentée par l'objet actuel. |
| virtual [ToArray](./toarray/)() | Renvoie une copie du tampon mémoire sous-jacent sous forme de tableau d'octets. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Renvoie le tableau d'octets non signés à partir duquel ce flux a été créé. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [WriteByte](./writebyte/)(uint8_t) override | Écrit la valeur entière non signée de 8 bits spécifiée dans le flux. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Écrit le contenu du tampon sous-jacent dans le flux spécifié. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../stream/null/) | Un flux sans stockage sous-jacent. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers lui-même. |
## Voir aussi

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
