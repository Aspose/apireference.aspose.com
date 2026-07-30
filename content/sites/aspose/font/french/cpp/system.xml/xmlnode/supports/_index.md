---
title: "System::Xml::XmlNode::Supports méthode"
linktitle: "Supports"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNode::Supports méthode. Vérifie si l'implémentation du DOM prend en charge une fonctionnalité spécifique en C++."
type: docs
weight: 4400
url: /fr/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


Teste si l’implémentation DOM implémente une fonctionnalité spécifique.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fonctionnalité | String | Le nom du package de la fonctionnalité à tester. Ce nom n'est pas sensible à la casse. |
| version | String | Le numéro de version du nom du package à tester. Si la version n'est pas spécifiée (null), la prise en charge de n'importe quelle version de la fonctionnalité entraîne le retour de true par la méthode. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Remarques



Le tableau suivant décrit les combinaisons qui renvoient **true**. |||
|-|-|
| Fonctionnalité | Version |
| XML | 1.0 |
| XML | 2.0 |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
