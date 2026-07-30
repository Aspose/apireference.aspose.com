---
title: "classe System::Text::ICUEncoder"
linktitle: "ICUEncoder"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::ICUEncoder. Encodeur qui utilise ICU pour le codage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Convertit les caractères en octets. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Convertit les caractères en octets. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Obtient le nombre d'octets nécessaires pour encoder un tampon. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Obtient le nombre d'octets nécessaires pour encoder un tampon. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Obtenez les octets résultant de l'encodage d'un tampon. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Obtenez les octets résultant de l'encodage d'un tampon. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | Constructeur. |
| virtual [Reset](./reset/)() | Réinitialise les variables internes à leur état initial. |
| [~ICUEncoder](./~icuencoder/)() | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Base](./base/) | Type [Base](./base/). |
## Voir aussi

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
