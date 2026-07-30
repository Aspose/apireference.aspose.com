---
title: "Classe System::Text::EncodingDecoder"
linktitle: "EncodingDecoder"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::EncodingDecoder. Décodeur qui utilise un objet d’encodage pour le décodage. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 1700
url: /fr/cpp/system.text/encodingdecoder/
---
## EncodingDecoder class


[Decoder](../decoder/) that uses encoding object for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingDecoder : public System::Text::Decoder
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) override | Convertit les octets en caractères. |
| [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) override | Convertit les octets en caractères. |
## Voir aussi

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
