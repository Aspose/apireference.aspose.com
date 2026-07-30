---
title: "Classe System::Collections::IEnumeratorImplRefType"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::IEnumeratorImplRefType. Wrapper qui crée une implémentation non générique de IEnumerator sur l'itérateur générique IEnumeratorImplRefType - wrapper pour les types de référence en C++."
type: docs
weight: 700
url: /fr/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


Wrapper qui crée une implémentation non générique de [IEnumerator](../ienumerator/) sur l'itérateur générique [IEnumeratorImplRefType](./) - wrapper pour les types de référence.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Current](./get_current/)() const override | Obtient l'élément actuel. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | constructeur du wrapper |
| [MoveNext](./movenext/)() override | Déplace l'énumérateur vers l'élément suivant. Si aucun élément n'a été référencé auparavant, définit la référence sur le premier élément disponible. Si la fin du conteneur est atteinte, ne fait rien. |

## Voir aussi

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
