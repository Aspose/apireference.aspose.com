---
title: "System::Text::Encoder class"
linktitle: "Encoder"
second_title: "Aspose.Font pour C++"
description: "System::Text::Encoder class. Encapsule la séquence de caractères d'encodage en séquence d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 900
url: /fr/cpp/system.text/encoder/
---
## Encoder class


Encapsule la séquence de caractères d'encodage en séquence d'octets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Encoder : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Convertit les caractères en octets. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Convertit les caractères en octets. |
| [get_Fallback](./get_fallback/)() const | Obtient le repli de gestion des erreurs. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Obtient le tampon de repli. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Obtient le nombre d'octets nécessaires pour encoder un tampon. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Obtient le nombre d'octets nécessaires pour encoder un tampon. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Obtenez les octets résultant de l'encodage d'un tampon. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Obtenez les octets résultant de l'encodage d'un tampon. |
| virtual [Reset](./reset/)() | Nettoie l'état interne de l'encodeur. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Définit le repli de gestion des erreurs. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
