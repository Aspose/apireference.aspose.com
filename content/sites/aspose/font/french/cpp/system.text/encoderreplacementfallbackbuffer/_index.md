---
title: "System::Text::EncoderReplacementFallbackBuffer class"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Font pour C++"
description: "System::Text::EncoderReplacementFallbackBuffer class. Tampon pour remplacer la stratégie de repli d'encodage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours encapsuler cette classe dans un pointeur System::SmartPtr et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1500
url: /fr/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | Constructeur. |
| [Fallback](./fallback/)(char_t, int) override | Gère les échecs d'encodage. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Gère les échecs d'encodage. |
| [get_Remaining](./get_remaining/)() const override | Obtient le nombre de caractères restants dans le tampon. |
| [GetNextChar](./getnextchar/)() override | Obtient le caractère disponible suivant. |
| [MovePrevious](./moveprevious/)() override | Se déplace au caractère précédent. |
| [Reset](./reset/)() override | Réinitialise le tampon à son état initial (avant l'appel de [Fallback()](./fallback/)). |
## Voir aussi

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
