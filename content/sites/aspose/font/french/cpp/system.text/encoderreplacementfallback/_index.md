---
title: "classe System::Text::EncoderReplacementFallback"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::EncoderReplacementFallback. Fournit une stratégie de repli consistant à remplacer le symbole erroné par un substitut. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1400
url: /fr/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Fournit une stratégie de repli consistant à remplacer le symbole erroné par un substitut. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Crée un tampon de repli. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | Constructeur qui utilise la chaîne de remplacement par défaut "?". |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | Constructeur. |
| [get_DefaultString](./get_defaultstring/)() const | Obtient la chaîne de remplacement. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Obtient le nombre maximal de caractères que l'instance peut retourner. |
## Voir aussi

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
