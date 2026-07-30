---
title: "System::Text::DecoderExceptionFallbackBuffer class"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Font pour C++"
description: "System::Text::DecoderExceptionFallbackBuffer class. Tampon pour la stratégie de repli de décodage qui lève des exceptions. Ne stocke en fait rien, mais lève une exception à la place. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 400
url: /fr/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | Constructeur. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Gère les échecs de décodage. |
| [get_Remaining](./get_remaining/)() const override | Obtient le nombre de caractères restants. |
| [GetNextChar](./getnextchar/)() override | Obtient le caractère disponible suivant. |
| [MovePrevious](./moveprevious/)() override | Se déplace au caractère précédent. |
## Voir aussi

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
