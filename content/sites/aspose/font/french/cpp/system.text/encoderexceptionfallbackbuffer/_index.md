---
title: "Classe System::Text::EncoderExceptionFallbackBuffer"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Font pour C++"
description: "System::Text::EncoderExceptionFallbackBuffer class. Tampon pour la stratégie de repli d'encodage qui lève des exceptions. Ne stocke en fait rien, mais lève une exception à la place. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
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
| [GetNextChar](./getnextchar/)() override | Obtient le caractère disponible suivant. |
| [MovePrevious](./moveprevious/)() override | Se déplace au caractère précédent. |
## Voir aussi

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
