---
title: "Classe System::IO::Stream"
linktitle: "Flux"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::Stream. Une classe de base pour une variété d'implémentations de flux. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.io/stream/
---
## Stream class


Une classe de base pour une variété d'implémentations de flux. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Stream : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Initie une opération de lecture asynchrone. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Initie une opération d'écriture asynchrone. |
| virtual [Close](./close/)() | Ferme le flux. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | Copie des octets vers le flux spécifié. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | Copie des octets vers le flux spécifié, en utilisant la taille de tampon spécifiée. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'objet actuel et ferme le flux. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | Attends jusqu'à ce que l'opération de lecture asynchrone spécifiée soit terminée. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | Termine une opération d'écriture asynchrone. Attend jusqu'à ce que l'opération d'écriture asynchrone spécifiée soit terminée. |
| virtual [Flush](./flush/)() | Efface les tampons de ce flux et écrit toutes les données tamponnées dans le stockage sous-jacent. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | Efface de manière asynchrone tous les tampons de ce flux, force l'écriture de toutes les données tamponnées vers le dispositif sous-jacent et surveille les demandes d'annulation. |
| [FlushAsync](./flushasync/)() | Efface de manière asynchrone tous les tampons de ce flux, force l'écriture de toutes les données tamponnées vers le dispositif sous-jacent et surveille les demandes d'annulation. |
| virtual [get_CanRead](./get_canread/)() const | Détermine si le flux est lisible. |
| virtual [get_CanSeek](./get_canseek/)() const | Détermine si le flux prend en charge le repositionnement. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | Obtient une valeur qui détermine si le flux actuel peut expirer. |
| virtual [get_CanWrite](./get_canwrite/)() const | Détermine si le flux est accessible en écriture. |
| virtual [get_Length](./get_length/)() const | Renvoie la longueur du flux en octets. |
| virtual [get_Position](./get_position/)() const | Renvoie la position actuelle du flux. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | Obtient une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera de lire avant d'expirer. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | Obtient une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera d'écrire avant d'expirer. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Lit de manière asynchrone une séquence d'octets depuis le flux actuel, avance la position dans le flux du nombre d'octets lus et surveille les demandes d'annulation. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Lit de manière asynchrone une séquence d'octets depuis le flux actuel, avance la position dans le flux du nombre d'octets lus et surveille les demandes d'annulation. |
| virtual [ReadByte](./readbyte/)() | Lit un octet unique du flux et renvoie une valeur entière de 32 bits équivalente à la valeur de l'octet lu. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | Définit la position du flux représentée par l'objet actuel. |
| virtual [set_Position](./set_position/)(int64_t) | Définit la position du flux. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | Définit une valeur qui détermine si le flux actuel peut expirer. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | Définit une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera de lire avant d'expirer. |
| virtual [SetLength](./setlength/)(int64_t) | Définit la longueur du flux représentée par l'objet actuel. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Écrit de manière asynchrone une séquence d'octets dans le flux actuel, avance la position actuelle dans ce flux du nombre d'octets écrits et surveille les demandes d'annulation. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Écrit de manière asynchrone une séquence d'octets dans le flux actuel, avance la position actuelle dans ce flux du nombre d'octets écrits et surveille les demandes d'annulation. |
| virtual [WriteByte](./writebyte/)(uint8_t) | Écrit la valeur entière non signée de 8 bits spécifiée dans le flux. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](./null/) | Un flux sans stockage sous-jacent. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers cette classe. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
