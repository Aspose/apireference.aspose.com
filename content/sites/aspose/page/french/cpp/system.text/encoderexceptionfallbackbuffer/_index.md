---
title: "Classe System::Text::EncoderExceptionFallbackBuffer"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Page pour C++"
description: "Classe System::Text::EncoderExceptionFallbackBuffer. Tampon pour la stratégie de secours d'encodage qui lève une exception. Ne stocke rien en fait, mais lève une exception à la place. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | Constructeur. |
| [Fallback](./fallback/)(char_t, int) override | Gère les échecs d'encodage. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Gère les échecs d'encodage. |
| [get_Remaining](./get_remaining/)() const override | Obtient le nombre de caractères restants. |
| [GetNextChar](./getnextchar/)() override | Obtient le caractère suivant disponible. |
| [MovePrevious](./moveprevious/)() override | Se déplace au caractère précédent. |
## Voir aussi

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
