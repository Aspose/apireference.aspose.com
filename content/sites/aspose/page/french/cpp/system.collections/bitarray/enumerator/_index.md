---
title: "System::Collections::BitArray::Enumerator classe"
linktitle: "Énumérateur"
second_title: "Aspose.Page pour C++"
description: "System::Collections::BitArray::Enumerator classe. Type d'énumérateur pour l'itération en C++."
type: docs
weight: 2900
url: /fr/cpp/system.collections/bitarray/enumerator/
---
## Enumerator class


[Enumerator](./) type for iteration purposes.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<bool>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<BitArray\>\&) | Crée un itérateur. |
| [get_Current](./get_current/)() const override | Obtient le bit adressé sous forme booléenne. |
| [MoveNext](./movenext/)() override | Passe au bit suivant. |
| [Reset](./reset/)() override | Réinitialise l'énumérateur à la position avant le premier élément. |
## Voir aussi

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [BitArray](../)
* Namespace [System::Collections](../../)
* Library [Aspose.Page for C++](../../../)
