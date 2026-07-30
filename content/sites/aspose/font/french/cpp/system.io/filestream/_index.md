---
title: "System::IO::FileStream classe"
linktitle: "FileStream"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::FileStream. Représente un flux de fichier prenant en charge les opérations de lecture et d'écriture synchrones et asynchrones. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1500
url: /fr/cpp/system.io/filestream/
---
## FileStream class


Représente un flux de fichier prenant en charge les opérations de lecture et d'écriture synchrones et asynchrones. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class FileStream : public System::IO::Stream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme l'objet [FileStream](./) actuel. |
| [FileStream](./filestream/)(const String\&, FileMode) | Construit une nouvelle instance de la classe [FileStream](./) et l'initialise avec les paramètres spécifiés. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | Construit une nouvelle instance de la classe [FileStream](./) et l'initialise avec les paramètres spécifiés. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | Construit une nouvelle instance de la classe [FileStream](./) et l'initialise avec les paramètres spécifiés. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | Vide les tampons de ce flux et écrit toutes les données tamponnées dans le fichier sous-jacent. |
| [Flush](./flush/)(bool) | Vide les tampons de ce flux et écrit toutes les données tamponnées dans le fichier sous-jacent. Synonyme de la méthode [Flush()](./flush/). |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | Efface de manière asynchrone tous les tampons de ce flux, force l'écriture de toutes les données tamponnées vers le dispositif sous-jacent et surveille les demandes d'annulation. |
| [get_CanRead](./get_canread/)() const override | Détermine si le flux est lisible. |
| [get_CanSeek](./get_canseek/)() const override | Détermine si le flux prend en charge le repositionnement. |
| [get_CanWrite](./get_canwrite/)() const override | Détermine si le flux est accessible en écriture. |
| [get_Length](./get_length/)() const override | Renvoie la longueur du flux en octets. |
| [get_Name](./get_name/)() const | Renvoie le nom du fichier encapsulé par l'objet [FileStream](./) actuel. |
| [get_Position](./get_position/)() const override | Renvoie la position actuelle du flux. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Lit de manière asynchrone une séquence d'octets depuis le flux actuel, avance la position dans le flux du nombre d'octets lus et surveille les demandes d'annulation. |
| [ReadByte](./readbyte/)() override | Lit un octet unique du flux et renvoie une valeur entière de 32 bits équivalente à la valeur de l'octet lu. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Définit la position du flux représentée par l'objet actuel. |
| [set_Position](./set_position/)(int64_t) override | Vide le flux puis définit la position du flux. |
| [SetLength](./setlength/)(int64_t) override | Définit la longueur du flux représentée par l'objet actuel. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Écrit de manière asynchrone une séquence d'octets dans le flux actuel, avance la position actuelle dans ce flux du nombre d'octets écrits et surveille les demandes d'annulation. |
| [WriteByte](./writebyte/)(uint8_t) override | Écrit la valeur entière non signée de 8 bits spécifiée dans le flux. |
| [~FileStream](./~filestream/)() | Destructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | Valeur par défaut du nombre d'octets tamponnés lors des opérations de lecture et d'écriture. |
| static [Null](../stream/null/) | Un flux sans stockage sous-jacent. |
## Voir aussi

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
