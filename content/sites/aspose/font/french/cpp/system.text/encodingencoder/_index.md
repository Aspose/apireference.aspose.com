---
title: "classe System::Text::EncodingEncoder"
linktitle: "EncodingEncoder"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::EncodingEncoder. Encodeur qui utilise un objet d'encodage pour l'encodage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1800
url: /fr/cpp/system.text/encodingencoder/
---
## EncodingEncoder class


[Encoder](../encoder/) that uses encoding object for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingEncoder : public System::Text::Encoder
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Convertit les caractères en octets. |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Convertit les caractères en octets. |
## Voir aussi

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
