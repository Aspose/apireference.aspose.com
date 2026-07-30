---
title: "classe System::Security::Cryptography::CryptoStream"
linktitle: "CryptoStream"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::CryptoStream. Implémentation de flux qui enveloppe un flux existant avec une fonction cryptographique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Implémentation de flux qui enveloppe un flux existant avec une fonction cryptographique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class CryptoStream : public System::IO::Stream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme la connexion. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Constructeur. |
| [Flush](./flush/)() override | Vide le tampon dans le flux enveloppé. Ne fait rien car l'algorithme de transformation peut encore attendre plus de données. |
| [FlushFinalBlock](./flushfinalblock/)() | Écrit les données qui sont encore dans le tampon vers le flux. |
| [get_CanRead](./get_canread/)() const override | Vérifie si le flux est lisible. |
| [get_CanSeek](./get_canseek/)() const override | Vérifie si le flux est positionnable. |
| [get_CanWrite](./get_canwrite/)() const override | Vérifie si le flux est inscriptible. |
| [get_Length](./get_length/)() const override | Obtient la longueur du flux. Non pris en charge. |
| [get_Position](./get_position/)() const override | Obtient la position actuelle dans le flux. Non pris en charge. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lit les données du flux. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit les données du flux. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Positionne le pointeur dans le flux. Non pris en charge. |
| [set_Position](./set_position/)(int64_t) override | Positionne le pointeur dans le flux. Non pris en charge. |
| [SetLength](./setlength/)(int64_t) override | Positionne la taille du flux. Non pris en charge. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Écrit les données dans le flux. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Écrit les données dans le flux. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Un flux sans stockage sous-jacent. |
## Voir aussi

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
