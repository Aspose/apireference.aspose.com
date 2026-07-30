---
title: "classe System::Text::DecoderExceptionFallback"
linktitle: "DecoderExceptionFallback"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::DecoderExceptionFallback. Fournit une stratégie de repli qui lève une exception. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.text/decoderexceptionfallback/
---
## DecoderExceptionFallback class


Fournit une stratégie de repli qui lève une exception. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class DecoderExceptionFallback : public System::Text::DecoderFallback
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Crée un tampon de repli. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Obtient le nombre maximal de caractères que l'instance peut retourner. |
## Voir aussi

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
