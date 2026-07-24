---
title: "Classe System::Xml::IXmlNamespaceResolver"
linktitle: "IXmlNamespaceResolver"
second_title: "Aspose.Page pour C++"
description: "Classe System::Xml::IXmlNamespaceResolver. Fournit un accès en lecture seule à un ensemble de mappages préfixe et espace de noms en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml/ixmlnamespaceresolver/
---
## IXmlNamespaceResolver class


Fournit un accès en lecture seule à un ensemble de mappages de préfixes et d'espaces de noms.

```cpp
class IXmlNamespaceResolver : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) | Renvoie une collection de mappages préfixe-espace de noms définis qui sont actuellement en portée. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Renvoie l'URI d'espace de noms associé au préfixe spécifié. |
| virtual [LookupPrefix](./lookupprefix/)(const String\&) | Renvoie le préfixe qui est associé à l'URI d'espace de noms spécifié. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
