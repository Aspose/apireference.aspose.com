---
title: "System::Collections::IEnumeratorImplValueType classe"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Font pour C++"
description: "System::Collections::IEnumeratorImplValueType classe. Wrapper qui crée une implémentation non générique de IEnumerator sur l'itérateur générique IEnumeratorImplRefType - wrapper pour les types valeur en C++."
type: docs
weight: 800
url: /fr/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Wrapper qui crée une implémentation non générique de [IEnumerator](../ienumerator/) sur l'itérateur générique [IEnumeratorImplRefType](../ienumeratorimplreftype/) - wrapper pour les types valeur.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Current](./get_current/)() const override | Obtient l'élément actuel. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | constructeur du wrapper |
| [MoveNext](./movenext/)() override | Déplace l'énumérateur vers l'élément suivant. Si aucun élément n'a été référencé auparavant, définit la référence sur le premier élément disponible. Si la fin du conteneur est atteinte, ne fait rien. |

## Voir aussi

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
