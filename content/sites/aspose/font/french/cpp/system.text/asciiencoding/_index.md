---
title: "Classe System::Text::ASCIIEncoding"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::ASCIIEncoding. Représente l’encodage ASCII. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


Représente l’encodage ASCII. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | Constructeur. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Obtient le nombre maximal d’octets possible pour contenir une chaîne d’un nombre de caractères connu. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Obtient le nombre maximal de caractères nécessaires pour décoder un nombre spécifié d'octets. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valeur par défaut de la page de codes. |
## Voir aussi

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
