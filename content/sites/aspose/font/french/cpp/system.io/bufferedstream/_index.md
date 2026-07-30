---
title: "System::IO::BufferedStream classe"
linktitle: "BufferedStream"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::BufferedStream. Ajoute une couche de mise en mémoire tampon au-dessus d'un autre flux. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.io/bufferedstream/
---
## BufferedStream class


Ajoute une couche de mise en mémoire tampon au-dessus d'un autre flux. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class BufferedStream : public System::IO::Stream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | Construit un objet [BufferedStream](./) qui encapsule le flux spécifié et utilise un tampon de 4096 octets. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | Construit un objet [BufferedStream](./) qui encapsule le flux spécifié et utilise un tampon de la taille spécifiée. |
| [Flush](./flush/)() override | Écrit le contenu du tampon dans le flux sous-jacent. |
| [get_CanRead](./get_canread/)() const override | Détermine si le flux est lisible. |
| [get_CanSeek](./get_canseek/)() const override | Détermine si le flux prend en charge le repositionnement. |
| [get_CanWrite](./get_canwrite/)() const override | Détermine si le flux est accessible en écriture. |
| [get_Length](./get_length/)() const override | Renvoie la longueur du flux. |
| [get_Position](./get_position/)() const override | Renvoie la position actuelle du flux. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux sous-jacent et les écrit dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux sous-jacent et les écrit dans le tableau d'octets spécifié. |
| [ReadByte](./readbyte/)() override | Lit un octet unique du flux sous-jacent et renvoie une valeur entière 32 bits équivalente à la valeur de l'octet lu. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Définit la position du flux représentée par l'objet actuel. |
| [set_Position](./set_position/)(int64_t) override | Vide le tampon dans le flux sous-jacent puis définit la position du flux. |
| [SetLength](./setlength/)(int64_t) override | Définit la longueur du flux représentée par l'objet actuel. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux sous-jacent. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux sous-jacent. |
| [WriteByte](./writebyte/)(uint8_t) override | Écrit la valeur entière non signée de 8 bits spécifiée dans le flux sous-jacent. |
| virtual [~BufferedStream](./~bufferedstream/)() | Destructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../stream/null/) | Un flux sans stockage sous-jacent. |
## Voir aussi

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
