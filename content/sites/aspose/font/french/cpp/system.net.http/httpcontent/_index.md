---
title: "System::Net::Http::HttpContent classe"
linktitle: "HttpContent"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::HttpContent classe. Représente le contenu d'une entité HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.net.http/httpcontent/
---
## HttpContent class


Représente le contenu d'une entité HTTP. [Object](../../system/object/) de cette classe ne doit être alloué qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class HttpContent : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Libère l'instance actuelle. Cette méthode libère également le flux renvoyé par 'ReadAsStream' et le tampon mémoire s'il a été créé. |
| [get_Headers](./get_headers/)() | Renvoie les en-têtes de contenu HTTP. |
| [LoadIntoBuffer](./loadintobuffer/)() | Sérialise le contenu dans un tampon mémoire. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | Sérialise le contenu dans un tampon mémoire. |
| [ReadAsByteArray](./readasbytearray/)() | Sérialise le contenu et renvoie un tableau d'octets. |
| [ReadAsStream](./readasstream/)() | Sérialise le contenu et renvoie un flux. |
| [ReadAsString](./readasstring/)() | Sérialise le contenu et renvoie une chaîne. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | Essaie de calculer la taille du contenu. |
## Champs

| Champ | Description |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | L'encodage par défaut. |
| static [MaxBufferSize](./maxbuffersize/) | Le nombre maximal d'octets. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
