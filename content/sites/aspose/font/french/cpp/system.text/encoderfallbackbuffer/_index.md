---
title: "classe System::Text::EncoderFallbackBuffer"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::EncoderFallbackBuffer. Fournit un tampon pour l'implémentation de repli. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1300
url: /fr/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


Fournit un tampon pour l'implémentation de repli. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | Implémente la procédure de repli réelle. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | Implémente la procédure de repli réelle. |
| virtual [get_Remaining](./get_remaining/)() const | Obtient le nombre restant de caractères à traiter. |
| virtual [GetNextChar](./getnextchar/)() | Extrait le caractère suivant dans le tampon de repli. |
| virtual [MovePrevious](./moveprevious/)() | Déplace la position du tampon d'un pas en arrière si possible. |
| virtual [Reset](./reset/)() | Réinitialise le tampon à son état initial. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
