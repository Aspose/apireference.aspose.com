---
title: "System::Net::Http::ByteArrayContent classe"
linktitle: "ByteArrayContent"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::ByteArrayContent classe. Représente le contenu HTTP sous forme de tableau d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


Représente le contenu HTTP sous forme de tableau d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | Informations RTTI. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Construit une nouvelle instance. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | Essaie de calculer la longueur du tableau d'octets. |
## Champs

| Champ | Description |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | L'encodage par défaut. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Le nombre maximal d'octets. |
## Voir aussi

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
