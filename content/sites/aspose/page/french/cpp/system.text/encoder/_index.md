---
title: "Classe System::Text::Encoder"
linktitle: "Encoder"
second_title: "Aspose.Page pour C++"
description: "Classe System::Text::Encoder. Encapsule la séquence de caractères à encoder en une séquence d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.text/encoder/
---
## Encoder class


Encapsule la séquence de caractères à encoder en une séquence d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Encoder : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Convertit les caractères en octets. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Convertit les caractères en octets. |
| [get_Fallback](./get_fallback/)() const | Obtient le fallback de gestion des erreurs. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Obtient le tampon de fallback. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Obtient le nombre d'octets nécessaires pour encoder un tampon. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Obtient le nombre d'octets nécessaires pour encoder un tampon. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Obtient les octets résultant de l'encodage d'un tampon. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Obtient les octets résultant de l'encodage d'un tampon. |
| virtual [Reset](./reset/)() | Nettoie l'état interne de l'encodeur. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Définit le fallback de gestion des erreurs. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
