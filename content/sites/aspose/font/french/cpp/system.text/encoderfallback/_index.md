---
title: "classe System::Text::EncoderFallback"
linktitle: "EncoderFallback"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::EncoderFallback. Fournit une API de secours pour gérer les erreurs d'encodage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.text/encoderfallback/
---
## EncoderFallback class


Fournit une API de secours pour gérer les erreurs d'encodage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class EncoderFallback : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Obtient le tampon associé à l'algorithme de repli. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Obtient l'implémentation de repli d'exception par défaut. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Obtient le nombre maximal de caractères pouvant être renvoyés par le repli. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Obtient l'implémentation de repli de remplacement par défaut. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Obtient l'implémentation de repli standard sûre par défaut. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
