---
title: "Classe System::Net::Http::StringContent"
linktitle: "StringContent"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::StringContent. Représente le contenu HTTP sous forme de chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.net.http/stringcontent/
---
## StringContent class


Représente le contenu HTTP sous forme de chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [StringContent](./stringcontent/)(String) | Informations RTTI. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | Construit une nouvelle instance. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | Construit une nouvelle instance. |
## Champs

| Champ | Description |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | L'encodage par défaut. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Le nombre maximal d'octets. |
## Voir aussi

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
