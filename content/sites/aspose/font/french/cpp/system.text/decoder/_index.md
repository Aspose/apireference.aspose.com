---
title: "classe System::Text::Decoder"
linktitle: "Decoder"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::Decoder. Encapsule le décodage d'une séquence d'octets en une séquence de caractères. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.text/decoder/
---
## Decoder class


Encapsule le décodage d'une séquence d'octets en une séquence de caractères. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Decoder : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Convertit les octets en caractères. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Convertit les octets en caractères. |
| [get_Fallback](./get_fallback/)() const | Obtient le repli de gestion des erreurs. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Obtient le tampon de repli. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Obtient le nombre de caractères nécessaires pour décoder un tampon. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Obtient le nombre de caractères nécessaires pour décoder un tampon. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Obtient le nombre de caractères nécessaires pour décoder un tampon. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Obtenez les caractères résultant du décodage d’un tampon. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Obtenez les caractères résultant du décodage d’un tampon. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Obtenez les caractères résultant du décodage d’un tampon. |
| virtual [Reset](./reset/)() | Nettoie l'état interne du décodeur. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Définit le repli de gestion des erreurs. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
