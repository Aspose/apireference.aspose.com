---
title: "System::SmartPtrInfo classe"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page pour C++"
description: "System::SmartPtrInfo classe. Classe de service pour tester et modifier le contenu de SmartPtr''s sans connaître le type final. Utilisée pour la collecte des déchets et la détection des références en boucle, etc. Considérez‑la comme un ''pointeur vers pointeur''. Nous ne pouvons pas utiliser le type de base de SmartPtr''s car il n'en a aucun ; à la place, nous utilisons cette classe ''info'' en C++."
type: docs
weight: 5600
url: /fr/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Classe de service pour tester et modifier le contenu de [SmartPtr](../smartptr/)'s sans connaître le type final. Utilisée pour la collecte des déchets et la détection des références en boucle, etc. Considérez‑la comme un 'pointeur vers pointeur'. Nous ne pouvons pas utiliser le type de base de [SmartPtr](../smartptr/)'s car il n'en a aucun ; à la place, nous utilisons cette classe 'info'.

```cpp
class SmartPtrInfo
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Obtient l'objet brut pointé par le pointeur référencé. |
| [getObject](./getobject/)() const | Obtient l'objet pointé par le pointeur référencé. |
| [getOwned](./getowned/)() const | Obtient le pointeur propriétaire de l'objet. |
| [operator bool](./operatorbool/)() const | Vérifie si l'objet info pointe vers un pointeur non nul. |
| [operator!](./operator!/)() const | Vérifie si l'objet info ne pointe pas vers un pointeur non nul. |
| [operator->](./operator-_/)() const | Permet d'appeler les méthodes de [Object](../object/) pointées par le pointeur référencé. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Less compare les valeurs des pointeurs référencés par deux objets d'information. |
| [SmartPtrInfo](./smartptrinfo/)() | Crée un objet [SmartPtrInfo](./) vide. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Crée un objet [SmartPtrInfo](./) avec des informations sur un pointeur intelligent spécifique. |
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
