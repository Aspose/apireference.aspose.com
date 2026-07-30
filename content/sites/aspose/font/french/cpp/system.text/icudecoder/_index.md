---
title: "Classe System::Text::ICUDecoder"
linktitle: "ICUDecoder"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::ICUDecoder. Décodeur qui utilise ICU pour le décodage. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Convertit les octets en caractères. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Convertit les octets en caractères. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Obtient le nombre de caractères nécessaires pour décoder un tampon. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Obtient le nombre de caractères nécessaires pour décoder un tampon. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Obtient le nombre de caractères nécessaires pour décoder un tampon. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Obtenez les caractères résultant du décodage d’un tampon. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Obtenez les caractères résultant du décodage d’un tampon. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Obtenez les caractères résultant du décodage d’un tampon. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | Constructeur. |
| virtual [Reset](./reset/)() | Réinitialise les variables internes à leur état initial. |
| virtual [~ICUDecoder](./~icudecoder/)() | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Base](./base/) | Type [Base](./base/). |
## Voir aussi

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
